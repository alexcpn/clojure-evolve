(ns my.clojure.learn

 (:gen-class))
 
(defn main  [args]
  
  (println  "A red apple tree" )
  
  (println (def x(str "Hello " args "!")) )
   x
 )
 

(defn add [x y]
    (+ x y)
)

( defn workingwithlist []
  
  (println "In the function workingwithlist")
  
  (def listx (list 1 (add 1 1) 3 4  ))
 
  (doseq [item listx]
   (println item))
  
    listx
  )