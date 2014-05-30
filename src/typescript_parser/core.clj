(ns typescript-parser.core
  (:require [instaparse.core :as insta]
            [clojure.pprint :as pp]
            [clojure.string :as str])
  (:gen-class))

(def grammar
  (insta/parser (slurp "typescript.ebnf")
                :output-format :hiccup
                :optimize :memory))

(defn parse-tree [s]
  (grammar s))

(defn output-ts []
  (let [ts-src (slurp "lib.d.ts")
        tss (str/split ts-src #"\n\}")]
    (println (str "Chopped up the input into " (count tss) " chunks"))
    (concat (pmap #(grammar (str % "\n}"))
                  (butlast tss)))))

(defn nop [x] '(fn [& _]))

(defn nop-them [& keys]
  (println "{")
  (doseq [k keys]
    (println (str "  " k " " '(fn [& _]))))
  (println "}"))

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


(defn transform [tree]
  (insta/transform
   {:ExportAssignment (fn [& _]),
    :RequiredParameter (fn [& _]),
    :TypeAnnotation (fn [& _]),
    :PropertySignature (fn [& _]),
    :TypeMember (fn [& _]),
    :RestParameter (fn [& _]),
    :Initializer (fn [& _]),
    :TypeReference (fn [& _]),
    :AmbientModuleBody (fn [& _]),
    :AmbientVariableDeclaration (fn [& _]),
    :AmbientClassDeclaration (fn [& _]),
    :AmbientClassBodyElement (fn [& _]),
    :AmbientPropertyMemberDeclaration (fn [& _]),
    :Constant (fn [& _]),
    :ArrayType (fn [& _]),
    :AmbientEnumMember (fn [& _]),
    :ImplementsClause (fn [& _]),
    :QualifiedIdentifier (fn [& _]),
    :ClassOrInterfaceTypeList (fn [& _]),
    :TypeArgument (fn [& _]),
    :AccessLevel (fn [& _]),
    :ModuleName (fn [& _]),
    :MethodSignature (fn [& _]),
    :ConstructorType (fn [& _]),
    :OptionalParameter (fn [& _]),
    :TypeQuery (fn [& _]),
    :AmbientEnumBody (fn [& _]),
    :Type (fn [& _]),
    :CallSignature (fn [& _]),
    :TypeParameters (fn [& _]),
    :StringLiteral (fn [& _]),
    :AmbientModuleElement (fn [& _]),
    :AmbientModuleDeclaration (fn [& _]),
    :AmbientFunctionDeclaration (fn [& _]),
    :ExternalImportDeclaration (fn [& _]),
    :ExternalModuleReference (fn [& _]),
    :Parameter-List (fn [& _]),
    :NumericLiteral (fn [& _]),
    :TypeParameter (fn [& _]),
    :TypeArguments (fn [& _]),
    :TypeBody (fn [& _]),
    :ObjectType (fn [& _]),
    :FunctionType (fn [& _]),
    :AmbientConstructorDeclaration (fn [& _]),
    :TypeMemberList (fn [& _]),
    :InterfaceDeclaration (fn [& _]),
    :AmbientEnumDeclaration (fn [& _]),
    :AmbientExternalModuleDeclaration (fn [& _]),
    :PropertyName (fn [& _]),
    :ClassHeritage (fn [& _]),
    :AmbientExternalModuleElement (fn [& _]),
    :Identifier (fn [& _]),
    :LiteralValue (fn [& _]),
    :InterfaceExtendsClause (fn [& _]),
    :TypeArgumentList (fn [& _]),
    :ImportDeclaration (fn [& _]),
    :AmbientClassBody (fn [& _]),
    :TypeLiteral (fn [& _]),
    :AmbientExternalModuleBody (fn [& _]),
    :IndexSignature (fn [& _]),
    :ClassExtendsClause (fn [& _])}

   tree))


#_(transform (first (output-ts)))


(defn -main []
  (comment doseq [t (output-ts)]
           (pp/pprint (transform t)))
  (pp/pprint nops))
