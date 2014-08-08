(defn nop [x] '(fn [& _]))

(defn nop-them [& keys]
  (into {}
        (map (fn [k] [k (nop k)]) keys)))

(def nops
  (nop-them :TypeParameters
            :TypeParameter
            :Identifier
            :Constant
            :Type
            :TypeReference
            :QualifiedIdentifier
            :ModuleName
            :TypeArguments
            :TypeArgumentList
            :TypeArgument
            :TypeQuery
            :TypeLiteral
            :ArrayType
            :FunctionType
            :ConstructorType
            :ObjectType
            :TypeBody
            :TypeMemberList
            :TypeMember
            :PropertySignature
            :PropertyName
            :CallSignature
            :Parameter-List
            :RequiredParameter
            :OptionalParameter
            :Initializer
            :RestParameter
            :IndexSignature
            :MethodSignature
            :TypeAnnotation
            :InterfaceDeclaration
            :InterfaceExtendsClause
            :ClassOrInterfaceTypeList
            :ClassHeritage
            :ClassExtendsClause
            :ImplementsClause
            :ImportDeclaration
            :ExternalImportDeclaration
            :ExternalModuleReference
            :ExportAssignment
            :AmbientVariableDeclaration
            :AmbientFunctionDeclaration
            :AmbientClassDeclaration
            :AmbientClassBody
            :AmbientClassBodyElement
            :AmbientConstructorDeclaration
            :AmbientPropertyMemberDeclaration
            :AmbientEnumDeclaration
            :AmbientEnumBody
            :AmbientEnumMember
            :AmbientModuleDeclaration
            :AmbientModuleBody
            :AmbientModuleElement
            :AmbientExternalModuleDeclaration
            :AmbientExternalModuleBody
            :AmbientExternalModuleBody
            :AmbientExternalModuleElement
            :LiteralValue
            :StringLiteral
            :NumericLiteral
            :AccessLevel))




(defn ast->ann [tree]
  (insta/transform
   {:AmbientVariableDeclaration
    (fn var-dec [id type]
      (list 'ann id type))

    :TypeAnnotation
    identity

    :Type
    identity

    :TypeReference
    identity

    :QualifiedIdentifier
    identity

    :Identifier
    (fn identifier [x]
      (symbol x))

    :CallSignature
    (fn cs
      ([t] ['-> t])
      ([pl t] (conj (conj (vec pl) '->) t)))

    :Parameter-List
    (fn pl [& req] req)

    :RequiredParameter
    (fn rp [id t] t)

    :OptionalParameter
    (fn op [id t] t)

    :AmbientFunctionDeclaration
    (fn fn-dec ([id cs]
                 (list 'ann id cs)))

    :InterfaceDeclaration
    (fn ifd ([id body]
              (list 'ann-interface id body))
      ([id extends body]
         (list 'ann-interface id body)))

    :ObjectType (fn [& x] (seq x))
    :TypeBody   identity

    :TypeMemberList
    (fn tml [& tms] tms)

    :TypeMember identity

    :MethodSignature
    (fn ms ([[_ id] cs]
             (list id cs))
      ([[_ id] _ cs]
         (list id cs)))

    :PropertySignature
    (fn ps ([[_ id] t]
             (list id t))
      ([[_ id] _ t]
         (list id t)))

    :IndexSignature
    (fn is [id ti to]
      (list 'aget [(symbol ti) to]))

    :TypeLiteral identity

    :ArrayType
    (fn [t] (list 'Seq t))

    :RestParameter
    (fn [id at] at)

    :ConstructSignature
    (fn [& x] (seq x))

    :FunctionType
    (fn [& x] (vec x))
    }
   tree))
