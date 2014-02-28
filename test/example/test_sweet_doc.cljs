(ns example.test-sweet-doc
  (:require [purnam.test])
  (:use-macros [purnam.test :only [fact facts]]))

[[:chapter {:title "testing clojure"}]]

[[:section {:title "'pure' clojurescript hashmaps"}]]

"Remember, these are tests in clojurescript!"

(def o {:a 1 :b 2 :c 3})

(facts [[{:doc "Basic Hashmaps"
          :globals [o {:a 1 :b 2 :c 3}]}]]
  (o :a)       => 1 
  (o :a)       => #(not= 0 %)
  (get o :b)   => 2
  (:c o)       => 3
  (select-keys o [:a :b]) => {:a 1 :b 2})


[[:section {:title "native javascript objects"}]]

"We now look at doing tests on native javascript objects"

(facts [[{:doc "an example test description"
          :globals [ka "a"
                    kb "b"]
          :vars [o (js* "{a:1,b:2,c:3}")
                 m (js* "[[1, 2, 3], [4, 5, 6],[7, 8, 9]]")]}]]
 
 "Here are some examples"
 
 [[:subsection {:title "dot notation for native objects"}]]
 o.a => 1
 (+ o.a o.b o.c) => 6


 [[:subsection {:title "native and cljs comparisons"}]]
 o => (js* "{a:1,b:2,c:3}")
 [1 2 3 4] => [1 2 3 4]

 [[:subsection {:title "function comparison"}]]
  2 => even?
  3 => (comp not even?)

  [[:subsection {:title "globals can be accessed"}]]
  o.|ka| => 1
  (+ o.|ka| o.|kb|) => 3

  [[:subsection {:title "matrices"}]]
          
  (- m.2.2 m.0.0) => 8)