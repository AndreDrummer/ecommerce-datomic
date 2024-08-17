(ns ecommerce.db
  (:use clojure.pprint)
  (:require [datomic.api :as d]))


(def db-uri "datomic:dev://localhost:4334/ecommerce")

(defn abre-conexao []
  (d/create-database db-uri)
  (d/connect db-uri))

(defn apaga-banco []
  (d/delete-database db-uri))

; Supunhetemos que quero inserir um novo produto no banco de dados
; Para isso, preciso de um schema que defina a estrutura do banco.
; No datomic, trabalhamos com uma abordagem chamada Entity-Attribute-Value
; onde uma entidade é um mapa que contém atributos e valores.
; Por exemplo, um produto pode ser uma entidade que contém os atributos
; :nome, :slug e :preco.
; O schema é uma lista de mapas que definem os atributos de cada entidade.
; No caso do produto, o schema seria:
; [{:db/ident :produto/nome
;   :db/valueType :db.type/string
;   :db/cardinality :db.cardinality/one
;   :db/doc "Nome do produto"}
;  {:db/ident :produto/slug
;   :db/valueType :db.type/string
;   :db/cardinality :db.cardinality/one
;   :db/doc "Slug do produto"}
;  {:db/ident :produto/preco
;   :db/valueType :db.type/long
;   :db/cardinality :db.cardinality/one
;   :db/doc "Preço do produto"}]
; O schema é uma lista de mapas onde cada mapa define um atributo.

(def schema [{:db/ident       :produto/nome
              :db/valueType   :db.type/string
              :db/cardinality :db.cardinality/one
              :db/doc         "Nome do produto"}
             {:db/ident       :produto/slug
              :db/valueType   :db.type/string
              :db/cardinality :db.cardinality/one
              :db/doc         "Slug do produto"}
             {:db/ident       :produto/preco
              :db/valueType   :db.type/bigdec
              :db/cardinality :db.cardinality/one
              :db/doc         "Preço do produto"}])

(defn cria-schema [conn]
  (d/transact conn schema))
