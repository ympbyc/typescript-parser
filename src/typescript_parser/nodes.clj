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
