(ns clojure-noob.core
  (:gen-class))

(defn push2
  [v]
  (conj v 1))
;(push2 [1 2])
;[1 2 1]

(defn list
  []
  (conj '(1 2 3) 4))
;(list)
;(4 1 2 3)


(defn getMap
  [m]
  (get-in m [:a :b] ))

(defn getInfo
  [m]
  (get m :a))

(defn addHash
  [hash]
  (conj hash 1))
;(addHash #{1 2})
;#{1 2}

(defn se
  []
  (set [1 1 2 2]))

(defn containTest
  []
  (contains? {:a 1 :b 2} :a))

(defn containIf
  []
  (if (contains? {:a 1 :b 2} :c)
    (get {:a (str true)} :a) (get {:b (str false)} :b) ))

(defn test3
  []
  (contains? [1 2 3 4] 4))


(defn test4
  []
  (contains? [:a :b :c] :c))
;false
;the index of c is not present and the key are only available in a map

(defn test5
  []
  (contains? {:a 100 :c (str "test")} :c))
;true

(defn t
  []
  (first [1 2 3 4 5]))

(defn l
  []
  (last [1 2 3 4]))

(defn fs
  []
  (first '(1 2 3 "mike")))

(defn a
  []
  (first [[[1 2 3]] [[2 3 4]]]))


