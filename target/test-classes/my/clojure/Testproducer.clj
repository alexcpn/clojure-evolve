
(ns my.clojure.Testproducer
        (:use my.clojure.producer)
        (:use clojure.test)
      (:gen-class)
  )

(deftest test-addandcheck
  
  (addtask 1)
  (addtask 2)
  (is(= 0 (count (gettasklist))))
  ;(addtask 3)
  ;(addtask 4)
  ;(list? gettasklist)
  ;(is (= true (true? (= 2(+ 1 1)))))//learning boolean test
  ;(println (str "The number of tasks are") count gettasklist)
  (println (str "The number of tasks are") (count (gettasklist)))
  
 )


