;;https://clojurebridge.org/community-docs/docs/getting-started/helloworld/
user=> (prn "Hello World")
"Hello World"
nil
user=> (println "Hello World")
Hello World
nil
user=> (pr-str "Hello World")

;;https://clojure.org/about/functional_programming
(def hello (fn [] "Hello world"))
-> #'user/hello
(hello)
-> "Hello world"
