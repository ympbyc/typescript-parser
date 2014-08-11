# typescript-parser

Parse TypeScript type declaration files.


What we are given:

```typescript
declare var NaN: number;
declare function eval(x: string): any;

//typescript interface is named structural type
interface Number {
    toString(radix?: number): string;
    toFixed(fractionDigits?: number): string;
    toExponential(fractionDigits?: number): string;
    toPrecision(precision: number): string;
}

//raw structural type
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

;;from interface, we construct a named jsnominal
(defjsnominal Number
  toString      [number -> string]
  toExponential [number -> string]
  toPrecision   [number -> string])

;;raw structural type is expressed using JSNominal
(ann js/Number
  (JSNominal
   prototype Number
   MAX_VALUE number
   MIN_VALUE number
   NaN       number
   NEGATIVE_INFINITY number
   POSITIVE_INFINITY number))

;;clj style constructor
;;we get the annotation from `new` inside var declaration of js/Number
(ann js/Number. (IFn [-> number] [Any -> number]))
```

extra things we might need:

+ `number` should implement INumber

### modules and classes

What we get:

```typescript
declare module goog.dom {
  class DomHelper {
    constructor(opt_document?: Document);
    getElement(element: string): Element;
  }
  function getDomHelper(opt_element?: Node): goog.dom.DomHelper;
  function getElementsByClass(className: string, opt_el?: Document): {length: number};
}
```

What we want:

```clojure
(ns goog.dom)

;;we'll annotate js class using ann-datatype
(ann-datatype DomHelper
   [getElement :- [string -> IElement]])

;;constructor
(ann DomHelper. (IFn [-> nil] [IDocument -> nil]))
(ann getDomHelper (IFn [-> DomHelper] [INode -> DomHelper]))
(ann getElementsByClass (IFn [string -> (JSHMap :mandatory {:length number})]
                             [string IDocument -> (JSHMap :mandatory {:length number})]))
```

memo to myself: deftype creates host platform's barebone class. defrecord creates immutable persistent class


## Challenges

+ We might need a mechanism to extend subtype test function on the fly

## Usage

FIXME

## License

Copyright © 2013 Ambrose Bonnaire-Sergeant

Distributed under the Eclipse Public License, the same as Clojure.

A copy of the Apache 2 license is provided to allow TypeScript files
to be copied into this repository.
