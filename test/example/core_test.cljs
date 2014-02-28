(ns example.core-test
  (:require [example.core :refer [add5]])
  (:use-macros [purnam.core :only [obj arr ! f.n def.n]]
               [purnam.test :only [describe it is is-not]]))

(describe
  (it "FIX THIS: One Plus One Equals... " 
     (is (+ 1 1) 2)))

(describe
  (it "FIX THIS: add5... " 
     (is (add5 10)  15) 
     (is (add5 100) 105)
     (is (add5 1000) 1005)))

(describe
 {:doc "One Plus One Examples:"
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
     (is o1 (array 0 1 2 3 4))))

