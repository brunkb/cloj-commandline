(ns ccle.core
  (:require [clojure.tools.cli :refer [cli]])
  (:gen-class))


(defn -main
  "Clojure command-line program example"
  [& args]
  (let [[opts args banner] (cli args
        ["-h" "--help" "Print this help"
         :default false :flag true])]
    (if (:help opts)
      (println banner)
      (println "Example command line program has completed its processing"))))
