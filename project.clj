(defproject purnam-karma-testing "0.0.0-SNAPSHOT"
  :description "Karma testing with clojurescript"
  :url "http://docs.caudate.me/purnam-crafty-game"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1978"]
                 [im.chit/purnam "0.1.5"]]
  
  :cljsbuild
  {:builds  [{:source-paths ["src" "test"],
              :id "karma-test",
              :compiler {:pretty-print true,
                         :output-to "karma-test.js",
                         :optimizations :whitespace}}]})
