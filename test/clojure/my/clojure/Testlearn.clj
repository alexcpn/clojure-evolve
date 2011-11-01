(ns my.clojure.Testlearn
	(:use my.clojure.learn)
	(:use clojure.test)
      (:gen-class)
 )
	
(deftest test-add
  ; equals is easy what about not equal to
  (is(not= 5 (add 1 2)))
  )

(deftest test-add2
  ; equals is easy what about not equal to
  (is(= 3 (add 1 2)))
  )

(deftest test-helloworld
  
  (is(= "Hello World!"(main "World")))
 )

(deftest test-lists
  
  ;(println "Testing lists")
  (list? (workingwithlist))
  
  )