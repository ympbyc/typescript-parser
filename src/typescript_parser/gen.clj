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


;; number string? -> number   ---> (Fn [number -> number] [number string -> number])
;; number ...string -> number ---> [number string * -> number]
(defn call
  [{:keys [t-params param-ts annotation]}]
  (let [ps (map gen-tc param-ts)
        an (gen-tc annotation)
        reqs (map :annotation (filter #(= (:param-prop %) :required) ps))
        opts (map :annotation (filter #(= (:param-prop %) :optional) ps))
        rest (first (map #(if % (list (first (rest %)) '*))
                         (map :annotation (filter #(= (:param-prop %) :rest) ps))))
        t    (map (fn [i] (vec (concat reqs (take i opts) ,,, )))
                  (range 0 (inc (count opts))))
        t    (map (fn [x] (vec (concat x ['-> an])))
                  (concat (butlast t) (list (concat (last t) rest))))
        t    (if (> (count opts) 0) (cons 'Fn t) (first t))]
    (if t-params
      (list 'All (vec (map gen-tc t-params)) t)
      t)))

(defn req-param
  [{:keys [id annotation]}]
  {:param-prop :required
   :annotation (gen-tc annotation)})

(defn opt-param
  [{:keys [annotation]}]
  {:param-prop :optional
   :annotation (gen-tc annotation)})

(defn rest-param
  [{:keys [annotation]}]
  {:param-prop :rest
   :annotation (gen-tc annotation)})

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
  (list 'Seq (gen-tc elt)))

(defn t-param
  [{:keys [id constraint]}]
  (:id id))
