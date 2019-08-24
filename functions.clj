;;https://clojure.org/guides/learn/functions

;;    name   params         body
;;    -----  ------  -------------------
(defn greet  [name]  (str "Hello, " name) )

user=> (greet "students")
;;"Hello, students"

;;Variadic fns

(defn hello [greeting & who]
  (println greeting who))

user=> (hello "Hello" "world" "class")
Hello (world class)
