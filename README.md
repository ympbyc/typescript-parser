# typescript-parser

Parse TypeScript type declaration files.


What we are given:

```typescript
declare var NaN: number;
declare function eval(x: string): any;

//typescript interface is named structural type
interface Uint8Array extends ArrayBufferView {
    BYTES_PER_ELEMENT: number;
    length: number;
    [index: number]: number;
    get(index: number): number;
    set(index: number, value: number): void;
    set(array: Uint8Array, offset?: number): void;
    set(array: number[], offset?: number): void;
    subarray(begin: number, end?: number): Uint8Array;
}

//raw structural type
declare var Uint8Array: {
    prototype: Uint8Array;
    new (length: number): Uint8Array;
    new (array: Uint8Array): Uint8Array;
    new (array: number[]): Uint8Array;
    new (buffer: ArrayBuffer, byteOffset?: number, length?: number): Uint8Array;
    BYTES_PER_ELEMENT: number;
}
```

What we want:

```clojure
;;simple var
(ann js/NaN number)

;;simple function
(ann js/eval [string -> Any])

;;from interface, we construct a named jsnominal
(ann-jsnominal
 Uint8Array
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {BYTES_PER_ELEMENT number
   length number}
  :methods
  {get [number -> number]
   set (IFn [number -> void]
            [number number -> void]
            [Uint8Array -> void]
            [Uint8Array number -> void]
            [(Array number) -> void]
            [(Array number) number -> void])
   subarray (IFn [number -> Uint8Array]
                 [number number -> Uint8Array])}])

;;raw structural type is expressed using HJSObj
(ann
 js/Uint8Array
 (HJSObj
  :mandatory
  {prototype Uint8Array
   BYTES_PER_ELEMENT number}))

;;clj style constructor
;;we get the annotation from `new` inside var declaration of js/Number
(ann js/Uint8Array.
  (IFn
    [number -> Uint8Array]
    [Uint8Array -> Uint8Array]
    [(Array number) -> Uint8Array]
    [ArrayBuffer -> Uint8Array]
    [ArrayBuffer number -> Uint8Array]
    [ArrayBuffer number number -> Uint8Array]))
```

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
   [getElement :- [string -> Element]])

;;constructor
(ann DomHelper. (IFn [-> nil] [Document -> nil]))
(ann getDomHelper (IFn [-> DomHelper] [Node -> DomHelper]))
(ann getElementsByClass (IFn [string -> (JSNominal length number)]
                             [string Document -> (JSNominal length number)]))
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
