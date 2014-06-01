;;This is an automatically generated file. Do not modify.
;;LOG: Chopped up the input into 1002 chunks
([:AmbientVariableDeclaration
  [:Identifier "NaN"]
  [:TypeAnnotation
   [:Type
    [:TypeReference
     [:QualifiedIdentifier [:Identifier "number"]]
     [:TypeArguments]]]]]
 [:AmbientVariableDeclaration
  [:Identifier "Infinity"]
  [:TypeAnnotation
   [:Type
    [:TypeReference
     [:QualifiedIdentifier [:Identifier "number"]]
     [:TypeArguments]]]]]
 [:AmbientFunctionDeclaration
  [:Identifier "eval"]
  [:CallSignature
   [:TypeParameters]
   [:Parameter-List
    [:RequiredParameter
     [:AccessLevel]
     [:Identifier "x"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]]
   [:TypeAnnotation
    [:Type
     [:TypeReference
      [:QualifiedIdentifier [:Identifier "any"]]
      [:TypeArguments]]]]]]
 [:AmbientFunctionDeclaration
  [:Identifier "parseInt"]
  [:CallSignature
   [:TypeParameters]
   [:Parameter-List
    [:RequiredParameter
     [:AccessLevel]
     [:Identifier "s"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]
    [:OptionalParameter
     [:AccessLevel]
     [:Identifier "radix"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]]
   [:TypeAnnotation
    [:Type
     [:TypeReference
      [:QualifiedIdentifier [:Identifier "number"]]
      [:TypeArguments]]]]]]
 [:AmbientFunctionDeclaration
  [:Identifier "parseFloat"]
  [:CallSignature
   [:TypeParameters]
   [:Parameter-List
    [:RequiredParameter
     [:AccessLevel]
     [:Identifier "string"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]]
   [:TypeAnnotation
    [:Type
     [:TypeReference
      [:QualifiedIdentifier [:Identifier "number"]]
      [:TypeArguments]]]]]]
 [:AmbientFunctionDeclaration
  [:Identifier "isNaN"]
  [:CallSignature
   [:TypeParameters]
   [:Parameter-List
    [:RequiredParameter
     [:AccessLevel]
     [:Identifier "number"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]]
   [:TypeAnnotation
    [:Type
     [:TypeReference
      [:QualifiedIdentifier [:Identifier "boolean"]]
      [:TypeArguments]]]]]]
 [:AmbientFunctionDeclaration
  [:Identifier "isFinite"]
  [:CallSignature
   [:TypeParameters]
   [:Parameter-List
    [:RequiredParameter
     [:AccessLevel]
     [:Identifier "number"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]]
   [:TypeAnnotation
    [:Type
     [:TypeReference
      [:QualifiedIdentifier [:Identifier "boolean"]]
      [:TypeArguments]]]]]]
 [:AmbientFunctionDeclaration
  [:Identifier "decodeURI"]
  [:CallSignature
   [:TypeParameters]
   [:Parameter-List
    [:RequiredParameter
     [:AccessLevel]
     [:Identifier "encodedURI"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]]
   [:TypeAnnotation
    [:Type
     [:TypeReference
      [:QualifiedIdentifier [:Identifier "string"]]
      [:TypeArguments]]]]]]
 [:AmbientFunctionDeclaration
  [:Identifier "decodeURIComponent"]
  [:CallSignature
   [:TypeParameters]
   [:Parameter-List
    [:RequiredParameter
     [:AccessLevel]
     [:Identifier "encodedURIComponent"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]]
   [:TypeAnnotation
    [:Type
     [:TypeReference
      [:QualifiedIdentifier [:Identifier "string"]]
      [:TypeArguments]]]]]]
 [:AmbientFunctionDeclaration
  [:Identifier "encodeURI"]
  [:CallSignature
   [:TypeParameters]
   [:Parameter-List
    [:RequiredParameter
     [:AccessLevel]
     [:Identifier "uri"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]]
   [:TypeAnnotation
    [:Type
     [:TypeReference
      [:QualifiedIdentifier [:Identifier "string"]]
      [:TypeArguments]]]]]]
 [:AmbientFunctionDeclaration
  [:Identifier "encodeURIComponent"]
  [:CallSignature
   [:TypeParameters]
   [:Parameter-List
    [:RequiredParameter
     [:AccessLevel]
     [:Identifier "uriComponent"]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]]
   [:TypeAnnotation
    [:Type
     [:TypeReference
      [:QualifiedIdentifier [:Identifier "string"]]
      [:TypeArguments]]]]]]
 [:InterfaceDeclaration
  [:Identifier "PropertyDescriptor"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:PropertySignature
     [:PropertyName [:Identifier "configurable"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "boolean"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "enumerable"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "boolean"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "value"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "any"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "writable"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "boolean"]]
        [:TypeArguments]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "get"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "any"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "set"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "v"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "PropertyDescriptorMap"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:IndexSignature
     [:Identifier "s"]
     "string"
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "PropertyDescriptor"]]
        [:TypeArguments]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "Object"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:MethodSignature
     [:PropertyName [:Identifier "toString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toLocaleString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "valueOf"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "Object"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "hasOwnProperty"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "v"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "isPrototypeOf"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "v"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "Object"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "propertyIsEnumerable"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "v"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]
         [:TypeArguments]]]]]]
    [:IndexSignature
     [:Identifier "s"]
     "string"
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "any"]]
        [:TypeArguments]]]]]]]])
([:AmbientVariableDeclaration
  [:Identifier "Object"]
  [:TypeAnnotation
   [:Type
    [:TypeLiteral
     [:ObjectType
      [:TypeMemberList
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Object"]]
            [:TypeArguments]]]]]]
       [:CallSignature
        [:TypeParameters]
        [:Parameter-List]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]
       [:CallSignature
        [:TypeParameters]
        [:Parameter-List
         [:RequiredParameter
          [:AccessLevel]
          [:Identifier "value"]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]
             [:TypeArguments]]]]]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "prototype"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "Object"]]
           [:TypeArguments]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "getPrototypeOf"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "getOwnPropertyDescriptor"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "p"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "PropertyDescriptor"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "getOwnPropertyNames"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "create"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "properties"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier
               [:Identifier "PropertyDescriptorMap"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "defineProperty"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "p"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "attributes"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "PropertyDescriptor"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "defineProperties"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "properties"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier
               [:Identifier "PropertyDescriptorMap"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "seal"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "freeze"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "preventExtensions"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "isSealed"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "boolean"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "isFrozen"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "boolean"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "isExtensible"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "boolean"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "keys"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "o"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]]]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "Function"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:MethodSignature
     [:PropertyName [:Identifier "apply"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "thisArg"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "argArray"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "any"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "call"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "thisArg"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]
       [:RestParameter
        [:Identifier "argArray"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:ArrayType
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]
             [:TypeArguments]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "any"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "bind"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "thisArg"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]
       [:RestParameter
        [:Identifier "argArray"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:ArrayType
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]
             [:TypeArguments]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "any"]]
         [:TypeArguments]]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "prototype"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "any"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "length"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "arguments"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "any"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "caller"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "Function"]]
        [:TypeArguments]]]]]]]])
([:AmbientVariableDeclaration
  [:Identifier "Function"]
  [:TypeAnnotation
   [:Type
    [:TypeLiteral
     [:ObjectType
      [:TypeMemberList
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RestParameter
           [:Identifier "args"]
           [:TypeAnnotation
            [:Type
             [:TypeLiteral
              [:ArrayType
               [:TypeReference
                [:QualifiedIdentifier [:Identifier "string"]]
                [:TypeArguments]]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Function"]]
            [:TypeArguments]]]]]]
       [:CallSignature
        [:TypeParameters]
        [:Parameter-List
         [:RestParameter
          [:Identifier "args"]
          [:TypeAnnotation
           [:Type
            [:TypeLiteral
             [:ArrayType
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]
               [:TypeArguments]]]]]]]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "Function"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "prototype"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "Function"]]
           [:TypeArguments]]]]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "IArguments"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:IndexSignature
     [:Identifier "index"]
     "number"
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "any"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "length"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "callee"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "Function"]]
        [:TypeArguments]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "String"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:MethodSignature
     [:PropertyName [:Identifier "toString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "charAt"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "pos"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "charCodeAt"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "index"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "concat"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RestParameter
        [:Identifier "strings"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:ArrayType
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "string"]]
             [:TypeArguments]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "indexOf"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "searchString"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "position"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "lastIndexOf"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "searchString"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "position"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "localeCompare"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "that"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "match"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "regexp"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "match"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "regexp"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "RegExp"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "replace"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "searchValue"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "replaceValue"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "replace"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "searchValue"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "replaceValue"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "substring"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]
                 [:TypeArguments]]]]]
             [:RestParameter
              [:Identifier "args"]
              [:TypeAnnotation
               [:Type
                [:TypeLiteral
                 [:ArrayType
                  [:TypeReference
                   [:QualifiedIdentifier [:Identifier "any"]]
                   [:TypeArguments]]]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "replace"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "searchValue"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "RegExp"]]
           [:TypeArguments]]]]]
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "replaceValue"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "replace"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "searchValue"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "RegExp"]]
           [:TypeArguments]]]]]
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "replaceValue"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "substring"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]
                 [:TypeArguments]]]]]
             [:RestParameter
              [:Identifier "args"]
              [:TypeAnnotation
               [:Type
                [:TypeLiteral
                 [:ArrayType
                  [:TypeReference
                   [:QualifiedIdentifier [:Identifier "any"]]
                   [:TypeArguments]]]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "search"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "regexp"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "search"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "regexp"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "RegExp"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "slice"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "start"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "end"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "split"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "separator"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "limit"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "split"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "separator"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "RegExp"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "limit"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "substring"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "start"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "end"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toLowerCase"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toLocaleLowerCase"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toUpperCase"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toLocaleUpperCase"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "trim"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "length"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "substr"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "from"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "length"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]]]])
([:AmbientVariableDeclaration
  [:Identifier "String"]
  [:TypeAnnotation
   [:Type
    [:TypeLiteral
     [:ObjectType
      [:TypeMemberList
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "String"]]
            [:TypeArguments]]]]]]
       [:CallSignature
        [:TypeParameters]
        [:Parameter-List
         [:OptionalParameter
          [:AccessLevel]
          [:Identifier "value"]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]
             [:TypeArguments]]]]]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "prototype"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "String"]]
           [:TypeArguments]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "fromCharCode"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RestParameter
           [:Identifier "codes"]
           [:TypeAnnotation
            [:Type
             [:TypeLiteral
              [:ArrayType
               [:TypeReference
                [:QualifiedIdentifier [:Identifier "number"]]
                [:TypeArguments]]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]
            [:TypeArguments]]]]]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "Boolean"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType [:TypeMemberList]]])
([:AmbientVariableDeclaration
  [:Identifier "Boolean"]
  [:TypeAnnotation
   [:Type
    [:TypeLiteral
     [:ObjectType
      [:TypeMemberList
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Boolean"]]
            [:TypeArguments]]]]]]
       [:CallSignature
        [:TypeParameters]
        [:Parameter-List
         [:OptionalParameter
          [:AccessLevel]
          [:Identifier "value"]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]
             [:TypeArguments]]]]]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "boolean"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "prototype"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "Boolean"]]
           [:TypeArguments]]]]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "Number"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:MethodSignature
     [:PropertyName [:Identifier "toString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "radix"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toFixed"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "fractionDigits"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toExponential"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "fractionDigits"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toPrecision"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "precision"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]]]])
([:AmbientVariableDeclaration
  [:Identifier "Number"]
  [:TypeAnnotation
   [:Type
    [:TypeLiteral
     [:ObjectType
      [:TypeMemberList
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Number"]]
            [:TypeArguments]]]]]]
       [:CallSignature
        [:TypeParameters]
        [:Parameter-List
         [:OptionalParameter
          [:AccessLevel]
          [:Identifier "value"]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]
             [:TypeArguments]]]]]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "prototype"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "Number"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "MAX_VALUE"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "MIN_VALUE"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "NaN"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "NEGATIVE_INFINITY"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "POSITIVE_INFINITY"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "Math"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:PropertySignature
     [:PropertyName [:Identifier "E"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "LN10"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "LN2"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "LOG2E"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "LOG10E"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "PI"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "SQRT1_2"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "SQRT2"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "abs"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "acos"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "asin"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "atan"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "atan2"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "y"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "ceil"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "cos"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "exp"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "floor"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "log"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "max"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RestParameter
        [:Identifier "values"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:ArrayType
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "number"]]
             [:TypeArguments]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "min"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RestParameter
        [:Identifier "values"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:ArrayType
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "number"]]
             [:TypeArguments]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "pow"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "y"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "random"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "round"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "sin"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "sqrt"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "tan"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "x"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]]]])
([:AmbientVariableDeclaration
  [:Identifier "Math"]
  [:TypeAnnotation
   [:Type
    [:TypeReference
     [:QualifiedIdentifier [:Identifier "Math"]]
     [:TypeArguments]]]]]
 [:InterfaceDeclaration
  [:Identifier "Date"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:MethodSignature
     [:PropertyName [:Identifier "toString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toDateString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toTimeString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toLocaleString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toLocaleDateString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toLocaleTimeString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "valueOf"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getTime"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getFullYear"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getUTCFullYear"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getMonth"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getUTCMonth"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getDate"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getUTCDate"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getDay"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getUTCDay"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getHours"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getUTCHours"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getMinutes"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getUTCMinutes"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getSeconds"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getUTCSeconds"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getMilliseconds"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getUTCMilliseconds"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "getTimezoneOffset"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setTime"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "time"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setMilliseconds"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "ms"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setUTCMilliseconds"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "ms"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setSeconds"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "sec"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "ms"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setUTCSeconds"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "sec"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "ms"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setMinutes"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "min"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "sec"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "ms"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setUTCMinutes"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "min"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "sec"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "ms"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setHours"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "hours"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "min"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "sec"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "ms"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setUTCHours"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "hours"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "min"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "sec"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "ms"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setDate"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "date"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setUTCDate"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "date"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setMonth"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "month"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "date"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setUTCMonth"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "month"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "date"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setFullYear"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "year"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "month"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "date"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "setUTCFullYear"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "year"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "month"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "date"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toUTCString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toISOString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toJSON"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "key"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]]]])
([:AmbientVariableDeclaration
  [:Identifier "Date"]
  [:TypeAnnotation
   [:Type
    [:TypeLiteral
     [:ObjectType
      [:TypeMemberList
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Date"]]
            [:TypeArguments]]]]]]
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Date"]]
            [:TypeArguments]]]]]]
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Date"]]
            [:TypeArguments]]]]]]
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "year"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "month"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "date"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "hours"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "minutes"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "seconds"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "ms"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Date"]]
            [:TypeArguments]]]]]]
       [:CallSignature
        [:TypeParameters]
        [:Parameter-List]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "prototype"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "Date"]]
           [:TypeArguments]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "parse"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "s"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "UTC"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "year"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "month"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "date"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "hours"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "minutes"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "seconds"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "ms"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]
            [:TypeArguments]]]]]]
       [:MethodSignature
        [:PropertyName [:Identifier "now"]]
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]
            [:TypeArguments]]]]]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "RegExpExecArray"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:IndexSignature
     [:Identifier "index"]
     "number"
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "length"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "index"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "input"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "toLocaleString"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "concat"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RestParameter
        [:Identifier "items"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:ArrayType
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "join"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "separator"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "pop"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "push"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RestParameter
        [:Identifier "items"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:ArrayType
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "string"]]
             [:TypeArguments]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "reverse"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "shift"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "slice"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "start"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "end"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "sort"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "compareFn"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "a"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "b"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]
                 [:TypeArguments]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]
              [:TypeArguments]]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "splice"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "start"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "splice"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "start"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "deleteCount"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]
       [:RestParameter
        [:Identifier "items"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:ArrayType
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "string"]]
             [:TypeArguments]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "unshift"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RestParameter
        [:Identifier "items"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:ArrayType
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "string"]]
             [:TypeArguments]]]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "indexOf"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "searchElement"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "fromIndex"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "lastIndexOf"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "searchElement"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "fromIndex"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "number"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "every"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "callbackfn"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "value"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "index"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "number"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "array"]
              [:TypeAnnotation
               [:Type
                [:TypeLiteral
                 [:ArrayType
                  [:TypeReference
                   [:QualifiedIdentifier [:Identifier "string"]]
                   [:TypeArguments]]]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "boolean"]]
              [:TypeArguments]]]]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "thisArg"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "some"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "callbackfn"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "value"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "index"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "number"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "array"]
              [:TypeAnnotation
               [:Type
                [:TypeLiteral
                 [:ArrayType
                  [:TypeReference
                   [:QualifiedIdentifier [:Identifier "string"]]
                   [:TypeArguments]]]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "boolean"]]
              [:TypeArguments]]]]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "thisArg"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "forEach"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "callbackfn"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "value"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "index"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "number"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "array"]
              [:TypeAnnotation
               [:Type
                [:TypeLiteral
                 [:ArrayType
                  [:TypeReference
                   [:QualifiedIdentifier [:Identifier "string"]]
                   [:TypeArguments]]]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "void"]]
              [:TypeArguments]]]]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "thisArg"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "void"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "map"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "callbackfn"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "value"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "index"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "number"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "array"]
              [:TypeAnnotation
               [:Type
                [:TypeLiteral
                 [:ArrayType
                  [:TypeReference
                   [:QualifiedIdentifier [:Identifier "string"]]
                   [:TypeArguments]]]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "thisArg"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "filter"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "callbackfn"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "value"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "index"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "number"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "array"]
              [:TypeAnnotation
               [:Type
                [:TypeLiteral
                 [:ArrayType
                  [:TypeReference
                   [:QualifiedIdentifier [:Identifier "string"]]
                   [:TypeArguments]]]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "boolean"]]
              [:TypeArguments]]]]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "thisArg"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeLiteral
         [:ArrayType
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "reduce"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "callbackfn"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "previousValue"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "any"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "currentValue"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "any"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "currentIndex"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "number"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "array"]
              [:TypeAnnotation
               [:Type
                [:TypeLiteral
                 [:ArrayType
                  [:TypeReference
                   [:QualifiedIdentifier [:Identifier "string"]]
                   [:TypeArguments]]]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "initialValue"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "any"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "reduceRight"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "callbackfn"]
        [:TypeAnnotation
         [:Type
          [:TypeLiteral
           [:FunctionType
            [:TypeParameters]
            [:Parameter-List
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "previousValue"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "any"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "currentValue"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "any"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "currentIndex"]
              [:TypeAnnotation
               [:Type
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "number"]]
                 [:TypeArguments]]]]]
             [:RequiredParameter
              [:AccessLevel]
              [:Identifier "array"]
              [:TypeAnnotation
               [:Type
                [:TypeLiteral
                 [:ArrayType
                  [:TypeReference
                   [:QualifiedIdentifier [:Identifier "string"]]
                   [:TypeArguments]]]]]]]]
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]
              [:TypeArguments]]]]]]]]
       [:OptionalParameter
        [:AccessLevel]
        [:Identifier "initialValue"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "any"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "any"]]
         [:TypeArguments]]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "RegExp"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:MethodSignature
     [:PropertyName [:Identifier "exec"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "string"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "RegExpExecArray"]]
         [:TypeArguments]]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "test"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List
       [:RequiredParameter
        [:AccessLevel]
        [:Identifier "string"]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]
         [:TypeArguments]]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "source"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "global"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "boolean"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "ignoreCase"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "boolean"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "multiline"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "boolean"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "lastIndex"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "number"]]
        [:TypeArguments]]]]]
    [:MethodSignature
     [:PropertyName [:Identifier "compile"]]
     [:CallSignature
      [:TypeParameters]
      [:Parameter-List]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "RegExp"]]
         [:TypeArguments]]]]]]]]])
([:AmbientVariableDeclaration
  [:Identifier "RegExp"]
  [:TypeAnnotation
   [:Type
    [:TypeLiteral
     [:ObjectType
      [:TypeMemberList
       [:ConstructSignature
        "new"
        [:CallSignature
         [:TypeParameters]
         [:Parameter-List
          [:RequiredParameter
           [:AccessLevel]
           [:Identifier "pattern"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]
          [:OptionalParameter
           [:AccessLevel]
           [:Identifier "flags"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]
              [:TypeArguments]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "RegExp"]]
            [:TypeArguments]]]]]]
       [:CallSignature
        [:TypeParameters]
        [:Parameter-List
         [:RequiredParameter
          [:AccessLevel]
          [:Identifier "pattern"]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "string"]]
             [:TypeArguments]]]]]
         [:OptionalParameter
          [:AccessLevel]
          [:Identifier "flags"]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "string"]]
             [:TypeArguments]]]]]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "RegExp"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "$1"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "$2"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "$3"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "$4"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "$5"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "$6"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "$7"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "$8"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "$9"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]
       [:PropertySignature
        [:PropertyName [:Identifier "lastMatch"]]
        [:TypeAnnotation
         [:Type
          [:TypeReference
           [:QualifiedIdentifier [:Identifier "string"]]
           [:TypeArguments]]]]]]]]]]])
([:InterfaceDeclaration
  [:Identifier "Error"]
  [:TypeParameters]
  [:InterfaceExtendsClause]
  [:ObjectType
   [:TypeMemberList
    [:PropertySignature
     [:PropertyName [:Identifier "name"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]
    [:PropertySignature
     [:PropertyName [:Identifier "message"]]
     [:TypeAnnotation
      [:Type
       [:TypeReference
        [:QualifiedIdentifier [:Identifier "string"]]
        [:TypeArguments]]]]]]]])
