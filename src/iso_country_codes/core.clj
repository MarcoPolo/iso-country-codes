(ns iso-country-codes.core
  (:use iso-country-codes.countries))

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
  (->
    (filter #(= (input-type %) value) countries)
    (first)))

;;Some examples
(comment 
  (country-translate :alpha-2 :name "US")
  (get-country-attributes :alpha-2 "US")
  )

