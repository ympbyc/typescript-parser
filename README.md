# typescript-parser

Parse TypeScript type declaration files.


What we are given:

```typescript
declare var NaN: number;
declare function eval(x: string): any;

interface Number {
    toString(radix?: number): string;
    toFixed(fractionDigits?: number): string;
    toExponential(fractionDigits?: number): string;
    toPrecision(precision: number): string;
}

declare var Number: {
    new (value?: any): Number;
    (value?: any): number;
    prototype: Number;
    MAX_VALUE: number;
    MIN_VALUE: number;
    NaN: number;
    NEGATIVE_INFINITY: number;
    POSITIVE_INFINITY: number;
}
```

What we want:

```clojure
;;simple var
(ann js/NaN number)

;;simple function
(ann js/eval [string -> Any])

;;from interface, we construct a protocol
(defprotocol INumber
  (toString [this])
  (toExponential [this])
  (toPrecision [this]))

;;and its annotation
(ann-protocol INumber
  toString (IFn [-> string] [number -> string])
  toFixed  (IFn [-> string] [number -> string])
  toPrecision [number -> string])

;;var that refers to a js object
;;TODO: JSHMap on core.typed side
;;Number is an example of var that acts as a namespace and a constructor
(ann js/Number
  (JSHMap :mandatory
   {:prototype INumber
    :MAX_VALUE number
    :MIN_VALUE number
    :NaN       number
    :NEGATIVE_INFINITY number
    :POSITIVE_INFINITY number]))

;;clj style constructor
;;we get the annotation from `new` inside var declaration of js/Number
(ann js/Number. (IFn [-> number] [Any -> number]))
```


## Usage

FIXME

## License

Copyright © 2013 Ambrose Bonnaire-Sergeant

Distributed under the Eclipse Public License, the same as Clojure.

A copy of the Apache 2 license is provided to allow TypeScript files
to be copied into this repository.
