(ns clojure-noob.maps)


(ns clojure-noob.core
  (:gen-class))

;map are a key value pair of data {:a 2 :b (1) } or { :a {:b ( + 1 2 3) }}
;example of map, get, get-in

(get {:a 2} :a)
;2

(get-in {:a
         {:b
          {:c
           {:d (str "this is a nested map of values")}}}} [:a :b :c :d])
;"this is a nested map of values"

(get [1 2 3] 0)
;1

({:name (str "I am the best ever at clojur")} :name)
;I am the best ever at clojur

(defn map
  []
  (get {:a 10} :a))
;(map)

(defn map2
  [map]
  (get map :a))
;(map2 {:a 2})