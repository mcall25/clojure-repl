(ns clojure-noob.vectors)


;vector are similar to an array in js. [1 2 3 4 5 5 5]


(defn vector
  [v]
  (get v 0))
;(vector [1 2 3 4 5 6 7 8 9 0])
;1

(defn push
  [v]
  (conj v 1 2 3 4))
;(push [9 9 9 ])
;[9 9 9 1 2 3 4]

