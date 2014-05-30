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
  (let [ts-src (slurp "lib.d.ts.short")
        tss (str/split ts-src #"\}")]
    (apply concat (pmap #(grammar (str % "}"))
                        tss))))

(defn transform [tree]
  (insta/transform
    {:Identifier
     (fn id [id] id)
     :QualifiedIdentifier
     (fn qid
       ([id] id)
       ([module id] (str module "." id)))
     :ModuleName
     (fn mn [nme & nms]
       (apply str (interpose "." (concat nme nms))))
     :TypeReference
     (fn tr
       ([id]
        {:op :type-reference
         :id id})
       ([id targs]
        {:op :type-reference
         :id id
         :targs targs}))
     :AmbientVariableDeclaration
     (fn avd
       ([id]
        {:op :ambient-var-declaration
         :id id})
       ([id type]
        {:op :ambient-var-declaration
         :id id
         :type type}))
     :AmbientFunctionDeclaration
     (fn afd
       [id sig]
       {:op :ambient-fn-declaration
        :id id
        :sig sig})
;     :CallSignature
;     (fn [& args]
;       (merge {:op :call-signature}
}

    tree))

(defn ast->ann [tree]
  (insta/transform
   {:AmbientVariableDeclaration
    (fn var-dec [id type] (list 'ann id type))

    :TypeAnnotation
    identity

    :Type
    identity

    :TypeReference
    identity

    :QualifiedIdentifier
    identity

    :Identifier
    identity

    :CallSignature
    (fn cs ([x] x)
      ([x y] (concat x y)))

    :Parameter-List
    (fn pl [& req] req)

    :RequiredParameter
    (fn rp [& xs] xs)

    :OptionalParameter
    (fn op [& xs] xs)

    :AmbientFunctionDeclaration
    (fn fn-dec ([id cs]
                 (list 'ann id cs)))
    }
   tree))

#_(transform (first (output-ts)))


(defn -main []
  (doseq [t (output-ts)]
    (pp/pprint (ast->ann t))))
