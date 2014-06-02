# typescript-parser

Parse TypeScript type declaration files.


```
declare function eval(x: string): any;

interface Number {
    toString(radix?: number): string;
    toFixed(fractionDigits?: number): string;
    toExponential(fractionDigits?: number): string;
    toPrecision(precision: number): string;
}
```

instaparse

```
[{:op       :function
  :id       'eval
  :type-in  ['string]
  :type-out any}

 {:op      :interface
  :id      'Number
  :methods [
    {:op       :function
     :id       :toString
     :type-in  ['number]
     :type-out 'string}
    {:op       :function
     :id       :toFixed
     :type-in  ['number]
     :type-out 'string}
    ...]}]
```

to-ann

```
(ann js/eval [string Any])

(ann-interface Number
  toString
  [number -> string]
  toFixed
  [number -> string]
  ...)
```

## tcljs lacks

+ annotating index on js objects (i.e interface I { [index foo]: bar })
+ annotationg constructor objects like Object, Function, Date, etc
+ interface with extends
+ modules (ns?)
+ string literals as types (e.g. getElementByTagName(name: "body"): NodeListOf<HTMLBodyElement>)
+ new

workaround:

```
(ann new (Fn [Object Any * -> Object]
             [Array -> (Seq Any)]
             [Array number -> (Seq Any)]
             ... keep adding stuff here ...))
```


## Usage

FIXME

## License

Copyright © 2013 Ambrose Bonnaire-Sergeant

Distributed under the Eclipse Public License, the same as Clojure.

A copy of the Apache 2 license is provided to allow TypeScript files
to be copied into this repository.
