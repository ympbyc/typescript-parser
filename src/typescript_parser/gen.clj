(ns typescript-parser.gen)

(defn gen-tc
  "Generate Typed Clojure annotation from AST"
  [{op :op :as tree}]
  (if (fn? op) (op tree) '*not-implemented*))

(defn declare-var [{:keys [id annotation]}]
  (list 'ann (:id id) (gen-tc annotation)))

(defn declare-function
  [{:keys [id signature]}]
  (list 'ann (:id id) (gen-tc signature)))

(defn call
  [{:keys [t-params param-ts annotation]}]
  (vec (concat (map gen-tc param-ts) ['-> (gen-tc annotation)])))

(defn req-param
  [{:keys [id annotation]}]
  (gen-tc annotation))

(defn opt-param
  [{:keys [annotation]}]
  {:opt (gen-tc annotation)})

(defn identifier
  [{:keys [id]}]
  id)

(defn interface
  [{:keys [id t-params extends type]}]
  (->> (gen-tc type)
       (cons (:id id))
       (cons 'ann-interface)))

(defn obj-t
  [{:keys [body]}]
  (mapcat gen-tc body))

(defn parameter
  [{:keys [id annotation]}]
  (list (:id id) (gen-tc annotation)))

(defn method
  [{:keys [id call]}]
  (list (:id id) (gen-tc call)))


(defn index
  [{:keys [id key-t annotation]}]
  (list [] [key-t '-> (gen-tc annotation)]))


(defn array-t
  [{:keys [elt]}]
  (list (gen-tc elt) '*))
