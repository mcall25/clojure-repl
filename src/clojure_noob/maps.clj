(ns clojure-noob.maps)


(ns clojure-noob.core
  (:gen-class))


;example of map, get, get-in, vectors

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
