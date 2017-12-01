(ns iso-country-codes.core
  (:require [clojure.string :refer [lower-case]])
  (:use iso-country-codes.countries))

(declare get-country-attributes)
(defn country-translate
  "Translates a certain type of country code into another type
  args: input-type output-type value
  e.g.
  (country-translate :alpha-2 :name \"US\" "
  [input-type output-type value]
  (output-type (get-country-attributes input-type value)))

(defn get-country-attributes
  "returns all attributes for a given country"
  [input-type value]
  (let [lower-val (lower-case value)]
    (some
     (fn [attrs]
        ;; Have to check found-val seperately, as str/lower-case
        ;; can not handle nil.
       (let [found-val (input-type attrs)]
         (if (and found-val (= (lower-case found-val) lower-val))
           attrs
           false)))
     countries)))

;;Some examples
(comment 
  (country-translate :alpha-2 :name "US")
  (get-country-attributes :alpha-2 "US")
  )
