(defproject example.purnam.test "0.0.0-SNAPSHOT"
  :description "Karma testing with clojurescript"
  :url "https://www.github.com/zcaudate/example.purnam.test"
  :license {:name "The MIT License"
            :url "http://opensource.org/licencses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [im.chit/purnam.test "0.4.3"]]
 :profiles {:dev {:dependencies [[org.clojure/clojurescript "0.0-2138"]
                                 [midje "1.6.0"]]
                  :plugins [[lein-cljsbuild "1.0.0"]
                            [lein-midje-doc "0.0.18"]]}}
 :documentation {:files {"doc/index"
                         {:input "test/example/test_sweet_doc.cljs"
                          :title "purnam.test examples"
                          :sub-title "testing on clojurescript"
                          :author "Chris Zheng"
                          :email  "z@caudate.me"
                          :tracking "UA-31320512-2"}}}
  :cljsbuild
  {:builds  [{:source-paths ["src" "test"],
              :id "karma-test",
              :compiler {:pretty-print true,
                         :output-to "karma-test.js",
                         :optimizations :whitespace}}]})
