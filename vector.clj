(defn _vec-op [op a b]
  (if (not-empty a)
    (cons (op (first a) (first b))
          (_vec-op op (rest a) (rest b)))
    ()
  )
)

(defn vec-add [a b]
  (_vec-op + a b)
)

(defn vec-sub [a b]
  (_vec-op - a b)
)

(defn vec-dot [a b]
  (reduce + (_vec-op * a b))
)

(defn vec-cross [a b]
  [
    (- (* (nth a 1) (nth b 2)) (* (nth a 2) (nth b 1)))
    (- (* (nth a 2) (nth b 0)) (* (nth a 0) (nth b 2)))
    (- (* (nth a 0) (nth b 1)) (* (nth a 1) (nth b 0)))
  ]
)

;(defn vec-len [a]
;  (sqrt (map #(* %1 %1) a))
;)
