//https://practicalli.github.io/clojure/thinking-functionally/partial-functions.html

(reduce + [1 2 3 4])
;; => 10

(reduce + [1 2 3 4] [5 6 7 8])
;; returns an error due to invalid arguments

(map (partial reduce +) [[1 2 3 4] [5 6 7 8]])
