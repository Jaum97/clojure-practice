;;https://clojure.org/guides/higher_order_functions

(def bands [
    {:name "Brown Beaters"   :genre :rock}
    {:name "Sunday Sunshine" :genre :blues}
    {:name "Foolish Beaters" :genre :rock}
    {:name "Monday Blues"    :genre :blues}
    {:name "Friday Fewer"    :genre :blues}
    {:name "Saturday Stars"  :genre :jazz}
    {:name "Sunday Brunch"   :genre :jazz}
])

(def rock-bands
    (filter
        (fn [band] (= :rock (:genre band)))
        bands))
        
(def rock-bands (filter #(= :rock (:genre %)) bands))
