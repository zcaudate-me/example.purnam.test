(ns purnam-karma-testing.core-test
  (:use [purnam.cljs :only [aget-in aset-in]])
  (:require-macros [purnam.js :as j])
  (:use-macros [purnam.js :only [obj arr ! f.n def.n]]
               [purnam.test :only [init describe it is is-not
                                   is-equal is-not-equal]]))

;; We have to initiate the jasmin test framework
(init)

(describe
  (it "FIX THIS: One Plus One Equals..." 
     (is (+ 1 1) 11)))

(describe
 {:doc "More One Plus One Examples:"
  :globals [one-plus-one (+ 1 1)]}
 (it "One plus one is:" 
   (is one-plus-one 2)
   (is-not one-plus-one 11)
   (is one-plus-one even?)
   (is-not one-plus-one odd?)
   (is (js* "1+1") 2)
   (is (js* "'1'+'1'") "11")))


(describe
 {:doc "Array Examples"
  :globals [o1 (arr 0 1 2 3 4)]}
 (it "describes something"
     (is o1.0 0)
     (is o1.1 odd?)
     (is-not   o1 (array 0 1 2 3 4))
     (is-equal o1 (array 0 1 2 3 4))))
