(ns example.handler
  (:require [compojure.api.sweet :refer [api]]
            [example.spec]))

(def app
  (api
    {:swagger
     {:ui "/"
      :spec "/swagger.json"
      :data {:info {:title "Compojure-api demo"
                    :description "Demontrating 2.0.0 (alpha) coersion"}
             :tags [{:name "spec", :description "math with clojure.spec coercion"}]}}}

    example.spec/routes))
