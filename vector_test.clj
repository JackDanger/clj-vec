(load "test")
(load "vector")

; testing the expect function
(expect 1 1)
(expect (+ 1 1) 2)
(expect (+ 1 0) 2)

(expect (vec-add [0 0 0] [1 2 3])
        [1 2 3]
)
(expect (vec-sub [5 6] [1 1])
        [4 5]
)
(expect (vec-dot [1 1 1 1 1] [2 2 2 2 2])
        10
)
(pending "figuring out how to import sqrt"
  (expect (vec-len [2 2 2 2])
          4
  )
)
