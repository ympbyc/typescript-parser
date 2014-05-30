[:AmbientVariableDeclaration
 [:Identifier "NaN"]
 [:TypeAnnotation
  [:Type
   [:TypeReference [:QualifiedIdentifier [:Identifier "number"]]]]]]
[:AmbientVariableDeclaration
 [:Identifier "Infinity"]
 [:TypeAnnotation
  [:Type
   [:TypeReference [:QualifiedIdentifier [:Identifier "number"]]]]]]
[:AmbientFunctionDeclaration
 [:Identifier "eval"]
 [:CallSignature
  [:Parameter-List
   [:RequiredParameter
    [:Identifier "x"]
    [:TypeAnnotation
     [:Type
      [:TypeReference
       [:QualifiedIdentifier [:Identifier "string"]]]]]]]
  [:TypeAnnotation
   [:Type
    [:TypeReference [:QualifiedIdentifier [:Identifier "any"]]]]]]]
[:AmbientFunctionDeclaration
 [:Identifier "parseInt"]
 [:CallSignature
  [:Parameter-List
   [:RequiredParameter
    [:Identifier "s"]
    [:TypeAnnotation
     [:Type
      [:TypeReference [:QualifiedIdentifier [:Identifier "string"]]]]]]
   [:OptionalParameter
    [:Identifier "radix"]
    [:TypeAnnotation
     [:Type
      [:TypeReference
       [:QualifiedIdentifier [:Identifier "number"]]]]]]]
  [:TypeAnnotation
   [:Type
    [:TypeReference [:QualifiedIdentifier [:Identifier "number"]]]]]]]
[:AmbientFunctionDeclaration
 [:Identifier "parseFloat"]
 [:CallSignature
  [:Parameter-List
   [:RequiredParameter
    [:Identifier "string"]
    [:TypeAnnotation
     [:Type
      [:TypeReference
       [:QualifiedIdentifier [:Identifier "string"]]]]]]]
  [:TypeAnnotation
   [:Type
    [:TypeReference [:QualifiedIdentifier [:Identifier "number"]]]]]]]
[:AmbientFunctionDeclaration
 [:Identifier "isNaN"]
 [:CallSignature
  [:Parameter-List
   [:RequiredParameter
    [:Identifier "number"]
    [:TypeAnnotation
     [:Type
      [:TypeReference
       [:QualifiedIdentifier [:Identifier "number"]]]]]]]
  [:TypeAnnotation
   [:Type
    [:TypeReference [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]
[:AmbientFunctionDeclaration
 [:Identifier "isFinite"]
 [:CallSignature
  [:Parameter-List
   [:RequiredParameter
    [:Identifier "number"]
    [:TypeAnnotation
     [:Type
      [:TypeReference
       [:QualifiedIdentifier [:Identifier "number"]]]]]]]
  [:TypeAnnotation
   [:Type
    [:TypeReference [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]
[:AmbientFunctionDeclaration
 [:Identifier "decodeURI"]
 [:CallSignature
  [:Parameter-List
   [:RequiredParameter
    [:Identifier "encodedURI"]
    [:TypeAnnotation
     [:Type
      [:TypeReference
       [:QualifiedIdentifier [:Identifier "string"]]]]]]]
  [:TypeAnnotation
   [:Type
    [:TypeReference [:QualifiedIdentifier [:Identifier "string"]]]]]]]
[:AmbientFunctionDeclaration
 [:Identifier "decodeURIComponent"]
 [:CallSignature
  [:Parameter-List
   [:RequiredParameter
    [:Identifier "encodedURIComponent"]
    [:TypeAnnotation
     [:Type
      [:TypeReference
       [:QualifiedIdentifier [:Identifier "string"]]]]]]]
  [:TypeAnnotation
   [:Type
    [:TypeReference [:QualifiedIdentifier [:Identifier "string"]]]]]]]
[:AmbientFunctionDeclaration
 [:Identifier "encodeURI"]
 [:CallSignature
  [:Parameter-List
   [:RequiredParameter
    [:Identifier "uri"]
    [:TypeAnnotation
     [:Type
      [:TypeReference
       [:QualifiedIdentifier [:Identifier "string"]]]]]]]
  [:TypeAnnotation
   [:Type
    [:TypeReference [:QualifiedIdentifier [:Identifier "string"]]]]]]]
[:AmbientFunctionDeclaration
 [:Identifier "encodeURIComponent"]
 [:CallSignature
  [:Parameter-List
   [:RequiredParameter
    [:Identifier "uriComponent"]
    [:TypeAnnotation
     [:Type
      [:TypeReference
       [:QualifiedIdentifier [:Identifier "string"]]]]]]]
  [:TypeAnnotation
   [:Type
    [:TypeReference [:QualifiedIdentifier [:Identifier "string"]]]]]]]
[:InterfaceDeclaration
 [:Identifier "PropertyDescriptor"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "configurable"]]
      "?"
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "enumerable"]]
      "?"
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "value"]]
      "?"
      [:TypeAnnotation
       [:Type
        [:TypeReference [:QualifiedIdentifier [:Identifier "any"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "writable"]]
      "?"
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "get"]]
      "?"
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "set"]]
      "?"
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "v"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "PropertyDescriptorMap"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:IndexSignature
      [:Identifier "s"]
      "string"
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier
          [:Identifier "PropertyDescriptor"]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "Object"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toLocaleString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "valueOf"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "Object"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "hasOwnProperty"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "v"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "isPrototypeOf"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "v"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Object"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "propertyIsEnumerable"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "v"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]
    [:TypeMember
     [:IndexSignature
      [:Identifier "s"]
      "string"
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]]]
[:AmbientVariableDeclaration
 [:Identifier "Object"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "value"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "Object"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:RequiredParameter
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Object"]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "getPrototypeOf"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "getOwnPropertyDescriptor"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]
           [:RequiredParameter
            [:Identifier "p"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier
              [:Identifier "PropertyDescriptor"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "getOwnPropertyNames"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeLiteral
             [:ArrayType
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "create"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]
           [:OptionalParameter
            [:Identifier "properties"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier
                [:Identifier "PropertyDescriptorMap"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "defineProperty"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]
           [:RequiredParameter
            [:Identifier "p"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]
           [:RequiredParameter
            [:Identifier "attributes"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier
                [:Identifier "PropertyDescriptor"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "defineProperties"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]
           [:RequiredParameter
            [:Identifier "properties"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier
                [:Identifier "PropertyDescriptorMap"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "seal"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "freeze"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "preventExtensions"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "isSealed"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "isFrozen"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "isExtensible"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "keys"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "o"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeLiteral
             [:ArrayType
              [:TypeReference
               [:QualifiedIdentifier
                [:Identifier "string"]]]]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "Function"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "apply"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "thisArg"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]
        [:OptionalParameter
         [:Identifier "argArray"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "call"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "thisArg"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]
        [:RestParameter
         "..."
         [:Identifier "argArray"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "bind"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "thisArg"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]
        [:RestParameter
         "..."
         [:Identifier "argArray"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "prototype"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference [:QualifiedIdentifier [:Identifier "any"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "length"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "arguments"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference [:QualifiedIdentifier [:Identifier "any"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "caller"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "Function"]]]]]]]]]]]
[:AmbientVariableDeclaration
 [:Identifier "Function"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:RestParameter
            "..."
            [:Identifier "args"]
            [:TypeAnnotation
             [:Type
              [:TypeLiteral
               [:ArrayType
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "Function"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:RestParameter
           "..."
           [:Identifier "args"]
           [:TypeAnnotation
            [:Type
             [:TypeLiteral
              [:ArrayType
               [:TypeReference
                [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Function"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Function"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "IArguments"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:IndexSignature
      [:Identifier "index"]
      "number"
      [:TypeAnnotation
       [:Type
        [:TypeReference [:QualifiedIdentifier [:Identifier "any"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "length"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "callee"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "Function"]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "String"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "charAt"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "pos"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "charCodeAt"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "index"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "concat"]]
      [:CallSignature
       [:Parameter-List
        [:RestParameter
         "..."
         [:Identifier "strings"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "indexOf"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "searchString"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]
        [:OptionalParameter
         [:Identifier "position"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "lastIndexOf"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "searchString"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]
        [:OptionalParameter
         [:Identifier "position"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "localeCompare"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "that"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "match"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "regexp"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "match"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "regexp"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "RegExp"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "replace"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "searchValue"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]
        [:RequiredParameter
         [:Identifier "replaceValue"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "replace"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "searchValue"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]
        [:RequiredParameter
         [:Identifier "replaceValue"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "substring"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "string"]]]]]]
              [:RestParameter
               "..."
               [:Identifier "args"]
               [:TypeAnnotation
                [:Type
                 [:TypeLiteral
                  [:ArrayType
                   [:TypeReference
                    [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "replace"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "searchValue"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "RegExp"]]]]]]
        [:RequiredParameter
         [:Identifier "replaceValue"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "replace"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "searchValue"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "RegExp"]]]]]]
        [:RequiredParameter
         [:Identifier "replaceValue"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "substring"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "string"]]]]]]
              [:RestParameter
               "..."
               [:Identifier "args"]
               [:TypeAnnotation
                [:Type
                 [:TypeLiteral
                  [:ArrayType
                   [:TypeReference
                    [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "search"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "regexp"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "search"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "regexp"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "RegExp"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "slice"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "start"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "end"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "split"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "separator"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]
        [:OptionalParameter
         [:Identifier "limit"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "split"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "separator"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "RegExp"]]]]]]
        [:OptionalParameter
         [:Identifier "limit"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "substring"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "start"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "end"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toLowerCase"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toLocaleLowerCase"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toUpperCase"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toLocaleUpperCase"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "trim"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "length"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "substr"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "from"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "length"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]]]
[:AmbientVariableDeclaration
 [:Identifier "String"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "value"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "String"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "String"]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "fromCharCode"]]
         [:CallSignature
          [:Parameter-List
           [:RestParameter
            "..."
            [:Identifier "codes"]
            [:TypeAnnotation
             [:Type
              [:TypeLiteral
               [:ArrayType
                [:TypeReference
                 [:QualifiedIdentifier [:Identifier "number"]]]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]]]]]]
[:InterfaceDeclaration [:Identifier "Boolean"] [:ObjectType]]
[:AmbientVariableDeclaration
 [:Identifier "Boolean"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "value"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "Boolean"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Boolean"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "Number"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toString"]]
      [:CallSignature
       [:Parameter-List
        [:OptionalParameter
         [:Identifier "radix"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toFixed"]]
      [:CallSignature
       [:Parameter-List
        [:OptionalParameter
         [:Identifier "fractionDigits"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toExponential"]]
      [:CallSignature
       [:Parameter-List
        [:OptionalParameter
         [:Identifier "fractionDigits"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toPrecision"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "precision"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]]]
[:AmbientVariableDeclaration
 [:Identifier "Number"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "value"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "Number"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "value"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "any"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Number"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "MAX_VALUE"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "MIN_VALUE"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "NaN"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "NEGATIVE_INFINITY"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "POSITIVE_INFINITY"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "Math"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "E"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "LN10"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "LN2"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "LOG2E"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "LOG10E"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "PI"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "SQRT1_2"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "SQRT2"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "abs"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "acos"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "asin"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "atan"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "atan2"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "y"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "ceil"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "cos"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "exp"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "floor"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "log"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "max"]]
      [:CallSignature
       [:Parameter-List
        [:RestParameter
         "..."
         [:Identifier "values"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "min"]]
      [:CallSignature
       [:Parameter-List
        [:RestParameter
         "..."
         [:Identifier "values"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "number"]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "pow"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:RequiredParameter
         [:Identifier "y"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "random"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "round"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "sin"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "sqrt"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "tan"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "x"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]]]]]
[:AmbientVariableDeclaration
 [:Identifier "Math"]
 [:TypeAnnotation
  [:Type [:TypeReference [:QualifiedIdentifier [:Identifier "Math"]]]]]]
[:InterfaceDeclaration
 [:Identifier "Date"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toDateString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toTimeString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toLocaleString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toLocaleDateString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toLocaleTimeString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "valueOf"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getTime"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getFullYear"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getUTCFullYear"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getMonth"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getUTCMonth"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getDate"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getUTCDate"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getDay"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getUTCDay"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getHours"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getUTCHours"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getMinutes"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getUTCMinutes"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getSeconds"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getUTCSeconds"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getMilliseconds"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getUTCMilliseconds"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "getTimezoneOffset"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setTime"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "time"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setMilliseconds"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "ms"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setUTCMilliseconds"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "ms"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setSeconds"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "sec"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "ms"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setUTCSeconds"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "sec"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "ms"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setMinutes"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "min"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "sec"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "ms"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setUTCMinutes"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "min"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "sec"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "ms"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setHours"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "hours"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "min"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "sec"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "ms"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setUTCHours"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "hours"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "min"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "sec"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "ms"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setDate"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "date"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setUTCDate"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "date"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setMonth"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "month"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "date"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setUTCMonth"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "month"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "date"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setFullYear"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "year"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "month"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "date"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "setUTCFullYear"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "year"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "month"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "date"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toUTCString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toISOString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toJSON"]]
      [:CallSignature
       [:Parameter-List
        [:OptionalParameter
         [:Identifier "key"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]]]
[:AmbientVariableDeclaration
 [:Identifier "Date"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "Date"]]]]]]]]
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "value"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "Date"]]]]]]]]
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "value"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "Date"]]]]]]]]
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "year"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:RequiredParameter
            [:Identifier "month"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "date"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "hours"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "minutes"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "seconds"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "ms"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "Date"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Date"]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "parse"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "s"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "UTC"]]
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "year"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:RequiredParameter
            [:Identifier "month"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "date"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "hours"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "minutes"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "seconds"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]
           [:OptionalParameter
            [:Identifier "ms"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
       [:TypeMember
        [:MethodSignature
         [:PropertyName [:Identifier "now"]]
         [:CallSignature
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "number"]]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "RegExpExecArray"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:IndexSignature
      [:Identifier "index"]
      "number"
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "length"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "index"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "input"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "toLocaleString"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "concat"]]
      [:CallSignature
       [:Parameter-List
        [:RestParameter
         "..."
         [:Identifier "items"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:ArrayType
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "join"]]
      [:CallSignature
       [:Parameter-List
        [:OptionalParameter
         [:Identifier "separator"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "pop"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "push"]]
      [:CallSignature
       [:Parameter-List
        [:RestParameter
         "..."
         [:Identifier "items"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "reverse"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "shift"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "string"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "slice"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "start"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:OptionalParameter
         [:Identifier "end"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "sort"]]
      [:CallSignature
       [:Parameter-List
        [:OptionalParameter
         [:Identifier "compareFn"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "a"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "string"]]]]]]
              [:RequiredParameter
               [:Identifier "b"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "string"]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "number"]]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "splice"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "start"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "splice"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "start"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:RequiredParameter
         [:Identifier "deleteCount"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]
        [:RestParameter
         "..."
         [:Identifier "items"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "unshift"]]
      [:CallSignature
       [:Parameter-List
        [:RestParameter
         "..."
         [:Identifier "items"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:ArrayType
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "indexOf"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "searchElement"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]
        [:OptionalParameter
         [:Identifier "fromIndex"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "lastIndexOf"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "searchElement"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]
        [:OptionalParameter
         [:Identifier "fromIndex"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "number"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "number"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "every"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "callbackfn"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "value"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "string"]]]]]]
              [:RequiredParameter
               [:Identifier "index"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "number"]]]]]]
              [:RequiredParameter
               [:Identifier "array"]
               [:TypeAnnotation
                [:Type
                 [:TypeLiteral
                  [:ArrayType
                   [:TypeReference
                    [:QualifiedIdentifier
                     [:Identifier "string"]]]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]]
        [:OptionalParameter
         [:Identifier "thisArg"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "some"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "callbackfn"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "value"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "string"]]]]]]
              [:RequiredParameter
               [:Identifier "index"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "number"]]]]]]
              [:RequiredParameter
               [:Identifier "array"]
               [:TypeAnnotation
                [:Type
                 [:TypeLiteral
                  [:ArrayType
                   [:TypeReference
                    [:QualifiedIdentifier
                     [:Identifier "string"]]]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]]
        [:OptionalParameter
         [:Identifier "thisArg"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "forEach"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "callbackfn"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "value"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "string"]]]]]]
              [:RequiredParameter
               [:Identifier "index"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "number"]]]]]]
              [:RequiredParameter
               [:Identifier "array"]
               [:TypeAnnotation
                [:Type
                 [:TypeLiteral
                  [:ArrayType
                   [:TypeReference
                    [:QualifiedIdentifier
                     [:Identifier "string"]]]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "void"]]]]]]]]]
        [:OptionalParameter
         [:Identifier "thisArg"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "void"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "map"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "callbackfn"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "value"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "string"]]]]]]
              [:RequiredParameter
               [:Identifier "index"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "number"]]]]]]
              [:RequiredParameter
               [:Identifier "array"]
               [:TypeAnnotation
                [:Type
                 [:TypeLiteral
                  [:ArrayType
                   [:TypeReference
                    [:QualifiedIdentifier
                     [:Identifier "string"]]]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]
        [:OptionalParameter
         [:Identifier "thisArg"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "filter"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "callbackfn"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "value"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "string"]]]]]]
              [:RequiredParameter
               [:Identifier "index"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "number"]]]]]]
              [:RequiredParameter
               [:Identifier "array"]
               [:TypeAnnotation
                [:Type
                 [:TypeLiteral
                  [:ArrayType
                   [:TypeReference
                    [:QualifiedIdentifier
                     [:Identifier "string"]]]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]]
        [:OptionalParameter
         [:Identifier "thisArg"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeLiteral
          [:ArrayType
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "reduce"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "callbackfn"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "previousValue"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "any"]]]]]]
              [:RequiredParameter
               [:Identifier "currentValue"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "any"]]]]]]
              [:RequiredParameter
               [:Identifier "currentIndex"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "number"]]]]]]
              [:RequiredParameter
               [:Identifier "array"]
               [:TypeAnnotation
                [:Type
                 [:TypeLiteral
                  [:ArrayType
                   [:TypeReference
                    [:QualifiedIdentifier
                     [:Identifier "string"]]]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]
        [:OptionalParameter
         [:Identifier "initialValue"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "any"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "reduceRight"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "callbackfn"]
         [:TypeAnnotation
          [:Type
           [:TypeLiteral
            [:FunctionType
             [:Parameter-List
              [:RequiredParameter
               [:Identifier "previousValue"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "any"]]]]]]
              [:RequiredParameter
               [:Identifier "currentValue"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "any"]]]]]]
              [:RequiredParameter
               [:Identifier "currentIndex"]
               [:TypeAnnotation
                [:Type
                 [:TypeReference
                  [:QualifiedIdentifier [:Identifier "number"]]]]]]
              [:RequiredParameter
               [:Identifier "array"]
               [:TypeAnnotation
                [:Type
                 [:TypeLiteral
                  [:ArrayType
                   [:TypeReference
                    [:QualifiedIdentifier
                     [:Identifier "string"]]]]]]]]]
             "=>"
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]
        [:OptionalParameter
         [:Identifier "initialValue"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "any"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "any"]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "RegExp"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "exec"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "string"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "RegExpExecArray"]]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "test"]]
      [:CallSignature
       [:Parameter-List
        [:RequiredParameter
         [:Identifier "string"]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "source"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "global"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "ignoreCase"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "multiline"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "boolean"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "lastIndex"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "number"]]]]]]]
    [:TypeMember
     [:MethodSignature
      [:PropertyName [:Identifier "compile"]]
      [:CallSignature
       [:TypeAnnotation
        [:Type
         [:TypeReference
          [:QualifiedIdentifier [:Identifier "RegExp"]]]]]]]]]]]]
[:AmbientVariableDeclaration
 [:Identifier "RegExp"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:RequiredParameter
            [:Identifier "pattern"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]
           [:OptionalParameter
            [:Identifier "flags"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "RegExp"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:RequiredParameter
           [:Identifier "pattern"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]
          [:OptionalParameter
           [:Identifier "flags"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "RegExp"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "$1"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "$2"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "$3"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "$4"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "$5"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "$6"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "$7"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "$8"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "$9"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "lastMatch"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "Error"]
 [:ObjectType
  [:TypeBody
   [:TypeMemberList
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "name"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]]]]]]
    [:TypeMember
     [:PropertySignature
      [:PropertyName [:Identifier "message"]]
      [:TypeAnnotation
       [:Type
        [:TypeReference
         [:QualifiedIdentifier [:Identifier "string"]]]]]]]]]]]
[:AmbientVariableDeclaration
 [:Identifier "Error"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "message"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "Error"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "message"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Error"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "Error"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "EvalError"]
 [:InterfaceExtendsClause
  [:ClassOrInterfaceTypeList
   [:TypeReference [:QualifiedIdentifier [:Identifier "Error"]]]]]
 [:ObjectType]]
[:AmbientVariableDeclaration
 [:Identifier "EvalError"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "message"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "EvalError"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "message"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "EvalError"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "EvalError"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "RangeError"]
 [:InterfaceExtendsClause
  [:ClassOrInterfaceTypeList
   [:TypeReference [:QualifiedIdentifier [:Identifier "Error"]]]]]
 [:ObjectType]]
[:AmbientVariableDeclaration
 [:Identifier "RangeError"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "message"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "RangeError"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "message"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "RangeError"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier
             [:Identifier "RangeError"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "ReferenceError"]
 [:InterfaceExtendsClause
  [:ClassOrInterfaceTypeList
   [:TypeReference [:QualifiedIdentifier [:Identifier "Error"]]]]]
 [:ObjectType]]
[:AmbientVariableDeclaration
 [:Identifier "ReferenceError"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "message"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier
              [:Identifier "ReferenceError"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "message"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "ReferenceError"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier
             [:Identifier "ReferenceError"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "SyntaxError"]
 [:InterfaceExtendsClause
  [:ClassOrInterfaceTypeList
   [:TypeReference [:QualifiedIdentifier [:Identifier "Error"]]]]]
 [:ObjectType]]
[:AmbientVariableDeclaration
 [:Identifier "SyntaxError"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "message"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "SyntaxError"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "message"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "SyntaxError"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier
             [:Identifier "SyntaxError"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "TypeError"]
 [:InterfaceExtendsClause
  [:ClassOrInterfaceTypeList
   [:TypeReference [:QualifiedIdentifier [:Identifier "Error"]]]]]
 [:ObjectType]]
[:AmbientVariableDeclaration
 [:Identifier "TypeError"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "message"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "TypeError"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "message"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "TypeError"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "TypeError"]]]]]]]]]]]]]]
[:InterfaceDeclaration
 [:Identifier "URIError"]
 [:InterfaceExtendsClause
  [:ClassOrInterfaceTypeList
   [:TypeReference [:QualifiedIdentifier [:Identifier "Error"]]]]]
 [:ObjectType]]
[:AmbientVariableDeclaration
 [:Identifier "URIError"]
 [:TypeAnnotation
  [:Type
   [:TypeLiteral
    [:ObjectType
     [:TypeBody
      [:TypeMemberList
       [:TypeMember
        [:ConstructSignature
         "new"
         [:CallSignature
          [:Parameter-List
           [:OptionalParameter
            [:Identifier "message"]
            [:TypeAnnotation
             [:Type
              [:TypeReference
               [:QualifiedIdentifier [:Identifier "string"]]]]]]]
          [:TypeAnnotation
           [:Type
            [:TypeReference
             [:QualifiedIdentifier [:Identifier "URIError"]]]]]]]]
       [:TypeMember
        [:CallSignature
         [:Parameter-List
          [:OptionalParameter
           [:Identifier "message"]
           [:TypeAnnotation
            [:Type
             [:TypeReference
              [:QualifiedIdentifier [:Identifier "string"]]]]]]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "URIError"]]]]]]]
       [:TypeMember
        [:PropertySignature
         [:PropertyName [:Identifier "prototype"]]
         [:TypeAnnotation
          [:Type
           [:TypeReference
            [:QualifiedIdentifier [:Identifier "URIError"]]]]]]]]]]]]]]
[:index 1]
[:reason
 [{:tag :string, :expecting "declare"}
  {:tag :string, :expecting "export"}
  {:tag :string, :expecting "import"}
  {:tag :string, :expecting "interface"}
  {:tag :string, :expecting "export"}
  {:tag :string, :expecting "/*"}
  {:tag :string, :expecting "//"}
  {:tag :regexp, :expecting #"\s+"}]]
[:text "}"]
[:column 1]
[:line 2]
