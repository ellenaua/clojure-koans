(defn recursive-reverse [coll]
  (print coll)
  (print coll)
  (if (empty? coll)
    coll
    (list* (recursive-reverse (rest coll) (first coll)))
  )
)