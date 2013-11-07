(ns purnam-karma-testing.test-sweet-doc
  (:use [purnam.cljs :only [aget-in aset-in js-equals]])
  (:use-macros [purnam.js :only [! ? f.n def.n obj arr]]
               [purnam.test :only [init describe is it]]
               [purnam.test.sweet :only [fact facts]]))

[[{:hide true}]]
(init)

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

(def o (obj :a 1 :b 2 :c 3))

(facts [[{:doc "an example test description"
          :globals [ka "a"
                   kb "b"]
          :vars [o (obj :a 1 :b 2 :c 3)]}]]
 
 "Here are some examples"
 
 [[:subsubsection {:title "dot notation for native objects"}]]
 o.a => 1
 (+ o.a o.b o.c) => 6


 [[:subsubsection {:title "support for both native and cljs comparisons"}]]
 o => (obj :a 1 :b 2 :c 3)
 [1 2 3 4] => [1 2 3 4]

 [[:subsubsection {:title "support for function comparison"}]]
  2 => even?
  3 => (comp not even?)

  [[:subsubsection {:title "globals can be accessed"}]]
  o.|ka| => 1
  (+ o.|ka| o.|kb|) => 3

  [[:subsubsection {:title "vars can be rebound"}]]
  (! o (arr [1 2 3]
            [4 5 6]
            [7 8 9]))
          
  (- o.2.2 o.0.0) => 8)