(defproject cloj-commandline-example "0.1.0-SNAPSHOT"
  :description "Example of how to package a clojure program for running on the command line"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.2.4"]]
  :plugins [[lein-bin "0.3.4"]]
  :main ccle.core
  :bin { :name "ccle" })
