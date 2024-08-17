(ns ecommerce.core
  (:use clojure.pprint)
  (:require [datomic.api :as d]
            [ecommerce.db :as db]
            [ecommerce.model :as model]))

(def conn (db/abre-conexao))

(db/cria-schema conn)

(def computador (model/novo-produto "Computador Novo" "/computador-novo" 1000M))

(pprint computador)

(d/transact conn [computador])
