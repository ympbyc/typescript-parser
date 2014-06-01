(ns typescript-parser.core
  (:require [instaparse.core :as insta]
            [clojure.pprint :as pp]
            [clojure.string :as str]
            [typescript-parser.gen :as gen])
  (:gen-class))

(def grammar
  (insta/parser (slurp "typescript.ebnf.ympbyc")
                :output-format :hiccup
                :optimize :memory))

(defn parse-tree [s]
  (grammar s))

(defn output-ts []
  (let [ts-src (slurp "lib.d.ts")
        tss (str/split ts-src #"\n\}")]
    (println (str ";;This is an automatically generated file. Do not modify."))
    (println (str ";;LOG: Chopped up the input into " (count tss) " chunks"))
    (concat (pmap #(grammar (str % "\n}"))
                  (butlast tss)))))



(defn transform [tree]
  (insta/transform
   {:TypeParameters
    (fn tps ([& tps] tps))

    :TypeParameter
    (fn tp [id constraint] {:op gen/t-param
                           :id id
                           :constraint constraint})

    :Identifier
    (fn idt [id] {:op gen/identifier
                 :id (symbol id)})

    :Constraint (fn cstr [& c] c)

    :Type (fn typ [t] t)

    :TypeReference (fn tr
                     [id tas] id)  ;;

    :QualifiedIdentifier
    (fn qi ([id] id)
      ([module id] (symbol (str module "/" id))))

    :ModuleName (fn mn [& ids] (apply str ids))

    :TypeArguments (fn tas [& targs] targs)

    :TypeArgumentList (fn tal [& targ] (vec targ))

    :TypeArgument (fn ta [t] (list :type-arg t))

    :TypeQuery (fn tq [qi] (list :type-of qi))

    :TypeLiteral (fn tl [t] t)

    :ArrayType (fn arrt [elt] {:op gen/array-t
                              :elt elt})

    :FunctionType (fn fnt
                    ([tps ps t] {:op gen/call
                                 :t-params tps
                                 :param-ts ps
                                 :annotation t}))

    :ConstructorType (fn ct [ft] (list :ctor-t ft))

    :ConstructSignature (fn [name call] {:op gen/method :id name :call call})

    :ObjectType (fn ot [tbody] {:op gen/obj-t
                               :body tbody})

    ;;:TypeBody

    :TypeMemberList (fn tml [& tms] tms)

    :TypeMember (fn tm [tm] tm)

    :PropertySignature (fn ps
                         [pn ta] {:op gen/parameter
                                  :id pn
                                  :annotation ta})

    :PropertyName (fn pn [pn] pn)

    :CallSignature (fn cs ([tps pl ta] {:op gen/call
                                       :t-params tps
                                       :param-ts  pl
                                       :annotation ta}))

    :Parameter-List (fn pl [& pls] pls)

    :RequiredParameter (fn reqp ([al id ta] {:op gen/req-param
                                       :access-lev al
                                       :id id
                                       :annotation ta})
                         ([id slit] {:op gen/req-param
                                     :id id
                                     :deco slit}))

    :OptionalParameter (fn optp ([al id ta] {:op gen/opt-param
                                       :access-lev al
                                       :id  id
                                       :annotation ta
                                       :init nil})
                         ([al id ta init] {:op gen/opt-param
                                           :access-lev al
                                           :id  id
                                           :annotation ta
                                           :init  init}))

    :Initializer (fn init [v] v)
    :RestParameter (fn restp [id ta] {:op gen/rest-param
                               :annotation ta})

    :IndexSignature (fn idx [id s-or-n ta] {:op gen/index
                                       :id id
                                       :key-t (symbol s-or-n)
                                       :annotation ta})

    :MethodSignature (fn meth [prop-name call] {:op gen/method
                                          :id prop-name
                                          :call call})

    :TypeAnnotation (fn tann [t] t)

    :InterfaceDeclaration (fn itfd [id tps iec ot] {:op gen/interface
                                              :id  id
                                              :t-params tps
                                              :extends iec
                                              :type ot})

    :InterfaceExtendsClause (fn itfec [& xs] xs)

    ;;:ClassOrInterfaceTypeList (fn [& _])

    :ClassHeritage (fn clh [cec iec] {:op :heritage
                                 :interface iec
                                 :class cec})

    :ClassExtendsClause (fn clec ([] nil)
                          ([c] c))

    :ImplementsClause (fn implc ([] nil)
                        ([x] x))

    :ImportDeclaration (fn imptd [id qi] {:op :import
                                   :id id
                                   :subject qi})

    :ExternalImportDeclaration (fn eximptd [id mr] {:op :ext-import
                                           :id id
                                           :ref mr})

    :ExternalModuleReference (fn exmodr [slit] slit)

    :ExportAssignment (fn exas [id] id)

    :AmbientVariableDeclaration (fn vard [id ta] {:op gen/declare-var
                                            :id id
                                            :annotation ta})

    :AmbientFunctionDeclaration (fn fnd [id sig] {:op gen/declare-function
                                                 :id id
                                                 :signature sig})

    :AmbientClassDeclaration (fn clsd [id tps ch cb] {:op :class
                                                :id id
                                                :t-params tps
                                                :heritage ch
                                                :body cb})

    ;;:AmbientClassBody (fn [& be] be)

    :AmbientClassBodyElement (fn clsbe [& be] be)

    :AmbientConstructorDeclaration (fn ctrd [pl] {:op :constructor
                                            :params pl})

    :AmbientPropertyMemberDeclaration (fn pmd ([al pn ta] {:op :prop
                                                      :access-lev al
                                                      :annotation ta
                                                      :static? false})
                                        ([al static pn ta]
                                           {:op :prop
                                            :access-lev al
                                            :annotation ta
                                            :static? true}))

    :AmbientEnumDeclaration (fn enmd [id body] {:op :enum
                                          :id id
                                          :body body})

    ;;:AmbientEnumBody (fn [])

    :AmbientEnumMember (fn enmm ([pn] pn)
                         ([pn eq] (list pn eq)))

    :AmbientModuleDeclaration (fn modd [qi & mb] {:op :module
                                               :id qi
                                               :body mb})

    ;;:AmbientModuleBody (fn [& xs] xs)

    ;;:AmbientModuleElement (fn [& _])

    :AmbientExternalModuleDeclaration (fn exmodd [slit emb] {:op :ext-module
                                                     :name slit
                                                     :body emb})

    ;;:AmbientExternalModuleBody (fn [& _])
    ;;:AmbientExternalModuleElement (fn [& _])

    :LiteralValue (fn litv [x] (list :literal x))
    :StringLiteral (fn strl [x] (list :string x))
    :NumericLiteral (fn numl [x] (list :number x))
    :AccessLevel (fn acsl ([] nil)
                   ([x] x))}

   tree))



(defn -main []
  (doseq [t (output-ts);(take 10 (drop 60 (output-ts)))
          ]
    (pp/pprint (map gen/gen-tc (transform t)))
    ;;(pp/pprint t)
    ))
