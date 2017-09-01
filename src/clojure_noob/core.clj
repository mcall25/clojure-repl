(ns clojure-noob.core
  (:gen-class))


(defn map
  []
  (get {:a 10} :a))
;(map)

(defn map2
  [map]
  (get map :a))
;(map2 {:a 2})