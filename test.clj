(defmacro expect [given expected]
  (if (= (eval given) (eval expected))
    (println "   PASS:" given "=" expected)
    (println "x  FAIL:" given "!=" expected
             "\n     expected" (eval given) "to equal" (eval expected))
  )
)

(defmacro pending [reason expr]
  (println "PENDING:" (nth expr 1) "?=" (nth expr 2)
           "\n    " reason)
)
