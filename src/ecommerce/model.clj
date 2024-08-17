(ns ecommerce.model)


(def ^:private product-keys [:nome :slug :preco])

(defn ^:private build-product-map [args]
  (zipmap product-keys args))

(defn ^:private produto->schema [produto]
  (-> {}
      (assoc :produto/nome (:nome produto))
      (assoc :produto/slug (:slug produto))
      (assoc :produto/preco (:preco produto))))

(defn novo-produto [& args]
  (do
    (-> args
        (build-product-map)
        (produto->schema))))
