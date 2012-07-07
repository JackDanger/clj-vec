(defmacro expect [given expected]
  (let [given-result (eval given) expected-result (eval expected)]
    (if (= given-result expected-result)
      (println "   PASS:" given "=" expected)
      (println "x  FAIL:" given "!=" expected
               "\n     expected" given-result "to equal" expected-result)
    )
  )
)

(defmacro pending [reason expr]
  (println "PENDING:" (nth expr 1) "?=" (nth expr 2)
           "\n    " reason)
)
