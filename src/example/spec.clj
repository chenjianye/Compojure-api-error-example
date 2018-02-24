(ns example.spec
  (:require [compojure.api.sweet :refer [context POST]]
            [clojure.spec.alpha :as s]))

(def routes
  (context "/spec" []
    :tags ["spec"]
    :coercion :spec
    (POST "/records" []
          :body-params [string1 :- string?
                        string2 :- string?
                        string3 :- string?
                        string4 :- string?
                        coll1 :- (s/coll-of map?)]
          :return string?
          (str string1 string2 string3 string4 coll1))))
