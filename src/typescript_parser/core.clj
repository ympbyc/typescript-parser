(ns typescript-parser.core
  (:require [instaparse.core :as insta]
            [clojure.pprint :as pp]
            [clojure.string :as str]
            [typescript-parser.transform :as tr]
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


(defn -main []
  (doseq [t (take 1000 (output-ts))
          chunk (map gen/gen-tc (tr/transform t))]
    (pp/pprint chunk)))
