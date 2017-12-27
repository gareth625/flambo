(ns flambo.function-test
  (:use midje.sweet)
  (:require [flambo.function :as func]))

(defmacro gen-udfs
  []
  (let [arglists# (mapv (fn [i#] (mapv (comp gensym str char) (range 97 (+ 97 i#))))
                         (range 1))
        udfs#     (mapv (fn [args#] `(func/udf ~@args#
                                               (reduce + args#)))
                        arglists#)]
    udfs#))

(comment

  (gen-udfs)


  (func/udf [x] (inc x))

  )


(facts
 "about SparkSQL UDFs"

 (fact))


(comment



  )
