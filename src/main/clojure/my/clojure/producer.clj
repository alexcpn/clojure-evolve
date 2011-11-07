;a simple producer class
(ns my.clojure.producer
    (:use  my.clojure.consumer)
  (:gen-class)
  )
  
 (def tasklist( ref (list) )) ;this is declared as a global variable; to make this 
    ;mutable we need to use the fn ref
  

(defn gettasklist[]
    (deref tasklist) ;we need to use deref fn to return the task list
  )
(def testagent (agent 0))
(defn emptytasklist[akey aref old-val new-val]
  
   (doseq [item (gettasklist)]
        (println(str "item is") item)
        (send testagent consume item)
        (send testagent increment item)
     )
      (. java.lang.Thread sleep 1000)
   (dosync ; adding a transaction for this is needed to reset
     
      (remove-watch tasklist "key123"); removing the watch on the tasklist so that it does not
                                       ; go to a recursive call
      (ref-set tasklist (list ) ) ; we need to make it as a ref to reassign
      (println (str "The number of tasks now remaining is=")  (count (gettasklist)))
     
     )
  (add-watch tasklist "key123" emptytasklist)
 )
(add-watch tasklist "key123" emptytasklist)

  (defn addtask [task] 
    (dosync ; adding a transaction for this is needed to refset
      ;(println (str "The number of tasks before") (count (gettasklist)))
      (println (str "Adding a task") task)
      (ref-set tasklist (conj (gettasklist) task )) ; we need to make it as a ref to reassign
      ;(println (str "The number of tasks after") (count (gettasklist)))
     )
  )



