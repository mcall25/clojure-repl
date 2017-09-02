(ns clojure-noob.contains?)


;Contains? return a value if a key or indeces is in a given array or map.
;it will confuse you if you are looking for a specific value (contains? [1 2 3] 4) will equal false because the
;index of 4 is not present in the vector
;contains? should not be used for lists

(defn test4
  []
  (contains? [:a :b :c] :c))
;false
;the index of c is not present and the key are only available in a map


(defn test5
  []
  (contains? {:a 100 :c (str "test")} :c))
;true