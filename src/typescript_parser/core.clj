(ns typescript-parser.core
  (:require [instaparse.core :as insta]
            [clojure.pprint :as pp]
            [clojure.string :as str])
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
    (fn tp [id constraint] (list :t-param id constraint))

    :Identifier
    (fn idt [id] (symbol id))

    :Constraint (fn cstr [& c] c)

    :Type (fn typ [t] t)

    :TypeReference (fn tr
                     [id tas] (cons id (seq tas)))

    :QualifiedIdentifier
    (fn qi ([id] id)
      ([module id] (symbol (str module "/" id))))

    :ModuleName (fn mn [& ids] (apply str ids))

    :TypeArguments (fn tas [& targs] targs)

    :TypeArgumentList (fn tal [& targ] (vec targ))

    :TypeArgument (fn ta [t] (list :type-arg t))

    :TypeQuery (fn tq [qi] (list :type-of qi))

    :TypeLiteral (fn tl [t] t)

    :ArrayType (fn arrt [elt] (list :array-t elt))

    :FunctionType (fn fnt
                    ([tps ps t] {:op :fn-t
                                 :t-params tps
                                 :param-ts ps
                                 :out-t t}))

    :ConstructorType (fn ct [ft] (list :ctor-t ft))

    :ObjectType (fn ot [tbody] {:op :obj-t
                               :body tbody})

    ;;:TypeBody

    :TypeMemberList (fn tml [& tms] tms)

    :TypeMember (fn tm [tm] tm)

    :PropertySignature (fn ps
                         [pn ta] (list :property pn ta))

    :PropertyName (fn pn [pn] pn)

    :CallSignature (fn cs ([tps pl ta] {:op :call
                                       :t-params tps
                                       :param-ts  pl
                                       :annotation ta}))

    :Parameter-List (fn pl [& pls] pls)

    :RequiredParameter (fn ([al id ta] {:op :req-param
                                       :access-lev al
                                       :id id
                                       :annotation ta})
                         ([id slit] {:op :req-param
                                     :id id
                                     :deco slit}))

    :OptionalParameter (fn ([al id ta] {:op :opt-param
                                       :access-lev al
                                       :id  id
                                       :annotation ta
                                       :init nil})
                         ([al id ta init] {:op :opt-param
                                           :access-lev al
                                           :id  id
                                           :annotation ta
                                           :init  init}))

    :Initializer (fn [v] v)
    :RestParameter (fn [id ta] {:op :rest-param
                               :annotation ta})

    :IndexSignature (fn [id s-or-n ta] {:op :index
                                       :id id
                                       :key-t s-or-n
                                       :annotation ta})

    :MethodSignature (fn [prop-name call] {:op :method
                                          :id prop-name
                                          :call call})

    :TypeAnnotation (fn ([] nil)
                      ([t] (first t)))

    :InterfaceDeclaration (fn [id tps iec ot] {:op :interface
                                              :id  id
                                              :t-params tps
                                              :extends iec
                                              :type ot})

    :InterfaceExtendsClause (fn ([] nil)
                              ([x] x))

    ;;:ClassOrInterfaceTypeList (fn [& _])

    :ClassHeritage (fn [cec iec] {:op :heritage
                                 :interface iec
                                 :class cec})

    :ClassExtendsClause (fn ([] nil)
                          ([c] c))

    :ImplementsClause (fn ([] nil)
                        ([x] x))

    :ImportDeclaration (fn [id qi] {:op :import
                                   :id id
                                   :subject qi})

    :ExternalImportDeclaration (fn [id mr] {:op :ext-import
                                           :id id
                                           :ref mr})

    :ExternalModuleReference (fn [slit] slit)

    :ExportAssignment (fn [id] id)

    :AmbientVariableDeclaration (fn [id ta] {:op :var
                                            :id id
                                            :annotation ta})

    :AmbientFunctionDeclaration (fn [id sig] {:op :function
                                             :id id
                                             :signature sig})

    :AmbientClassDeclaration (fn [id tps ch cb] {:op :class
                                                :id id
                                                :t-params tps
                                                :heritage ch
                                                :body cb})

    ;;:AmbientClassBody (fn [& be] be)

    :AmbientClassBodyElement (fn [& be] be)

    :AmbientConstructorDeclaration (fn [pl] {:op :constructor
                                            :params pl})

    :AmbientPropertyMemberDeclaration (fn ([al pn ta] {:op :prop
                                                      :access-lev al
                                                      :annotation ta
                                                      :static? false})
                                        ([al static pn ta]
                                           {:op :prop
                                            :access-lev al
                                            :annotation ta
                                            :static? true}))

    :AmbientEnumDeclaration (fn [id body] {:op :enum
                                          :id id
                                          :body body})

    ;;:AmbientEnumBody (fn [])

    :AmbientEnumMember (fn ([pn] pn)
                         ([pn eq] (list pn eq)))

    :AmbientModuleDeclaration (fn [qi mb] {:op :module
                                          :id qi
                                          :body mb})

    ;;:AmbientModuleBody (fn [& _])

    ;;:AmbientModuleElement (fn [& _])

    :AmbientExternalModuleDeclaration (fn [slit emb] {:op :ext-module
                                                     :name slit
                                                     :body emb})

    ;;:AmbientExternalModuleBody (fn [& _])
    ;;:AmbientExternalModuleElement (fn [& _])

    :LiteralValue (fn [x] (list :literal x))
    :StringLiteral (fn [x] (list :string x))
    :NumericLiteral (fn [x] (list :number x))
    :AccessLevel (fn ([] nil)
                   ([x] x))}

   tree))


#_(transform (first (output-ts)))


(defn -main []
  (doseq [t (take 20 (output-ts))]
    (pp/pprint (transform t))))
