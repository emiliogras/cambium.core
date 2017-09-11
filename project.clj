(defproject cambium/cambium.core "0.9.1-SNAPSHOT"
  :description "Core module for the Cambium logging API"
  :url "https://github.com/cambium-clojure/cambium.core"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.2.0"
  :pedantic? :abort
  :dependencies [[org.slf4j/slf4j-api       "1.7.25"]
                 [org.clojure/tools.logging "0.4.0" :exclusions [org.clojure/clojure]]]
  :global-vars {*warn-on-reflection* true}
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :codec-simple {:dependencies [[cambium/cambium.codec-simple "0.9.1"]]}
             :nested-test  {:test-paths ["nested-test"]}
             :dev {:dependencies [[org.clojure/tools.nrepl "0.2.12"]]}
             :logback {:dependencies [[ch.qos.logback/logback-classic "1.1.7"]
                                      [ch.qos.logback/logback-core    "1.1.7"]]}
             :log4j12 {:dependencies [[org.slf4j/slf4j-log4j12 "1.7.25"]
                                      [log4j/log4j "1.2.17"]]}
             :log4j2  {:dependencies [[org.apache.logging.log4j/log4j-api  "2.6.2"]
                                      [org.apache.logging.log4j/log4j-core "2.6.2"]
                                      [org.apache.logging.log4j/log4j-slf4j-impl "2.6.2"]]}
             :c15 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :c16 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :c17 {:dependencies [[org.clojure/clojure "1.7.0"]]
                   :global-vars  {*unchecked-math* :warn-on-boxed}}
             :c18 {:dependencies [[org.clojure/clojure "1.8.0"]]
                   :global-vars  {*unchecked-math* :warn-on-boxed}}
             :c19 {:dependencies [[org.clojure/clojure "1.9.0-alpha20"]]
                   :global-vars  {*unchecked-math* :warn-on-boxed}}
             :dln {:jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})