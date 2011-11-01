
(ns my.clojure.consumer
  ;(:require )
  
  ;(:import )
  )
(defn consume[c item]
  
  (println  "In the consume method:Item is " c item  )
  item 
)
(defn increment [c n] 
  (println "parmeters are" c n)
  (+ c n)
  )
