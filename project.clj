(defproject example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [metosin/compojure-api "2.0.0-alpha18"]
                 [metosin/spec-tools "0.5.1"]]
  :jvm-opts ["-Xmx256m"]
  :ring {:handler example.handler/app, :async? true}
  :uberjar-name "server.jar"
  :profiles {:dev {:plugins [[lein-ring "0.12.0"]]}})
