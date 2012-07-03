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

;(defn vec-len [a]
;  (sqrt (map #(* %1 %1) a))
;)
