# iso-country-codes

Simplify converting different types of iso country codes

## Usage

The most useful function is country-translate. specify the input-type, output-type, and value.

So to convert an alpha-2 iso code to a full name:
  ` (country-translate :alpha-2 :name "US")  `

The different types are
` [ :alpha-2 :alpha-3 :country-code :name :iso_3166-2 :region-code :sub-region-code ] `

You can also get all the attributes of a specific country using:
  ` (get-country-attributes :alpha-2 "US") `

The arguments here are just input-type and value


## Notes
    Data fetched from: https://github.com/lukes/ISO-3166-Countries-with-Regional-Codes

## License

Distributed under the Eclipse Public License, the same as Clojure.
