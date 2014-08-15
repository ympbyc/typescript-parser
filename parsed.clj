;;This is an automatically generated file. Do not modify.
;;LOG: Chopped up the input into 1002 chunks
(ann js/NaN number)
(ann js/Infinity number)
(ann js/eval [string -> any])
(ann js/parseInt (Fn [string -> number] [string number -> number]))
(ann js/parseFloat [string -> number])
(ann js/isNaN [number -> boolean])
(ann js/isFinite [number -> boolean])
(ann js/decodeURI [string -> string])
(ann js/decodeURIComponent [string -> string])
(ann js/encodeURI [string -> string])
(ann js/encodeURIComponent [string -> string])
(ann-jsnominal
 PropertyDescriptor
 [[]
  :ancestors
  #{}
  :fields
  {configurable boolean,
   enumerable boolean,
   value any,
   writable boolean}
  :methods
  {get [-> any], set [any -> void]}])
(ann-jsnominal
 PropertyDescriptorMap
 [[] :ancestors #{} :fields {} :methods {}])
(ann-jsnominal
 Object
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {toString [-> string],
   toLocaleString [-> string],
   valueOf [-> Object],
   hasOwnProperty [string -> boolean],
   isPrototypeOf [Object -> boolean],
   propertyIsEnumerable [string -> boolean]}])
(ann
 js/Object
 (HJSObj
  :mandatory
  {new (Fn [-> Object] [any -> Object]),
   keys [any -> (Seq string)],
   defineProperties [any PropertyDescriptorMap -> any],
   prototype Object,
   create (Fn [any -> any] [any PropertyDescriptorMap -> any]),
   isSealed [any -> boolean],
   seal [any -> any],
   freeze [any -> any],
   getOwnPropertyDescriptor [any string -> PropertyDescriptor],
   call [any -> any],
   isExtensible [any -> boolean],
   preventExtensions [any -> any],
   getPrototypeOf [any -> any],
   defineProperty [any string PropertyDescriptor -> any],
   isFrozen [any -> boolean],
   getOwnPropertyNames [any -> (Seq string)]}))
(ann-jsnominal
 Function
 [[]
  :ancestors
  #{}
  :fields
  {prototype any, length number, arguments any, caller Function}
  :methods
  {apply (Fn [any -> any] [any any -> any]),
   call [any any * -> any],
   bind [any any * -> any]}])
(ann
 js/Function
 (HJSObj
  :mandatory
  {new [string * -> Function],
   call [string * -> Function],
   prototype Function}))
(ann-jsnominal
 IArguments
 [[]
  :ancestors
  #{}
  :fields
  {length number, callee Function}
  :methods
  {}])
(ann-jsnominal
 String
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {charCodeAt [number -> number],
   indexOf (Fn [string -> number] [string number -> number]),
   trim [-> string],
   substr (Fn [number -> string] [number number -> string]),
   split (Fn [RegExp -> (Seq string)] [RegExp number -> (Seq string)]),
   localeCompare [string -> number],
   toLowerCase [-> string],
   charAt [number -> string],
   concat [string * -> string],
   search [RegExp -> number],
   slice (Fn [number -> string] [number number -> string]),
   match [RegExp -> (Seq string)],
   toUpperCase [-> string],
   replace [RegExp [string any * -> string] -> string],
   toLocaleUpperCase [-> string],
   toString [-> string],
   toLocaleLowerCase [-> string],
   substring (Fn [number -> string] [number number -> string]),
   lastIndexOf (Fn [string -> number] [string number -> number])}])
(ann
 js/String
 (HJSObj
  :mandatory
  {new (Fn [-> String] [any -> String]),
   call (Fn [-> string] [any -> string]),
   prototype String,
   fromCharCode [number * -> string]}))
(ann-jsnominal Boolean [[] :ancestors #{} :fields {} :methods {}])
(ann
 js/Boolean
 (HJSObj
  :mandatory
  {new (Fn [-> Boolean] [any -> Boolean]),
   call (Fn [-> boolean] [any -> boolean]),
   prototype Boolean}))
(ann-jsnominal
 Number
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {toString (Fn [-> string] [number -> string]),
   toFixed (Fn [-> string] [number -> string]),
   toExponential (Fn [-> string] [number -> string]),
   toPrecision [number -> string]}])
(ann
 js/Number
 (HJSObj
  :mandatory
  {new (Fn [-> Number] [any -> Number]),
   call (Fn [-> number] [any -> number]),
   prototype Number,
   MAX_VALUE number,
   MIN_VALUE number,
   NaN number,
   NEGATIVE_INFINITY number,
   POSITIVE_INFINITY number}))
(ann-jsnominal
 Math
 [[]
  :ancestors
  #{}
  :fields
  {E number,
   LN10 number,
   LN2 number,
   LOG2E number,
   LOG10E number,
   PI number,
   SQRT1_2 number,
   SQRT2 number}
  :methods
  {tan [number -> number],
   atan [number -> number],
   sqrt [number -> number],
   abs [number -> number],
   random [-> number],
   log [number -> number],
   atan2 [number number -> number],
   floor [number -> number],
   round [number -> number],
   max [number * -> number],
   pow [number number -> number],
   sin [number -> number],
   asin [number -> number],
   acos [number -> number],
   exp [number -> number],
   cos [number -> number],
   ceil [number -> number],
   min [number * -> number]}])
(ann js/Math Math)
(ann-jsnominal
 Date
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {setHours
   (Fn
    [number -> void]
    [number number -> void]
    [number number number -> void]
    [number number number number -> void]),
   setUTCHours
   (Fn
    [number -> void]
    [number number -> void]
    [number number number -> void]
    [number number number number -> void]),
   getMonth [-> number],
   getUTCMilliseconds [-> number],
   toLocaleDateString [-> string],
   getUTCDay [-> number],
   getSeconds [-> number],
   setTime [number -> void],
   toLocaleString [-> string],
   toUTCString [-> string],
   getDate [-> number],
   toTimeString [-> string],
   getUTCHours [-> number],
   getTime [-> number],
   getMinutes [-> number],
   setUTCMilliseconds [number -> void],
   setMilliseconds [number -> void],
   valueOf [-> number],
   getUTCMinutes [-> number],
   getUTCFullYear [-> number],
   toJSON (Fn [-> string] [any -> string]),
   getTimezoneOffset [-> number],
   getFullYear [-> number],
   getMilliseconds [-> number],
   getDay [-> number],
   getUTCSeconds [-> number],
   getUTCDate [-> number],
   setUTCDate [number -> void],
   setUTCSeconds (Fn [number -> void] [number number -> void]),
   setSeconds (Fn [number -> void] [number number -> void]),
   setDate [number -> void],
   setMonth (Fn [number -> void] [number number -> void]),
   getHours [-> number],
   setUTCMonth (Fn [number -> void] [number number -> void]),
   getUTCMonth [-> number],
   toString [-> string],
   setFullYear
   (Fn
    [number -> void]
    [number number -> void]
    [number number number -> void]),
   setUTCFullYear
   (Fn
    [number -> void]
    [number number -> void]
    [number number number -> void]),
   toISOString [-> string],
   setMinutes
   (Fn
    [number -> void]
    [number number -> void]
    [number number number -> void]),
   toDateString [-> string],
   setUTCMinutes
   (Fn
    [number -> void]
    [number number -> void]
    [number number number -> void]),
   toLocaleTimeString [-> string]}])
(ann
 js/Date
 (HJSObj
  :mandatory
  {new
   (Fn
    [number number -> Date]
    [number number number -> Date]
    [number number number number -> Date]
    [number number number number number -> Date]
    [number number number number number number -> Date]
    [number number number number number number number -> Date]),
   call [-> string],
   prototype Date,
   parse [string -> number],
   UTC
   (Fn
    [number number -> number]
    [number number number -> number]
    [number number number number -> number]
    [number number number number number -> number]
    [number number number number number number -> number]
    [number number number number number number number -> number]),
   now [-> number]}))
(ann-jsnominal
 RegExpExecArray
 [[]
  :ancestors
  #{}
  :fields
  {length number, index number, input string}
  :methods
  {some
   (Fn
    [[string number (Seq string) -> boolean] -> boolean]
    [[string number (Seq string) -> boolean] any -> boolean]),
   indexOf (Fn [string -> number] [string number -> number]),
   splice [number number string * -> (Seq string)],
   every
   (Fn
    [[string number (Seq string) -> boolean] -> boolean]
    [[string number (Seq string) -> boolean] any -> boolean]),
   toLocaleString [-> string],
   push [string * -> number],
   join (Fn [-> string] [string -> string]),
   concat [(Seq string) * -> (Seq string)],
   map
   (Fn
    [[string number (Seq string) -> any] -> (Seq any)]
    [[string number (Seq string) -> any] any -> (Seq any)]),
   slice (Fn [number -> (Seq string)] [number number -> (Seq string)]),
   filter
   (Fn
    [[string number (Seq string) -> boolean] -> (Seq string)]
    [[string number (Seq string) -> boolean] any -> (Seq string)]),
   unshift [string * -> number],
   reverse [-> (Seq string)],
   reduce
   (Fn
    [[any any number (Seq string) -> any] -> any]
    [[any any number (Seq string) -> any] any -> any]),
   reduceRight
   (Fn
    [[any any number (Seq string) -> any] -> any]
    [[any any number (Seq string) -> any] any -> any]),
   toString [-> string],
   forEach
   (Fn
    [[string number (Seq string) -> void] -> void]
    [[string number (Seq string) -> void] any -> void]),
   shift [-> string],
   pop [-> string],
   lastIndexOf (Fn [string -> number] [string number -> number]),
   sort
   (Fn [-> (Seq string)] [[string string -> number] -> (Seq string)])}])
(ann-jsnominal
 RegExp
 [[]
  :ancestors
  #{}
  :fields
  {source string,
   global boolean,
   ignoreCase boolean,
   multiline boolean,
   lastIndex number}
  :methods
  {exec [string -> RegExpExecArray],
   test [string -> boolean],
   compile [-> RegExp]}])
(ann
 js/RegExp
 (HJSObj
  :mandatory
  {new (Fn [string -> RegExp] [string string -> RegExp]),
   lastMatch string,
   $8 string,
   $9 string,
   $5 string,
   $4 string,
   call (Fn [string -> RegExp] [string string -> RegExp]),
   $7 string,
   $6 string,
   $1 string,
   $2 string,
   $3 string}))
(ann-jsnominal
 Error
 [[] :ancestors #{} :fields {name string, message string} :methods {}])
(ann
 js/Error
 (HJSObj
  :mandatory
  {new (Fn [-> Error] [string -> Error]),
   call (Fn [-> Error] [string -> Error]),
   prototype Error}))
(ann-jsnominal
 EvalError
 [[] :ancestors #{Error} :fields {} :methods {}])
(ann
 js/EvalError
 (HJSObj
  :mandatory
  {new (Fn [-> EvalError] [string -> EvalError]),
   call (Fn [-> EvalError] [string -> EvalError]),
   prototype EvalError}))
(ann-jsnominal
 RangeError
 [[] :ancestors #{Error} :fields {} :methods {}])
(ann
 js/RangeError
 (HJSObj
  :mandatory
  {new (Fn [-> RangeError] [string -> RangeError]),
   call (Fn [-> RangeError] [string -> RangeError]),
   prototype RangeError}))
(ann-jsnominal
 ReferenceError
 [[] :ancestors #{Error} :fields {} :methods {}])
(ann
 js/ReferenceError
 (HJSObj
  :mandatory
  {new (Fn [-> ReferenceError] [string -> ReferenceError]),
   call (Fn [-> ReferenceError] [string -> ReferenceError]),
   prototype ReferenceError}))
(ann-jsnominal
 SyntaxError
 [[] :ancestors #{Error} :fields {} :methods {}])
(ann
 js/SyntaxError
 (HJSObj
  :mandatory
  {new (Fn [-> SyntaxError] [string -> SyntaxError]),
   call (Fn [-> SyntaxError] [string -> SyntaxError]),
   prototype SyntaxError}))
(ann-jsnominal
 TypeError
 [[] :ancestors #{Error} :fields {} :methods {}])
(ann
 js/TypeError
 (HJSObj
  :mandatory
  {new (Fn [-> TypeError] [string -> TypeError]),
   call (Fn [-> TypeError] [string -> TypeError]),
   prototype TypeError}))
(ann-jsnominal URIError [[] :ancestors #{Error} :fields {} :methods {}])
(ann
 js/URIError
 (HJSObj
  :mandatory
  {new (Fn [-> URIError] [string -> URIError]),
   call (Fn [-> URIError] [string -> URIError]),
   prototype URIError}))
(ann-jsnominal
 JSON
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {parse (Fn [string -> any] [string [any any -> any] -> any]),
   stringify [any (Seq any) any -> string]}])
(ann js/JSON JSON)
(ann-jsnominal
 Array
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {some
   (Fn
    [[T number (Seq T) -> boolean] -> boolean]
    [[T number (Seq T) -> boolean] any -> boolean]),
   indexOf (Fn [T -> number] [T number -> number]),
   splice [number number T * -> (Seq T)],
   every
   (Fn
    [[T number (Seq T) -> boolean] -> boolean]
    [[T number (Seq T) -> boolean] any -> boolean]),
   toLocaleString [-> string],
   push [T * -> number],
   join (Fn [-> string] [string -> string]),
   concat [T * -> (Seq T)],
   map
   (All
    [U]
    (Fn
     [[T number (Seq T) -> U] -> (Seq U)]
     [[T number (Seq T) -> U] any -> (Seq U)])),
   slice (Fn [number -> (Seq T)] [number number -> (Seq T)]),
   filter
   (Fn
    [[T number (Seq T) -> boolean] -> (Seq T)]
    [[T number (Seq T) -> boolean] any -> (Seq T)]),
   unshift [T * -> number],
   reverse [-> (Seq T)],
   reduce (All [U] [[U T number (Seq T) -> U] U -> U]),
   reduceRight (All [U] [[U T number (Seq T) -> U] U -> U]),
   toString [-> string],
   forEach
   (Fn
    [[T number (Seq T) -> void] -> void]
    [[T number (Seq T) -> void] any -> void]),
   shift [-> T],
   pop [-> T],
   lastIndexOf (Fn [T -> number] [T number -> number]),
   sort (Fn [-> (Seq T)] [[T T -> number] -> (Seq T)])}])
(ann
 js/Array
 (HJSObj
  :mandatory
  {new (All [T] [T * -> (Seq T)]),
   call (All [T] [T * -> (Seq T)]),
   isArray [any -> boolean],
   prototype (Array any)}))
(ann-jsnominal
 ArrayBuffer
 [[] :ancestors #{} :fields {byteLength number} :methods {}])
(ann
 js/ArrayBuffer
 (HJSObj
  :mandatory
  {prototype ArrayBuffer, new [number -> ArrayBuffer]}))
(ann-jsnominal
 ArrayBufferView
 [[]
  :ancestors
  #{}
  :fields
  {buffer ArrayBuffer, byteOffset number, byteLength number}
  :methods
  {}])
(ann-jsnominal
 Int8Array
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {BYTES_PER_ELEMENT number, length number}
  :methods
  {get [number -> number],
   set (Fn [(Seq number) -> void] [(Seq number) number -> void]),
   subarray (Fn [number -> Int8Array] [number number -> Int8Array])}])
(ann
 js/Int8Array
 (HJSObj
  :mandatory
  {prototype Int8Array,
   new
   (Fn
    [ArrayBuffer -> Int8Array]
    [ArrayBuffer number -> Int8Array]
    [ArrayBuffer number number -> Int8Array]),
   BYTES_PER_ELEMENT number}))
(ann-jsnominal
 Uint8Array
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {BYTES_PER_ELEMENT number, length number}
  :methods
  {get [number -> number],
   set (Fn [(Seq number) -> void] [(Seq number) number -> void]),
   subarray (Fn [number -> Uint8Array] [number number -> Uint8Array])}])
(ann
 js/Uint8Array
 (HJSObj
  :mandatory
  {prototype Uint8Array,
   new
   (Fn
    [ArrayBuffer -> Uint8Array]
    [ArrayBuffer number -> Uint8Array]
    [ArrayBuffer number number -> Uint8Array]),
   BYTES_PER_ELEMENT number}))
(ann-jsnominal
 Int16Array
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {BYTES_PER_ELEMENT number, length number}
  :methods
  {get [number -> number],
   set (Fn [(Seq number) -> void] [(Seq number) number -> void]),
   subarray (Fn [number -> Int16Array] [number number -> Int16Array])}])
(ann
 js/Int16Array
 (HJSObj
  :mandatory
  {prototype Int16Array,
   new
   (Fn
    [ArrayBuffer -> Int16Array]
    [ArrayBuffer number -> Int16Array]
    [ArrayBuffer number number -> Int16Array]),
   BYTES_PER_ELEMENT number}))
(ann-jsnominal
 Uint16Array
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {BYTES_PER_ELEMENT number, length number}
  :methods
  {get [number -> number],
   set (Fn [(Seq number) -> void] [(Seq number) number -> void]),
   subarray
   (Fn [number -> Uint16Array] [number number -> Uint16Array])}])
(ann
 js/Uint16Array
 (HJSObj
  :mandatory
  {prototype Uint16Array,
   new
   (Fn
    [ArrayBuffer -> Uint16Array]
    [ArrayBuffer number -> Uint16Array]
    [ArrayBuffer number number -> Uint16Array]),
   BYTES_PER_ELEMENT number}))
(ann-jsnominal
 Int32Array
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {BYTES_PER_ELEMENT number, length number}
  :methods
  {get [number -> number],
   set (Fn [(Seq number) -> void] [(Seq number) number -> void]),
   subarray (Fn [number -> Int32Array] [number number -> Int32Array])}])
(ann
 js/Int32Array
 (HJSObj
  :mandatory
  {prototype Int32Array,
   new
   (Fn
    [ArrayBuffer -> Int32Array]
    [ArrayBuffer number -> Int32Array]
    [ArrayBuffer number number -> Int32Array]),
   BYTES_PER_ELEMENT number}))
(ann-jsnominal
 Uint32Array
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {BYTES_PER_ELEMENT number, length number}
  :methods
  {get [number -> number],
   set (Fn [(Seq number) -> void] [(Seq number) number -> void]),
   subarray
   (Fn [number -> Uint32Array] [number number -> Uint32Array])}])
(ann
 js/Uint32Array
 (HJSObj
  :mandatory
  {prototype Uint32Array,
   new
   (Fn
    [ArrayBuffer -> Uint32Array]
    [ArrayBuffer number -> Uint32Array]
    [ArrayBuffer number number -> Uint32Array]),
   BYTES_PER_ELEMENT number}))
(ann-jsnominal
 Float32Array
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {BYTES_PER_ELEMENT number, length number}
  :methods
  {get [number -> number],
   set (Fn [(Seq number) -> void] [(Seq number) number -> void]),
   subarray
   (Fn [number -> Float32Array] [number number -> Float32Array])}])
(ann
 js/Float32Array
 (HJSObj
  :mandatory
  {prototype Float32Array,
   new
   (Fn
    [ArrayBuffer -> Float32Array]
    [ArrayBuffer number -> Float32Array]
    [ArrayBuffer number number -> Float32Array]),
   BYTES_PER_ELEMENT number}))
(ann-jsnominal
 Float64Array
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {BYTES_PER_ELEMENT number, length number}
  :methods
  {get [number -> number],
   set (Fn [(Seq number) -> void] [(Seq number) number -> void]),
   subarray
   (Fn [number -> Float64Array] [number number -> Float64Array])}])
(ann
 js/Float64Array
 (HJSObj
  :mandatory
  {prototype Float64Array,
   new
   (Fn
    [ArrayBuffer -> Float64Array]
    [ArrayBuffer number -> Float64Array]
    [ArrayBuffer number number -> Float64Array]),
   BYTES_PER_ELEMENT number}))
(ann-jsnominal
 DataView
 [[]
  :ancestors
  #{ArrayBufferView}
  :fields
  {}
  :methods
  {setInt32
   (Fn [number number -> void] [number number boolean -> void]),
   getUint16 (Fn [number -> number] [number boolean -> number]),
   setInt8 [number number -> void],
   getUint32 (Fn [number -> number] [number boolean -> number]),
   setUint8 [number number -> void],
   setFloat32
   (Fn [number number -> void] [number number boolean -> void]),
   setInt16
   (Fn [number number -> void] [number number boolean -> void]),
   getFloat64 (Fn [number -> number] [number boolean -> number]),
   getInt32 (Fn [number -> number] [number boolean -> number]),
   setFloat64
   (Fn [number number -> void] [number number boolean -> void]),
   setUint16
   (Fn [number number -> void] [number number boolean -> void]),
   getUint8 [number -> number],
   setUint32
   (Fn [number number -> void] [number number boolean -> void]),
   getInt16 (Fn [number -> number] [number boolean -> number]),
   getInt8 [number -> number],
   getFloat32 (Fn [number -> number] [number boolean -> number])}])
(ann
 js/DataView
 (HJSObj
  :mandatory
  {prototype DataView,
   new
   (Fn
    [ArrayBuffer -> DataView]
    [ArrayBuffer number -> DataView]
    [ArrayBuffer number number -> DataView])}))
(ann-jsnominal
 Map
 [[]
  :ancestors
  #{}
  :fields
  {size number}
  :methods
  {clear [-> void],
   delete [K -> boolean],
   forEach
   (Fn
    [[V K (Map K V) -> void] -> void]
    [[V K (Map K V) -> void] any -> void]),
   get [K -> V],
   has [K -> boolean],
   set [K V -> (Map K V)]}])
(ann js/Map (HJSObj :mandatory {new (All [K V] [-> (Map K V)])}))
(ann-jsnominal
 WeakMap
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {clear [-> void],
   delete [K -> boolean],
   get [K -> V],
   has [K -> boolean],
   set [K V -> (WeakMap K V)]}])
(ann
 js/WeakMap
 (HJSObj :mandatory {new (All [K V] [-> (WeakMap K V)])}))
(ann-jsnominal
 Set
 [[]
  :ancestors
  #{}
  :fields
  {size number}
  :methods
  {add [T -> (Set T)],
   clear [-> void],
   delete [T -> boolean],
   forEach
   (Fn
    [[T T (Set T) -> void] -> void]
    [[T T (Set T) -> void] any -> void]),
   has [T -> boolean]}])
(ann js/Set (HJSObj :mandatory {new (All [T] [-> (Set T)])}))
(*not-implemented* :module)
(ann-jsnominal
 String
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {localeCompare
   (Fn
    [string string -> number]
    [string string (*not-implemented* nil) -> number])}])
(ann-jsnominal
 Numer
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {toLocaleString
   (Fn [string -> string] [string (*not-implemented* nil) -> string])}])
(ann-jsnominal
 Date
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {toLocaleString
   (Fn [string -> string] [string (*not-implemented* nil) -> string])}])
(ann-jsnominal
 PositionOptions
 [[]
  :ancestors
  #{}
  :fields
  {enableHighAccuracy boolean, timeout number, maximumAge number}
  :methods
  {}])
(ann-jsnominal
 NavigatorID
 [[]
  :ancestors
  #{}
  :fields
  {appVersion string,
   appName string,
   userAgent string,
   platform string}
  :methods
  {}])
(ann-jsnominal
 HTMLTableElement
 [[]
  :ancestors
  #{MSDataBindingTableExtensions DOML2DeprecatedBackgroundStyle
    DOML2DeprecatedBackgroundColorStyle MSDataBindingExtensions
    HTMLElement}
  :fields
  {rules string,
   tHead HTMLTableSectionElement,
   cellPadding string,
   summary string,
   height any,
   cols number,
   border string,
   borderColorDark any,
   borderColor any,
   width string,
   caption HTMLTableCaptionElement,
   rows HTMLCollection,
   borderColorLight any,
   cellSpacing string,
   frame string,
   tBodies HTMLCollection,
   tFoot HTMLTableSectionElement,
   cells HTMLCollection,
   align string}
  :methods
  {createCaption [-> HTMLElement],
   moveRow
   (Fn [-> Object] [number -> Object] [number number -> Object]),
   createTBody [-> HTMLElement],
   deleteTFoot [-> void],
   deleteRow (Fn [-> void] [number -> void]),
   insertRow (Fn [-> HTMLElement] [number -> HTMLElement]),
   deleteTHead [-> void],
   createTFoot [-> HTMLElement],
   createTHead [-> HTMLElement],
   deleteCaption [-> void]}])
(ann
 js/HTMLTableElement
 (HJSObj
  :mandatory
  {prototype HTMLTableElement, new [-> HTMLTableElement]}))
(ann-jsnominal
 TreeWalker
 [[]
  :ancestors
  #{}
  :fields
  {whatToShow number,
   filter NodeFilter,
   root Node,
   currentNode Node,
   expandEntityReferences boolean}
  :methods
  {previousSibling [-> Node],
   lastChild [-> Node],
   nextSibling [-> Node],
   nextNode [-> Node],
   parentNode [-> Node],
   firstChild [-> Node],
   previousNode [-> Node]}])
(ann
 js/TreeWalker
 (HJSObj :mandatory {prototype TreeWalker, new [-> TreeWalker]}))
(ann-jsnominal
 GetSVGDocument
 [[] :ancestors #{} :fields {} :methods {getSVGDocument [-> Document]}])
(ann-jsnominal
 SVGPathSegCurvetoQuadraticRel
 [[]
  :ancestors
  #{SVGPathSeg}
  :fields
  {y number, y1 number, x number, x1 number}
  :methods
  {}])
(ann
 js/SVGPathSegCurvetoQuadraticRel
 (HJSObj
  :mandatory
  {prototype SVGPathSegCurvetoQuadraticRel,
   new [-> SVGPathSegCurvetoQuadraticRel]}))
(ann-jsnominal
 Performance
 [[]
  :ancestors
  #{}
  :fields
  {navigation PerformanceNavigation, timing PerformanceTiming}
  :methods
  {getMeasures (Fn [-> any] [string -> any]),
   mark [string -> void],
   getEntriesByName (Fn [string -> any] [string string -> any]),
   getEntriesByType [string -> any],
   clearMeasures (Fn [-> void] [string -> void]),
   setResourceTimingBufferSize [number -> void],
   getMarks (Fn [-> any] [string -> any]),
   clearMarks (Fn [-> void] [string -> void]),
   measure
   (Fn
    [string -> void]
    [string string -> void]
    [string string string -> void]),
   toJSON [-> any],
   getEntries [-> any],
   clearResourceTimings [-> void]}])
(ann
 js/Performance
 (HJSObj :mandatory {prototype Performance, new [-> Performance]}))
(ann-jsnominal
 MSDataBindingTableExtensions
 [[]
  :ancestors
  #{}
  :fields
  {dataPageSize number}
  :methods
  {nextPage [-> void],
   firstPage [-> void],
   refresh [-> void],
   previousPage [-> void],
   lastPage [-> void]}])
(ann-jsnominal
 CompositionEvent
 [[]
  :ancestors
  #{UIEvent}
  :fields
  {data string, locale string}
  :methods
  {initCompositionEvent
   [string boolean boolean Window string string -> void]}])
(ann
 js/CompositionEvent
 (HJSObj
  :mandatory
  {prototype CompositionEvent, new [-> CompositionEvent]}))
(ann-jsnominal
 WindowTimers
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {clearTimeout [number -> void],
   setTimeout (Fn [any -> number] [any any any * -> number]),
   clearInterval [number -> void],
   setInterval (Fn [any -> number] [any any any * -> number])}])
(ann-jsnominal
 SVGMarkerElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement SVGFitToViewBox
    SVGLangSpace}
  :fields
  {SVG_MARKER_ORIENT_ANGLE number,
   refY SVGAnimatedLength,
   SVG_MARKER_ORIENT_UNKNOWN number,
   refX SVGAnimatedLength,
   markerWidth SVGAnimatedLength,
   SVG_MARKERUNITS_UNKNOWN number,
   SVG_MARKERUNITS_USERSPACEONUSE number,
   SVG_MARKERUNITS_STROKEWIDTH number,
   orientAngle SVGAnimatedAngle,
   SVG_MARKER_ORIENT_AUTO number,
   markerHeight SVGAnimatedLength,
   markerUnits SVGAnimatedEnumeration,
   orientType SVGAnimatedEnumeration}
  :methods
  {setOrientToAngle [SVGAngle -> void], setOrientToAuto [-> void]}])
(ann
 js/SVGMarkerElement
 (HJSObj
  :mandatory
  {prototype SVGMarkerElement,
   new [-> SVGMarkerElement],
   SVG_MARKER_ORIENT_UNKNOWN number,
   SVG_MARKER_ORIENT_ANGLE number,
   SVG_MARKERUNITS_UNKNOWN number,
   SVG_MARKERUNITS_STROKEWIDTH number,
   SVG_MARKER_ORIENT_AUTO number,
   SVG_MARKERUNITS_USERSPACEONUSE number}))
(ann-jsnominal
 CSSStyleDeclaration
 [[]
  :ancestors
  #{}
  :fields
  {strokeLinejoin string,
   boxShadow string,
   pageBreakInside string,
   rubyAlign string,
   borderBottom string,
   clear string,
   backgroundPosition string,
   borderSpacing string,
   backgroundImage string,
   quotes string,
   backgroundOrigin string,
   rubyPosition string,
   textJustify string,
   wordWrap string,
   backgroundSize string,
   markerStart string,
   font string,
   textOverflow string,
   pageBreakBefore string,
   fontStyle string,
   glyphOrientationHorizontal string,
   alignmentBaseline string,
   backgroundAttachment string,
   listStylePosition string,
   glyphOrientationVertical string,
   fontSize string,
   strokeDashoffset string,
   height string,
   fontWeight string,
   cssFloat string,
   outlineWidth string,
   minHeight string,
   borderRightColor string,
   direction string,
   tableLayout string,
   bottom string,
   maxHeight string,
   borderRightStyle string,
   border string,
   outlineColor string,
   overflowX string,
   markerEnd string,
   borderBottomColor string,
   msTransformOrigin string,
   rubyOverhang string,
   overflowY string,
   borderColor string,
   markerMid string,
   strokeMiterlimit string,
   stopOpacity string,
   margin string,
   position string,
   background string,
   boxSizing string,
   minWidth string,
   outline string,
   clipPath string,
   borderTopStyle string,
   display string,
   wordBreak string,
   maxWidth string,
   strokeDasharray string,
   verticalAlign string,
   textAnchor string,
   parentRule CSSRule,
   padding string,
   width string,
   whiteSpace string,
   borderWidth string,
   marginTop string,
   captionSide string,
   borderBottomStyle string,
   borderCollapse string,
   widows string,
   fontFamily string,
   marginBottom string,
   content string,
   borderRadius string,
   zIndex string,
   visibility string,
   pointerEvents string,
   kerning string,
   fontStretch string,
   fontVariant string,
   paddingRight string,
   opacity string,
   pageBreakAfter string,
   listStyleType string,
   borderTop string,
   color string,
   unicodeBidi string,
   textAlignLast string,
   marginRight string,
   borderBottomWidth string,
   fillOpacity string,
   borderTopLeftRadius string,
   outlineStyle string,
   msTransform string,
   length number,
   letterSpacing string,
   borderTopColor string,
   baselineShift string,
   borderTopWidth string,
   textDecoration string,
   wordSpacing string,
   listStyle string,
   counterReset string,
   borderLeftWidth string,
   strokeOpacity string,
   borderStyle string,
   textAlign string,
   textTransform string,
   clipRule string,
   orphans string,
   stopColor string,
   mask string,
   borderRightWidth string,
   cursor string,
   borderBottomRightRadius string,
   backgroundRepeat string,
   strokeWidth string,
   fill string,
   marginLeft string,
   listStyleImage string,
   top string,
   textUnderlinePosition string,
   backgroundColor string,
   overflow string,
   lineHeight string,
   strokeLinecap string,
   paddingBottom string,
   right string,
   borderRight string,
   marker string,
   clip string,
   borderBottomLeftRadius string,
   borderLeftColor string,
   left string,
   cssText string,
   borderLeftStyle string,
   borderLeft string,
   emptyCells string,
   counterIncrement string,
   paddingTop string,
   textIndent string,
   backgroundClip string,
   paddingLeft string,
   fillRule string,
   fontSizeAdjust string,
   borderTopRightRadius string,
   dominantBaseline string,
   stroke string}
  :methods
  {getPropertyPriority [string -> string],
   getPropertyValue [string -> string],
   removeProperty [string -> string],
   item [number -> string],
   setProperty
   (Fn [string string -> void] [string string string -> void])}])
(ann
 js/CSSStyleDeclaration
 (HJSObj
  :mandatory
  {prototype CSSStyleDeclaration, new [-> CSSStyleDeclaration]}))
(ann-jsnominal
 SVGGElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGGElement
 (HJSObj :mandatory {prototype SVGGElement, new [-> SVGGElement]}))
(ann-jsnominal
 MSStyleCSSProperties
 [[]
  :ancestors
  #{MSCSSProperties}
  :fields
  {pixelHeight number,
   posHeight number,
   textDecorationOverline boolean,
   pixelLeft number,
   posRight number,
   textDecorationNone boolean,
   posLeft number,
   posTop number,
   pixelRight number,
   pixelWidth number,
   textDecorationLineThrough boolean,
   textDecorationUnderline boolean,
   pixelTop number,
   pixelBottom number,
   textDecorationBlink boolean,
   posWidth number,
   posBottom number}
  :methods
  {}])
(ann
 js/MSStyleCSSProperties
 (HJSObj
  :mandatory
  {prototype MSStyleCSSProperties, new [-> MSStyleCSSProperties]}))
(ann-jsnominal
 Navigator
 [[]
  :ancestors
  #{NavigatorStorageUtils NavigatorGeolocation MSNavigatorDoNotTrack
    MSNavigatorExtensions NavigatorID NavigatorOnLine
    NavigatorContentUtils}
  :fields
  {}
  :methods
  {}])
(ann
 js/Navigator
 (HJSObj :mandatory {prototype Navigator, new [-> Navigator]}))
(ann-jsnominal
 SVGPathSegCurvetoCubicSmoothAbs
 [[]
  :ancestors
  #{SVGPathSeg}
  :fields
  {y number, x2 number, x number, y2 number}
  :methods
  {}])
(ann
 js/SVGPathSegCurvetoCubicSmoothAbs
 (HJSObj
  :mandatory
  {prototype SVGPathSegCurvetoCubicSmoothAbs,
   new [-> SVGPathSegCurvetoCubicSmoothAbs]}))
(ann-jsnominal
 SVGZoomEvent
 [[]
  :ancestors
  #{UIEvent}
  :fields
  {zoomRectScreen SVGRect,
   previousScale number,
   newScale number,
   previousTranslate SVGPoint,
   newTranslate SVGPoint}
  :methods
  {}])
(ann
 js/SVGZoomEvent
 (HJSObj :mandatory {prototype SVGZoomEvent, new [-> SVGZoomEvent]}))
(ann-jsnominal
 NodeSelector
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {querySelectorAll [string -> NodeList],
   querySelector [string -> Element]}])
(ann-jsnominal
 HTMLTableDataCellElement
 [[] :ancestors #{HTMLTableCellElement} :fields {} :methods {}])
(ann
 js/HTMLTableDataCellElement
 (HJSObj
  :mandatory
  {prototype HTMLTableDataCellElement,
   new [-> HTMLTableDataCellElement]}))
(ann-jsnominal
 HTMLBaseElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {target string, href string}
  :methods
  {}])
(ann
 js/HTMLBaseElement
 (HJSObj
  :mandatory
  {prototype HTMLBaseElement, new [-> HTMLBaseElement]}))
(ann-jsnominal
 ClientRect
 [[]
  :ancestors
  #{}
  :fields
  {left number,
   width number,
   right number,
   top number,
   bottom number,
   height number}
  :methods
  {}])
(ann
 js/ClientRect
 (HJSObj :mandatory {prototype ClientRect, new [-> ClientRect]}))
(ann-jsnominal
 PositionErrorCallback
 [[] :ancestors #{} :fields {} :methods {call [PositionError -> void]}])
(ann-jsnominal
 DOMImplementation
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {createDocumentType [string string string -> DocumentType],
   createDocument [string string DocumentType -> Document],
   hasFeature (Fn [string -> boolean] [string string -> boolean]),
   createHTMLDocument [string -> Document]}])
(ann
 js/DOMImplementation
 (HJSObj
  :mandatory
  {prototype DOMImplementation, new [-> DOMImplementation]}))
(ann-jsnominal
 SVGUnitTypes
 [[]
  :ancestors
  #{}
  :fields
  {SVG_UNIT_TYPE_UNKNOWN number,
   SVG_UNIT_TYPE_OBJECTBOUNDINGBOX number,
   SVG_UNIT_TYPE_USERSPACEONUSE number}
  :methods
  {}])
(ann
 js/SVGUnitTypes
 (HJSObj
  :mandatory
  {prototype SVGUnitTypes,
   new [-> SVGUnitTypes],
   SVG_UNIT_TYPE_UNKNOWN number,
   SVG_UNIT_TYPE_OBJECTBOUNDINGBOX number,
   SVG_UNIT_TYPE_USERSPACEONUSE number}))
(Value "a")
(Value "abbr")
(Value "address")
(Value "area")
(Value "article")
(Value "aside")
(Value "audio")
(Value "b")
(Value "base")
(Value "bdi")
(Value "bdo")
(Value "blockquote")
(Value "body")
(Value "br")
(Value "button")
(Value "canvas")
(Value "caption")
(Value "cite")
(Value "code")
(Value "col")
(Value "colgroup")
(Value "datalist")
(Value "dd")
(Value "del")
(Value "dfn")
(Value "div")
(Value "dl")
(Value "dt")
(Value "em")
(Value "embed")
(Value "fieldset")
(Value "figcaption")
(Value "figure")
(Value "footer")
(Value "form")
(Value "h1")
(Value "h2")
(Value "h3")
(Value "h4")
(Value "h5")
(Value "h6")
(Value "head")
(Value "header")
(Value "hgroup")
(Value "hr")
(Value "html")
(Value "i")
(Value "iframe")
(Value "img")
(Value "input")
(Value "ins")
(Value "kbd")
(Value "label")
(Value "legend")
(Value "li")
(Value "link")
(Value "main")
(Value "map")
(Value "mark")
(Value "menu")
(Value "meta")
(Value "nav")
(Value "noscript")
(Value "object")
(Value "ol")
(Value "optgroup")
(Value "option")
(Value "p")
(Value "param")
(Value "pre")
(Value "progress")
(Value "q")
(Value "rp")
(Value "rt")
(Value "ruby")
(Value "s")
(Value "samp")
(Value "script")
(Value "section")
(Value "select")
(Value "small")
(Value "source")
(Value "span")
(Value "strong")
(Value "style")
(Value "sub")
(Value "summary")
(Value "sup")
(Value "table")
(Value "tbody")
(Value "td")
(Value "textarea")
(Value "tfoot")
(Value "th")
(Value "thead")
(Value "title")
(Value "tr")
(Value "track")
(Value "u")
(Value "ul")
(Value "var")
(Value "video")
(Value "wbr")
(ann-jsnominal
 Element
 [[]
  :ancestors
  #{NodeSelector Node ElementTraversal}
  :fields
  {scrollLeft number,
   scrollTop number,
   clientLeft number,
   scrollWidth number,
   tagName string,
   clientTop number,
   scrollHeight number,
   clientWidth number,
   clientHeight number}
  :methods
  {getAttributeNodeNS [string string -> Attr],
   getClientRects [-> ClientRectList],
   hasAttribute [string -> boolean],
   setAttributeNode [Attr -> Attr],
   removeAttributeNode [Attr -> Attr],
   msMatchesSelector [string -> boolean],
   setAttributeNodeNS [Attr -> Attr],
   getAttributeNS [string string -> string],
   removeAttribute (Fn [-> void] [string -> void]),
   getBoundingClientRect [-> ClientRect],
   getAttributeNode [string -> Attr],
   getAttribute (Fn [-> string] [string -> string]),
   hasAttributeNS [string string -> boolean],
   setAttribute
   (Fn [-> void] [string -> void] [string string -> void]),
   removeAttributeNS [string string -> void],
   getElementsByTagName
   [(Value "\"wbr\"") -> (NodeListOf HTMLElement)],
   getElementsByTagNameNS [string string -> NodeList],
   fireEvent (Fn [string -> boolean] [string any -> boolean]),
   setAttributeNS [string string string -> void]}])
(ann
 js/Element
 (HJSObj :mandatory {prototype Element, new [-> Element]}))
(ann-jsnominal
 HTMLNextIdElement
 [[] :ancestors #{HTMLElement} :fields {n string} :methods {}])
(ann
 js/HTMLNextIdElement
 (HJSObj
  :mandatory
  {prototype HTMLNextIdElement, new [-> HTMLNextIdElement]}))
(ann-jsnominal
 SVGPathSegMovetoRel
 [[] :ancestors #{SVGPathSeg} :fields {y number, x number} :methods {}])
(ann
 js/SVGPathSegMovetoRel
 (HJSObj
  :mandatory
  {prototype SVGPathSegMovetoRel, new [-> SVGPathSegMovetoRel]}))
(ann-jsnominal
 SVGLineElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {y1 SVGAnimatedLength,
   x2 SVGAnimatedLength,
   x1 SVGAnimatedLength,
   y2 SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGLineElement
 (HJSObj
  :mandatory
  {prototype SVGLineElement, new [-> SVGLineElement]}))
(ann-jsnominal
 HTMLParagraphElement
 [[]
  :ancestors
  #{HTMLElement DOML2DeprecatedTextFlowControl}
  :fields
  {align string}
  :methods
  {}])
(ann
 js/HTMLParagraphElement
 (HJSObj
  :mandatory
  {prototype HTMLParagraphElement, new [-> HTMLParagraphElement]}))
(ann-jsnominal
 HTMLAreasCollection
 [[]
  :ancestors
  #{HTMLCollection}
  :fields
  {}
  :methods
  {remove (Fn [-> void] [number -> void]),
   add (Fn [HTMLElement -> void] [HTMLElement any -> void])}])
(ann
 js/HTMLAreasCollection
 (HJSObj
  :mandatory
  {prototype HTMLAreasCollection, new [-> HTMLAreasCollection]}))
(ann-jsnominal
 SVGDescElement
 [[]
  :ancestors
  #{SVGStylable SVGElement SVGLangSpace}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGDescElement
 (HJSObj
  :mandatory
  {prototype SVGDescElement, new [-> SVGDescElement]}))
(ann-jsnominal
 Node
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {firstChild Node,
   previousSibling Node,
   parentNode Node,
   CDATA_SECTION_NODE number,
   childNodes NodeList,
   nextSibling Node,
   DOCUMENT_POSITION_CONTAINED_BY number,
   DOCUMENT_NODE number,
   lastChild Node,
   ENTITY_REFERENCE_NODE number,
   DOCUMENT_POSITION_FOLLOWING number,
   localName string,
   nodeName string,
   DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC number,
   DOCUMENT_TYPE_NODE number,
   namespaceURI string,
   nodeType number,
   ENTITY_NODE number,
   prefix string,
   PROCESSING_INSTRUCTION_NODE number,
   textContent string,
   nodeValue string,
   DOCUMENT_POSITION_PRECEDING number,
   ATTRIBUTE_NODE number,
   attributes NamedNodeMap,
   DOCUMENT_FRAGMENT_NODE number,
   DOCUMENT_POSITION_DISCONNECTED number,
   TEXT_NODE number,
   ownerDocument Document,
   COMMENT_NODE number,
   DOCUMENT_POSITION_CONTAINS number,
   NOTATION_NODE number,
   ELEMENT_NODE number}
  :methods
  {isEqualNode [Node -> boolean],
   appendChild [Node -> Node],
   replaceChild [Node Node -> Node],
   isSupported [string string -> boolean],
   insertBefore (Fn [Node -> Node] [Node Node -> Node]),
   cloneNode (Fn [-> Node] [boolean -> Node]),
   lookupPrefix [string -> string],
   lookupNamespaceURI [string -> string],
   hasChildNodes [-> boolean],
   hasAttributes [-> boolean],
   removeChild [Node -> Node],
   normalize [-> void],
   isDefaultNamespace [string -> boolean],
   compareDocumentPosition [Node -> number],
   isSameNode [Node -> boolean]}])
(ann
 js/Node
 (HJSObj
  :mandatory
  {new [-> Node],
   CDATA_SECTION_NODE number,
   DOCUMENT_POSITION_CONTAINED_BY number,
   prototype Node,
   DOCUMENT_NODE number,
   ENTITY_REFERENCE_NODE number,
   DOCUMENT_POSITION_FOLLOWING number,
   DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC number,
   DOCUMENT_TYPE_NODE number,
   ENTITY_NODE number,
   PROCESSING_INSTRUCTION_NODE number,
   DOCUMENT_POSITION_PRECEDING number,
   ATTRIBUTE_NODE number,
   DOCUMENT_FRAGMENT_NODE number,
   DOCUMENT_POSITION_DISCONNECTED number,
   TEXT_NODE number,
   COMMENT_NODE number,
   DOCUMENT_POSITION_CONTAINS number,
   NOTATION_NODE number,
   ELEMENT_NODE number}))
(ann-jsnominal
 SVGPathSegCurvetoQuadraticSmoothRel
 [[] :ancestors #{SVGPathSeg} :fields {y number, x number} :methods {}])
(ann
 js/SVGPathSegCurvetoQuadraticSmoothRel
 (HJSObj
  :mandatory
  {prototype SVGPathSegCurvetoQuadraticSmoothRel,
   new [-> SVGPathSegCurvetoQuadraticSmoothRel]}))
(ann-jsnominal
 DOML2DeprecatedListSpaceReduction
 [[] :ancestors #{} :fields {compact boolean} :methods {}])
(ann-jsnominal MSScriptHost [[] :ancestors #{} :fields {} :methods {}])
(ann
 js/MSScriptHost
 (HJSObj :mandatory {prototype MSScriptHost, new [-> MSScriptHost]}))
(ann-jsnominal
 SVGClipPathElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGUnitTypes SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {clipPathUnits SVGAnimatedEnumeration}
  :methods
  {}])
(ann
 js/SVGClipPathElement
 (HJSObj
  :mandatory
  {prototype SVGClipPathElement, new [-> SVGClipPathElement]}))
(ann-jsnominal
 MouseEvent
 [[]
  :ancestors
  #{UIEvent}
  :fields
  {altKey boolean,
   ctrlKey boolean,
   offsetY number,
   layerX number,
   metaKey boolean,
   shiftKey boolean,
   offsetX number,
   fromElement Element,
   pageY number,
   pageX number,
   layerY number,
   y number,
   x number,
   button number,
   screenX number,
   buttons number,
   toElement Element,
   screenY number,
   clientX number,
   clientY number,
   relatedTarget EventTarget,
   which number}
  :methods
  {initMouseEvent
   [string
    boolean
    boolean
    Window
    number
    number
    number
    number
    number
    boolean
    boolean
    boolean
    boolean
    number
    EventTarget
    ->
    void],
   getModifierState [string -> boolean]}])
(ann
 js/MouseEvent
 (HJSObj :mandatory {prototype MouseEvent, new [-> MouseEvent]}))
(ann-jsnominal
 RangeException
 [[]
  :ancestors
  #{}
  :fields
  {code number,
   message string,
   INVALID_NODE_TYPE_ERR number,
   BAD_BOUNDARYPOINTS_ERR number}
  :methods
  {toString [-> string]}])
(ann
 js/RangeException
 (HJSObj
  :mandatory
  {prototype RangeException,
   new [-> RangeException],
   INVALID_NODE_TYPE_ERR number,
   BAD_BOUNDARYPOINTS_ERR number}))
(ann-jsnominal
 SVGTextPositioningElement
 [[]
  :ancestors
  #{SVGTextContentElement}
  :fields
  {y SVGAnimatedLengthList,
   rotate SVGAnimatedNumberList,
   dy SVGAnimatedLengthList,
   x SVGAnimatedLengthList,
   dx SVGAnimatedLengthList}
  :methods
  {}])
(ann
 js/SVGTextPositioningElement
 (HJSObj
  :mandatory
  {prototype SVGTextPositioningElement,
   new [-> SVGTextPositioningElement]}))
(ann-jsnominal
 HTMLAppletElement
 [[]
  :ancestors
  #{DOML2DeprecatedAlignmentStyle DOML2DeprecatedMarginStyle
    MSDataBindingRecordSetExtensions DOML2DeprecatedBorderStyle
    MSDataBindingExtensions HTMLElement}
  :fields
  {altHtml string,
   height string,
   standby string,
   data string,
   alt string,
   archive string,
   width number,
   codeType string,
   classid string,
   form HTMLFormElement,
   codeBase string,
   name string,
   contentDocument Document,
   BaseHref string,
   object string,
   declare boolean,
   code string,
   useMap string,
   type string}
  :methods
  {}])
(ann
 js/HTMLAppletElement
 (HJSObj
  :mandatory
  {prototype HTMLAppletElement, new [-> HTMLAppletElement]}))
(ann-jsnominal
 TextMetrics
 [[] :ancestors #{} :fields {width number} :methods {}])
(ann
 js/TextMetrics
 (HJSObj :mandatory {prototype TextMetrics, new [-> TextMetrics]}))
(ann-jsnominal
 DocumentEvent
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {createEvent [string -> Event]}])
(ann-jsnominal
 HTMLOListElement
 [[]
  :ancestors
  #{DOML2DeprecatedListNumberingAndBulletStyle HTMLElement
    DOML2DeprecatedListSpaceReduction}
  :fields
  {start number}
  :methods
  {}])
(ann
 js/HTMLOListElement
 (HJSObj
  :mandatory
  {prototype HTMLOListElement, new [-> HTMLOListElement]}))
(ann-jsnominal
 SVGPathSegLinetoVerticalRel
 [[] :ancestors #{SVGPathSeg} :fields {y number} :methods {}])
(ann
 js/SVGPathSegLinetoVerticalRel
 (HJSObj
  :mandatory
  {prototype SVGPathSegLinetoVerticalRel,
   new [-> SVGPathSegLinetoVerticalRel]}))
(ann-jsnominal
 SVGAnimatedString
 [[]
  :ancestors
  #{}
  :fields
  {animVal string, baseVal string}
  :methods
  {}])
(ann
 js/SVGAnimatedString
 (HJSObj
  :mandatory
  {prototype SVGAnimatedString, new [-> SVGAnimatedString]}))
(ann-jsnominal
 CDATASection
 [[] :ancestors #{Text} :fields {} :methods {}])
(ann
 js/CDATASection
 (HJSObj :mandatory {prototype CDATASection, new [-> CDATASection]}))
(ann-jsnominal
 StyleMedia
 [[]
  :ancestors
  #{}
  :fields
  {type string}
  :methods
  {matchMedium [string -> boolean]}])
(ann
 js/StyleMedia
 (HJSObj :mandatory {prototype StyleMedia, new [-> StyleMedia]}))
(ann-jsnominal
 HTMLSelectElement
 [[]
  :ancestors
  #{MSHTMLCollectionExtensions MSDataBindingExtensions HTMLElement}
  :fields
  {selectedIndex number,
   value string,
   multiple boolean,
   form HTMLFormElement,
   name string,
   length number,
   size number,
   type string,
   options HTMLSelectElement}
  :methods
  {remove (Fn [-> void] [number -> void]),
   add (Fn [HTMLElement -> void] [HTMLElement any -> void]),
   item (Fn [-> any] [any -> any] [any any -> any]),
   namedItem [string -> any]}])
(ann
 js/HTMLSelectElement
 (HJSObj
  :mandatory
  {prototype HTMLSelectElement, new [-> HTMLSelectElement]}))
(ann-jsnominal
 TextRange
 [[]
  :ancestors
  #{}
  :fields
  {boundingLeft number,
   htmlText string,
   offsetLeft number,
   boundingWidth number,
   boundingHeight number,
   boundingTop number,
   text string,
   offsetTop number}
  :methods
  {moveEnd (Fn [string -> number] [string number -> number]),
   setEndPoint [string TextRange -> void],
   getClientRects [-> ClientRectList],
   queryCommandValue [string -> any],
   select [-> void],
   expand [string -> boolean],
   moveToElementText [Element -> void],
   inRange [TextRange -> boolean],
   parentElement [-> Element],
   getBookmark [-> string],
   isEqual [TextRange -> boolean],
   collapse (Fn [-> void] [boolean -> void]),
   moveStart (Fn [string -> number] [string number -> number]),
   execCommand
   (Fn
    [string -> boolean]
    [string boolean -> boolean]
    [string boolean any -> boolean]),
   queryCommandEnabled [string -> boolean],
   moveToPoint [number number -> void],
   scrollIntoView (Fn [-> void] [boolean -> void]),
   execCommandShowHelp [string -> boolean],
   queryCommandSupported [string -> boolean],
   duplicate [-> TextRange],
   getBoundingClientRect [-> ClientRect],
   queryCommandText [string -> string],
   pasteHTML [string -> void],
   queryCommandState [string -> boolean],
   queryCommandIndeterm [string -> boolean],
   moveToBookmark [string -> boolean],
   move (Fn [string -> number] [string number -> number]),
   findText
   (Fn
    [string -> boolean]
    [string number -> boolean]
    [string number number -> boolean]),
   compareEndPoints [string TextRange -> number]}])
(ann
 js/TextRange
 (HJSObj :mandatory {prototype TextRange, new [-> TextRange]}))
(ann-jsnominal
 SVGTests
 [[]
  :ancestors
  #{}
  :fields
  {requiredFeatures SVGStringList,
   requiredExtensions SVGStringList,
   systemLanguage SVGStringList}
  :methods
  {hasExtension [string -> boolean]}])
(ann-jsnominal
 HTMLBlockElement
 [[]
  :ancestors
  #{HTMLElement DOML2DeprecatedTextFlowControl}
  :fields
  {width number, cite string}
  :methods
  {}])
(ann
 js/HTMLBlockElement
 (HJSObj
  :mandatory
  {prototype HTMLBlockElement, new [-> HTMLBlockElement]}))
(ann-jsnominal
 CSSStyleSheet
 [[]
  :ancestors
  #{StyleSheet}
  :fields
  {rules MSCSSRuleList,
   ownerRule CSSRule,
   id string,
   isAlternate boolean,
   href string,
   owningElement Element,
   pages StyleSheetPageList,
   isPrefAlternate boolean,
   cssRules CSSRuleList,
   readOnly boolean,
   imports StyleSheetList,
   cssText string}
  :methods
  {addImport (Fn [string -> number] [string number -> number]),
   addPageRule
   (Fn [string string -> number] [string string number -> number]),
   insertRule (Fn [string -> number] [string number -> number]),
   removeRule [number -> void],
   deleteRule (Fn [-> void] [number -> void]),
   addRule
   (Fn
    [string -> number]
    [string string -> number]
    [string string number -> number]),
   removeImport [number -> void]}])
(ann
 js/CSSStyleSheet
 (HJSObj :mandatory {prototype CSSStyleSheet, new [-> CSSStyleSheet]}))
(ann-jsnominal
 MSSelection
 [[]
  :ancestors
  #{}
  :fields
  {type string, typeDetail string}
  :methods
  {createRange [-> TextRange],
   clear [-> void],
   createRangeCollection [-> TextRangeCollection],
   empty [-> void]}])
(ann
 js/MSSelection
 (HJSObj :mandatory {prototype MSSelection, new [-> MSSelection]}))
(ann-jsnominal
 HTMLMetaElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {httpEquiv string,
   name string,
   content string,
   url string,
   scheme string,
   charset string}
  :methods
  {}])
(ann
 js/HTMLMetaElement
 (HJSObj
  :mandatory
  {prototype HTMLMetaElement, new [-> HTMLMetaElement]}))
(ann-jsnominal
 SVGPatternElement
 [[]
  :ancestors
  #{SVGURIReference SVGExternalResourcesRequired SVGUnitTypes
    SVGStylable SVGElement SVGTests SVGFitToViewBox SVGLangSpace}
  :fields
  {patternUnits SVGAnimatedEnumeration,
   y SVGAnimatedLength,
   width SVGAnimatedLength,
   x SVGAnimatedLength,
   patternContentUnits SVGAnimatedEnumeration,
   patternTransform SVGAnimatedTransformList,
   height SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGPatternElement
 (HJSObj
  :mandatory
  {prototype SVGPatternElement, new [-> SVGPatternElement]}))
(ann-jsnominal
 SVGAnimatedAngle
 [[]
  :ancestors
  #{}
  :fields
  {animVal SVGAngle, baseVal SVGAngle}
  :methods
  {}])
(ann
 js/SVGAnimatedAngle
 (HJSObj
  :mandatory
  {prototype SVGAnimatedAngle, new [-> SVGAnimatedAngle]}))
(ann-jsnominal
 Selection
 [[]
  :ancestors
  #{}
  :fields
  {isCollapsed boolean,
   anchorNode Node,
   focusNode Node,
   anchorOffset number,
   focusOffset number,
   rangeCount number}
  :methods
  {getRangeAt [number -> Range],
   selectAllChildren [Node -> void],
   removeRange [Range -> void],
   collapse [Node number -> void],
   deleteFromDocument [-> void],
   removeAllRanges [-> void],
   collapseToEnd [-> void],
   toString [-> string],
   addRange [Range -> void],
   collapseToStart [-> void]}])
(ann
 js/Selection
 (HJSObj :mandatory {prototype Selection, new [-> Selection]}))
(ann-jsnominal
 SVGScriptElement
 [[]
  :ancestors
  #{SVGURIReference SVGExternalResourcesRequired SVGElement}
  :fields
  {type string}
  :methods
  {}])
(ann
 js/SVGScriptElement
 (HJSObj
  :mandatory
  {prototype SVGScriptElement, new [-> SVGScriptElement]}))
(ann-jsnominal
 HTMLDDElement
 [[] :ancestors #{HTMLElement} :fields {noWrap boolean} :methods {}])
(ann
 js/HTMLDDElement
 (HJSObj :mandatory {prototype HTMLDDElement, new [-> HTMLDDElement]}))
(ann-jsnominal
 MSDataBindingRecordSetReadonlyExtensions
 [[]
  :ancestors
  #{}
  :fields
  {recordset Object}
  :methods
  {namedRecordset (Fn [string -> Object] [string any -> Object])}])
(ann-jsnominal
 CSSStyleRule
 [[]
  :ancestors
  #{CSSRule}
  :fields
  {selectorText string, style MSStyleCSSProperties, readOnly boolean}
  :methods
  {}])
(ann
 js/CSSStyleRule
 (HJSObj :mandatory {prototype CSSStyleRule, new [-> CSSStyleRule]}))
(ann-jsnominal
 NodeIterator
 [[]
  :ancestors
  #{}
  :fields
  {whatToShow number,
   filter NodeFilter,
   root Node,
   expandEntityReferences boolean}
  :methods
  {nextNode [-> Node], detach [-> void], previousNode [-> Node]}])
(ann
 js/NodeIterator
 (HJSObj :mandatory {prototype NodeIterator, new [-> NodeIterator]}))
(ann-jsnominal
 SVGViewElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGElement SVGZoomAndPan
    SVGFitToViewBox}
  :fields
  {viewTarget SVGStringList}
  :methods
  {}])
(ann
 js/SVGViewElement
 (HJSObj
  :mandatory
  {prototype SVGViewElement, new [-> SVGViewElement]}))
(ann-jsnominal
 HTMLLinkElement
 [[]
  :ancestors
  #{LinkStyle HTMLElement}
  :fields
  {rel string,
   target string,
   href string,
   media string,
   rev string,
   type string,
   charset string,
   hreflang string}
  :methods
  {}])
(ann
 js/HTMLLinkElement
 (HJSObj
  :mandatory
  {prototype HTMLLinkElement, new [-> HTMLLinkElement]}))
(ann-jsnominal
 SVGLocatable
 [[]
  :ancestors
  #{}
  :fields
  {farthestViewportElement SVGElement,
   nearestViewportElement SVGElement}
  :methods
  {getBBox [-> SVGRect],
   getTransformToElement [SVGElement -> SVGMatrix],
   getCTM [-> SVGMatrix],
   getScreenCTM [-> SVGMatrix]}])
(ann-jsnominal
 HTMLFontElement
 [[]
  :ancestors
  #{DOML2DeprecatedSizeProperty DOML2DeprecatedColorProperty
    HTMLElement}
  :fields
  {face string}
  :methods
  {}])
(ann
 js/HTMLFontElement
 (HJSObj
  :mandatory
  {prototype HTMLFontElement, new [-> HTMLFontElement]}))
(ann-jsnominal
 SVGTitleElement
 [[]
  :ancestors
  #{SVGStylable SVGElement SVGLangSpace}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGTitleElement
 (HJSObj
  :mandatory
  {prototype SVGTitleElement, new [-> SVGTitleElement]}))
(ann-jsnominal
 ControlRangeCollection
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {add [Element -> void],
   queryCommandValue [string -> any],
   select [-> void],
   addElement [Element -> void],
   execCommand
   (Fn
    [string -> boolean]
    [string boolean -> boolean]
    [string boolean any -> boolean]),
   queryCommandEnabled [string -> boolean],
   item [number -> Element],
   scrollIntoView (Fn [-> void] [any -> void]),
   queryCommandSupported [string -> boolean],
   queryCommandText [string -> string],
   queryCommandState [string -> boolean],
   queryCommandIndeterm [string -> boolean],
   remove [number -> void]}])
(ann
 js/ControlRangeCollection
 (HJSObj
  :mandatory
  {prototype ControlRangeCollection, new [-> ControlRangeCollection]}))
(Value "readystatechange")
(ann-jsnominal
 MSNamespaceInfo
 [[]
  :ancestors
  #{MSEventAttachmentTarget}
  :fields
  {urn string,
   onreadystatechange [Event -> any],
   name string,
   readyState string}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   doImport [string -> void]}])
(ann
 js/MSNamespaceInfo
 (HJSObj
  :mandatory
  {prototype MSNamespaceInfo, new [-> MSNamespaceInfo]}))
(ann-jsnominal
 WindowSessionStorage
 [[] :ancestors #{} :fields {sessionStorage Storage} :methods {}])
(ann-jsnominal
 SVGAnimatedTransformList
 [[]
  :ancestors
  #{}
  :fields
  {animVal SVGTransformList, baseVal SVGTransformList}
  :methods
  {}])
(ann
 js/SVGAnimatedTransformList
 (HJSObj
  :mandatory
  {prototype SVGAnimatedTransformList,
   new [-> SVGAnimatedTransformList]}))
(ann-jsnominal
 HTMLTableCaptionElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {align string, vAlign string}
  :methods
  {}])
(ann
 js/HTMLTableCaptionElement
 (HJSObj
  :mandatory
  {prototype HTMLTableCaptionElement,
   new [-> HTMLTableCaptionElement]}))
(ann-jsnominal
 HTMLOptionElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {index number,
   defaultSelected boolean,
   value string,
   text string,
   form HTMLFormElement,
   label string,
   selected boolean}
  :methods
  {create [-> HTMLOptionElement]}])
(ann
 js/HTMLOptionElement
 (HJSObj
  :mandatory
  {prototype HTMLOptionElement, new [-> HTMLOptionElement]}))
(ann-jsnominal
 HTMLMapElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {name string, areas HTMLAreasCollection}
  :methods
  {}])
(ann
 js/HTMLMapElement
 (HJSObj
  :mandatory
  {prototype HTMLMapElement, new [-> HTMLMapElement]}))
(ann-jsnominal
 HTMLMenuElement
 [[]
  :ancestors
  #{HTMLElement DOML2DeprecatedListSpaceReduction}
  :fields
  {type string}
  :methods
  {}])
(ann
 js/HTMLMenuElement
 (HJSObj
  :mandatory
  {prototype HTMLMenuElement, new [-> HTMLMenuElement]}))
(ann-jsnominal
 MouseWheelEvent
 [[]
  :ancestors
  #{MouseEvent}
  :fields
  {wheelDelta number}
  :methods
  {initMouseWheelEvent
   [string
    boolean
    boolean
    Window
    number
    number
    number
    number
    number
    number
    EventTarget
    string
    number
    ->
    void]}])
(ann
 js/MouseWheelEvent
 (HJSObj
  :mandatory
  {prototype MouseWheelEvent, new [-> MouseWheelEvent]}))
(ann-jsnominal
 SVGFitToViewBox
 [[]
  :ancestors
  #{}
  :fields
  {viewBox SVGAnimatedRect,
   preserveAspectRatio SVGAnimatedPreserveAspectRatio}
  :methods
  {}])
(ann-jsnominal
 SVGPointList
 [[]
  :ancestors
  #{}
  :fields
  {numberOfItems number}
  :methods
  {replaceItem [SVGPoint number -> SVGPoint],
   getItem [number -> SVGPoint],
   clear [-> void],
   appendItem [SVGPoint -> SVGPoint],
   initialize [SVGPoint -> SVGPoint],
   removeItem [number -> SVGPoint],
   insertItemBefore [SVGPoint number -> SVGPoint]}])
(ann
 js/SVGPointList
 (HJSObj :mandatory {prototype SVGPointList, new [-> SVGPointList]}))
(ann-jsnominal
 SVGAnimatedLengthList
 [[]
  :ancestors
  #{}
  :fields
  {animVal SVGLengthList, baseVal SVGLengthList}
  :methods
  {}])
(ann
 js/SVGAnimatedLengthList
 (HJSObj
  :mandatory
  {prototype SVGAnimatedLengthList, new [-> SVGAnimatedLengthList]}))
(Value "dragend")
(Value "keydown")
(Value "dragover")
(Value "keyup")
(Value "reset")
(Value "mouseup")
(Value "dragstart")
(Value "drag")
(Value "mouseover")
(Value "dragleave")
(Value "afterprint")
(Value "pause")
(Value "beforeprint")
(Value "mousedown")
(Value "seeked")
(Value "click")
(Value "waiting")
(Value "online")
(Value "durationchange")
(Value "blur")
(Value "emptied")
(Value "seeking")
(Value "canplay")
(Value "stalled")
(Value "mousemove")
(Value "offline")
(Value "beforeunload")
(Value "ratechange")
(Value "storage")
(Value "loadstart")
(Value "dragenter")
(Value "submit")
(Value "progress")
(Value "dblclick")
(Value "contextmenu")
(Value "change")
(Value "loadedmetadata")
(Value "play")
(Value "playing")
(Value "canplaythrough")
(Value "abort")
(Value "readystatechange")
(Value "keypress")
(Value "loadeddata")
(Value "suspend")
(Value "focus")
(Value "message")
(Value "timeupdate")
(Value "resize")
(Value "select")
(Value "drop")
(Value "mouseout")
(Value "ended")
(Value "hashchange")
(Value "unload")
(Value "scroll")
(Value "mousewheel")
(Value "load")
(Value "volumechange")
(Value "input")
(ann-jsnominal
 Window
 [[]
  :ancestors
  #{MSEventAttachmentTarget WindowTimers EventTarget WindowLocalStorage
    WindowSessionStorage MSWindowExtensions}
  :fields
  {oninput [Event -> any],
   self Window,
   onmousemove [MouseEvent -> any],
   onpause [Event -> any],
   opener Window,
   onkeypress [KeyboardEvent -> any],
   onloadeddata [Event -> any],
   ondrop [DragEvent -> any],
   oncontextmenu [MouseEvent -> any],
   onbeforeprint [Event -> any],
   onmessage [MessageEvent -> any],
   onchange [Event -> any],
   onmousedown [MouseEvent -> any],
   frameElement Element,
   onmousewheel [MouseWheelEvent -> any],
   ontimeupdate [Event -> any],
   frames Window,
   document Document,
   onselect [UIEvent -> any],
   onafterprint [Event -> any],
   onsuspend [Event -> any],
   window Window,
   onoffline [Event -> any],
   ononline [Event -> any],
   ondragenter [DragEvent -> any],
   onmouseup [MouseEvent -> any],
   onseeking [Event -> any],
   parent Window,
   onvolumechange [Event -> any],
   history History,
   ondragstart [DragEvent -> any],
   onkeydown [KeyboardEvent -> any],
   onratechange [Event -> any],
   onblur [FocusEvent -> any],
   onmouseover [MouseEvent -> any],
   onreadystatechange [Event -> any],
   onhashchange [Event -> any],
   onemptied [Event -> any],
   pageYOffset number,
   innerWidth number,
   ondrag [DragEvent -> any],
   ondblclick [MouseEvent -> any],
   onplay [Event -> any],
   oncanplay [Event -> any],
   onload [Event -> any],
   name string,
   onprogress [any -> any],
   onseeked [Event -> any],
   outerWidth number,
   onsubmit [Event -> any],
   oncanplaythrough [Event -> any],
   ondurationchange [Event -> any],
   onclick [MouseEvent -> any],
   onerror ErrorEventHandler,
   onwaiting [Event -> any],
   location Location,
   onstorage [StorageEvent -> any],
   onabort [UIEvent -> any],
   length number,
   onloadstart [Event -> any],
   ondragover [DragEvent -> any],
   performance Performance,
   styleMedia StyleMedia,
   onfocus [FocusEvent -> any],
   onscroll [UIEvent -> any],
   screen Screen,
   screenX number,
   navigator Navigator,
   screenY number,
   onstalled [Event -> any],
   ondragend [DragEvent -> any],
   outerHeight number,
   top Window,
   onplaying [Event -> any],
   onmouseout [MouseEvent -> any],
   onkeyup [KeyboardEvent -> any],
   onended [Event -> any],
   pageXOffset number,
   onreset [Event -> any],
   onbeforeunload [BeforeUnloadEvent -> any],
   innerHeight number,
   ondragleave [DragEvent -> any],
   onunload [Event -> any],
   onresize [UIEvent -> any],
   onloadedmetadata [Event -> any]}
  :methods
  {scroll (Fn [-> void] [number -> void] [number number -> void]),
   addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   open
   (Fn
    [-> Window]
    [string -> Window]
    [string string -> Window]
    [string string string -> Window]
    [string string string boolean -> Window]),
   showModalDialog
   (Fn
    [-> any]
    [string -> any]
    [string any -> any]
    [string any any -> any]),
   confirm (Fn [-> boolean] [string -> boolean]),
   print [-> void],
   scrollTo (Fn [-> void] [number -> void] [number number -> void]),
   alert (Fn [-> void] [string -> void]),
   postMessage (Fn [any string -> void] [any string any -> void]),
   close [-> void],
   blur [-> void],
   prompt
   (Fn [-> string] [string -> string] [string string -> string]),
   focus [-> void],
   getSelection [-> Selection],
   toString [-> string],
   getComputedStyle
   (Fn
    [Element -> CSSStyleDeclaration]
    [Element string -> CSSStyleDeclaration]),
   scrollBy (Fn [-> void] [number -> void] [number number -> void])}])
(ann js/Window (HJSObj :mandatory {prototype Window, new [-> Window]}))
(ann-jsnominal
 SVGAnimatedPreserveAspectRatio
 [[]
  :ancestors
  #{}
  :fields
  {animVal SVGPreserveAspectRatio, baseVal SVGPreserveAspectRatio}
  :methods
  {}])
(ann
 js/SVGAnimatedPreserveAspectRatio
 (HJSObj
  :mandatory
  {prototype SVGAnimatedPreserveAspectRatio,
   new [-> SVGAnimatedPreserveAspectRatio]}))
(ann-jsnominal
 MSSiteModeEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {buttonID number, actionURL string}
  :methods
  {}])
(ann
 js/MSSiteModeEvent
 (HJSObj
  :mandatory
  {prototype MSSiteModeEvent, new [-> MSSiteModeEvent]}))
(ann-jsnominal
 DOML2DeprecatedTextFlowControl
 [[] :ancestors #{} :fields {clear string} :methods {}])
(ann-jsnominal
 StyleSheetPageList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> CSSPageRule]}])
(ann
 js/StyleSheetPageList
 (HJSObj
  :mandatory
  {prototype StyleSheetPageList, new [-> StyleSheetPageList]}))
(ann-jsnominal
 MSCSSProperties
 [[]
  :ancestors
  #{CSSStyleDeclaration}
  :fields
  {scrollbarArrowColor string,
   layoutGridLine string,
   styleFloat string,
   backgroundPositionX string,
   textKashida string,
   backgroundPositionY string,
   layoutGrid string,
   scrollbarDarkShadowColor string,
   filter string,
   layoutFlow string,
   textKashidaSpace string,
   msInterpolationMode string,
   scrollbarBaseColor string,
   textAutospace string,
   msBlockProgression string,
   textJustifyTrim string,
   lineBreak string,
   accelerator string,
   layoutGridType string,
   scrollbarFaceColor string,
   scrollbarHighlightColor string,
   layoutGridChar string,
   scrollbarShadowColor string,
   zoom string,
   imeMode string,
   layoutGridMode string,
   scrollbarTrackColor string,
   scrollbar3dLightColor string,
   behavior string,
   writingMode string}
  :methods
  {getAttribute (Fn [string -> any] [string number -> any]),
   setAttribute (Fn [string any -> void] [string any number -> void]),
   removeAttribute
   (Fn [string -> boolean] [string number -> boolean])}])
(ann
 js/MSCSSProperties
 (HJSObj
  :mandatory
  {prototype MSCSSProperties, new [-> MSCSSProperties]}))
(ann-jsnominal
 HTMLCollection
 [[]
  :ancestors
  #{MSHTMLCollectionExtensions}
  :fields
  {length number}
  :methods
  {item (Fn [-> Element] [any -> Element] [any any -> Element]),
   namedItem [string -> Element]}])
(ann
 js/HTMLCollection
 (HJSObj
  :mandatory
  {prototype HTMLCollection, new [-> HTMLCollection]}))
(ann-jsnominal
 SVGExternalResourcesRequired
 [[]
  :ancestors
  #{}
  :fields
  {externalResourcesRequired SVGAnimatedBoolean}
  :methods
  {}])
(ann-jsnominal
 HTMLImageElement
 [[]
  :ancestors
  #{MSImageResourceExtensions MSResourceMetadata
    MSDataBindingExtensions HTMLElement}
  :fields
  {height number,
   border string,
   href string,
   longDesc string,
   alt string,
   width number,
   name string,
   naturalHeight number,
   src string,
   useMap string,
   naturalWidth number,
   vspace number,
   hspace number,
   complete boolean,
   align string,
   isMap boolean}
  :methods
  {create [-> HTMLImageElement]}])
(ann
 js/HTMLImageElement
 (HJSObj
  :mandatory
  {prototype HTMLImageElement, new [-> HTMLImageElement]}))
(ann-jsnominal
 HTMLAreaElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {shape string,
   protocol string,
   href string,
   alt string,
   search string,
   host string,
   target string,
   noHref boolean,
   hash string,
   pathname string,
   hostname string,
   port string,
   coords string}
  :methods
  {toString [-> string]}])
(ann
 js/HTMLAreaElement
 (HJSObj
  :mandatory
  {prototype HTMLAreaElement, new [-> HTMLAreaElement]}))
(ann-jsnominal
 EventTarget
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {removeEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   dispatchEvent [Event -> boolean]}])
(ann-jsnominal
 SVGAngle
 [[]
  :ancestors
  #{}
  :fields
  {valueAsString string,
   value number,
   unitType number,
   SVG_ANGLETYPE_UNSPECIFIED number,
   valueInSpecifiedUnits number,
   SVG_ANGLETYPE_DEG number,
   SVG_ANGLETYPE_RAD number,
   SVG_ANGLETYPE_GRAD number,
   SVG_ANGLETYPE_UNKNOWN number}
  :methods
  {newValueSpecifiedUnits [number number -> void],
   convertToSpecifiedUnits [number -> void]}])
(ann
 js/SVGAngle
 (HJSObj
  :mandatory
  {prototype SVGAngle,
   new [-> SVGAngle],
   SVG_ANGLETYPE_RAD number,
   SVG_ANGLETYPE_UNKNOWN number,
   SVG_ANGLETYPE_UNSPECIFIED number,
   SVG_ANGLETYPE_DEG number,
   SVG_ANGLETYPE_GRAD number}))
(ann-jsnominal
 HTMLButtonElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {value string,
   status any,
   form HTMLFormElement,
   name string,
   type string}
  :methods
  {createTextRange [-> TextRange]}])
(ann
 js/HTMLButtonElement
 (HJSObj
  :mandatory
  {prototype HTMLButtonElement, new [-> HTMLButtonElement]}))
(ann-jsnominal
 HTMLSourceElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {src string, media string, type string}
  :methods
  {}])
(ann
 js/HTMLSourceElement
 (HJSObj
  :mandatory
  {prototype HTMLSourceElement, new [-> HTMLSourceElement]}))
(ann-jsnominal
 CanvasGradient
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {addColorStop [number string -> void]}])
(ann
 js/CanvasGradient
 (HJSObj
  :mandatory
  {prototype CanvasGradient, new [-> CanvasGradient]}))
(ann-jsnominal
 KeyboardEvent
 [[]
  :ancestors
  #{UIEvent}
  :fields
  {altKey boolean,
   DOM_KEY_LOCATION_LEFT number,
   ctrlKey boolean,
   DOM_KEY_LOCATION_MOBILE number,
   repeat boolean,
   metaKey boolean,
   shiftKey boolean,
   DOM_KEY_LOCATION_STANDARD number,
   DOM_KEY_LOCATION_JOYSTICK number,
   DOM_KEY_LOCATION_RIGHT number,
   DOM_KEY_LOCATION_NUMPAD number,
   key string,
   charCode number,
   location number,
   locale string,
   keyCode number,
   char string,
   which number}
  :methods
  {getModifierState [string -> boolean],
   initKeyboardEvent
   [string
    boolean
    boolean
    Window
    string
    number
    string
    boolean
    string
    ->
    void]}])
(ann
 js/KeyboardEvent
 (HJSObj
  :mandatory
  {prototype KeyboardEvent,
   new [-> KeyboardEvent],
   DOM_KEY_LOCATION_RIGHT number,
   DOM_KEY_LOCATION_STANDARD number,
   DOM_KEY_LOCATION_LEFT number,
   DOM_KEY_LOCATION_NUMPAD number,
   DOM_KEY_LOCATION_JOYSTICK number,
   DOM_KEY_LOCATION_MOBILE number}))
(Value "keydown")
(Value "keyup")
(Value "reset")
(Value "help")
(Value "dragleave")
(Value "focusin")
(Value "seeked")
(Value "durationchange")
(Value "blur")
(Value "emptied")
(Value "seeking")
(Value "deactivate")
(Value "canplay")
(Value "datasetchanged")
(Value "rowsdelete")
(Value "loadstart")
(Value "controlselect")
(Value "dragenter")
(Value "submit")
(Value "change")
(Value "beforeactivate")
(Value "canplaythrough")
(Value "beforeupdate")
(Value "datasetcomplete")
(Value "suspend")
(Value "errorupdate")
(Value "mouseout")
(Value "msthumbnailclick")
(Value "mousewheel")
(Value "volumechange")
(Value "cellchange")
(Value "rowexit")
(Value "rowsinserted")
(Value "propertychange")
(Value "dragend")
(Value "dragover")
(Value "dragstart")
(Value "mouseup")
(Value "drag")
(Value "mouseover")
(Value "pause")
(Value "mousedown")
(Value "click")
(Value "waiting")
(Value "stop")
(Value "mssitemodejumplistitemremoved")
(Value "stalled")
(Value "mousemove")
(Value "beforeeditfocus")
(Value "ratechange")
(Value "progress")
(Value "dblclick")
(Value "contextmenu")
(Value "loadedmetadata")
(Value "error")
(Value "play")
(Value "afterupdate")
(Value "playing")
(Value "abort")
(Value "focusout")
(Value "selectionchange")
(Value "storagecommit")
(Value "dataavailable")
(Value "readystatechange")
(Value "keypress")
(Value "loadeddata")
(Value "beforedeactivate")
(Value "activate")
(Value "selectstart")
(Value "focus")
(Value "timeupdate")
(Value "select")
(Value "drop")
(Value "ended")
(Value "scroll")
(Value "rowenter")
(Value "load")
(Value "input")
(Value "a")
(Value "abbr")
(Value "address")
(Value "area")
(Value "article")
(Value "aside")
(Value "audio")
(Value "b")
(Value "base")
(Value "bdi")
(Value "bdo")
(Value "blockquote")
(Value "body")
(Value "br")
(Value "button")
(Value "canvas")
(Value "caption")
(Value "cite")
(Value "code")
(Value "col")
(Value "colgroup")
(Value "datalist")
(Value "dd")
(Value "del")
(Value "dfn")
(Value "div")
(Value "dl")
(Value "dt")
(Value "em")
(Value "embed")
(Value "fieldset")
(Value "figcaption")
(Value "figure")
(Value "footer")
(Value "form")
(Value "h1")
(Value "h2")
(Value "h3")
(Value "h4")
(Value "h5")
(Value "h6")
(Value "head")
(Value "header")
(Value "hgroup")
(Value "hr")
(Value "html")
(Value "i")
(Value "iframe")
(Value "img")
(Value "input")
(Value "ins")
(Value "kbd")
(Value "label")
(Value "legend")
(Value "li")
(Value "link")
(Value "main")
(Value "map")
(Value "mark")
(Value "menu")
(Value "meta")
(Value "nav")
(Value "noscript")
(Value "object")
(Value "ol")
(Value "optgroup")
(Value "option")
(Value "p")
(Value "param")
(Value "pre")
(Value "progress")
(Value "q")
(Value "rp")
(Value "rt")
(Value "ruby")
(Value "s")
(Value "samp")
(Value "script")
(Value "section")
(Value "select")
(Value "small")
(Value "source")
(Value "span")
(Value "strong")
(Value "style")
(Value "sub")
(Value "summary")
(Value "sup")
(Value "table")
(Value "tbody")
(Value "td")
(Value "textarea")
(Value "tfoot")
(Value "th")
(Value "thead")
(Value "title")
(Value "tr")
(Value "track")
(Value "u")
(Value "ul")
(Value "var")
(Value "video")
(Value "wbr")
(Value "a")
(Value "abbr")
(Value "address")
(Value "area")
(Value "article")
(Value "aside")
(Value "audio")
(Value "b")
(Value "base")
(Value "bdi")
(Value "bdo")
(Value "blockquote")
(Value "body")
(Value "br")
(Value "button")
(Value "canvas")
(Value "caption")
(Value "cite")
(Value "code")
(Value "col")
(Value "colgroup")
(Value "datalist")
(Value "dd")
(Value "del")
(Value "dfn")
(Value "div")
(Value "dl")
(Value "dt")
(Value "em")
(Value "embed")
(Value "fieldset")
(Value "figcaption")
(Value "figure")
(Value "footer")
(Value "form")
(Value "h1")
(Value "h2")
(Value "h3")
(Value "h4")
(Value "h5")
(Value "h6")
(Value "head")
(Value "header")
(Value "hgroup")
(Value "hr")
(Value "html")
(Value "i")
(Value "iframe")
(Value "img")
(Value "input")
(Value "ins")
(Value "kbd")
(Value "label")
(Value "legend")
(Value "li")
(Value "link")
(Value "main")
(Value "map")
(Value "mark")
(Value "menu")
(Value "meta")
(Value "nav")
(Value "noscript")
(Value "object")
(Value "ol")
(Value "optgroup")
(Value "option")
(Value "p")
(Value "param")
(Value "pre")
(Value "progress")
(Value "q")
(Value "rp")
(Value "rt")
(Value "ruby")
(Value "s")
(Value "samp")
(Value "script")
(Value "section")
(Value "select")
(Value "small")
(Value "source")
(Value "span")
(Value "strong")
(Value "style")
(Value "sub")
(Value "summary")
(Value "sup")
(Value "table")
(Value "tbody")
(Value "td")
(Value "textarea")
(Value "tfoot")
(Value "th")
(Value "thead")
(Value "title")
(Value "tr")
(Value "track")
(Value "u")
(Value "ul")
(Value "var")
(Value "video")
(Value "wbr")
(Value "DOMContentLoaded")
(ann-jsnominal
 Document
 [[]
  :ancestors
  #{NodeSelector MSResourceMetadata Node MSEventAttachmentTarget
    MSNodeExtensions DocumentEvent}
  :fields
  {charset string,
   defaultCharset string,
   all HTMLCollection,
   oninput [Event -> any],
   onmsthumbnailclick [MSSiteModeEvent -> any],
   plugins HTMLCollection,
   onmousemove [MouseEvent -> any],
   onpause [Event -> any],
   onhelp [Event -> any],
   onkeypress [KeyboardEvent -> any],
   onloadeddata [Event -> any],
   ondrop [DragEvent -> any],
   fgColor string,
   oncontextmenu [MouseEvent -> any],
   body HTMLElement,
   alinkColor string,
   URL string,
   onchange [Event -> any],
   onmousedown [MouseEvent -> any],
   onmousewheel [MouseWheelEvent -> any],
   ontimeupdate [Event -> any],
   frames Window,
   onselect [UIEvent -> any],
   oncontrolselect [MSEventObj -> any],
   onsuspend [Event -> any],
   onselectionchange [Event -> any],
   onselectstart [Event -> any],
   onstoragecommit [StorageEvent -> any],
   doctype DocumentType,
   lastModified string,
   ondatasetcomplete [MSEventObj -> any],
   ondragenter [DragEvent -> any],
   uniqueID string,
   activeElement Element,
   xmlVersion string,
   onmouseup [MouseEvent -> any],
   onseeking [Event -> any],
   security string,
   onvolumechange [Event -> any],
   readyState string,
   forms HTMLCollection,
   ondragstart [DragEvent -> any],
   onkeydown [KeyboardEvent -> any],
   onratechange [Event -> any],
   onblur [FocusEvent -> any],
   URLUnencoded string,
   onbeforeactivate [UIEvent -> any],
   onmouseover [MouseEvent -> any],
   onreadystatechange [Event -> any],
   onemptied [Event -> any],
   ondrag [DragEvent -> any],
   ondeactivate [UIEvent -> any],
   anchors HTMLCollection,
   ondblclick [MouseEvent -> any],
   documentMode number,
   domain string,
   onplay [Event -> any],
   characterSet string,
   onbeforedeactivate [UIEvent -> any],
   onerrorupdate [MSEventObj -> any],
   onmssitemodejumplistitemremoved [MSSiteModeEvent -> any],
   images HTMLCollection,
   oncanplay [Event -> any],
   onload [Event -> any],
   msCapsLockWarningOff boolean,
   namespaces MSNamespaceInfoCollection,
   compatMode string,
   selection MSSelection,
   onprogress [any -> any],
   onseeked [Event -> any],
   documentElement Element,
   onstop [Event -> any],
   xmlEncoding string,
   onsubmit [Event -> any],
   head HTMLHeadElement,
   oncanplaythrough [Event -> any],
   dir string,
   ondataavailable [MSEventObj -> any],
   ondurationchange [Event -> any],
   onrowsdelete [MSEventObj -> any],
   linkColor string,
   onclick [MouseEvent -> any],
   onerror [Event -> any],
   onwaiting [Event -> any],
   scripts HTMLCollection,
   location Location,
   xmlStandalone boolean,
   onabort [UIEvent -> any],
   oncellchange [MSEventObj -> any],
   onafterupdate [MSEventObj -> any],
   ondatasetchanged [MSEventObj -> any],
   onloadstart [Event -> any],
   onbeforeupdate [MSEventObj -> any],
   ondragover [DragEvent -> any],
   onbeforeeditfocus [MSEventObj -> any],
   inputEncoding string,
   onpropertychange [MSEventObj -> any],
   onfocus [FocusEvent -> any],
   media string,
   cookie string,
   applets HTMLCollection,
   onfocusin [FocusEvent -> any],
   title string,
   implementation DOMImplementation,
   onscroll [UIEvent -> any],
   designMode string,
   Script MSScriptHost,
   onstalled [Event -> any],
   compatible MSCompatibleInfoCollection,
   ondragend [DragEvent -> any],
   onplaying [Event -> any],
   onfocusout [FocusEvent -> any],
   onmouseout [MouseEvent -> any],
   onkeyup [KeyboardEvent -> any],
   onended [Event -> any],
   defaultView Window,
   onreset [Event -> any],
   onrowenter [MSEventObj -> any],
   onrowsinserted [MSEventObj -> any],
   rootElement SVGSVGElement,
   parentWindow Window,
   embeds HTMLCollection,
   links HTMLCollection,
   bgColor string,
   onrowexit [MSEventObj -> any],
   ondragleave [DragEvent -> any],
   vlinkColor string,
   onloadedmetadata [Event -> any],
   referrer string,
   onactivate [UIEvent -> any],
   styleSheets StyleSheetList}
  :methods
  {writeln [string * -> void],
   createRange [-> Range],
   addEventListener
   (Fn
    [(Value "\"DOMContentLoaded\"") [Event -> any] -> void]
    [(Value "\"DOMContentLoaded\"") [Event -> any] boolean -> void]),
   createStyleSheet
   (Fn
    [-> CSSStyleSheet]
    [string -> CSSStyleSheet]
    [string number -> CSSStyleSheet]),
   open
   (Fn
    [-> any]
    [string -> any]
    [string string -> any]
    [string string string -> any]
    [string string string boolean -> any]),
   queryCommandValue [string -> string],
   getElementsByName [string -> NodeList],
   createDocumentFragment [-> DocumentFragment],
   createElementNS [string string -> Element],
   createNodeIterator [Node number NodeFilter boolean -> NodeIterator],
   createComment [string -> Comment],
   createTreeWalker [Node number NodeFilter boolean -> TreeWalker],
   importNode [Node boolean -> Node],
   createEventObject (Fn [-> MSEventObj] [any -> MSEventObj]),
   execCommand
   (Fn
    [string -> boolean]
    [string boolean -> boolean]
    [string boolean any -> boolean]),
   queryCommandEnabled [string -> boolean],
   hasFocus [-> boolean],
   createAttributeNS [string string -> Attr],
   write [string * -> void],
   execCommandShowHelp [string -> boolean],
   getElementsByClassName [string -> NodeList],
   createProcessingInstruction
   [string string -> ProcessingInstruction],
   close [-> void],
   queryCommandSupported [string -> boolean],
   updateSettings [-> void],
   createElement [(Value "\"wbr\"") -> HTMLElement],
   createCDATASection [string -> CDATASection],
   queryCommandText [string -> string],
   focus [-> void],
   releaseCapture [-> void],
   createTextNode [string -> Text],
   getSelection [-> Selection],
   getElementsByTagName
   [(Value "\"wbr\"") -> (NodeListOf HTMLElement)],
   elementFromPoint [number number -> Element],
   createAttribute [string -> Attr],
   queryCommandState [string -> boolean],
   queryCommandIndeterm [string -> boolean],
   getElementsByTagNameNS [string string -> NodeList],
   fireEvent (Fn [string -> boolean] [string any -> boolean]),
   getElementById [string -> HTMLElement],
   adoptNode [Node -> Node]}])
(ann
 js/Document
 (HJSObj :mandatory {prototype Document, new [-> Document]}))
(ann-jsnominal
 MessageEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {source Window, origin string, data any}
  :methods
  {initMessageEvent
   [string boolean boolean any string string Window -> void]}])
(ann
 js/MessageEvent
 (HJSObj :mandatory {prototype MessageEvent, new [-> MessageEvent]}))
(Value "mouseover")
(Value "mousemove")
(Value "mouseout")
(Value "dblclick")
(Value "focusout")
(Value "focusin")
(Value "mousedown")
(Value "load")
(Value "mouseup")
(Value "click")
(ann-jsnominal
 SVGElement
 [[]
  :ancestors
  #{Element}
  :fields
  {viewportElement SVGElement,
   onmousemove [MouseEvent -> any],
   onmousedown [MouseEvent -> any],
   id string,
   onmouseup [MouseEvent -> any],
   onmouseover [MouseEvent -> any],
   ondblclick [MouseEvent -> any],
   onload [Event -> any],
   ownerSVGElement SVGSVGElement,
   onclick [MouseEvent -> any],
   onfocusin [FocusEvent -> any],
   onfocusout [FocusEvent -> any],
   xmlbase string,
   onmouseout [MouseEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann
 js/SVGElement
 (HJSObj :mandatory {prototype SVGElement, new [-> SVGElement]}))
(ann-jsnominal
 HTMLScriptElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {defer boolean,
   text string,
   src string,
   htmlFor string,
   charset string,
   type string,
   event string}
  :methods
  {}])
(ann
 js/HTMLScriptElement
 (HJSObj
  :mandatory
  {prototype HTMLScriptElement, new [-> HTMLScriptElement]}))
(ann-jsnominal
 HTMLTableRowElement
 [[]
  :ancestors
  #{HTMLTableAlignment DOML2DeprecatedBackgroundColorStyle HTMLElement}
  :fields
  {rowIndex number,
   cells HTMLCollection,
   align string,
   borderColorLight any,
   sectionRowIndex number,
   borderColor any,
   height any,
   borderColorDark any}
  :methods
  {deleteCell (Fn [-> void] [number -> void]),
   insertCell (Fn [-> HTMLElement] [number -> HTMLElement])}])
(ann
 js/HTMLTableRowElement
 (HJSObj
  :mandatory
  {prototype HTMLTableRowElement, new [-> HTMLTableRowElement]}))
(ann-jsnominal
 CanvasRenderingContext2D
 [[]
  :ancestors
  #{}
  :fields
  {shadowColor string,
   globalCompositeOperation string,
   font string,
   msImageSmoothingEnabled boolean,
   shadowBlur number,
   globalAlpha number,
   textBaseline string,
   miterLimit number,
   shadowOffsetY number,
   lineJoin string,
   lineDashOffset number,
   strokeStyle any,
   lineCap string,
   canvas HTMLCanvasElement,
   textAlign string,
   msFillRule string,
   shadowOffsetX number,
   lineWidth number,
   fillStyle any}
  :methods
  {drawImage
   (Fn
    [HTMLElement number number -> void]
    [HTMLElement number number number -> void]
    [HTMLElement number number number number -> void]
    [HTMLElement number number number number number -> void]
    [HTMLElement number number number number number number -> void]
    [HTMLElement
     number
     number
     number
     number
     number
     number
     number
     ->
     void]
    [HTMLElement
     number
     number
     number
     number
     number
     number
     number
     number
     ->
     void]),
   scale [number number -> void],
   createPattern [HTMLElement string -> CanvasPattern],
   translate [number number -> void],
   save [-> void],
   moveTo [number number -> void],
   measureText [string -> TextMetrics],
   setTransform [number number number number number number -> void],
   setLineDash [(Array number) -> void],
   createLinearGradient
   [number number number number -> CanvasGradient],
   isPointInPath
   (Fn [number number -> boolean] [number number string -> boolean]),
   quadraticCurveTo [number number number number -> void],
   createRadialGradient
   [number number number number number number -> CanvasGradient],
   createImageData (Fn [any -> ImageData] [any number -> ImageData]),
   restore [-> void],
   lineTo [number number -> void],
   rotate [number -> void],
   strokeRect [number number number number -> void],
   closePath [-> void],
   rect [number number number number -> void],
   bezierCurveTo [number number number number number number -> void],
   transform [number number number number number number -> void],
   putImageData
   (Fn
    [ImageData number number -> void]
    [ImageData number number number -> void]
    [ImageData number number number number -> void]
    [ImageData number number number number number -> void]
    [ImageData number number number number number number -> void]),
   arcTo [number number number number number -> void],
   beginPath [-> void],
   fill (Fn [-> void] [string -> void]),
   getImageData [number number number number -> ImageData],
   getLineDash [-> (Array number)],
   clearRect [number number number number -> void],
   clip (Fn [-> void] [string -> void]),
   fillText
   (Fn
    [string number number -> void]
    [string number number number -> void]),
   fillRect [number number number number -> void],
   strokeText
   (Fn
    [string number number -> void]
    [string number number number -> void]),
   arc
   (Fn
    [number number number number number -> void]
    [number number number number number boolean -> void]),
   stroke [-> void]}])
(ann
 js/CanvasRenderingContext2D
 (HJSObj
  :mandatory
  {prototype CanvasRenderingContext2D,
   new [-> CanvasRenderingContext2D]}))
(ann-jsnominal
 MSCSSRuleList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item (Fn [-> CSSStyleRule] [number -> CSSStyleRule])}])
(ann
 js/MSCSSRuleList
 (HJSObj :mandatory {prototype MSCSSRuleList, new [-> MSCSSRuleList]}))
(ann-jsnominal
 SVGPathSegLinetoHorizontalAbs
 [[] :ancestors #{SVGPathSeg} :fields {x number} :methods {}])
(ann
 js/SVGPathSegLinetoHorizontalAbs
 (HJSObj
  :mandatory
  {prototype SVGPathSegLinetoHorizontalAbs,
   new [-> SVGPathSegLinetoHorizontalAbs]}))
(ann-jsnominal
 SVGPathSegArcAbs
 [[]
  :ancestors
  #{SVGPathSeg}
  :fields
  {y number,
   sweepFlag boolean,
   r2 number,
   x number,
   angle number,
   r1 number,
   largeArcFlag boolean}
  :methods
  {}])
(ann
 js/SVGPathSegArcAbs
 (HJSObj
  :mandatory
  {prototype SVGPathSegArcAbs, new [-> SVGPathSegArcAbs]}))
(ann-jsnominal
 SVGTransformList
 [[]
  :ancestors
  #{}
  :fields
  {numberOfItems number}
  :methods
  {appendItem [SVGTransform -> SVGTransform],
   clear [-> void],
   createSVGTransformFromMatrix [SVGMatrix -> SVGTransform],
   initialize [SVGTransform -> SVGTransform],
   insertItemBefore [SVGTransform number -> SVGTransform],
   removeItem [number -> SVGTransform],
   consolidate [-> SVGTransform],
   getItem [number -> SVGTransform],
   replaceItem [SVGTransform number -> SVGTransform]}])
(ann
 js/SVGTransformList
 (HJSObj
  :mandatory
  {prototype SVGTransformList, new [-> SVGTransformList]}))
(ann-jsnominal
 HTMLHtmlElement
 [[] :ancestors #{HTMLElement} :fields {version string} :methods {}])
(ann
 js/HTMLHtmlElement
 (HJSObj
  :mandatory
  {prototype HTMLHtmlElement, new [-> HTMLHtmlElement]}))
(ann-jsnominal
 SVGPathSegClosePath
 [[] :ancestors #{SVGPathSeg} :fields {} :methods {}])
(ann
 js/SVGPathSegClosePath
 (HJSObj
  :mandatory
  {prototype SVGPathSegClosePath, new [-> SVGPathSegClosePath]}))
(Value "load")
(ann-jsnominal
 HTMLFrameElement
 [[]
  :ancestors
  #{GetSVGDocument MSDataBindingExtensions HTMLElement}
  :fields
  {contentWindow Window,
   marginHeight string,
   scrolling string,
   height any,
   frameSpacing any,
   border string,
   security any,
   longDesc string,
   borderColor any,
   width any,
   frameBorder string,
   onload [Event -> any],
   name string,
   contentDocument Document,
   src string,
   noResize boolean,
   marginWidth string}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann
 js/HTMLFrameElement
 (HJSObj
  :mandatory
  {prototype HTMLFrameElement, new [-> HTMLFrameElement]}))
(ann-jsnominal
 SVGAnimatedLength
 [[]
  :ancestors
  #{}
  :fields
  {animVal SVGLength, baseVal SVGLength}
  :methods
  {}])
(ann
 js/SVGAnimatedLength
 (HJSObj
  :mandatory
  {prototype SVGAnimatedLength, new [-> SVGAnimatedLength]}))
(ann-jsnominal
 SVGAnimatedPoints
 [[]
  :ancestors
  #{}
  :fields
  {points SVGPointList, animatedPoints SVGPointList}
  :methods
  {}])
(ann-jsnominal
 SVGDefsElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGDefsElement
 (HJSObj
  :mandatory
  {prototype SVGDefsElement, new [-> SVGDefsElement]}))
(ann-jsnominal
 HTMLQuoteElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {dateTime string, cite string}
  :methods
  {}])
(ann
 js/HTMLQuoteElement
 (HJSObj
  :mandatory
  {prototype HTMLQuoteElement, new [-> HTMLQuoteElement]}))
(ann-jsnominal
 CSSMediaRule
 [[]
  :ancestors
  #{CSSRule}
  :fields
  {media MediaList, cssRules CSSRuleList}
  :methods
  {insertRule (Fn [string -> number] [string number -> number]),
   deleteRule (Fn [-> void] [number -> void])}])
(ann
 js/CSSMediaRule
 (HJSObj :mandatory {prototype CSSMediaRule, new [-> CSSMediaRule]}))
(ann-jsnominal
 WindowModal
 [[]
  :ancestors
  #{}
  :fields
  {dialogArguments any, returnValue any}
  :methods
  {}])
(Value "timeout")
(Value "readystatechange")
(Value "load")
(ann-jsnominal
 XMLHttpRequest
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {ontimeout [Event -> any],
   HEADERS_RECEIVED number,
   status number,
   responseXML Document,
   readyState number,
   onreadystatechange [Event -> any],
   onload [Event -> any],
   timeout number,
   responseText string,
   UNSENT number,
   statusText string,
   responseBody any,
   OPENED number,
   DONE number,
   LOADING number}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   open
   (Fn
    [string string -> void]
    [string string boolean -> void]
    [string string boolean string -> void]
    [string string boolean string string -> void]),
   create [-> XMLHttpRequest],
   send (Fn [-> void] [any -> void]),
   abort [-> void],
   getAllResponseHeaders [-> string],
   setRequestHeader [string string -> void],
   getResponseHeader [string -> string]}])
(ann
 js/XMLHttpRequest
 (HJSObj
  :mandatory
  {prototype XMLHttpRequest,
   new [-> XMLHttpRequest],
   LOADING number,
   DONE number,
   UNSENT number,
   OPENED number,
   HEADERS_RECEIVED number}))
(ann-jsnominal
 HTMLTableHeaderCellElement
 [[]
  :ancestors
  #{HTMLTableCellElement}
  :fields
  {scope string}
  :methods
  {}])
(ann
 js/HTMLTableHeaderCellElement
 (HJSObj
  :mandatory
  {prototype HTMLTableHeaderCellElement,
   new [-> HTMLTableHeaderCellElement]}))
(ann-jsnominal
 HTMLDListElement
 [[]
  :ancestors
  #{HTMLElement DOML2DeprecatedListSpaceReduction}
  :fields
  {}
  :methods
  {}])
(ann
 js/HTMLDListElement
 (HJSObj
  :mandatory
  {prototype HTMLDListElement, new [-> HTMLDListElement]}))
(ann-jsnominal
 MSDataBindingExtensions
 [[]
  :ancestors
  #{}
  :fields
  {dataSrc string, dataFormatAs string, dataFld string}
  :methods
  {}])
(ann-jsnominal
 SVGPathSegLinetoHorizontalRel
 [[] :ancestors #{SVGPathSeg} :fields {x number} :methods {}])
(ann
 js/SVGPathSegLinetoHorizontalRel
 (HJSObj
  :mandatory
  {prototype SVGPathSegLinetoHorizontalRel,
   new [-> SVGPathSegLinetoHorizontalRel]}))
(ann-jsnominal
 SVGEllipseElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {ry SVGAnimatedLength,
   cx SVGAnimatedLength,
   rx SVGAnimatedLength,
   cy SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGEllipseElement
 (HJSObj
  :mandatory
  {prototype SVGEllipseElement, new [-> SVGEllipseElement]}))
(ann-jsnominal
 SVGAElement
 [[]
  :ancestors
  #{SVGURIReference SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {target SVGAnimatedString}
  :methods
  {}])
(ann
 js/SVGAElement
 (HJSObj :mandatory {prototype SVGAElement, new [-> SVGAElement]}))
(ann-jsnominal
 SVGStylable
 [[]
  :ancestors
  #{}
  :fields
  {className SVGAnimatedString, style CSSStyleDeclaration}
  :methods
  {}])
(ann-jsnominal
 SVGTransformable
 [[]
  :ancestors
  #{SVGLocatable}
  :fields
  {transform SVGAnimatedTransformList}
  :methods
  {}])
(Value "online")
(Value "blur")
(Value "focus")
(Value "message")
(Value "error")
(Value "resize")
(Value "afterprint")
(Value "beforeprint")
(Value "offline")
(Value "unload")
(Value "hashchange")
(Value "load")
(Value "beforeunload")
(Value "storage")
(ann-jsnominal
 HTMLFrameSetElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {onbeforeprint [Event -> any],
   onmessage [MessageEvent -> any],
   onafterprint [Event -> any],
   cols string,
   onoffline [Event -> any],
   ononline [Event -> any],
   frameSpacing any,
   border string,
   borderColor any,
   onblur [FocusEvent -> any],
   onhashchange [Event -> any],
   frameBorder string,
   onload [Event -> any],
   name string,
   onerror [Event -> any],
   onstorage [StorageEvent -> any],
   onfocus [FocusEvent -> any],
   rows string,
   onbeforeunload [BeforeUnloadEvent -> any],
   onunload [Event -> any],
   onresize [UIEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann
 js/HTMLFrameSetElement
 (HJSObj
  :mandatory
  {prototype HTMLFrameSetElement, new [-> HTMLFrameSetElement]}))
(ann-jsnominal
 Screen
 [[]
  :ancestors
  #{}
  :fields
  {availHeight number,
   logicalYDPI number,
   colorDepth number,
   deviceYDPI number,
   height number,
   systemYDPI number,
   availWidth number,
   systemXDPI number,
   updateInterval number,
   width number,
   pixelDepth number,
   bufferDepth number,
   logicalXDPI number,
   deviceXDPI number,
   fontSmoothingEnabled boolean}
  :methods
  {}])
(ann js/Screen (HJSObj :mandatory {prototype Screen, new [-> Screen]}))
(ann-jsnominal
 Coordinates
 [[]
  :ancestors
  #{}
  :fields
  {altitudeAccuracy number,
   longitude number,
   latitude number,
   speed number,
   heading number,
   altitude number,
   accuracy number}
  :methods
  {}])
(ann
 js/Coordinates
 (HJSObj :mandatory {prototype Coordinates, new [-> Coordinates]}))
(ann-jsnominal
 NavigatorGeolocation
 [[] :ancestors #{} :fields {geolocation Geolocation} :methods {}])
(ann-jsnominal
 NavigatorContentUtils
 [[] :ancestors #{} :fields {} :methods {}])
(ann-jsnominal
 EventListener
 [[] :ancestors #{} :fields {} :methods {call [Event -> void]}])
(ann-jsnominal
 SVGLangSpace
 [[]
  :ancestors
  #{}
  :fields
  {xmllang string, xmlspace string}
  :methods
  {}])
(ann-jsnominal
 DataTransfer
 [[]
  :ancestors
  #{}
  :fields
  {effectAllowed string, dropEffect string}
  :methods
  {clearData (Fn [-> boolean] [string -> boolean]),
   setData [string string -> boolean],
   getData [string -> string]}])
(ann
 js/DataTransfer
 (HJSObj :mandatory {prototype DataTransfer, new [-> DataTransfer]}))
(ann-jsnominal
 FocusEvent
 [[]
  :ancestors
  #{UIEvent}
  :fields
  {relatedTarget EventTarget}
  :methods
  {initFocusEvent
   [string boolean boolean Window number EventTarget -> void]}])
(ann
 js/FocusEvent
 (HJSObj :mandatory {prototype FocusEvent, new [-> FocusEvent]}))
(ann-jsnominal
 Range
 [[]
  :ancestors
  #{}
  :fields
  {endOffset number,
   START_TO_END number,
   commonAncestorContainer Node,
   startOffset number,
   END_TO_END number,
   endContainer Node,
   START_TO_START number,
   startContainer Node,
   collapsed boolean,
   END_TO_START number}
  :methods
  {setStart [Node number -> void],
   getClientRects [-> ClientRectList],
   setEnd [Node number -> void],
   compareBoundaryPoints [number Range -> number],
   cloneContents [-> DocumentFragment],
   collapse [boolean -> void],
   setEndAfter [Node -> void],
   detach [-> void],
   setEndBefore [Node -> void],
   surroundContents [Node -> void],
   cloneRange [-> Range],
   getBoundingClientRect [-> ClientRect],
   insertNode [Node -> void],
   selectNodeContents [Node -> void],
   deleteContents [-> void],
   setStartBefore [Node -> void],
   toString [-> string],
   setStartAfter [Node -> void],
   extractContents [-> DocumentFragment],
   selectNode [Node -> void]}])
(ann
 js/Range
 (HJSObj
  :mandatory
  {prototype Range,
   new [-> Range],
   END_TO_END number,
   START_TO_START number,
   START_TO_END number,
   END_TO_START number}))
(ann-jsnominal
 SVGPoint
 [[]
  :ancestors
  #{}
  :fields
  {y number, x number}
  :methods
  {matrixTransform [SVGMatrix -> SVGPoint]}])
(ann
 js/SVGPoint
 (HJSObj :mandatory {prototype SVGPoint, new [-> SVGPoint]}))
(ann-jsnominal
 MSPluginsCollection
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {refresh (Fn [-> void] [boolean -> void])}])
(ann
 js/MSPluginsCollection
 (HJSObj
  :mandatory
  {prototype MSPluginsCollection, new [-> MSPluginsCollection]}))
(ann-jsnominal
 SVGAnimatedNumberList
 [[]
  :ancestors
  #{}
  :fields
  {animVal SVGNumberList, baseVal SVGNumberList}
  :methods
  {}])
(ann
 js/SVGAnimatedNumberList
 (HJSObj
  :mandatory
  {prototype SVGAnimatedNumberList, new [-> SVGAnimatedNumberList]}))
(Value "zoom")
(Value "error")
(Value "resize")
(Value "abort")
(Value "unload")
(Value "scroll")
(ann-jsnominal
 SVGSVGElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement SVGZoomAndPan
    SVGTests SVGFitToViewBox SVGLocatable SVGLangSpace DocumentEvent}
  :fields
  {pixelUnitToMillimeterX number,
   viewport SVGRect,
   screenPixelToMillimeterX number,
   height SVGAnimatedLength,
   contentScriptType string,
   screenPixelToMillimeterY number,
   width SVGAnimatedLength,
   y SVGAnimatedLength,
   pixelUnitToMillimeterY number,
   contentStyleType string,
   x SVGAnimatedLength,
   onerror [Event -> any],
   onabort [UIEvent -> any],
   onzoom [any -> any],
   onscroll [UIEvent -> any],
   currentTranslate SVGPoint,
   currentScale number,
   onunload [Event -> any],
   onresize [UIEvent -> any]}
  :methods
  {unpauseAnimations [-> void],
   createSVGRect [-> SVGRect],
   addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   checkEnclosure [SVGElement SVGRect -> boolean],
   createSVGLength [-> SVGLength],
   deselectAll [-> void],
   setCurrentTime [number -> void],
   createSVGMatrix [-> SVGMatrix],
   createSVGTransformFromMatrix [SVGMatrix -> SVGTransform],
   createSVGPoint [-> SVGPoint],
   forceRedraw [-> void],
   getEnclosureList [SVGRect SVGElement -> NodeList],
   checkIntersection [SVGElement SVGRect -> boolean],
   createSVGNumber [-> SVGNumber],
   unsuspendRedraw [number -> void],
   unsuspendRedrawAll [-> void],
   getIntersectionList [SVGRect SVGElement -> NodeList],
   getCurrentTime [-> number],
   createSVGAngle [-> SVGAngle],
   getComputedStyle
   (Fn
    [Element -> CSSStyleDeclaration]
    [Element string -> CSSStyleDeclaration]),
   createSVGTransform [-> SVGTransform],
   suspendRedraw [number -> number],
   pauseAnimations [-> void],
   getElementById [string -> Element]}])
(ann
 js/SVGSVGElement
 (HJSObj :mandatory {prototype SVGSVGElement, new [-> SVGSVGElement]}))
(ann-jsnominal
 HTMLLabelElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {htmlFor string, form HTMLFormElement}
  :methods
  {}])
(ann
 js/HTMLLabelElement
 (HJSObj
  :mandatory
  {prototype HTMLLabelElement, new [-> HTMLLabelElement]}))
(ann-jsnominal
 MSResourceMetadata
 [[]
  :ancestors
  #{}
  :fields
  {protocol string,
   fileSize string,
   fileUpdatedDate string,
   nameProp string,
   fileCreatedDate string,
   fileModifiedDate string,
   mimeType string}
  :methods
  {}])
(ann-jsnominal
 HTMLLegendElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {align string, form HTMLFormElement}
  :methods
  {}])
(ann
 js/HTMLLegendElement
 (HJSObj
  :mandatory
  {prototype HTMLLegendElement, new [-> HTMLLegendElement]}))
(ann-jsnominal
 HTMLDirectoryElement
 [[]
  :ancestors
  #{DOML2DeprecatedListNumberingAndBulletStyle HTMLElement
    DOML2DeprecatedListSpaceReduction}
  :fields
  {}
  :methods
  {}])
(ann
 js/HTMLDirectoryElement
 (HJSObj
  :mandatory
  {prototype HTMLDirectoryElement, new [-> HTMLDirectoryElement]}))
(ann-jsnominal
 SVGAnimatedInteger
 [[]
  :ancestors
  #{}
  :fields
  {animVal number, baseVal number}
  :methods
  {}])
(ann
 js/SVGAnimatedInteger
 (HJSObj
  :mandatory
  {prototype SVGAnimatedInteger, new [-> SVGAnimatedInteger]}))
(ann-jsnominal
 SVGTextElement
 [[]
  :ancestors
  #{SVGTextPositioningElement SVGTransformable}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGTextElement
 (HJSObj
  :mandatory
  {prototype SVGTextElement, new [-> SVGTextElement]}))
(ann-jsnominal
 SVGTSpanElement
 [[] :ancestors #{SVGTextPositioningElement} :fields {} :methods {}])
(ann
 js/SVGTSpanElement
 (HJSObj
  :mandatory
  {prototype SVGTSpanElement, new [-> SVGTSpanElement]}))
(ann-jsnominal
 HTMLLIElement
 [[]
  :ancestors
  #{DOML2DeprecatedListNumberingAndBulletStyle HTMLElement}
  :fields
  {value number}
  :methods
  {}])
(ann
 js/HTMLLIElement
 (HJSObj :mandatory {prototype HTMLLIElement, new [-> HTMLLIElement]}))
(ann-jsnominal
 SVGPathSegLinetoVerticalAbs
 [[] :ancestors #{SVGPathSeg} :fields {y number} :methods {}])
(ann
 js/SVGPathSegLinetoVerticalAbs
 (HJSObj
  :mandatory
  {prototype SVGPathSegLinetoVerticalAbs,
   new [-> SVGPathSegLinetoVerticalAbs]}))
(ann-jsnominal
 MSStorageExtensions
 [[] :ancestors #{} :fields {remainingSpace number} :methods {}])
(ann-jsnominal
 SVGStyleElement
 [[]
  :ancestors
  #{SVGElement SVGLangSpace}
  :fields
  {media string, type string, title string}
  :methods
  {}])
(ann
 js/SVGStyleElement
 (HJSObj
  :mandatory
  {prototype SVGStyleElement, new [-> SVGStyleElement]}))
(ann-jsnominal
 MSCurrentStyleCSSProperties
 [[]
  :ancestors
  #{MSCSSProperties}
  :fields
  {blockDirection string,
   clipBottom string,
   clipLeft string,
   clipRight string,
   clipTop string,
   hasLayout string}
  :methods
  {}])
(ann
 js/MSCurrentStyleCSSProperties
 (HJSObj
  :mandatory
  {prototype MSCurrentStyleCSSProperties,
   new [-> MSCurrentStyleCSSProperties]}))
(ann-jsnominal
 MSHTMLCollectionExtensions
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {urns [any -> Object], tags [any -> Object]}])
(ann-jsnominal
 Storage
 [[]
  :ancestors
  #{MSStorageExtensions}
  :fields
  {length number}
  :methods
  {getItem [string -> any],
   setItem [string string -> void],
   clear [-> void],
   removeItem [string -> void],
   key [number -> string]}])
(ann
 js/Storage
 (HJSObj :mandatory {prototype Storage, new [-> Storage]}))
(Value "load")
(ann-jsnominal
 HTMLIFrameElement
 [[]
  :ancestors
  #{GetSVGDocument MSDataBindingExtensions HTMLElement}
  :fields
  {contentWindow Window,
   marginHeight string,
   scrolling string,
   height string,
   frameSpacing any,
   border string,
   security any,
   longDesc string,
   width string,
   frameBorder string,
   onload [Event -> any],
   name string,
   contentDocument Document,
   src string,
   noResize boolean,
   vspace number,
   hspace number,
   marginWidth string,
   align string}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann
 js/HTMLIFrameElement
 (HJSObj
  :mandatory
  {prototype HTMLIFrameElement, new [-> HTMLIFrameElement]}))
(ann-jsnominal
 TextRangeCollection
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> TextRange]}])
(ann
 js/TextRangeCollection
 (HJSObj
  :mandatory
  {prototype TextRangeCollection, new [-> TextRangeCollection]}))
(Value "online")
(Value "blur")
(Value "focus")
(Value "message")
(Value "error")
(Value "resize")
(Value "afterprint")
(Value "beforeprint")
(Value "offline")
(Value "unload")
(Value "hashchange")
(Value "load")
(Value "beforeunload")
(Value "storage")
(ann-jsnominal
 HTMLBodyElement
 [[]
  :ancestors
  #{DOML2DeprecatedBackgroundStyle DOML2DeprecatedBackgroundColorStyle
    HTMLElement}
  :fields
  {scroll string,
   onbeforeprint [Event -> any],
   onmessage [MessageEvent -> any],
   onafterprint [Event -> any],
   onoffline [Event -> any],
   ononline [Event -> any],
   noWrap boolean,
   text any,
   leftMargin any,
   aLink any,
   onblur [FocusEvent -> any],
   vLink any,
   onhashchange [Event -> any],
   link any,
   onload [Event -> any],
   topMargin any,
   onerror [Event -> any],
   onstorage [StorageEvent -> any],
   onfocus [FocusEvent -> any],
   bgProperties string,
   rightMargin any,
   onbeforeunload [BeforeUnloadEvent -> any],
   bottomMargin any,
   onunload [Event -> any],
   onresize [UIEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   createTextRange [-> TextRange]}])
(ann
 js/HTMLBodyElement
 (HJSObj
  :mandatory
  {prototype HTMLBodyElement, new [-> HTMLBodyElement]}))
(ann-jsnominal
 DocumentType
 [[]
  :ancestors
  #{Node}
  :fields
  {name string,
   notations NamedNodeMap,
   systemId string,
   internalSubset string,
   entities NamedNodeMap,
   publicId string}
  :methods
  {}])
(ann
 js/DocumentType
 (HJSObj :mandatory {prototype DocumentType, new [-> DocumentType]}))
(ann-jsnominal
 SVGRadialGradientElement
 [[]
  :ancestors
  #{SVGGradientElement}
  :fields
  {cx SVGAnimatedLength,
   r SVGAnimatedLength,
   cy SVGAnimatedLength,
   fx SVGAnimatedLength,
   fy SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGRadialGradientElement
 (HJSObj
  :mandatory
  {prototype SVGRadialGradientElement,
   new [-> SVGRadialGradientElement]}))
(ann-jsnominal
 MutationEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {newValue string,
   attrChange number,
   attrName string,
   prevValue string,
   relatedNode Node,
   MODIFICATION number,
   REMOVAL number,
   ADDITION number}
  :methods
  {initMutationEvent
   [string boolean boolean Node string string string number -> void]}])
(ann
 js/MutationEvent
 (HJSObj
  :mandatory
  {prototype MutationEvent,
   new [-> MutationEvent],
   MODIFICATION number,
   REMOVAL number,
   ADDITION number}))
(ann-jsnominal
 DragEvent
 [[]
  :ancestors
  #{MouseEvent}
  :fields
  {dataTransfer DataTransfer}
  :methods
  {initDragEvent
   [string
    boolean
    boolean
    Window
    number
    number
    number
    number
    number
    boolean
    boolean
    boolean
    boolean
    number
    EventTarget
    DataTransfer
    ->
    void]}])
(ann
 js/DragEvent
 (HJSObj :mandatory {prototype DragEvent, new [-> DragEvent]}))
(ann-jsnominal
 HTMLTableSectionElement
 [[]
  :ancestors
  #{HTMLTableAlignment DOML2DeprecatedBackgroundColorStyle HTMLElement}
  :fields
  {align string, rows HTMLCollection}
  :methods
  {deleteRow (Fn [-> void] [number -> void]),
   moveRow
   (Fn [-> Object] [number -> Object] [number number -> Object]),
   insertRow (Fn [-> HTMLElement] [number -> HTMLElement])}])
(ann
 js/HTMLTableSectionElement
 (HJSObj
  :mandatory
  {prototype HTMLTableSectionElement,
   new [-> HTMLTableSectionElement]}))
(ann-jsnominal
 DOML2DeprecatedListNumberingAndBulletStyle
 [[] :ancestors #{} :fields {type string} :methods {}])
(ann-jsnominal
 HTMLInputElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {dynsrc string,
   defaultChecked boolean,
   value string,
   checked boolean,
   height string,
   loop number,
   status boolean,
   border string,
   alt string,
   selectionEnd number,
   width string,
   lowsrc string,
   form HTMLFormElement,
   name string,
   selectionStart number,
   readOnly boolean,
   accept string,
   start string,
   vrml string,
   defaultValue string,
   src string,
   size number,
   maxLength number,
   useMap string,
   indeterminate boolean,
   vspace number,
   type string,
   hspace number,
   complete boolean,
   align string}
  :methods
  {createTextRange [-> TextRange],
   setSelectionRange [number number -> void],
   select [-> void]}])
(ann
 js/HTMLInputElement
 (HJSObj
  :mandatory
  {prototype HTMLInputElement, new [-> HTMLInputElement]}))
(ann-jsnominal
 HTMLAnchorElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {charset string,
   shape string,
   rev string,
   urn string,
   rel string,
   hreflang string,
   protocol string,
   href string,
   search string,
   host string,
   target string,
   Methods string,
   name string,
   hash string,
   mimeType string,
   nameProp string,
   protocolLong string,
   pathname string,
   hostname string,
   port string,
   type string,
   coords string}
  :methods
  {toString [-> string]}])
(ann
 js/HTMLAnchorElement
 (HJSObj
  :mandatory
  {prototype HTMLAnchorElement, new [-> HTMLAnchorElement]}))
(ann-jsnominal
 HTMLParamElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {value string, name string, type string, valueType string}
  :methods
  {}])
(ann
 js/HTMLParamElement
 (HJSObj
  :mandatory
  {prototype HTMLParamElement, new [-> HTMLParamElement]}))
(ann-jsnominal
 SVGImageElement
 [[]
  :ancestors
  #{SVGURIReference SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {y SVGAnimatedLength,
   width SVGAnimatedLength,
   preserveAspectRatio SVGAnimatedPreserveAspectRatio,
   x SVGAnimatedLength,
   height SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGImageElement
 (HJSObj
  :mandatory
  {prototype SVGImageElement, new [-> SVGImageElement]}))
(ann-jsnominal
 SVGAnimatedNumber
 [[]
  :ancestors
  #{}
  :fields
  {animVal number, baseVal number}
  :methods
  {}])
(ann
 js/SVGAnimatedNumber
 (HJSObj
  :mandatory
  {prototype SVGAnimatedNumber, new [-> SVGAnimatedNumber]}))
(ann-jsnominal
 PerformanceTiming
 [[]
  :ancestors
  #{}
  :fields
  {responseStart number,
   fetchStart number,
   domComplete number,
   domLoading number,
   domainLookupStart number,
   connectStart number,
   domInteractive number,
   navigationStart number,
   connectEnd number,
   unloadEventStart number,
   requestStart number,
   domContentLoadedEventStart number,
   redirectEnd number,
   redirectStart number,
   responseEnd number,
   loadEventEnd number,
   domContentLoadedEventEnd number,
   unloadEventEnd number,
   msFirstPaint number,
   loadEventStart number,
   domainLookupEnd number}
  :methods
  {toJSON [-> any]}])
(ann
 js/PerformanceTiming
 (HJSObj
  :mandatory
  {prototype PerformanceTiming, new [-> PerformanceTiming]}))
(ann-jsnominal
 HTMLPreElement
 [[]
  :ancestors
  #{HTMLElement DOML2DeprecatedTextFlowControl}
  :fields
  {width number, cite string}
  :methods
  {}])
(ann
 js/HTMLPreElement
 (HJSObj
  :mandatory
  {prototype HTMLPreElement, new [-> HTMLPreElement]}))
(ann-jsnominal
 EventException
 [[]
  :ancestors
  #{}
  :fields
  {code number,
   message string,
   DISPATCH_REQUEST_ERR number,
   UNSPECIFIED_EVENT_TYPE_ERR number}
  :methods
  {toString [-> string]}])
(ann
 js/EventException
 (HJSObj
  :mandatory
  {prototype EventException,
   new [-> EventException],
   DISPATCH_REQUEST_ERR number,
   UNSPECIFIED_EVENT_TYPE_ERR number}))
(ann-jsnominal
 MSNavigatorDoNotTrack
 [[] :ancestors #{} :fields {msDoNotTrack string} :methods {}])
(ann-jsnominal
 NavigatorOnLine
 [[] :ancestors #{} :fields {onLine boolean} :methods {}])
(ann-jsnominal
 WindowLocalStorage
 [[] :ancestors #{} :fields {localStorage Storage} :methods {}])
(ann-jsnominal
 SVGMetadataElement
 [[] :ancestors #{SVGElement} :fields {} :methods {}])
(ann
 js/SVGMetadataElement
 (HJSObj
  :mandatory
  {prototype SVGMetadataElement, new [-> SVGMetadataElement]}))
(ann-jsnominal
 SVGPathSegArcRel
 [[]
  :ancestors
  #{SVGPathSeg}
  :fields
  {y number,
   sweepFlag boolean,
   r2 number,
   x number,
   angle number,
   r1 number,
   largeArcFlag boolean}
  :methods
  {}])
(ann
 js/SVGPathSegArcRel
 (HJSObj
  :mandatory
  {prototype SVGPathSegArcRel, new [-> SVGPathSegArcRel]}))
(ann-jsnominal
 SVGPathSegMovetoAbs
 [[] :ancestors #{SVGPathSeg} :fields {y number, x number} :methods {}])
(ann
 js/SVGPathSegMovetoAbs
 (HJSObj
  :mandatory
  {prototype SVGPathSegMovetoAbs, new [-> SVGPathSegMovetoAbs]}))
(ann-jsnominal
 SVGStringList
 [[]
  :ancestors
  #{}
  :fields
  {numberOfItems number}
  :methods
  {replaceItem [string number -> string],
   getItem [number -> string],
   clear [-> void],
   appendItem [string -> string],
   initialize [string -> string],
   removeItem [number -> string],
   insertItemBefore [string number -> string]}])
(ann
 js/SVGStringList
 (HJSObj :mandatory {prototype SVGStringList, new [-> SVGStringList]}))
(Value "error")
(Value "load")
(Value "progress")
(Value "timeout")
(ann-jsnominal
 XDomainRequest
 [[]
  :ancestors
  #{}
  :fields
  {timeout number,
   onerror [Event -> any],
   onload [Event -> any],
   onprogress [any -> any],
   ontimeout [Event -> any],
   responseText string,
   contentType string}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   open [string string -> void],
   create [-> XDomainRequest],
   abort [-> void],
   send (Fn [-> void] [any -> void])}])
(ann
 js/XDomainRequest
 (HJSObj
  :mandatory
  {prototype XDomainRequest, new [-> XDomainRequest]}))
(ann-jsnominal
 DOML2DeprecatedBackgroundColorStyle
 [[] :ancestors #{} :fields {bgColor any} :methods {}])
(ann-jsnominal
 ElementTraversal
 [[]
  :ancestors
  #{}
  :fields
  {childElementCount number,
   previousElementSibling Element,
   lastElementChild Element,
   nextElementSibling Element,
   firstElementChild Element}
  :methods
  {}])
(ann-jsnominal
 SVGLength
 [[]
  :ancestors
  #{}
  :fields
  {SVG_LENGTHTYPE_PX number,
   valueAsString string,
   SVG_LENGTHTYPE_PT number,
   value number,
   SVG_LENGTHTYPE_CM number,
   unitType number,
   SVG_LENGTHTYPE_PERCENTAGE number,
   SVG_LENGTHTYPE_PC number,
   SVG_LENGTHTYPE_NUMBER number,
   valueInSpecifiedUnits number,
   SVG_LENGTHTYPE_EXS number,
   SVG_LENGTHTYPE_UNKNOWN number,
   SVG_LENGTHTYPE_EMS number,
   SVG_LENGTHTYPE_MM number,
   SVG_LENGTHTYPE_IN number}
  :methods
  {newValueSpecifiedUnits [number number -> void],
   convertToSpecifiedUnits [number -> void]}])
(ann
 js/SVGLength
 (HJSObj
  :mandatory
  {SVG_LENGTHTYPE_PX number,
   new [-> SVGLength],
   SVG_LENGTHTYPE_PT number,
   prototype SVGLength,
   SVG_LENGTHTYPE_CM number,
   SVG_LENGTHTYPE_PERCENTAGE number,
   SVG_LENGTHTYPE_PC number,
   SVG_LENGTHTYPE_NUMBER number,
   SVG_LENGTHTYPE_EXS number,
   SVG_LENGTHTYPE_UNKNOWN number,
   SVG_LENGTHTYPE_EMS number,
   SVG_LENGTHTYPE_MM number,
   SVG_LENGTHTYPE_IN number}))
(ann-jsnominal
 SVGPolygonElement
 [[]
  :ancestors
  #{SVGAnimatedPoints SVGExternalResourcesRequired SVGStylable
    SVGElement SVGTransformable SVGTests SVGLangSpace}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGPolygonElement
 (HJSObj
  :mandatory
  {prototype SVGPolygonElement, new [-> SVGPolygonElement]}))
(ann-jsnominal
 HTMLPhraseElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {dateTime string, cite string}
  :methods
  {}])
(ann
 js/HTMLPhraseElement
 (HJSObj
  :mandatory
  {prototype HTMLPhraseElement, new [-> HTMLPhraseElement]}))
(ann-jsnominal
 NavigatorStorageUtils
 [[] :ancestors #{} :fields {} :methods {}])
(ann-jsnominal
 SVGPathSegCurvetoCubicRel
 [[]
  :ancestors
  #{SVGPathSeg}
  :fields
  {y number, y1 number, x2 number, x number, x1 number, y2 number}
  :methods
  {}])
(ann
 js/SVGPathSegCurvetoCubicRel
 (HJSObj
  :mandatory
  {prototype SVGPathSegCurvetoCubicRel,
   new [-> SVGPathSegCurvetoCubicRel]}))
(ann-jsnominal
 MSEventObj
 [[]
  :ancestors
  #{Event}
  :fields
  {returnValue any,
   altKey boolean,
   buttonID number,
   ctrlKey boolean,
   nextPage string,
   origin string,
   recordset Object,
   offsetY number,
   srcFilter Object,
   cancelBubble boolean,
   repeat boolean,
   source Window,
   contentOverflow boolean,
   bookmarks BookmarkCollection,
   shiftKey boolean,
   offsetX number,
   fromElement Element,
   qualifier string,
   data string,
   shiftLeft boolean,
   boundElements HTMLCollection,
   y number,
   reason number,
   ctrlLeft boolean,
   x number,
   srcElement Element,
   dataTransfer DataTransfer,
   actionURL string,
   behaviorPart number,
   button number,
   screenX number,
   keyCode number,
   behaviorCookie number,
   toElement Element,
   screenY number,
   propertyName string,
   srcUrn string,
   clientX number,
   dataFld string,
   clientY number,
   url string,
   wheelDelta number,
   type string,
   altLeft boolean}
  :methods
  {getAttribute (Fn [string -> any] [string number -> any]),
   setAttribute (Fn [string any -> void] [string any number -> void]),
   removeAttribute
   (Fn [string -> boolean] [string number -> boolean])}])
(ann
 js/MSEventObj
 (HJSObj :mandatory {prototype MSEventObj, new [-> MSEventObj]}))
(ann-jsnominal
 SVGTextContentElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement SVGTests
    SVGLangSpace}
  :fields
  {textLength SVGAnimatedLength,
   lengthAdjust SVGAnimatedEnumeration,
   LENGTHADJUST_SPACING number,
   LENGTHADJUST_SPACINGANDGLYPHS number,
   LENGTHADJUST_UNKNOWN number}
  :methods
  {getStartPositionOfChar [number -> SVGPoint],
   getCharNumAtPosition [SVGPoint -> number],
   getRotationOfChar [number -> number],
   getExtentOfChar [number -> SVGRect],
   getEndPositionOfChar [number -> SVGPoint],
   getSubStringLength [number number -> number],
   getComputedTextLength [-> number],
   selectSubString [number number -> void],
   getNumberOfChars [-> number]}])
(ann
 js/SVGTextContentElement
 (HJSObj
  :mandatory
  {prototype SVGTextContentElement,
   new [-> SVGTextContentElement],
   LENGTHADJUST_SPACING number,
   LENGTHADJUST_SPACINGANDGLYPHS number,
   LENGTHADJUST_UNKNOWN number}))
(ann-jsnominal
 DOML2DeprecatedColorProperty
 [[] :ancestors #{} :fields {color string} :methods {}])
(Value "2d")
(ann-jsnominal
 HTMLCanvasElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {width number, height number}
  :methods
  {toDataURL (Fn [-> string] [string any * -> string]),
   getContext [(Value "\"2d\"") -> CanvasRenderingContext2D]}])
(ann
 js/HTMLCanvasElement
 (HJSObj
  :mandatory
  {prototype HTMLCanvasElement, new [-> HTMLCanvasElement]}))
(ann-jsnominal
 Location
 [[]
  :ancestors
  #{}
  :fields
  {hash string,
   protocol string,
   search string,
   href string,
   hostname string,
   port string,
   pathname string,
   host string}
  :methods
  {reload (Fn [-> void] [boolean -> void]),
   replace [string -> void],
   assign [string -> void],
   toString [-> string]}])
(ann
 js/Location
 (HJSObj :mandatory {prototype Location, new [-> Location]}))
(ann-jsnominal
 HTMLTitleElement
 [[] :ancestors #{HTMLElement} :fields {text string} :methods {}])
(ann
 js/HTMLTitleElement
 (HJSObj
  :mandatory
  {prototype HTMLTitleElement, new [-> HTMLTitleElement]}))
(ann-jsnominal
 HTMLStyleElement
 [[]
  :ancestors
  #{LinkStyle HTMLElement}
  :fields
  {media string, type string}
  :methods
  {}])
(ann
 js/HTMLStyleElement
 (HJSObj
  :mandatory
  {prototype HTMLStyleElement, new [-> HTMLStyleElement]}))
(ann-jsnominal
 PerformanceEntry
 [[]
  :ancestors
  #{}
  :fields
  {name string, startTime number, duration number, entryType string}
  :methods
  {}])
(ann
 js/PerformanceEntry
 (HJSObj
  :mandatory
  {prototype PerformanceEntry, new [-> PerformanceEntry]}))
(ann-jsnominal
 SVGTransform
 [[]
  :ancestors
  #{}
  :fields
  {SVG_TRANSFORM_ROTATE number,
   SVG_TRANSFORM_UNKNOWN number,
   SVG_TRANSFORM_SCALE number,
   matrix SVGMatrix,
   SVG_TRANSFORM_MATRIX number,
   SVG_TRANSFORM_SKEWY number,
   SVG_TRANSFORM_SKEWX number,
   SVG_TRANSFORM_TRANSLATE number,
   type number,
   angle number}
  :methods
  {setTranslate [number number -> void],
   setScale [number number -> void],
   setMatrix [SVGMatrix -> void],
   setSkewY [number -> void],
   setRotate [number number number -> void],
   setSkewX [number -> void]}])
(ann
 js/SVGTransform
 (HJSObj
  :mandatory
  {new [-> SVGTransform],
   SVG_TRANSFORM_ROTATE number,
   prototype SVGTransform,
   SVG_TRANSFORM_UNKNOWN number,
   SVG_TRANSFORM_SCALE number,
   SVG_TRANSFORM_MATRIX number,
   SVG_TRANSFORM_SKEWY number,
   SVG_TRANSFORM_SKEWX number,
   SVG_TRANSFORM_TRANSLATE number}))
(ann-jsnominal
 UIEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {detail number, view Window}
  :methods
  {initUIEvent [string boolean boolean Window number -> void]}])
(ann
 js/UIEvent
 (HJSObj :mandatory {prototype UIEvent, new [-> UIEvent]}))
(ann-jsnominal
 SVGURIReference
 [[] :ancestors #{} :fields {href SVGAnimatedString} :methods {}])
(ann-jsnominal
 SVGPathSeg
 [[]
  :ancestors
  #{}
  :fields
  {PATHSEG_CURVETO_CUBIC_SMOOTH_REL number,
   PATHSEG_ARC_ABS number,
   pathSegType number,
   PATHSEG_MOVETO_ABS number,
   PATHSEG_MOVETO_REL number,
   PATHSEG_CURVETO_QUADRATIC_REL number,
   PATHSEG_CURVETO_CUBIC_SMOOTH_ABS number,
   PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL number,
   PATHSEG_LINETO_HORIZONTAL_ABS number,
   PATHSEG_LINETO_VERTICAL_ABS number,
   PATHSEG_CURVETO_CUBIC_REL number,
   pathSegTypeAsLetter string,
   PATHSEG_UNKNOWN number,
   PATHSEG_LINETO_VERTICAL_REL number,
   PATHSEG_LINETO_ABS number,
   PATHSEG_LINETO_REL number,
   PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS number,
   PATHSEG_CLOSEPATH number,
   PATHSEG_CURVETO_QUADRATIC_ABS number,
   PATHSEG_ARC_REL number,
   PATHSEG_CURVETO_CUBIC_ABS number,
   PATHSEG_LINETO_HORIZONTAL_REL number}
  :methods
  {}])
(ann
 js/SVGPathSeg
 (HJSObj
  :mandatory
  {PATHSEG_CURVETO_CUBIC_SMOOTH_REL number,
   PATHSEG_ARC_ABS number,
   new [-> SVGPathSeg],
   PATHSEG_MOVETO_ABS number,
   prototype SVGPathSeg,
   PATHSEG_MOVETO_REL number,
   PATHSEG_CURVETO_QUADRATIC_REL number,
   PATHSEG_CURVETO_CUBIC_SMOOTH_ABS number,
   PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL number,
   PATHSEG_LINETO_HORIZONTAL_ABS number,
   PATHSEG_LINETO_VERTICAL_ABS number,
   PATHSEG_CURVETO_CUBIC_REL number,
   PATHSEG_UNKNOWN number,
   PATHSEG_LINETO_VERTICAL_REL number,
   PATHSEG_LINETO_ABS number,
   PATHSEG_LINETO_REL number,
   PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS number,
   PATHSEG_CLOSEPATH number,
   PATHSEG_CURVETO_QUADRATIC_ABS number,
   PATHSEG_ARC_REL number,
   PATHSEG_CURVETO_CUBIC_ABS number,
   PATHSEG_LINETO_HORIZONTAL_REL number}))
(ann-jsnominal
 WheelEvent
 [[]
  :ancestors
  #{MouseEvent}
  :fields
  {deltaZ number,
   deltaX number,
   deltaMode number,
   deltaY number,
   DOM_DELTA_PIXEL number,
   DOM_DELTA_LINE number,
   DOM_DELTA_PAGE number}
  :methods
  {initWheelEvent
   [string
    boolean
    boolean
    Window
    number
    number
    number
    number
    number
    number
    EventTarget
    string
    number
    number
    number
    number
    ->
    void]}])
(ann
 js/WheelEvent
 (HJSObj
  :mandatory
  {prototype WheelEvent,
   new [-> WheelEvent],
   DOM_DELTA_PIXEL number,
   DOM_DELTA_LINE number,
   DOM_DELTA_PAGE number}))
(ann-jsnominal
 MSEventAttachmentTarget
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {attachEvent [string EventListener -> boolean],
   detachEvent [string EventListener -> void]}])
(ann-jsnominal
 SVGNumber
 [[] :ancestors #{} :fields {value number} :methods {}])
(ann
 js/SVGNumber
 (HJSObj :mandatory {prototype SVGNumber, new [-> SVGNumber]}))
(ann-jsnominal
 SVGPathElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement
    SVGAnimatedPathData SVGTransformable SVGTests SVGLangSpace}
  :fields
  {}
  :methods
  {createSVGPathSegCurvetoQuadraticSmoothAbs
   [number number -> SVGPathSegCurvetoQuadraticSmoothAbs],
   createSVGPathSegCurvetoQuadraticSmoothRel
   [number number -> SVGPathSegCurvetoQuadraticSmoothRel],
   createSVGPathSegLinetoHorizontalRel
   [number -> SVGPathSegLinetoHorizontalRel],
   getPointAtLength [number -> SVGPoint],
   createSVGPathSegLinetoVerticalRel
   [number -> SVGPathSegLinetoVerticalRel],
   getTotalLength [-> number],
   createSVGPathSegClosePath [-> SVGPathSegClosePath],
   createSVGPathSegCurvetoCubicRel
   [number
    number
    number
    number
    number
    number
    ->
    SVGPathSegCurvetoCubicRel],
   createSVGPathSegCurvetoCubicSmoothAbs
   [number number number number -> SVGPathSegCurvetoCubicSmoothAbs],
   createSVGPathSegCurvetoQuadraticAbs
   [number number number number -> SVGPathSegCurvetoQuadraticAbs],
   createSVGPathSegMovetoRel [number number -> SVGPathSegMovetoRel],
   createSVGPathSegArcRel
   [number
    number
    number
    number
    number
    boolean
    boolean
    ->
    SVGPathSegArcRel],
   createSVGPathSegLinetoAbs [number number -> SVGPathSegLinetoAbs],
   createSVGPathSegLinetoHorizontalAbs
   [number -> SVGPathSegLinetoHorizontalAbs],
   createSVGPathSegCurvetoCubicAbs
   [number
    number
    number
    number
    number
    number
    ->
    SVGPathSegCurvetoCubicAbs],
   createSVGPathSegCurvetoQuadraticRel
   [number number number number -> SVGPathSegCurvetoQuadraticRel],
   createSVGPathSegCurvetoCubicSmoothRel
   [number number number number -> SVGPathSegCurvetoCubicSmoothRel],
   createSVGPathSegArcAbs
   [number
    number
    number
    number
    number
    boolean
    boolean
    ->
    SVGPathSegArcAbs],
   createSVGPathSegLinetoRel [number number -> SVGPathSegLinetoRel],
   getPathSegAtLength [number -> number],
   createSVGPathSegMovetoAbs [number number -> SVGPathSegMovetoAbs],
   createSVGPathSegLinetoVerticalAbs
   [number -> SVGPathSegLinetoVerticalAbs]}])
(ann
 js/SVGPathElement
 (HJSObj
  :mandatory
  {prototype SVGPathElement, new [-> SVGPathElement]}))
(ann-jsnominal
 MSCompatibleInfo
 [[]
  :ancestors
  #{}
  :fields
  {version string, userAgent string}
  :methods
  {}])
(ann
 js/MSCompatibleInfo
 (HJSObj
  :mandatory
  {prototype MSCompatibleInfo, new [-> MSCompatibleInfo]}))
(ann-jsnominal
 Text
 [[]
  :ancestors
  #{MSNodeExtensions CharacterData}
  :fields
  {wholeText string}
  :methods
  {splitText [number -> Text], replaceWholeText [string -> Text]}])
(ann js/Text (HJSObj :mandatory {prototype Text, new [-> Text]}))
(ann-jsnominal
 SVGAnimatedRect
 [[]
  :ancestors
  #{}
  :fields
  {animVal SVGRect, baseVal SVGRect}
  :methods
  {}])
(ann
 js/SVGAnimatedRect
 (HJSObj
  :mandatory
  {prototype SVGAnimatedRect, new [-> SVGAnimatedRect]}))
(ann-jsnominal
 CSSNamespaceRule
 [[]
  :ancestors
  #{CSSRule}
  :fields
  {namespaceURI string, prefix string}
  :methods
  {}])
(ann
 js/CSSNamespaceRule
 (HJSObj
  :mandatory
  {prototype CSSNamespaceRule, new [-> CSSNamespaceRule]}))
(ann-jsnominal
 SVGPathSegList
 [[]
  :ancestors
  #{}
  :fields
  {numberOfItems number}
  :methods
  {replaceItem [SVGPathSeg number -> SVGPathSeg],
   getItem [number -> SVGPathSeg],
   clear [-> void],
   appendItem [SVGPathSeg -> SVGPathSeg],
   initialize [SVGPathSeg -> SVGPathSeg],
   removeItem [number -> SVGPathSeg],
   insertItemBefore [SVGPathSeg number -> SVGPathSeg]}])
(ann
 js/SVGPathSegList
 (HJSObj
  :mandatory
  {prototype SVGPathSegList, new [-> SVGPathSegList]}))
(ann-jsnominal
 HTMLUnknownElement
 [[]
  :ancestors
  #{MSDataBindingRecordSetReadonlyExtensions HTMLElement}
  :fields
  {}
  :methods
  {}])
(ann
 js/HTMLUnknownElement
 (HJSObj
  :mandatory
  {prototype HTMLUnknownElement, new [-> HTMLUnknownElement]}))
(ann-jsnominal
 HTMLAudioElement
 [[] :ancestors #{HTMLMediaElement} :fields {} :methods {}])
(ann
 js/HTMLAudioElement
 (HJSObj
  :mandatory
  {prototype HTMLAudioElement, new [-> HTMLAudioElement]}))
(ann-jsnominal
 MSImageResourceExtensions
 [[]
  :ancestors
  #{}
  :fields
  {dynsrc string,
   vrml string,
   lowsrc string,
   start string,
   loop number}
  :methods
  {}])
(ann-jsnominal
 PositionError
 [[]
  :ancestors
  #{}
  :fields
  {code number,
   message string,
   POSITION_UNAVAILABLE number,
   PERMISSION_DENIED number,
   TIMEOUT number}
  :methods
  {toString [-> string]}])
(ann
 js/PositionError
 (HJSObj
  :mandatory
  {prototype PositionError,
   new [-> PositionError],
   POSITION_UNAVAILABLE number,
   PERMISSION_DENIED number,
   TIMEOUT number}))
(ann-jsnominal
 HTMLTableCellElement
 [[]
  :ancestors
  #{DOML2DeprecatedBackgroundStyle HTMLTableAlignment
    DOML2DeprecatedBackgroundColorStyle HTMLElement}
  :fields
  {axis string,
   height any,
   noWrap boolean,
   borderColorDark any,
   borderColor any,
   width number,
   cellIndex number,
   rowSpan number,
   abbr string,
   borderColorLight any,
   colSpan number,
   scope string,
   headers string,
   align string}
  :methods
  {}])
(ann
 js/HTMLTableCellElement
 (HJSObj
  :mandatory
  {prototype HTMLTableCellElement, new [-> HTMLTableCellElement]}))
(ann-jsnominal
 SVGElementInstance
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {previousSibling SVGElementInstance,
   parentNode SVGElementInstance,
   lastChild SVGElementInstance,
   nextSibling SVGElementInstance,
   childNodes SVGElementInstanceList,
   correspondingUseElement SVGUseElement,
   correspondingElement SVGElement,
   firstChild SVGElementInstance}
  :methods
  {}])
(ann
 js/SVGElementInstance
 (HJSObj
  :mandatory
  {prototype SVGElementInstance, new [-> SVGElementInstance]}))
(ann-jsnominal
 MSNamespaceInfoCollection
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {add
   (Fn
    [-> Object]
    [string -> Object]
    [string string -> Object]
    [string string any -> Object]),
   item [any -> Object]}])
(ann
 js/MSNamespaceInfoCollection
 (HJSObj
  :mandatory
  {prototype MSNamespaceInfoCollection,
   new [-> MSNamespaceInfoCollection]}))
(ann-jsnominal
 SVGCircleElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {cx SVGAnimatedLength, r SVGAnimatedLength, cy SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGCircleElement
 (HJSObj
  :mandatory
  {prototype SVGCircleElement, new [-> SVGCircleElement]}))
(ann-jsnominal
 StyleSheetList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item (Fn [-> StyleSheet] [number -> StyleSheet])}])
(ann
 js/StyleSheetList
 (HJSObj
  :mandatory
  {prototype StyleSheetList, new [-> StyleSheetList]}))
(ann-jsnominal
 CSSImportRule
 [[]
  :ancestors
  #{CSSRule}
  :fields
  {styleSheet CSSStyleSheet, href string, media MediaList}
  :methods
  {}])
(ann
 js/CSSImportRule
 (HJSObj :mandatory {prototype CSSImportRule, new [-> CSSImportRule]}))
(ann-jsnominal
 CustomEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {detail Object}
  :methods
  {initCustomEvent [string boolean boolean Object -> void]}])
(ann
 js/CustomEvent
 (HJSObj :mandatory {prototype CustomEvent, new [-> CustomEvent]}))
(ann-jsnominal
 HTMLBaseFontElement
 [[]
  :ancestors
  #{DOML2DeprecatedColorProperty HTMLElement}
  :fields
  {face string, size number}
  :methods
  {}])
(ann
 js/HTMLBaseFontElement
 (HJSObj
  :mandatory
  {prototype HTMLBaseFontElement, new [-> HTMLBaseFontElement]}))
(ann-jsnominal
 HTMLTextAreaElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {wrap string,
   value string,
   cols number,
   status any,
   selectionEnd number,
   form HTMLFormElement,
   name string,
   selectionStart number,
   readOnly boolean,
   defaultValue string,
   rows number,
   type string}
  :methods
  {createTextRange [-> TextRange],
   setSelectionRange [number number -> void],
   select [-> void]}])
(ann
 js/HTMLTextAreaElement
 (HJSObj
  :mandatory
  {prototype HTMLTextAreaElement, new [-> HTMLTextAreaElement]}))
(ann-jsnominal
 Geolocation
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {clearWatch [number -> void],
   getCurrentPosition
   (Fn
    [PositionCallback -> void]
    [PositionCallback PositionErrorCallback -> void]
    [PositionCallback PositionErrorCallback PositionOptions -> void]),
   watchPosition
   (Fn
    [PositionCallback -> number]
    [PositionCallback PositionErrorCallback -> number]
    [PositionCallback
     PositionErrorCallback
     PositionOptions
     ->
     number])}])
(ann
 js/Geolocation
 (HJSObj :mandatory {prototype Geolocation, new [-> Geolocation]}))
(ann-jsnominal
 DOML2DeprecatedMarginStyle
 [[] :ancestors #{} :fields {vspace number, hspace number} :methods {}])
(ann-jsnominal
 MSWindowModeless
 [[]
  :ancestors
  #{}
  :fields
  {dialogTop any,
   dialogLeft any,
   dialogWidth any,
   dialogHeight any,
   menuArguments any}
  :methods
  {}])
(ann-jsnominal
 DOML2DeprecatedAlignmentStyle
 [[] :ancestors #{} :fields {align string} :methods {}])
(Value "bounce")
(Value "start")
(Value "finish")
(ann-jsnominal
 HTMLMarqueeElement
 [[]
  :ancestors
  #{DOML2DeprecatedBackgroundColorStyle MSDataBindingExtensions
    HTMLElement}
  :fields
  {onbounce [Event -> any],
   height string,
   loop number,
   direction string,
   width string,
   scrollDelay number,
   onstart [Event -> any],
   trueSpeed boolean,
   onfinish [Event -> any],
   vspace number,
   hspace number,
   behavior string,
   scrollAmount number}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   stop [-> void],
   start [-> void]}])
(ann
 js/HTMLMarqueeElement
 (HJSObj
  :mandatory
  {prototype HTMLMarqueeElement, new [-> HTMLMarqueeElement]}))
(ann-jsnominal
 SVGRect
 [[]
  :ancestors
  #{}
  :fields
  {y number, width number, x number, height number}
  :methods
  {}])
(ann
 js/SVGRect
 (HJSObj :mandatory {prototype SVGRect, new [-> SVGRect]}))
(ann-jsnominal
 MSNodeExtensions
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {swapNode [Node -> Node],
   removeNode (Fn [-> Node] [boolean -> Node]),
   replaceNode [Node -> Node]}])
(ann-jsnominal
 History
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {back (Fn [-> void] [any -> void]),
   forward (Fn [-> void] [any -> void]),
   go (Fn [-> void] [any -> void])}])
(ann
 js/History
 (HJSObj :mandatory {prototype History, new [-> History]}))
(ann-jsnominal
 SVGPathSegCurvetoCubicAbs
 [[]
  :ancestors
  #{SVGPathSeg}
  :fields
  {y number, y1 number, x2 number, x number, x1 number, y2 number}
  :methods
  {}])
(ann
 js/SVGPathSegCurvetoCubicAbs
 (HJSObj
  :mandatory
  {prototype SVGPathSegCurvetoCubicAbs,
   new [-> SVGPathSegCurvetoCubicAbs]}))
(ann-jsnominal
 SVGPathSegCurvetoQuadraticAbs
 [[]
  :ancestors
  #{SVGPathSeg}
  :fields
  {y number, y1 number, x number, x1 number}
  :methods
  {}])
(ann
 js/SVGPathSegCurvetoQuadraticAbs
 (HJSObj
  :mandatory
  {prototype SVGPathSegCurvetoQuadraticAbs,
   new [-> SVGPathSegCurvetoQuadraticAbs]}))
(ann-jsnominal
 TimeRanges
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {start [number -> number], end [number -> number]}])
(ann
 js/TimeRanges
 (HJSObj :mandatory {prototype TimeRanges, new [-> TimeRanges]}))
(ann-jsnominal
 CSSRule
 [[]
  :ancestors
  #{}
  :fields
  {UNKNOWN_RULE number,
   PAGE_RULE number,
   MEDIA_RULE number,
   FONT_FACE_RULE number,
   CHARSET_RULE number,
   parentRule CSSRule,
   parentStyleSheet CSSStyleSheet,
   IMPORT_RULE number,
   STYLE_RULE number,
   NAMESPACE_RULE number,
   type number,
   cssText string}
  :methods
  {}])
(ann
 js/CSSRule
 (HJSObj
  :mandatory
  {new [-> CSSRule],
   prototype CSSRule,
   UNKNOWN_RULE number,
   PAGE_RULE number,
   MEDIA_RULE number,
   FONT_FACE_RULE number,
   CHARSET_RULE number,
   IMPORT_RULE number,
   STYLE_RULE number,
   NAMESPACE_RULE number}))
(ann-jsnominal
 SVGPathSegLinetoAbs
 [[] :ancestors #{SVGPathSeg} :fields {y number, x number} :methods {}])
(ann
 js/SVGPathSegLinetoAbs
 (HJSObj
  :mandatory
  {prototype SVGPathSegLinetoAbs, new [-> SVGPathSegLinetoAbs]}))
(ann-jsnominal
 HTMLModElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {dateTime string, cite string}
  :methods
  {}])
(ann
 js/HTMLModElement
 (HJSObj
  :mandatory
  {prototype HTMLModElement, new [-> HTMLModElement]}))
(ann-jsnominal
 SVGMatrix
 [[]
  :ancestors
  #{}
  :fields
  {e number, c number, a number, b number, d number, f number}
  :methods
  {scale [number -> SVGMatrix],
   translate [number number -> SVGMatrix],
   rotateFromVector [number number -> SVGMatrix],
   multiply [SVGMatrix -> SVGMatrix],
   scaleNonUniform [number number -> SVGMatrix],
   flipY [-> SVGMatrix],
   flipX [-> SVGMatrix],
   skewX [number -> SVGMatrix],
   skewY [number -> SVGMatrix],
   rotate [number -> SVGMatrix],
   inverse [-> SVGMatrix]}])
(ann
 js/SVGMatrix
 (HJSObj :mandatory {prototype SVGMatrix, new [-> SVGMatrix]}))
(ann-jsnominal
 MSPopupWindow
 [[]
  :ancestors
  #{}
  :fields
  {document Document, isOpen boolean}
  :methods
  {show
   (Fn
    [number number number number -> void]
    [number number number number any -> void]),
   hide [-> void]}])
(ann
 js/MSPopupWindow
 (HJSObj :mandatory {prototype MSPopupWindow, new [-> MSPopupWindow]}))
(ann-jsnominal
 BeforeUnloadEvent
 [[] :ancestors #{Event} :fields {returnValue string} :methods {}])
(ann
 js/BeforeUnloadEvent
 (HJSObj
  :mandatory
  {prototype BeforeUnloadEvent, new [-> BeforeUnloadEvent]}))
(ann-jsnominal
 SVGUseElement
 [[]
  :ancestors
  #{SVGURIReference SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {y SVGAnimatedLength,
   width SVGAnimatedLength,
   animatedInstanceRoot SVGElementInstance,
   instanceRoot SVGElementInstance,
   x SVGAnimatedLength,
   height SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGUseElement
 (HJSObj :mandatory {prototype SVGUseElement, new [-> SVGUseElement]}))
(ann-jsnominal
 Event
 [[]
  :ancestors
  #{}
  :fields
  {timeStamp number,
   cancelBubble boolean,
   CAPTURING_PHASE number,
   target EventTarget,
   srcElement Element,
   defaultPrevented boolean,
   bubbles boolean,
   BUBBLING_PHASE number,
   eventPhase number,
   isTrusted boolean,
   currentTarget EventTarget,
   cancelable boolean,
   AT_TARGET number,
   type string}
  :methods
  {initEvent [string boolean boolean -> void],
   stopPropagation [-> void],
   stopImmediatePropagation [-> void],
   preventDefault [-> void]}])
(ann
 js/Event
 (HJSObj
  :mandatory
  {prototype Event,
   new [-> Event],
   CAPTURING_PHASE number,
   AT_TARGET number,
   BUBBLING_PHASE number}))
(ann-jsnominal
 ImageData
 [[]
  :ancestors
  #{}
  :fields
  {width number, data (Seq number), height number}
  :methods
  {}])
(ann
 js/ImageData
 (HJSObj :mandatory {prototype ImageData, new [-> ImageData]}))
(ann-jsnominal
 HTMLTableColElement
 [[]
  :ancestors
  #{HTMLTableAlignment HTMLElement}
  :fields
  {width any, align string, span number}
  :methods
  {}])
(ann
 js/HTMLTableColElement
 (HJSObj
  :mandatory
  {prototype HTMLTableColElement, new [-> HTMLTableColElement]}))
(ann-jsnominal
 SVGException
 [[]
  :ancestors
  #{}
  :fields
  {code number,
   message string,
   SVG_MATRIX_NOT_INVERTABLE number,
   SVG_WRONG_TYPE_ERR number,
   SVG_INVALID_VALUE_ERR number}
  :methods
  {toString [-> string]}])
(ann
 js/SVGException
 (HJSObj
  :mandatory
  {prototype SVGException,
   new [-> SVGException],
   SVG_MATRIX_NOT_INVERTABLE number,
   SVG_WRONG_TYPE_ERR number,
   SVG_INVALID_VALUE_ERR number}))
(ann-jsnominal
 SVGLinearGradientElement
 [[]
  :ancestors
  #{SVGGradientElement}
  :fields
  {y1 SVGAnimatedLength,
   x2 SVGAnimatedLength,
   x1 SVGAnimatedLength,
   y2 SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGLinearGradientElement
 (HJSObj
  :mandatory
  {prototype SVGLinearGradientElement,
   new [-> SVGLinearGradientElement]}))
(ann-jsnominal
 HTMLTableAlignment
 [[]
  :ancestors
  #{}
  :fields
  {ch string, vAlign string, chOff string}
  :methods
  {}])
(ann-jsnominal
 SVGAnimatedEnumeration
 [[]
  :ancestors
  #{}
  :fields
  {animVal number, baseVal number}
  :methods
  {}])
(ann
 js/SVGAnimatedEnumeration
 (HJSObj
  :mandatory
  {prototype SVGAnimatedEnumeration, new [-> SVGAnimatedEnumeration]}))
(ann-jsnominal
 DOML2DeprecatedSizeProperty
 [[] :ancestors #{} :fields {size number} :methods {}])
(ann-jsnominal
 HTMLUListElement
 [[]
  :ancestors
  #{DOML2DeprecatedListNumberingAndBulletStyle HTMLElement
    DOML2DeprecatedListSpaceReduction}
  :fields
  {}
  :methods
  {}])
(ann
 js/HTMLUListElement
 (HJSObj
  :mandatory
  {prototype HTMLUListElement, new [-> HTMLUListElement]}))
(ann-jsnominal
 SVGRectElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {y SVGAnimatedLength,
   width SVGAnimatedLength,
   ry SVGAnimatedLength,
   rx SVGAnimatedLength,
   x SVGAnimatedLength,
   height SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGRectElement
 (HJSObj
  :mandatory
  {prototype SVGRectElement, new [-> SVGRectElement]}))
(ann-jsnominal
 ErrorEventHandler
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {call [Event string number number -> void]}])
(ann-jsnominal
 HTMLDivElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {align string, noWrap boolean}
  :methods
  {}])
(ann
 js/HTMLDivElement
 (HJSObj
  :mandatory
  {prototype HTMLDivElement, new [-> HTMLDivElement]}))
(ann-jsnominal
 DOML2DeprecatedBorderStyle
 [[] :ancestors #{} :fields {border string} :methods {}])
(ann-jsnominal
 NamedNodeMap
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {removeNamedItemNS [string string -> Attr],
   item [number -> Attr],
   removeNamedItem [string -> Attr],
   getNamedItem [string -> Attr],
   setNamedItem [Attr -> Attr],
   getNamedItemNS [string string -> Attr],
   setNamedItemNS [Attr -> Attr]}])
(ann
 js/NamedNodeMap
 (HJSObj :mandatory {prototype NamedNodeMap, new [-> NamedNodeMap]}))
(ann-jsnominal
 MediaList
 [[]
  :ancestors
  #{}
  :fields
  {length number, mediaText string}
  :methods
  {deleteMedium [string -> void],
   appendMedium [string -> void],
   item [number -> string],
   toString [-> string]}])
(ann
 js/MediaList
 (HJSObj :mandatory {prototype MediaList, new [-> MediaList]}))
(ann-jsnominal
 SVGPathSegCurvetoQuadraticSmoothAbs
 [[] :ancestors #{SVGPathSeg} :fields {y number, x number} :methods {}])
(ann
 js/SVGPathSegCurvetoQuadraticSmoothAbs
 (HJSObj
  :mandatory
  {prototype SVGPathSegCurvetoQuadraticSmoothAbs,
   new [-> SVGPathSegCurvetoQuadraticSmoothAbs]}))
(ann-jsnominal
 SVGPathSegCurvetoCubicSmoothRel
 [[]
  :ancestors
  #{SVGPathSeg}
  :fields
  {y number, x2 number, x number, y2 number}
  :methods
  {}])
(ann
 js/SVGPathSegCurvetoCubicSmoothRel
 (HJSObj
  :mandatory
  {prototype SVGPathSegCurvetoCubicSmoothRel,
   new [-> SVGPathSegCurvetoCubicSmoothRel]}))
(ann-jsnominal
 SVGLengthList
 [[]
  :ancestors
  #{}
  :fields
  {numberOfItems number}
  :methods
  {replaceItem [SVGLength number -> SVGLength],
   getItem [number -> SVGLength],
   clear [-> void],
   appendItem [SVGLength -> SVGLength],
   initialize [SVGLength -> SVGLength],
   removeItem [number -> SVGLength],
   insertItemBefore [SVGLength number -> SVGLength]}])
(ann
 js/SVGLengthList
 (HJSObj :mandatory {prototype SVGLengthList, new [-> SVGLengthList]}))
(ann-jsnominal
 ProcessingInstruction
 [[]
  :ancestors
  #{Node}
  :fields
  {target string, data string}
  :methods
  {}])
(ann
 js/ProcessingInstruction
 (HJSObj
  :mandatory
  {prototype ProcessingInstruction, new [-> ProcessingInstruction]}))
(Value "mouseleave")
(Value "mouseenter")
(Value "help")
(Value "focusout")
(Value "focusin")
(ann-jsnominal
 MSWindowExtensions
 [[]
  :ancestors
  #{}
  :fields
  {external External,
   onhelp [Event -> any],
   screenTop number,
   event MSEventObj,
   onmouseenter [MouseEvent -> any],
   status string,
   offscreenBuffering any,
   defaultStatus string,
   screenLeft number,
   clientInformation Navigator,
   clipboardData DataTransfer,
   onfocusin [FocusEvent -> any],
   closed boolean,
   maxConnectionsPerServer number,
   onfocusout [FocusEvent -> any],
   onmouseleave [MouseEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   toStaticHTML [string -> string],
   msWriteProfilerMark [string -> void],
   resizeTo (Fn [-> void] [number -> void] [number number -> void]),
   navigate [string -> void],
   moveTo (Fn [-> void] [number -> void] [number number -> void]),
   resizeBy (Fn [-> void] [number -> void] [number number -> void]),
   createPopup (Fn [-> MSPopupWindow] [any -> MSPopupWindow]),
   showHelp
   (Fn
    [string -> void]
    [string any -> void]
    [string any string -> void]),
   item [any -> any],
   moveBy (Fn [-> void] [number -> void] [number number -> void]),
   execScript (Fn [string -> any] [string string -> any]),
   showModelessDialog
   (Fn
    [-> Window]
    [string -> Window]
    [string any -> Window]
    [string any any -> Window])}])
(ann-jsnominal
 MSBehaviorUrnsCollection
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> string]}])
(ann
 js/MSBehaviorUrnsCollection
 (HJSObj
  :mandatory
  {prototype MSBehaviorUrnsCollection,
   new [-> MSBehaviorUrnsCollection]}))
(ann-jsnominal
 CSSFontFaceRule
 [[]
  :ancestors
  #{CSSRule}
  :fields
  {style CSSStyleDeclaration}
  :methods
  {}])
(ann
 js/CSSFontFaceRule
 (HJSObj
  :mandatory
  {prototype CSSFontFaceRule, new [-> CSSFontFaceRule]}))
(ann-jsnominal
 DOML2DeprecatedBackgroundStyle
 [[] :ancestors #{} :fields {background string} :methods {}])
(ann-jsnominal
 TextEvent
 [[]
  :ancestors
  #{UIEvent}
  :fields
  {inputMethod number,
   DOM_INPUT_METHOD_OPTION number,
   DOM_INPUT_METHOD_SCRIPT number,
   DOM_INPUT_METHOD_IME number,
   DOM_INPUT_METHOD_DROP number,
   DOM_INPUT_METHOD_UNKNOWN number,
   DOM_INPUT_METHOD_HANDWRITING number,
   data string,
   DOM_INPUT_METHOD_MULTIMODAL number,
   DOM_INPUT_METHOD_PASTE number,
   DOM_INPUT_METHOD_KEYBOARD number,
   DOM_INPUT_METHOD_VOICE number,
   locale string}
  :methods
  {initTextEvent
   [string boolean boolean Window string number string -> void]}])
(ann
 js/TextEvent
 (HJSObj
  :mandatory
  {DOM_INPUT_METHOD_OPTION number,
   DOM_INPUT_METHOD_SCRIPT number,
   new [-> TextEvent],
   prototype TextEvent,
   DOM_INPUT_METHOD_IME number,
   DOM_INPUT_METHOD_DROP number,
   DOM_INPUT_METHOD_UNKNOWN number,
   DOM_INPUT_METHOD_HANDWRITING number,
   DOM_INPUT_METHOD_MULTIMODAL number,
   DOM_INPUT_METHOD_PASTE number,
   DOM_INPUT_METHOD_KEYBOARD number,
   DOM_INPUT_METHOD_VOICE number}))
(ann-jsnominal
 DocumentFragment
 [[]
  :ancestors
  #{NodeSelector Node MSEventAttachmentTarget MSNodeExtensions}
  :fields
  {}
  :methods
  {}])
(ann
 js/DocumentFragment
 (HJSObj
  :mandatory
  {prototype DocumentFragment, new [-> DocumentFragment]}))
(ann-jsnominal
 SVGPolylineElement
 [[]
  :ancestors
  #{SVGAnimatedPoints SVGExternalResourcesRequired SVGStylable
    SVGElement SVGTransformable SVGTests SVGLangSpace}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGPolylineElement
 (HJSObj
  :mandatory
  {prototype SVGPolylineElement, new [-> SVGPolylineElement]}))
(ann-jsnominal
 SVGAnimatedPathData
 [[] :ancestors #{} :fields {pathSegList SVGPathSegList} :methods {}])
(ann-jsnominal
 Position
 [[]
  :ancestors
  #{}
  :fields
  {timestamp number, coords Coordinates}
  :methods
  {}])
(ann
 js/Position
 (HJSObj :mandatory {prototype Position, new [-> Position]}))
(ann-jsnominal
 BookmarkCollection
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> any]}])
(ann
 js/BookmarkCollection
 (HJSObj
  :mandatory
  {prototype BookmarkCollection, new [-> BookmarkCollection]}))
(ann-jsnominal
 PerformanceMark
 [[] :ancestors #{PerformanceEntry} :fields {} :methods {}])
(ann
 js/PerformanceMark
 (HJSObj
  :mandatory
  {prototype PerformanceMark, new [-> PerformanceMark]}))
(ann-jsnominal
 CSSPageRule
 [[]
  :ancestors
  #{CSSRule}
  :fields
  {pseudoClass string,
   selectorText string,
   selector string,
   style CSSStyleDeclaration}
  :methods
  {}])
(ann
 js/CSSPageRule
 (HJSObj :mandatory {prototype CSSPageRule, new [-> CSSPageRule]}))
(ann-jsnominal
 HTMLBRElement
 [[] :ancestors #{HTMLElement} :fields {clear string} :methods {}])
(ann
 js/HTMLBRElement
 (HJSObj :mandatory {prototype HTMLBRElement, new [-> HTMLBRElement]}))
(ann-jsnominal
 MSNavigatorExtensions
 [[]
  :ancestors
  #{}
  :fields
  {plugins MSPluginsCollection,
   browserLanguage string,
   systemLanguage string,
   appMinorVersion string,
   mimeTypes MSMimeTypesCollection,
   userLanguage string,
   connectionSpeed number,
   cookieEnabled boolean,
   cpuClass string,
   appCodeName string}
  :methods
  {javaEnabled [-> boolean], taintEnabled [-> boolean]}])
(ann-jsnominal
 HTMLSpanElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {}
  :methods
  {}])
(ann
 js/HTMLSpanElement
 (HJSObj
  :mandatory
  {prototype HTMLSpanElement, new [-> HTMLSpanElement]}))
(ann-jsnominal
 HTMLHeadElement
 [[] :ancestors #{HTMLElement} :fields {profile string} :methods {}])
(ann
 js/HTMLHeadElement
 (HJSObj
  :mandatory
  {prototype HTMLHeadElement, new [-> HTMLHeadElement]}))
(ann-jsnominal
 HTMLHeadingElement
 [[]
  :ancestors
  #{HTMLElement DOML2DeprecatedTextFlowControl}
  :fields
  {align string}
  :methods
  {}])
(ann
 js/HTMLHeadingElement
 (HJSObj
  :mandatory
  {prototype HTMLHeadingElement, new [-> HTMLHeadingElement]}))
(ann-jsnominal
 HTMLFormElement
 [[]
  :ancestors
  #{MSHTMLCollectionExtensions HTMLElement}
  :fields
  {elements HTMLCollection,
   acceptCharset string,
   enctype string,
   target string,
   action string,
   name string,
   method string,
   length number,
   encoding string}
  :methods
  {reset [-> void],
   item (Fn [-> any] [any -> any] [any any -> any]),
   submit [-> void],
   namedItem [string -> any]}])
(ann
 js/HTMLFormElement
 (HJSObj
  :mandatory
  {prototype HTMLFormElement, new [-> HTMLFormElement]}))
(ann-jsnominal
 SVGZoomAndPan
 [[]
  :ancestors
  #{}
  :fields
  {zoomAndPan number,
   SVG_ZOOMANDPAN_MAGNIFY number,
   SVG_ZOOMANDPAN_UNKNOWN number,
   SVG_ZOOMANDPAN_DISABLE number}
  :methods
  {}])
(ann
 js/SVGZoomAndPan
 (HJSObj
  :mandatory
  {prototype SVGZoomAndPan,
   new [-> SVGZoomAndPan],
   SVG_ZOOMANDPAN_MAGNIFY number,
   SVG_ZOOMANDPAN_UNKNOWN number,
   SVG_ZOOMANDPAN_DISABLE number}))
(ann-jsnominal
 HTMLMediaElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {HAVE_FUTURE_DATA number,
   playbackRate number,
   HAVE_METADATA number,
   defaultPlaybackRate number,
   volume number,
   loop boolean,
   currentSrc string,
   paused boolean,
   duration number,
   readyState any,
   autobuffer boolean,
   HAVE_ENOUGH_DATA number,
   HAVE_CURRENT_DATA number,
   buffered TimeRanges,
   controls boolean,
   preload string,
   autoplay boolean,
   error MediaError,
   currentTime number,
   initialTime number,
   NETWORK_EMPTY number,
   src string,
   NETWORK_IDLE number,
   NETWORK_LOADING number,
   muted boolean,
   HAVE_NOTHING number,
   seeking boolean,
   networkState number,
   NETWORK_NO_SOURCE number,
   ended boolean,
   played TimeRanges,
   seekable TimeRanges}
  :methods
  {pause [-> void],
   play [-> void],
   load [-> void],
   canPlayType [string -> string]}])
(ann
 js/HTMLMediaElement
 (HJSObj
  :mandatory
  {new [-> HTMLMediaElement],
   HAVE_FUTURE_DATA number,
   prototype HTMLMediaElement,
   HAVE_METADATA number,
   HAVE_ENOUGH_DATA number,
   HAVE_CURRENT_DATA number,
   NETWORK_EMPTY number,
   NETWORK_IDLE number,
   NETWORK_LOADING number,
   HAVE_NOTHING number,
   NETWORK_NO_SOURCE number}))
(ann-jsnominal
 ElementCSSInlineStyle
 [[]
  :ancestors
  #{}
  :fields
  {runtimeStyle MSStyleCSSProperties,
   currentStyle MSCurrentStyleCSSProperties}
  :methods
  {doScroll (Fn [-> void] [any -> void]),
   componentFromPoint [number number -> string]}])
(ann-jsnominal
 DOMParser
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {parseFromString [string string -> Document]}])
(ann
 js/DOMParser
 (HJSObj :mandatory {prototype DOMParser, new [-> DOMParser]}))
(ann-jsnominal
 MSMimeTypesCollection
 [[] :ancestors #{} :fields {length number} :methods {}])
(ann
 js/MSMimeTypesCollection
 (HJSObj
  :mandatory
  {prototype MSMimeTypesCollection, new [-> MSMimeTypesCollection]}))
(ann-jsnominal
 StyleSheet
 [[]
  :ancestors
  #{}
  :fields
  {disabled boolean,
   ownerNode Node,
   parentStyleSheet StyleSheet,
   href string,
   media MediaList,
   type string,
   title string}
  :methods
  {}])
(ann
 js/StyleSheet
 (HJSObj :mandatory {prototype StyleSheet, new [-> StyleSheet]}))
(ann-jsnominal
 SVGTextPathElement
 [[]
  :ancestors
  #{SVGURIReference SVGTextContentElement}
  :fields
  {TEXTPATH_METHODTYPE_STRETCH number,
   spacing SVGAnimatedEnumeration,
   startOffset SVGAnimatedLength,
   TEXTPATH_METHODTYPE_UNKNOWN number,
   method SVGAnimatedEnumeration,
   TEXTPATH_METHODTYPE_ALIGN number,
   TEXTPATH_SPACINGTYPE_UNKNOWN number,
   TEXTPATH_SPACINGTYPE_EXACT number,
   TEXTPATH_SPACINGTYPE_AUTO number}
  :methods
  {}])
(ann
 js/SVGTextPathElement
 (HJSObj
  :mandatory
  {prototype SVGTextPathElement,
   new [-> SVGTextPathElement],
   TEXTPATH_SPACINGTYPE_EXACT number,
   TEXTPATH_METHODTYPE_STRETCH number,
   TEXTPATH_SPACINGTYPE_AUTO number,
   TEXTPATH_SPACINGTYPE_UNKNOWN number,
   TEXTPATH_METHODTYPE_UNKNOWN number,
   TEXTPATH_METHODTYPE_ALIGN number}))
(ann-jsnominal
 HTMLDTElement
 [[] :ancestors #{HTMLElement} :fields {noWrap boolean} :methods {}])
(ann
 js/HTMLDTElement
 (HJSObj :mandatory {prototype HTMLDTElement, new [-> HTMLDTElement]}))
(ann-jsnominal
 NodeList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> Node]}])
(ann
 js/NodeList
 (HJSObj :mandatory {prototype NodeList, new [-> NodeList]}))
(ann-jsnominal
 NodeListOf
 [[]
  :ancestors
  #{NodeList}
  :fields
  {length number}
  :methods
  {item [number -> TNode]}])
(ann-jsnominal
 XMLSerializer
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {serializeToString [Node -> string]}])
(ann
 js/XMLSerializer
 (HJSObj :mandatory {prototype XMLSerializer, new [-> XMLSerializer]}))
(ann-jsnominal
 PerformanceMeasure
 [[] :ancestors #{PerformanceEntry} :fields {} :methods {}])
(ann
 js/PerformanceMeasure
 (HJSObj
  :mandatory
  {prototype PerformanceMeasure, new [-> PerformanceMeasure]}))
(ann-jsnominal
 SVGGradientElement
 [[]
  :ancestors
  #{SVGURIReference SVGExternalResourcesRequired SVGUnitTypes
    SVGStylable SVGElement}
  :fields
  {spreadMethod SVGAnimatedEnumeration,
   gradientTransform SVGAnimatedTransformList,
   gradientUnits SVGAnimatedEnumeration,
   SVG_SPREADMETHOD_REFLECT number,
   SVG_SPREADMETHOD_PAD number,
   SVG_SPREADMETHOD_UNKNOWN number,
   SVG_SPREADMETHOD_REPEAT number}
  :methods
  {}])
(ann
 js/SVGGradientElement
 (HJSObj
  :mandatory
  {prototype SVGGradientElement,
   new [-> SVGGradientElement],
   SVG_SPREADMETHOD_REFLECT number,
   SVG_SPREADMETHOD_PAD number,
   SVG_SPREADMETHOD_UNKNOWN number,
   SVG_SPREADMETHOD_REPEAT number}))
(ann-jsnominal
 NodeFilter
 [[]
  :ancestors
  #{}
  :fields
  {SHOW_COMMENT number,
   SHOW_ELEMENT number,
   FILTER_ACCEPT number,
   SHOW_TEXT number,
   FILTER_REJECT number,
   SHOW_PROCESSING_INSTRUCTION number,
   SHOW_CDATA_SECTION number,
   FILTER_SKIP number,
   SHOW_DOCUMENT_FRAGMENT number,
   SHOW_ENTITY number,
   SHOW_ALL number,
   SHOW_DOCUMENT_TYPE number,
   SHOW_ENTITY_REFERENCE number,
   SHOW_DOCUMENT number,
   SHOW_ATTRIBUTE number,
   SHOW_NOTATION number}
  :methods
  {acceptNode [Node -> number]}])
(ann
 js/NodeFilter
 (HJSObj
  :mandatory
  {new [-> NodeFilter],
   prototype NodeFilter,
   SHOW_COMMENT number,
   SHOW_ELEMENT number,
   FILTER_ACCEPT number,
   SHOW_TEXT number,
   FILTER_REJECT number,
   SHOW_PROCESSING_INSTRUCTION number,
   SHOW_CDATA_SECTION number,
   FILTER_SKIP number,
   SHOW_DOCUMENT_FRAGMENT number,
   SHOW_ENTITY number,
   SHOW_ALL number,
   SHOW_DOCUMENT_TYPE number,
   SHOW_ENTITY_REFERENCE number,
   SHOW_DOCUMENT number,
   SHOW_ATTRIBUTE number,
   SHOW_NOTATION number}))
(ann-jsnominal
 SVGNumberList
 [[]
  :ancestors
  #{}
  :fields
  {numberOfItems number}
  :methods
  {replaceItem [SVGNumber number -> SVGNumber],
   getItem [number -> SVGNumber],
   clear [-> void],
   appendItem [SVGNumber -> SVGNumber],
   initialize [SVGNumber -> SVGNumber],
   removeItem [number -> SVGNumber],
   insertItemBefore [SVGNumber number -> SVGNumber]}])
(ann
 js/SVGNumberList
 (HJSObj :mandatory {prototype SVGNumberList, new [-> SVGNumberList]}))
(ann-jsnominal
 MediaError
 [[]
  :ancestors
  #{}
  :fields
  {code number,
   MEDIA_ERR_ABORTED number,
   MEDIA_ERR_NETWORK number,
   MEDIA_ERR_SRC_NOT_SUPPORTED number,
   MEDIA_ERR_DECODE number}
  :methods
  {}])
(ann
 js/MediaError
 (HJSObj
  :mandatory
  {prototype MediaError,
   new [-> MediaError],
   MEDIA_ERR_ABORTED number,
   MEDIA_ERR_NETWORK number,
   MEDIA_ERR_SRC_NOT_SUPPORTED number,
   MEDIA_ERR_DECODE number}))
(ann-jsnominal
 HTMLFieldSetElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {align string, form HTMLFormElement}
  :methods
  {}])
(ann
 js/HTMLFieldSetElement
 (HJSObj
  :mandatory
  {prototype HTMLFieldSetElement, new [-> HTMLFieldSetElement]}))
(ann-jsnominal
 HTMLBGSoundElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {balance any, volume any, src string, loop number}
  :methods
  {}])
(ann
 js/HTMLBGSoundElement
 (HJSObj
  :mandatory
  {prototype HTMLBGSoundElement, new [-> HTMLBGSoundElement]}))
(Value "mouseleave")
(Value "beforecut")
(Value "keydown")
(Value "move")
(Value "keyup")
(Value "reset")
(Value "help")
(Value "dragleave")
(Value "focusin")
(Value "seeked")
(Value "durationchange")
(Value "blur")
(Value "emptied")
(Value "seeking")
(Value "canplay")
(Value "deactivate")
(Value "datasetchanged")
(Value "rowsdelete")
(Value "loadstart")
(Value "losecapture")
(Value "dragenter")
(Value "controlselect")
(Value "submit")
(Value "change")
(Value "layoutcomplete")
(Value "beforeactivate")
(Value "canplaythrough")
(Value "beforeupdate")
(Value "filterchange")
(Value "datasetcomplete")
(Value "suspend")
(Value "mouseenter")
(Value "errorupdate")
(Value "mouseout")
(Value "mousewheel")
(Value "volumechange")
(Value "cellchange")
(Value "rowexit")
(Value "rowsinserted")
(Value "propertychange")
(Value "dragend")
(Value "beforepaste")
(Value "dragover")
(Value "mouseup")
(Value "dragstart")
(Value "beforecopy")
(Value "drag")
(Value "mouseover")
(Value "pause")
(Value "mousedown")
(Value "click")
(Value "waiting")
(Value "resizestart")
(Value "paste")
(Value "moveend")
(Value "stalled")
(Value "mousemove")
(Value "beforeeditfocus")
(Value "ratechange")
(Value "progress")
(Value "dblclick")
(Value "contextmenu")
(Value "loadedmetadata")
(Value "afterupdate")
(Value "error")
(Value "play")
(Value "resizeend")
(Value "playing")
(Value "focusout")
(Value "abort")
(Value "dataavailable")
(Value "readystatechange")
(Value "keypress")
(Value "loadeddata")
(Value "beforedeactivate")
(Value "activate")
(Value "movestart")
(Value "selectstart")
(Value "focus")
(Value "timeupdate")
(Value "resize")
(Value "cut")
(Value "select")
(Value "drop")
(Value "copy")
(Value "ended")
(Value "scroll")
(Value "rowenter")
(Value "load")
(Value "input")
(ann-jsnominal
 HTMLElement
 [[]
  :ancestors
  #{MSEventAttachmentTarget MSNodeExtensions Element
    ElementCSSInlineStyle}
  :fields
  {all HTMLCollection,
   isTextEdit boolean,
   oninput [Event -> any],
   parentTextEdit Element,
   tagUrn string,
   sourceIndex number,
   onmousemove [MouseEvent -> any],
   onpause [Event -> any],
   canHaveChildren boolean,
   onhelp [Event -> any],
   onkeypress [KeyboardEvent -> any],
   innerText string,
   className string,
   onloadeddata [Event -> any],
   ondrop [DragEvent -> any],
   outerText string,
   oncontextmenu [MouseEvent -> any],
   onchange [Event -> any],
   onmousedown [MouseEvent -> any],
   onmousewheel [MouseWheelEvent -> any],
   ontimeupdate [Event -> any],
   disabled boolean,
   document Document,
   id string,
   outerHTML string,
   onselect [UIEvent -> any],
   oncontrolselect [MSEventObj -> any],
   offsetHeight number,
   contentEditable string,
   onsuspend [Event -> any],
   onselectstart [Event -> any],
   isContentEditable boolean,
   offsetWidth number,
   scopeName string,
   children HTMLCollection,
   onmouseenter [MouseEvent -> any],
   parentElement HTMLElement,
   ondatasetcomplete [MSEventObj -> any],
   ondragenter [DragEvent -> any],
   uniqueID string,
   onmoveend [MSEventObj -> any],
   onmouseup [MouseEvent -> any],
   onseeking [Event -> any],
   behaviorUrns MSBehaviorUrnsCollection,
   isMultiLine boolean,
   onvolumechange [Event -> any],
   onpaste [DragEvent -> any],
   readyState any,
   ondragstart [DragEvent -> any],
   onresizeend [MSEventObj -> any],
   onkeydown [KeyboardEvent -> any],
   onratechange [Event -> any],
   offsetTop number,
   onblur [FocusEvent -> any],
   isDisabled boolean,
   filters Object,
   onbeforeactivate [UIEvent -> any],
   onmouseover [MouseEvent -> any],
   recordNumber any,
   uniqueNumber number,
   onreadystatechange [Event -> any],
   onemptied [Event -> any],
   ondrag [DragEvent -> any],
   ondeactivate [UIEvent -> any],
   ondblclick [MouseEvent -> any],
   onplay [Event -> any],
   onbeforecopy [DragEvent -> any],
   onbeforedeactivate [UIEvent -> any],
   onerrorupdate [MSEventObj -> any],
   oncanplay [Event -> any],
   onload [Event -> any],
   onprogress [any -> any],
   onseeked [Event -> any],
   hideFocus boolean,
   onsubmit [Event -> any],
   oncanplaythrough [Event -> any],
   dir string,
   ondataavailable [MSEventObj -> any],
   ondurationchange [Event -> any],
   onrowsdelete [MSEventObj -> any],
   onclick [MouseEvent -> any],
   onerror [Event -> any],
   onwaiting [Event -> any],
   onbeforepaste [DragEvent -> any],
   accessKey string,
   onabort [UIEvent -> any],
   style MSStyleCSSProperties,
   oncellchange [MSEventObj -> any],
   onafterupdate [MSEventObj -> any],
   ondatasetchanged [MSEventObj -> any],
   onloadstart [Event -> any],
   onmove [MSEventObj -> any],
   onbeforeupdate [MSEventObj -> any],
   ondragover [DragEvent -> any],
   onbeforeeditfocus [MSEventObj -> any],
   tabIndex number,
   onpropertychange [MSEventObj -> any],
   onfocus [FocusEvent -> any],
   onbeforecut [DragEvent -> any],
   onfocusin [FocusEvent -> any],
   title string,
   onmovestart [MSEventObj -> any],
   language string,
   onscroll [UIEvent -> any],
   innerHTML string,
   onstalled [Event -> any],
   lang string,
   oncopy [DragEvent -> any],
   oncut [DragEvent -> any],
   canHaveHTML boolean,
   ondragend [DragEvent -> any],
   onplaying [Event -> any],
   onresizestart [MSEventObj -> any],
   onlayoutcomplete [MSEventObj -> any],
   onfocusout [FocusEvent -> any],
   onmouseout [MouseEvent -> any],
   onkeyup [KeyboardEvent -> any],
   onended [Event -> any],
   onmouseleave [MouseEvent -> any],
   onreset [Event -> any],
   offsetLeft number,
   onfilterchange [MSEventObj -> any],
   onrowenter [MSEventObj -> any],
   onrowsinserted [MSEventObj -> any],
   offsetParent Element,
   onrowexit [MSEventObj -> any],
   ondragleave [DragEvent -> any],
   onresize [UIEvent -> any],
   onloadedmetadata [Event -> any],
   onactivate [UIEvent -> any],
   onlosecapture [MSEventObj -> any]}
  :methods
  {removeBehavior [number -> boolean],
   addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   createControlRange [-> ControlRangeCollection],
   dragDrop [-> boolean],
   applyElement (Fn [Element -> Element] [Element string -> Element]),
   mergeAttributes
   (Fn [HTMLElement -> void] [HTMLElement boolean -> void]),
   insertAdjacentHTML [string string -> void],
   addFilter [Object -> void],
   addBehavior (Fn [string -> number] [string any -> number]),
   scrollIntoView (Fn [-> void] [boolean -> void]),
   getElementsByClassName [string -> NodeList],
   insertAdjacentElement [string Element -> Element],
   replaceAdjacentText [string string -> string],
   click [-> void],
   setActive [-> void],
   blur [-> void],
   focus [-> void],
   releaseCapture [-> void],
   insertAdjacentText [string string -> void],
   removeFilter [Object -> void],
   clearAttributes [-> void],
   setCapture (Fn [-> void] [boolean -> void]),
   contains [HTMLElement -> boolean],
   getAdjacentText [string -> string]}])
(ann
 js/HTMLElement
 (HJSObj :mandatory {prototype HTMLElement, new [-> HTMLElement]}))
(ann-jsnominal
 Comment
 [[] :ancestors #{CharacterData} :fields {text string} :methods {}])
(ann
 js/Comment
 (HJSObj :mandatory {prototype Comment, new [-> Comment]}))
(ann-jsnominal
 PerformanceResourceTiming
 [[]
  :ancestors
  #{PerformanceEntry}
  :fields
  {responseStart number,
   fetchStart number,
   domainLookupStart number,
   connectStart number,
   connectEnd number,
   requestStart number,
   redirectEnd number,
   initiatorType string,
   redirectStart number,
   responseEnd number,
   domainLookupEnd number}
  :methods
  {}])
(ann
 js/PerformanceResourceTiming
 (HJSObj
  :mandatory
  {prototype PerformanceResourceTiming,
   new [-> PerformanceResourceTiming]}))
(ann-jsnominal CanvasPattern [[] :ancestors #{} :fields {} :methods {}])
(ann
 js/CanvasPattern
 (HJSObj :mandatory {prototype CanvasPattern, new [-> CanvasPattern]}))
(ann-jsnominal
 HTMLHRElement
 [[]
  :ancestors
  #{DOML2DeprecatedSizeProperty DOML2DeprecatedColorProperty
    HTMLElement}
  :fields
  {width number, align string, noShade boolean}
  :methods
  {}])
(ann
 js/HTMLHRElement
 (HJSObj :mandatory {prototype HTMLHRElement, new [-> HTMLHRElement]}))
(ann-jsnominal
 HTMLObjectElement
 [[]
  :ancestors
  #{DOML2DeprecatedAlignmentStyle DOML2DeprecatedMarginStyle
    MSDataBindingRecordSetExtensions DOML2DeprecatedBorderStyle
    GetSVGDocument MSDataBindingExtensions HTMLElement}
  :fields
  {altHtml string,
   height string,
   standby string,
   data string,
   alt string,
   archive string,
   width string,
   codeType string,
   classid string,
   form HTMLFormElement,
   codeBase string,
   name string,
   contentDocument Document,
   BaseHref string,
   object Object,
   declare boolean,
   code string,
   useMap string,
   type string}
  :methods
  {}])
(ann
 js/HTMLObjectElement
 (HJSObj
  :mandatory
  {prototype HTMLObjectElement, new [-> HTMLObjectElement]}))
(ann-jsnominal
 HTMLEmbedElement
 [[]
  :ancestors
  #{GetSVGDocument HTMLElement}
  :fields
  {width string,
   palette string,
   src string,
   name string,
   pluginspage string,
   height string,
   units string}
  :methods
  {}])
(ann
 js/HTMLEmbedElement
 (HJSObj
  :mandatory
  {prototype HTMLEmbedElement, new [-> HTMLEmbedElement]}))
(ann-jsnominal
 StorageEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {oldValue any,
   newValue any,
   url string,
   storageArea Storage,
   key string}
  :methods
  {initStorageEvent
   [string boolean boolean string any any string Storage -> void]}])
(ann
 js/StorageEvent
 (HJSObj :mandatory {prototype StorageEvent, new [-> StorageEvent]}))
(ann-jsnominal
 CharacterData
 [[]
  :ancestors
  #{Node}
  :fields
  {length number, data string}
  :methods
  {deleteData [number number -> void],
   replaceData [number number string -> void],
   appendData [string -> void],
   insertData [number string -> void],
   substringData [number number -> string]}])
(ann
 js/CharacterData
 (HJSObj :mandatory {prototype CharacterData, new [-> CharacterData]}))
(ann-jsnominal
 HTMLOptGroupElement
 [[]
  :ancestors
  #{MSDataBindingExtensions HTMLElement}
  :fields
  {index number,
   defaultSelected boolean,
   text string,
   value string,
   form HTMLFormElement,
   label string,
   selected boolean}
  :methods
  {}])
(ann
 js/HTMLOptGroupElement
 (HJSObj
  :mandatory
  {prototype HTMLOptGroupElement, new [-> HTMLOptGroupElement]}))
(ann-jsnominal
 HTMLIsIndexElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {form HTMLFormElement, action string, prompt string}
  :methods
  {}])
(ann
 js/HTMLIsIndexElement
 (HJSObj
  :mandatory
  {prototype HTMLIsIndexElement, new [-> HTMLIsIndexElement]}))
(ann-jsnominal
 SVGPathSegLinetoRel
 [[] :ancestors #{SVGPathSeg} :fields {y number, x number} :methods {}])
(ann
 js/SVGPathSegLinetoRel
 (HJSObj
  :mandatory
  {prototype SVGPathSegLinetoRel, new [-> SVGPathSegLinetoRel]}))
(ann-jsnominal
 DOMException
 [[]
  :ancestors
  #{}
  :fields
  {HIERARCHY_REQUEST_ERR number,
   INDEX_SIZE_ERR number,
   INVALID_CHARACTER_ERR number,
   PARSE_ERR number,
   INUSE_ATTRIBUTE_ERR number,
   VALIDATION_ERR number,
   ABORT_ERR number,
   NAMESPACE_ERR number,
   NETWORK_ERR number,
   NO_MODIFICATION_ALLOWED_ERR number,
   NOT_FOUND_ERR number,
   SERIALIZE_ERR number,
   SECURITY_ERR number,
   WRONG_DOCUMENT_ERR number,
   DOMSTRING_SIZE_ERR number,
   URL_MISMATCH_ERR number,
   INVALID_MODIFICATION_ERR number,
   NO_DATA_ALLOWED_ERR number,
   QUOTA_EXCEEDED_ERR number,
   NOT_SUPPORTED_ERR number,
   INVALID_STATE_ERR number,
   code number,
   SYNTAX_ERR number,
   message string,
   TYPE_MISMATCH_ERR number,
   INVALID_ACCESS_ERR number}
  :methods
  {toString [-> string]}])
(ann
 js/DOMException
 (HJSObj
  :mandatory
  {HIERARCHY_REQUEST_ERR number,
   new [-> DOMException],
   INDEX_SIZE_ERR number,
   prototype DOMException,
   INVALID_CHARACTER_ERR number,
   PARSE_ERR number,
   INUSE_ATTRIBUTE_ERR number,
   VALIDATION_ERR number,
   ABORT_ERR number,
   NAMESPACE_ERR number,
   NETWORK_ERR number,
   NO_MODIFICATION_ALLOWED_ERR number,
   NOT_FOUND_ERR number,
   SERIALIZE_ERR number,
   SECURITY_ERR number,
   WRONG_DOCUMENT_ERR number,
   DOMSTRING_SIZE_ERR number,
   URL_MISMATCH_ERR number,
   INVALID_MODIFICATION_ERR number,
   NO_DATA_ALLOWED_ERR number,
   QUOTA_EXCEEDED_ERR number,
   NOT_SUPPORTED_ERR number,
   INVALID_STATE_ERR number,
   SYNTAX_ERR number,
   TYPE_MISMATCH_ERR number,
   INVALID_ACCESS_ERR number}))
(ann-jsnominal
 SVGAnimatedBoolean
 [[]
  :ancestors
  #{}
  :fields
  {animVal boolean, baseVal boolean}
  :methods
  {}])
(ann
 js/SVGAnimatedBoolean
 (HJSObj
  :mandatory
  {prototype SVGAnimatedBoolean, new [-> SVGAnimatedBoolean]}))
(ann-jsnominal
 MSCompatibleInfoCollection
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> MSCompatibleInfo]}])
(ann
 js/MSCompatibleInfoCollection
 (HJSObj
  :mandatory
  {prototype MSCompatibleInfoCollection,
   new [-> MSCompatibleInfoCollection]}))
(ann-jsnominal
 SVGSwitchElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement
    SVGTransformable SVGTests SVGLangSpace}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGSwitchElement
 (HJSObj
  :mandatory
  {prototype SVGSwitchElement, new [-> SVGSwitchElement]}))
(ann-jsnominal
 SVGPreserveAspectRatio
 [[]
  :ancestors
  #{}
  :fields
  {SVG_PRESERVEASPECTRATIO_NONE number,
   SVG_PRESERVEASPECTRATIO_XMAXYMAX number,
   SVG_PRESERVEASPECTRATIO_XMINYMIN number,
   SVG_PRESERVEASPECTRATIO_XMIDYMAX number,
   SVG_PRESERVEASPECTRATIO_XMAXYMID number,
   meetOrSlice number,
   SVG_MEETORSLICE_MEET number,
   SVG_PRESERVEASPECTRATIO_XMIDYMID number,
   SVG_PRESERVEASPECTRATIO_UNKNOWN number,
   SVG_MEETORSLICE_SLICE number,
   SVG_PRESERVEASPECTRATIO_XMINYMID number,
   SVG_PRESERVEASPECTRATIO_XMIDYMIN number,
   SVG_PRESERVEASPECTRATIO_XMINYMAX number,
   SVG_MEETORSLICE_UNKNOWN number,
   SVG_PRESERVEASPECTRATIO_XMAXYMIN number,
   align number}
  :methods
  {}])
(ann
 js/SVGPreserveAspectRatio
 (HJSObj
  :mandatory
  {SVG_PRESERVEASPECTRATIO_NONE number,
   new [-> SVGPreserveAspectRatio],
   SVG_PRESERVEASPECTRATIO_XMAXYMAX number,
   prototype SVGPreserveAspectRatio,
   SVG_PRESERVEASPECTRATIO_XMINYMIN number,
   SVG_PRESERVEASPECTRATIO_XMIDYMAX number,
   SVG_PRESERVEASPECTRATIO_XMAXYMID number,
   SVG_MEETORSLICE_MEET number,
   SVG_PRESERVEASPECTRATIO_XMIDYMID number,
   SVG_PRESERVEASPECTRATIO_UNKNOWN number,
   SVG_MEETORSLICE_SLICE number,
   SVG_PRESERVEASPECTRATIO_XMINYMID number,
   SVG_PRESERVEASPECTRATIO_XMIDYMIN number,
   SVG_PRESERVEASPECTRATIO_XMINYMAX number,
   SVG_MEETORSLICE_UNKNOWN number,
   SVG_PRESERVEASPECTRATIO_XMAXYMIN number}))
(ann-jsnominal
 Attr
 [[]
  :ancestors
  #{Node}
  :fields
  {expando boolean,
   specified boolean,
   ownerElement Element,
   value string,
   name string}
  :methods
  {}])
(ann js/Attr (HJSObj :mandatory {prototype Attr, new [-> Attr]}))
(ann-jsnominal
 PerformanceNavigation
 [[]
  :ancestors
  #{}
  :fields
  {redirectCount number,
   type number,
   TYPE_RELOAD number,
   TYPE_RESERVED number,
   TYPE_BACK_FORWARD number,
   TYPE_NAVIGATE number}
  :methods
  {toJSON [-> any]}])
(ann
 js/PerformanceNavigation
 (HJSObj
  :mandatory
  {prototype PerformanceNavigation,
   new [-> PerformanceNavigation],
   TYPE_RELOAD number,
   TYPE_RESERVED number,
   TYPE_BACK_FORWARD number,
   TYPE_NAVIGATE number}))
(ann-jsnominal
 SVGStopElement
 [[]
  :ancestors
  #{SVGStylable SVGElement}
  :fields
  {offset SVGAnimatedNumber}
  :methods
  {}])
(ann
 js/SVGStopElement
 (HJSObj
  :mandatory
  {prototype SVGStopElement, new [-> SVGStopElement]}))
(ann-jsnominal
 PositionCallback
 [[] :ancestors #{} :fields {} :methods {call [Position -> void]}])
(ann-jsnominal
 SVGSymbolElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGStylable SVGElement SVGFitToViewBox
    SVGLangSpace}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGSymbolElement
 (HJSObj
  :mandatory
  {prototype SVGSymbolElement, new [-> SVGSymbolElement]}))
(ann-jsnominal
 SVGElementInstanceList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> SVGElementInstance]}])
(ann
 js/SVGElementInstanceList
 (HJSObj
  :mandatory
  {prototype SVGElementInstanceList, new [-> SVGElementInstanceList]}))
(ann-jsnominal
 CSSRuleList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> CSSRule]}])
(ann
 js/CSSRuleList
 (HJSObj :mandatory {prototype CSSRuleList, new [-> CSSRuleList]}))
(ann-jsnominal
 MSDataBindingRecordSetExtensions
 [[]
  :ancestors
  #{}
  :fields
  {recordset Object}
  :methods
  {namedRecordset (Fn [string -> Object] [string any -> Object])}])
(ann-jsnominal
 LinkStyle
 [[]
  :ancestors
  #{}
  :fields
  {styleSheet StyleSheet, sheet StyleSheet}
  :methods
  {}])
(ann-jsnominal
 HTMLVideoElement
 [[]
  :ancestors
  #{HTMLMediaElement}
  :fields
  {width number,
   videoWidth number,
   videoHeight number,
   height number,
   poster string}
  :methods
  {}])
(ann
 js/HTMLVideoElement
 (HJSObj
  :mandatory
  {prototype HTMLVideoElement, new [-> HTMLVideoElement]}))
(ann-jsnominal
 ClientRectList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> ClientRect]}])
(ann
 js/ClientRectList
 (HJSObj
  :mandatory
  {prototype ClientRectList, new [-> ClientRectList]}))
(ann-jsnominal
 SVGMaskElement
 [[]
  :ancestors
  #{SVGExternalResourcesRequired SVGUnitTypes SVGStylable SVGElement
    SVGTests SVGLangSpace}
  :fields
  {y SVGAnimatedLength,
   width SVGAnimatedLength,
   maskUnits SVGAnimatedEnumeration,
   maskContentUnits SVGAnimatedEnumeration,
   x SVGAnimatedLength,
   height SVGAnimatedLength}
  :methods
  {}])
(ann
 js/SVGMaskElement
 (HJSObj
  :mandatory
  {prototype SVGMaskElement, new [-> SVGMaskElement]}))
(ann-jsnominal External [[] :ancestors #{} :fields {} :methods {}])
(ann
 js/External
 (HJSObj :mandatory {prototype External, new [-> External]}))
(Value "dragend")
(Value "keydown")
(Value "dragover")
(Value "keyup")
(Value "reset")
(Value "mouseup")
(Value "dragstart")
(Value "drag")
(Value "mouseover")
(Value "dragleave")
(Value "afterprint")
(Value "pause")
(ann
 js/Audio
 (HJSObj
  :mandatory
  {new (Fn [-> HTMLAudioElement] [string -> HTMLAudioElement])}))
(ann
 js/Option
 (HJSObj
  :mandatory
  {new
   (Fn
    [-> HTMLOptionElement]
    [string -> HTMLOptionElement]
    [string string -> HTMLOptionElement]
    [string string boolean -> HTMLOptionElement]
    [string string boolean boolean -> HTMLOptionElement])}))
(ann
 js/Image
 (HJSObj
  :mandatory
  {new
   (Fn
    [-> HTMLImageElement]
    [number -> HTMLImageElement]
    [number number -> HTMLImageElement])}))
(ann js/ondragend [DragEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"dragend\"") [DragEvent -> any] -> void]
  [(Value "\"dragend\"") [DragEvent -> any] boolean -> void]))
(ann js/onkeydown [KeyboardEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"keydown\"") [KeyboardEvent -> any] -> void]
  [(Value "\"keydown\"") [KeyboardEvent -> any] boolean -> void]))
(ann js/ondragover [DragEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"dragover\"") [DragEvent -> any] -> void]
  [(Value "\"dragover\"") [DragEvent -> any] boolean -> void]))
(ann js/onkeyup [KeyboardEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"keyup\"") [KeyboardEvent -> any] -> void]
  [(Value "\"keyup\"") [KeyboardEvent -> any] boolean -> void]))
(ann js/onreset [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"reset\"") [Event -> any] -> void]
  [(Value "\"reset\"") [Event -> any] boolean -> void]))
(ann js/onmouseup [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mouseup\"") [MouseEvent -> any] -> void]
  [(Value "\"mouseup\"") [MouseEvent -> any] boolean -> void]))
(ann js/ondragstart [DragEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"dragstart\"") [DragEvent -> any] -> void]
  [(Value "\"dragstart\"") [DragEvent -> any] boolean -> void]))
(ann js/ondrag [DragEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"drag\"") [DragEvent -> any] -> void]
  [(Value "\"drag\"") [DragEvent -> any] boolean -> void]))
(ann js/screenX number)
(ann js/onmouseover [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mouseover\"") [MouseEvent -> any] -> void]
  [(Value "\"mouseover\"") [MouseEvent -> any] boolean -> void]))
(ann js/ondragleave [DragEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"dragleave\"") [DragEvent -> any] -> void]
  [(Value "\"dragleave\"") [DragEvent -> any] boolean -> void]))
(ann js/history History)
(ann js/pageXOffset number)
(ann js/name string)
(ann js/onafterprint [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"afterprint\"") [Event -> any] -> void]
  [(Value "\"afterprint\"") [Event -> any] boolean -> void]))
(ann js/onpause [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"pause\"") [Event -> any] -> void]
  [(Value "\"pause\"") [Event -> any] boolean -> void]))
(ann js/onbeforeprint [Event -> any])
(Value "beforeprint")
(Value "mousedown")
(Value "seeked")
(Value "click")
(Value "waiting")
(Value "online")
(Value "durationchange")
(Value "blur")
(Value "emptied")
(Value "seeking")
(Value "canplay")
(Value "stalled")
(Value "mousemove")
(ann
 js/addEventListener
 (Fn
  [(Value "\"beforeprint\"") [Event -> any] -> void]
  [(Value "\"beforeprint\"") [Event -> any] boolean -> void]))
(ann js/top Window)
(ann js/onmousedown [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mousedown\"") [MouseEvent -> any] -> void]
  [(Value "\"mousedown\"") [MouseEvent -> any] boolean -> void]))
(ann js/onseeked [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"seeked\"") [Event -> any] -> void]
  [(Value "\"seeked\"") [Event -> any] boolean -> void]))
(ann js/opener Window)
(ann js/onclick [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"click\"") [MouseEvent -> any] -> void]
  [(Value "\"click\"") [MouseEvent -> any] boolean -> void]))
(ann js/innerHeight number)
(ann js/onwaiting [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"waiting\"") [Event -> any] -> void]
  [(Value "\"waiting\"") [Event -> any] boolean -> void]))
(ann js/ononline [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"online\"") [Event -> any] -> void]
  [(Value "\"online\"") [Event -> any] boolean -> void]))
(ann js/ondurationchange [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"durationchange\"") [Event -> any] -> void]
  [(Value "\"durationchange\"") [Event -> any] boolean -> void]))
(ann js/frames Window)
(ann js/onblur [FocusEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"blur\"") [FocusEvent -> any] -> void]
  [(Value "\"blur\"") [FocusEvent -> any] boolean -> void]))
(ann js/onemptied [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"emptied\"") [Event -> any] -> void]
  [(Value "\"emptied\"") [Event -> any] boolean -> void]))
(ann js/onseeking [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"seeking\"") [Event -> any] -> void]
  [(Value "\"seeking\"") [Event -> any] boolean -> void]))
(ann js/oncanplay [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"canplay\"") [Event -> any] -> void]
  [(Value "\"canplay\"") [Event -> any] boolean -> void]))
(ann js/outerWidth number)
(ann js/onstalled [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"stalled\"") [Event -> any] -> void]
  [(Value "\"stalled\"") [Event -> any] boolean -> void]))
(ann js/onmousemove [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mousemove\"") [MouseEvent -> any] -> void]
  [(Value "\"mousemove\"") [MouseEvent -> any] boolean -> void]))
(ann js/innerWidth number)
(ann js/onoffline [Event -> any])
(Value "offline")
(Value "beforeunload")
(Value "ratechange")
(Value "storage")
(Value "loadstart")
(Value "dragenter")
(Value "submit")
(Value "progress")
(Value "dblclick")
(Value "contextmenu")
(Value "change")
(Value "loadedmetadata")
(Value "play")
(ann
 js/addEventListener
 (Fn
  [(Value "\"offline\"") [Event -> any] -> void]
  [(Value "\"offline\"") [Event -> any] boolean -> void]))
(ann js/length number)
(ann js/screen Screen)
(ann js/onbeforeunload [BeforeUnloadEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"beforeunload\"") [BeforeUnloadEvent -> any] -> void]
  [(Value "\"beforeunload\"")
   [BeforeUnloadEvent -> any]
   boolean
   ->
   void]))
(ann js/onratechange [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"ratechange\"") [Event -> any] -> void]
  [(Value "\"ratechange\"") [Event -> any] boolean -> void]))
(ann js/onstorage [StorageEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"storage\"") [StorageEvent -> any] -> void]
  [(Value "\"storage\"") [StorageEvent -> any] boolean -> void]))
(ann js/onloadstart [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"loadstart\"") [Event -> any] -> void]
  [(Value "\"loadstart\"") [Event -> any] boolean -> void]))
(ann js/ondragenter [DragEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"dragenter\"") [DragEvent -> any] -> void]
  [(Value "\"dragenter\"") [DragEvent -> any] boolean -> void]))
(ann js/onsubmit [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"submit\"") [Event -> any] -> void]
  [(Value "\"submit\"") [Event -> any] boolean -> void]))
(ann js/self Window)
(ann js/document Document)
(ann js/onprogress [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"progress\"") [any -> any] -> void]
  [(Value "\"progress\"") [any -> any] boolean -> void]))
(ann js/ondblclick [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"dblclick\"") [MouseEvent -> any] -> void]
  [(Value "\"dblclick\"") [MouseEvent -> any] boolean -> void]))
(ann js/pageYOffset number)
(ann js/oncontextmenu [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"contextmenu\"") [MouseEvent -> any] -> void]
  [(Value "\"contextmenu\"") [MouseEvent -> any] boolean -> void]))
(ann js/onchange [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"change\"") [Event -> any] -> void]
  [(Value "\"change\"") [Event -> any] boolean -> void]))
(ann js/onloadedmetadata [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"loadedmetadata\"") [Event -> any] -> void]
  [(Value "\"loadedmetadata\"") [Event -> any] boolean -> void]))
(ann js/onplay [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"play\"") [Event -> any] -> void]
  [(Value "\"play\"") [Event -> any] boolean -> void]))
(ann js/onerror ErrorEventHandler)
(ann js/onplaying [Event -> any])
(Value "playing")
(Value "canplaythrough")
(Value "abort")
(Value "readystatechange")
(Value "keypress")
(Value "loadeddata")
(Value "suspend")
(Value "focus")
(Value "message")
(Value "timeupdate")
(Value "resize")
(Value "select")
(Value "drop")
(ann
 js/addEventListener
 (Fn
  [(Value "\"playing\"") [Event -> any] -> void]
  [(Value "\"playing\"") [Event -> any] boolean -> void]))
(ann js/parent Window)
(ann js/location Location)
(ann js/oncanplaythrough [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"canplaythrough\"") [Event -> any] -> void]
  [(Value "\"canplaythrough\"") [Event -> any] boolean -> void]))
(ann js/onabort [UIEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"abort\"") [UIEvent -> any] -> void]
  [(Value "\"abort\"") [UIEvent -> any] boolean -> void]))
(ann js/onreadystatechange [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"readystatechange\"") [Event -> any] -> void]
  [(Value "\"readystatechange\"") [Event -> any] boolean -> void]))
(ann js/outerHeight number)
(ann js/onkeypress [KeyboardEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"keypress\"") [KeyboardEvent -> any] -> void]
  [(Value "\"keypress\"") [KeyboardEvent -> any] boolean -> void]))
(ann js/frameElement Element)
(ann js/onloadeddata [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"loadeddata\"") [Event -> any] -> void]
  [(Value "\"loadeddata\"") [Event -> any] boolean -> void]))
(ann js/onsuspend [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"suspend\"") [Event -> any] -> void]
  [(Value "\"suspend\"") [Event -> any] boolean -> void]))
(ann js/window Window)
(ann js/onfocus [FocusEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"focus\"") [FocusEvent -> any] -> void]
  [(Value "\"focus\"") [FocusEvent -> any] boolean -> void]))
(ann js/onmessage [MessageEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"message\"") [MessageEvent -> any] -> void]
  [(Value "\"message\"") [MessageEvent -> any] boolean -> void]))
(ann js/ontimeupdate [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"timeupdate\"") [Event -> any] -> void]
  [(Value "\"timeupdate\"") [Event -> any] boolean -> void]))
(ann js/onresize [UIEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"resize\"") [UIEvent -> any] -> void]
  [(Value "\"resize\"") [UIEvent -> any] boolean -> void]))
(ann js/onselect [UIEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"select\"") [UIEvent -> any] -> void]
  [(Value "\"select\"") [UIEvent -> any] boolean -> void]))
(ann js/navigator Navigator)
(ann js/styleMedia StyleMedia)
(ann js/ondrop [DragEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"drop\"") [DragEvent -> any] -> void]
  [(Value "\"drop\"") [DragEvent -> any] boolean -> void]))
(Value "mouseout")
(Value "ended")
(Value "hashchange")
(Value "unload")
(Value "scroll")
(Value "mousewheel")
(Value "load")
(Value "volumechange")
(Value "input")
(ann js/onmouseout [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mouseout\"") [MouseEvent -> any] -> void]
  [(Value "\"mouseout\"") [MouseEvent -> any] boolean -> void]))
(ann js/onended [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"ended\"") [Event -> any] -> void]
  [(Value "\"ended\"") [Event -> any] boolean -> void]))
(ann js/onhashchange [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"hashchange\"") [Event -> any] -> void]
  [(Value "\"hashchange\"") [Event -> any] boolean -> void]))
(ann js/onunload [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"unload\"") [Event -> any] -> void]
  [(Value "\"unload\"") [Event -> any] boolean -> void]))
(ann js/onscroll [UIEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"scroll\"") [UIEvent -> any] -> void]
  [(Value "\"scroll\"") [UIEvent -> any] boolean -> void]))
(ann js/screenY number)
(ann js/onmousewheel [MouseWheelEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mousewheel\"") [MouseWheelEvent -> any] -> void]
  [(Value "\"mousewheel\"") [MouseWheelEvent -> any] boolean -> void]))
(ann js/onload [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"load\"") [Event -> any] -> void]
  [(Value "\"load\"") [Event -> any] boolean -> void]))
(ann js/onvolumechange [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"volumechange\"") [Event -> any] -> void]
  [(Value "\"volumechange\"") [Event -> any] boolean -> void]))
(ann js/oninput [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"input\"") [Event -> any] -> void]
  [(Value "\"input\"") [Event -> any] boolean -> void]))
(ann js/performance Performance)
(ann js/alert (Fn [-> void] [string -> void]))
(ann js/scroll (Fn [-> void] [number -> void] [number number -> void]))
(ann js/focus [-> void])
(ann
 js/scrollTo
 (Fn [-> void] [number -> void] [number number -> void]))
(ann js/print [-> void])
(ann
 js/prompt
 (Fn [-> string] [string -> string] [string string -> string]))
(ann js/toString [-> string])
(ann
 js/open
 (Fn
  [-> Window]
  [string -> Window]
  [string string -> Window]
  [string string string -> Window]
  [string string string boolean -> Window]))
(ann
 js/scrollBy
 (Fn [-> void] [number -> void] [number number -> void]))
(ann js/confirm (Fn [-> boolean] [string -> boolean]))
(ann js/close [-> void])
(ann js/postMessage (Fn [any string -> void] [any string any -> void]))
(Value "mouseleave")
(Value "mouseenter")
(Value "help")
(Value "focusout")
(Value "focusin")
(ann
 js/showModalDialog
 (Fn
  [-> any]
  [string -> any]
  [string any -> any]
  [string any any -> any]))
(ann js/blur [-> void])
(ann js/getSelection [-> Selection])
(ann
 js/getComputedStyle
 (Fn
  [Element -> CSSStyleDeclaration]
  [Element string -> CSSStyleDeclaration]))
(ann
 js/addEventListener
 (Fn
  [string EventListener -> void]
  [string EventListener boolean -> void]))
(ann
 js/removeEventListener
 (Fn
  [string EventListener -> void]
  [string EventListener boolean -> void]))
(ann js/dispatchEvent [Event -> boolean])
(ann js/attachEvent [string EventListener -> boolean])
(ann js/detachEvent [string EventListener -> void])
(ann js/localStorage Storage)
(ann js/status string)
(ann js/onmouseleave [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mouseleave\"") [MouseEvent -> any] -> void]
  [(Value "\"mouseleave\"") [MouseEvent -> any] boolean -> void]))
(ann js/screenLeft number)
(ann js/offscreenBuffering any)
(ann js/maxConnectionsPerServer number)
(ann js/onmouseenter [MouseEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mouseenter\"") [MouseEvent -> any] -> void]
  [(Value "\"mouseenter\"") [MouseEvent -> any] boolean -> void]))
(ann js/clipboardData DataTransfer)
(ann js/defaultStatus string)
(ann js/clientInformation Navigator)
(ann js/closed boolean)
(ann js/onhelp [Event -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"help\"") [Event -> any] -> void]
  [(Value "\"help\"") [Event -> any] boolean -> void]))
(ann js/external External)
(ann js/event MSEventObj)
(ann js/onfocusout [FocusEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"focusout\"") [FocusEvent -> any] -> void]
  [(Value "\"focusout\"") [FocusEvent -> any] boolean -> void]))
(ann js/screenTop number)
(ann js/onfocusin [FocusEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"focusin\"") [FocusEvent -> any] -> void]
  [(Value "\"focusin\"") [FocusEvent -> any] boolean -> void]))
(ann
 js/showModelessDialog
 (Fn
  [-> Window]
  [string -> Window]
  [string any -> Window]
  [string any any -> Window]))
(ann js/navigate [string -> void])
(ann
 js/resizeBy
 (Fn [-> void] [number -> void] [number number -> void]))
(ann js/item [any -> any])
(ann
 js/resizeTo
 (Fn [-> void] [number -> void] [number number -> void]))
(ann js/createPopup (Fn [-> MSPopupWindow] [any -> MSPopupWindow]))
(ann js/toStaticHTML [string -> string])
(ann js/execScript (Fn [string -> any] [string string -> any]))
(ann js/msWriteProfilerMark [string -> void])
(ann js/moveTo (Fn [-> void] [number -> void] [number number -> void]))
(ann js/moveBy (Fn [-> void] [number -> void] [number number -> void]))
(ann
 js/showHelp
 (Fn [string -> void] [string any -> void] [string any string -> void]))
(ann js/sessionStorage Storage)
(ann js/clearTimeout [number -> void])
(ann js/setTimeout (Fn [any -> number] [any any any * -> number]))
(ann js/clearInterval [number -> void])
(ann js/setInterval (Fn [any -> number] [any any any * -> number]))
(ann-jsnominal
 ObjectURLOptions
 [[] :ancestors #{} :fields {oneTimeOnly boolean} :methods {}])
(Value "popstate")
(ann-jsnominal
 HTMLBodyElement
 [[]
  :ancestors
  #{}
  :fields
  {onpopstate [PopStateEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [(Value "\"popstate\"") [PopStateEvent -> any] -> void]
    [(Value "\"popstate\"") [PopStateEvent -> any] boolean -> void])}])
(ann-jsnominal
 MSGestureEvent
 [[]
  :ancestors
  #{UIEvent}
  :fields
  {scale number,
   translationY number,
   offsetY number,
   velocityX number,
   rotation number,
   offsetX number,
   MSGESTURE_FLAG_BEGIN number,
   MSGESTURE_FLAG_INERTIA number,
   MSGESTURE_FLAG_NONE number,
   hwTimestamp number,
   translationX number,
   velocityAngular number,
   velocityExpansion number,
   MSGESTURE_FLAG_CANCEL number,
   MSGESTURE_FLAG_END number,
   expansion number,
   screenX number,
   screenY number,
   clientX number,
   clientY number,
   gestureObject any,
   velocityY number}
  :methods
  {initGestureEvent
   [string
    boolean
    boolean
    Window
    number
    number
    number
    number
    number
    number
    number
    number
    number
    number
    number
    number
    number
    number
    number
    number
    number
    ->
    void]}])
(ann
 js/MSGestureEvent
 (HJSObj
  :mandatory
  {prototype MSGestureEvent,
   new [-> MSGestureEvent],
   MSGESTURE_FLAG_BEGIN number,
   MSGESTURE_FLAG_END number,
   MSGESTURE_FLAG_CANCEL number,
   MSGESTURE_FLAG_INERTIA number,
   MSGESTURE_FLAG_NONE number}))
(ann-jsnominal
 HTMLAnchorElement
 [[] :ancestors #{} :fields {text string} :methods {}])
(ann-jsnominal
 HTMLInputElement
 [[]
  :ancestors
  #{}
  :fields
  {step string,
   files FileList,
   validationMessage string,
   formTarget string,
   formAction string,
   placeholder string,
   valueAsNumber number,
   multiple boolean,
   pattern string,
   formMethod string,
   autofocus boolean,
   willValidate boolean,
   formNoValidate string,
   formEnctype string,
   max string,
   validity ValidityState,
   autocomplete string,
   list HTMLElement,
   min string,
   required boolean}
  :methods
  {checkValidity [-> boolean],
   stepDown (Fn [-> void] [number -> void]),
   stepUp (Fn [-> void] [number -> void]),
   setCustomValidity [string -> void]}])
(ann-jsnominal
 ErrorEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {colno number, filename string, lineno number, message string}
  :methods
  {initErrorEvent
   [string boolean boolean string string number -> void]}])
(ann
 js/ErrorEvent
 (HJSObj :mandatory {prototype ErrorEvent, new [-> ErrorEvent]}))
(ann-jsnominal
 SVGFilterElement
 [[]
  :ancestors
  #{SVGURIReference SVGExternalResourcesRequired SVGUnitTypes
    SVGStylable SVGElement SVGLangSpace}
  :fields
  {y SVGAnimatedLength,
   width SVGAnimatedLength,
   filterResX SVGAnimatedInteger,
   filterUnits SVGAnimatedEnumeration,
   primitiveUnits SVGAnimatedEnumeration,
   x SVGAnimatedLength,
   height SVGAnimatedLength,
   filterResY SVGAnimatedInteger}
  :methods
  {setFilterRes [number number -> void]}])
(ann
 js/SVGFilterElement
 (HJSObj
  :mandatory
  {prototype SVGFilterElement, new [-> SVGFilterElement]}))
(ann-jsnominal
 TrackEvent
 [[] :ancestors #{Event} :fields {track any} :methods {}])
(ann
 js/TrackEvent
 (HJSObj :mandatory {prototype TrackEvent, new [-> TrackEvent]}))
(ann-jsnominal
 SVGFEMergeNodeElement
 [[]
  :ancestors
  #{SVGElement}
  :fields
  {in1 SVGAnimatedString}
  :methods
  {}])
(ann
 js/SVGFEMergeNodeElement
 (HJSObj
  :mandatory
  {prototype SVGFEMergeNodeElement, new [-> SVGFEMergeNodeElement]}))
(ann-jsnominal
 SVGFEFloodElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGFEFloodElement
 (HJSObj
  :mandatory
  {prototype SVGFEFloodElement, new [-> SVGFEFloodElement]}))
(ann-jsnominal
 MSGesture
 [[]
  :ancestors
  #{}
  :fields
  {target Element}
  :methods
  {addPointer [number -> void], stop [-> void]}])
(ann
 js/MSGesture
 (HJSObj :mandatory {prototype MSGesture, new [-> MSGesture]}))
(Value "enter")
(Value "exit")
(ann-jsnominal
 TextTrackCue
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {onenter [Event -> any],
   track TextTrack,
   endTime number,
   text string,
   pauseOnExit boolean,
   id string,
   startTime number,
   onexit [Event -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   getCueAsHTML [-> DocumentFragment]}])
(ann
 js/TextTrackCue
 (HJSObj :mandatory {prototype TextTrackCue, new [-> TextTrackCue]}))
(ann-jsnominal
 MSStreamReader
 [[]
  :ancestors
  #{MSBaseReader}
  :fields
  {error DOMError}
  :methods
  {readAsArrayBuffer (Fn [MSStream -> void] [MSStream number -> void]),
   readAsBlob (Fn [MSStream -> void] [MSStream number -> void]),
   readAsDataURL (Fn [MSStream -> void] [MSStream number -> void]),
   readAsText
   (Fn
    [MSStream -> void]
    [MSStream string -> void]
    [MSStream string number -> void])}])
(ann
 js/MSStreamReader
 (HJSObj
  :mandatory
  {prototype MSStreamReader, new [-> MSStreamReader]}))
(ann-jsnominal
 DOMTokenList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {contains [string -> boolean],
   remove [string -> void],
   toggle [string -> boolean],
   add [string -> void],
   item [number -> string],
   toString [-> string]}])
(ann
 js/DOMTokenList
 (HJSObj :mandatory {prototype DOMTokenList, new [-> DOMTokenList]}))
(ann-jsnominal
 EventException
 [[] :ancestors #{} :fields {name string} :methods {}])
(ann-jsnominal
 Performance
 [[] :ancestors #{} :fields {} :methods {now [-> number]}])
(ann-jsnominal
 SVGFEFuncAElement
 [[]
  :ancestors
  #{SVGComponentTransferFunctionElement}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGFEFuncAElement
 (HJSObj
  :mandatory
  {prototype SVGFEFuncAElement, new [-> SVGFEFuncAElement]}))
(ann-jsnominal
 SVGFETileElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {in1 SVGAnimatedString}
  :methods
  {}])
(ann
 js/SVGFETileElement
 (HJSObj
  :mandatory
  {prototype SVGFETileElement, new [-> SVGFETileElement]}))
(ann-jsnominal
 SVGFEBlendElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {SVG_FEBLEND_MODE_UNKNOWN number,
   SVG_FEBLEND_MODE_SCREEN number,
   mode SVGAnimatedEnumeration,
   SVG_FEBLEND_MODE_NORMAL number,
   in1 SVGAnimatedString,
   in2 SVGAnimatedString,
   SVG_FEBLEND_MODE_MULTIPLY number,
   SVG_FEBLEND_MODE_LIGHTEN number,
   SVG_FEBLEND_MODE_DARKEN number}
  :methods
  {}])
(ann
 js/SVGFEBlendElement
 (HJSObj
  :mandatory
  {prototype SVGFEBlendElement,
   new [-> SVGFEBlendElement],
   SVG_FEBLEND_MODE_DARKEN number,
   SVG_FEBLEND_MODE_UNKNOWN number,
   SVG_FEBLEND_MODE_MULTIPLY number,
   SVG_FEBLEND_MODE_NORMAL number,
   SVG_FEBLEND_MODE_SCREEN number,
   SVG_FEBLEND_MODE_LIGHTEN number}))
(ann-jsnominal
 WindowTimers
 [[] :ancestors #{WindowTimersExtension} :fields {} :methods {}])
(ann
 js/WindowTimers
 (HJSObj :mandatory {prototype WindowTimers, new [-> WindowTimers]}))
(ann-jsnominal
 CSSStyleDeclaration
 [[]
  :ancestors
  #{}
  :fields
  {msScrollLimitYMin any,
   backfaceVisibility string,
   msAnimationDirection string,
   transitionProperty string,
   transitionTimingFunction string,
   msGridRowAlign string,
   columnGap any,
   msOverflowStyle string,
   msScrollRails string,
   columnRuleWidth any,
   msFlowInto string,
   msGridColumnAlign string,
   msFlexPreferredSize string,
   msFlexOrder string,
   msTransitionDuration string,
   msTouchAction string,
   msContentZoomLimit string,
   msScrollSnapY string,
   msPerspectiveOrigin string,
   msTransition string,
   msScrollSnapPointsY string,
   animationPlayState string,
   msAnimation string,
   columnRule string,
   msAnimationDelay string,
   transformStyle string,
   msScrollSnapPointsX string,
   msGridRowSpan any,
   msContentZoomSnapType string,
   columnSpan string,
   textShadow string,
   floodOpacity string,
   msGridRow any,
   msFlexWrap string,
   msAnimationName string,
   msFlexNegative string,
   transitionDelay string,
   msContentZoomLimitMax any,
   msTouchSelect string,
   msTransitionDelay string,
   msWrapThrough string,
   msScrollLimitXMin any,
   animationName string,
   msHyphens string,
   msScrollSnapX string,
   columnRuleColor any,
   enableBackground string,
   columns string,
   columnWidth any,
   msTransitionProperty string,
   msWrapFlow string,
   columnFill string,
   msWrapMargin any,
   breakBefore string,
   columnRuleStyle string,
   animationDelay string,
   filter string,
   msFlexPack string,
   msAnimationPlayState string,
   msFlexLinePack string,
   msPerspective string,
   msFlexFlow string,
   msAnimationTimingFunction string,
   msHyphenateLimitZone any,
   lightingColor string,
   transitionDuration string,
   msScrollChaining string,
   animationTimingFunction string,
   msBackfaceVisibility string,
   animationDirection string,
   msContentZooming string,
   perspective string,
   msGridColumns string,
   breakInside string,
   msTransitionTimingFunction string,
   msFlowFrom string,
   msAnimationFillMode string,
   msHyphenateLimitLines any,
   msFontFeatureSettings string,
   msScrollLimitYMax any,
   columnCount any,
   msFlexItemAlign string,
   msAnimationDuration string,
   transformOrigin string,
   msFlexPositive string,
   msFlex string,
   animationIterationCount string,
   transform string,
   msTransformStyle string,
   msGridColumnSpan any,
   animationFillMode string,
   msScrollSnapType string,
   msUserSelect string,
   msFlexDirection string,
   fontFeatureSettings string,
   msScrollLimitXMax any,
   perspectiveOrigin string,
   msGridColumn any,
   transition string,
   msScrollLimit string,
   msFlexAlign string,
   msHyphenateLimitChars string,
   colorInterpolationFilters string,
   msContentZoomLimitMin any,
   breakAfter string,
   msAnimationIterationCount string,
   msContentZoomSnap string,
   msContentZoomChaining string,
   msHighContrastAdjust string,
   msContentZoomSnapPoints string,
   animation string,
   msScrollTranslation string,
   animationDuration string,
   msGridRows string,
   floodColor string}
  :methods
  {}])
(ann-jsnominal
 MessageChannel
 [[]
  :ancestors
  #{}
  :fields
  {port2 MessagePort, port1 MessagePort}
  :methods
  {}])
(ann
 js/MessageChannel
 (HJSObj
  :mandatory
  {prototype MessageChannel, new [-> MessageChannel]}))
(ann-jsnominal
 SVGFEMergeElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGFEMergeElement
 (HJSObj
  :mandatory
  {prototype SVGFEMergeElement, new [-> SVGFEMergeElement]}))
(ann-jsnominal
 Navigator
 [[]
  :ancestors
  #{MSFileSaver}
  :fields
  {msMaxTouchPoints number,
   msPointerEnabled boolean,
   msManipulationViewsEnabled boolean}
  :methods
  {msLaunchUri
   (Fn
    [string -> void]
    [string MSLaunchUriCallback -> void]
    [string MSLaunchUriCallback MSLaunchUriCallback -> void])}])
(ann-jsnominal
 TransitionEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {propertyName string, elapsedTime number}
  :methods
  {initTransitionEvent [string boolean boolean string number -> void]}])
(ann
 js/TransitionEvent
 (HJSObj
  :mandatory
  {prototype TransitionEvent, new [-> TransitionEvent]}))
(ann-jsnominal
 MediaQueryList
 [[]
  :ancestors
  #{}
  :fields
  {matches boolean, media string}
  :methods
  {addListener [MediaQueryListListener -> void],
   removeListener [MediaQueryListListener -> void]}])
(ann
 js/MediaQueryList
 (HJSObj
  :mandatory
  {prototype MediaQueryList, new [-> MediaQueryList]}))
(ann-jsnominal
 DOMError
 [[]
  :ancestors
  #{}
  :fields
  {name string}
  :methods
  {toString [-> string]}])
(ann
 js/DOMError
 (HJSObj :mandatory {prototype DOMError, new [-> DOMError]}))
(ann-jsnominal
 CloseEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {wasClean boolean, reason string, code number}
  :methods
  {initCloseEvent
   [string boolean boolean boolean number string -> void]}])
(ann
 js/CloseEvent
 (HJSObj :mandatory {prototype CloseEvent, new [-> CloseEvent]}))
(Value "open")
(Value "message")
(Value "close")
(Value "error")
(ann-jsnominal
 WebSocket
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {OPEN number,
   onmessage [any -> any],
   protocol string,
   bufferedAmount number,
   extensions string,
   onopen [Event -> any],
   readyState number,
   CLOSING number,
   onclose [CloseEvent -> any],
   onerror [ErrorEvent -> any],
   binaryType string,
   CLOSED number,
   url string,
   CONNECTING number}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   close (Fn [-> void] [number -> void] [number string -> void]),
   send [any -> void]}])
(ann
 js/WebSocket
 (HJSObj
  :mandatory
  {prototype WebSocket,
   new [string (Seq string) -> WebSocket],
   OPEN number,
   CLOSING number,
   CONNECTING number,
   CLOSED number}))
(ann-jsnominal
 SVGFEPointLightElement
 [[]
  :ancestors
  #{SVGElement}
  :fields
  {y SVGAnimatedNumber, x SVGAnimatedNumber, z SVGAnimatedNumber}
  :methods
  {}])
(ann
 js/SVGFEPointLightElement
 (HJSObj
  :mandatory
  {prototype SVGFEPointLightElement, new [-> SVGFEPointLightElement]}))
(ann-jsnominal
 ProgressEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {loaded number, lengthComputable boolean, total number}
  :methods
  {initProgressEvent
   [string boolean boolean boolean number number -> void]}])
(ann
 js/ProgressEvent
 (HJSObj :mandatory {prototype ProgressEvent, new [-> ProgressEvent]}))
(ann-jsnominal
 IDBObjectStore
 [[]
  :ancestors
  #{}
  :fields
  {indexNames DOMStringList,
   name string,
   transaction IDBTransaction,
   keyPath string}
  :methods
  {add (Fn [any -> IDBRequest] [any any -> IDBRequest]),
   clear [-> IDBRequest],
   delete [any -> IDBRequest],
   openCursor
   (Fn [-> IDBRequest] [any -> IDBRequest] [any string -> IDBRequest]),
   createIndex
   (Fn [string string -> IDBIndex] [string string any -> IDBIndex]),
   count (Fn [-> IDBRequest] [any -> IDBRequest]),
   put (Fn [any -> IDBRequest] [any any -> IDBRequest]),
   deleteIndex [string -> void],
   get [any -> IDBRequest],
   index [string -> IDBIndex]}])
(ann
 js/IDBObjectStore
 (HJSObj
  :mandatory
  {prototype IDBObjectStore, new [-> IDBObjectStore]}))
(ann-jsnominal
 HTMLCanvasElement
 [[] :ancestors #{} :fields {} :methods {msToBlob [-> Blob]}])
(ann-jsnominal
 SVGFEGaussianBlurElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {stdDeviationX SVGAnimatedNumber,
   in1 SVGAnimatedString,
   stdDeviationY SVGAnimatedNumber}
  :methods
  {setStdDeviation [number number -> void]}])
(ann
 js/SVGFEGaussianBlurElement
 (HJSObj
  :mandatory
  {prototype SVGFEGaussianBlurElement,
   new [-> SVGFEGaussianBlurElement]}))
(ann-jsnominal
 SVGFilterPrimitiveStandardAttributes
 [[]
  :ancestors
  #{SVGStylable}
  :fields
  {y SVGAnimatedLength,
   width SVGAnimatedLength,
   x SVGAnimatedLength,
   height SVGAnimatedLength,
   result SVGAnimatedString}
  :methods
  {}])
(Value "mspointerdown")
(Value "msgotpointercapture")
(Value "msgesturedoubletap")
(Value "mspointerhover")
(Value "msgesturehold")
(Value "mspointermove")
(Value "msgesturechange")
(Value "msgesturestart")
(Value "mspointercancel")
(Value "msgestureend")
(Value "msgesturetap")
(Value "mspointerout")
(Value "msinertiastart")
(Value "mslostpointercapture")
(Value "mspointerover")
(Value "mspointerup")
(ann-jsnominal
 Element
 [[]
  :ancestors
  #{}
  :fields
  {onmspointerout [any -> any],
   onmsgestureend [any -> any],
   onmsgesturehold [any -> any],
   onmsgesturedoubletap [any -> any],
   onmsgesturestart [any -> any],
   onmspointerup [any -> any],
   onmspointerover [any -> any],
   onmsinertiastart [any -> any],
   onmsgesturechange [any -> any],
   onmspointermove [any -> any],
   msRegionOverflow string,
   onmspointerdown [any -> any],
   onmslostpointercapture [any -> any],
   onmspointerhover [any -> any],
   onmsgesturetap [any -> any],
   msContentZoomFactor number,
   onmsgotpointercapture [any -> any],
   onmspointercancel [any -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   msGetRegionContent [-> MSRangeCollection],
   msReleasePointerCapture [number -> void],
   msSetPointerCapture [number -> void]}])
(ann-jsnominal
 IDBVersionChangeEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {newVersion number, oldVersion number}
  :methods
  {}])
(ann
 js/IDBVersionChangeEvent
 (HJSObj
  :mandatory
  {prototype IDBVersionChangeEvent, new [-> IDBVersionChangeEvent]}))
(ann-jsnominal
 IDBIndex
 [[]
  :ancestors
  #{}
  :fields
  {unique boolean,
   name string,
   keyPath string,
   objectStore IDBObjectStore}
  :methods
  {count (Fn [-> IDBRequest] [any -> IDBRequest]),
   getKey [any -> IDBRequest],
   openKeyCursor
   (Fn
    [-> IDBRequest]
    [IDBKeyRange -> IDBRequest]
    [IDBKeyRange string -> IDBRequest]),
   get [any -> IDBRequest],
   openCursor
   (Fn
    [-> IDBRequest]
    [IDBKeyRange -> IDBRequest]
    [IDBKeyRange string -> IDBRequest])}])
(ann
 js/IDBIndex
 (HJSObj :mandatory {prototype IDBIndex, new [-> IDBIndex]}))
(ann-jsnominal
 WheelEvent
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {getCurrentPoint [Element -> void]}])
(ann-jsnominal
 FileList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> File]}])
(ann
 js/FileList
 (HJSObj :mandatory {prototype FileList, new [-> FileList]}))
(ann-jsnominal
 IDBCursor
 [[]
  :ancestors
  #{}
  :fields
  {source any,
   direction string,
   key any,
   primaryKey any,
   PREV string,
   PREV_NO_DUPLICATE string,
   NEXT string,
   NEXT_NO_DUPLICATE string}
  :methods
  {advance [number -> void],
   delete [-> IDBRequest],
   continue (Fn [-> void] [any -> void]),
   update [any -> IDBRequest]}])
(ann
 js/IDBCursor
 (HJSObj
  :mandatory
  {prototype IDBCursor,
   new [-> IDBCursor],
   PREV string,
   PREV_NO_DUPLICATE string,
   NEXT string,
   NEXT_NO_DUPLICATE string}))
(ann-jsnominal
 SVGFESpecularLightingElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {kernelUnitLengthY SVGAnimatedNumber,
   surfaceScale SVGAnimatedNumber,
   specularExponent SVGAnimatedNumber,
   in1 SVGAnimatedString,
   kernelUnitLengthX SVGAnimatedNumber,
   specularConstant SVGAnimatedNumber}
  :methods
  {}])
(ann
 js/SVGFESpecularLightingElement
 (HJSObj
  :mandatory
  {prototype SVGFESpecularLightingElement,
   new [-> SVGFESpecularLightingElement]}))
(ann-jsnominal
 File
 [[]
  :ancestors
  #{Blob}
  :fields
  {lastModifiedDate any, name string}
  :methods
  {}])
(ann js/File (HJSObj :mandatory {prototype File, new [-> File]}))
(ann-jsnominal
 URL
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {revokeObjectURL [string -> void],
   createObjectURL
   (Fn [any -> string] [any ObjectURLOptions -> string])}])
(ann js/URL URL)
(ann-jsnominal
 RangeException
 [[] :ancestors #{} :fields {name string} :methods {}])
(ann-jsnominal
 IDBCursorWithValue
 [[] :ancestors #{IDBCursor} :fields {value any} :methods {}])
(ann
 js/IDBCursorWithValue
 (HJSObj
  :mandatory
  {prototype IDBCursorWithValue, new [-> IDBCursorWithValue]}))
(ann-jsnominal
 HTMLTextAreaElement
 [[]
  :ancestors
  #{}
  :fields
  {validationMessage string,
   autofocus boolean,
   validity ValidityState,
   required boolean,
   maxLength number,
   willValidate boolean,
   placeholder string}
  :methods
  {checkValidity [-> boolean], setCustomValidity [string -> void]}])
(Value "progress")
(Value "error")
(Value "load")
(Value "timeout")
(Value "abort")
(Value "loadstart")
(Value "loadend")
(ann-jsnominal
 XMLHttpRequestEventTarget
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {onprogress [ProgressEvent -> any],
   onerror [ErrorEvent -> any],
   onload [any -> any],
   ontimeout [any -> any],
   onabort [any -> any],
   onloadstart [any -> any],
   onloadend [ProgressEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann
 js/XMLHttpRequestEventTarget
 (HJSObj
  :mandatory
  {prototype XMLHttpRequestEventTarget,
   new [-> XMLHttpRequestEventTarget]}))
(ann-jsnominal
 IDBEnvironment
 [[]
  :ancestors
  #{}
  :fields
  {msIndexedDB IDBFactory, indexedDB IDBFactory}
  :methods
  {}])
(Value "change")
(Value "addtrack")
(ann-jsnominal
 AudioTrackList
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {length number,
   onchange [any -> any],
   onaddtrack [TrackEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   getTrackById [string -> AudioTrack],
   item [number -> AudioTrack]}])
(ann
 js/AudioTrackList
 (HJSObj
  :mandatory
  {prototype AudioTrackList, new [-> AudioTrackList]}))
(Value "progress")
(Value "abort")
(Value "loadend")
(Value "error")
(Value "load")
(Value "loadstart")
(ann-jsnominal
 MSBaseReader
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {onloadend [ProgressEvent -> any],
   EMPTY number,
   readyState number,
   onload [any -> any],
   onprogress [ProgressEvent -> any],
   onerror [ErrorEvent -> any],
   onabort [any -> any],
   onloadstart [any -> any],
   DONE number,
   LOADING number,
   result any}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   abort [-> void]}])
(ann-jsnominal
 History
 [[]
  :ancestors
  #{}
  :fields
  {state any}
  :methods
  {replaceState (Fn [any string -> void] [any string string -> void]),
   pushState (Fn [any string -> void] [any string string -> void])}])
(ann-jsnominal
 SVGFEMorphologyElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {operator SVGAnimatedEnumeration,
   radiusX SVGAnimatedNumber,
   radiusY SVGAnimatedNumber,
   in1 SVGAnimatedString,
   SVG_MORPHOLOGY_OPERATOR_UNKNOWN number,
   SVG_MORPHOLOGY_OPERATOR_ERODE number,
   SVG_MORPHOLOGY_OPERATOR_DILATE number}
  :methods
  {}])
(ann
 js/SVGFEMorphologyElement
 (HJSObj
  :mandatory
  {prototype SVGFEMorphologyElement,
   new [-> SVGFEMorphologyElement],
   SVG_MORPHOLOGY_OPERATOR_UNKNOWN number,
   SVG_MORPHOLOGY_OPERATOR_ERODE number,
   SVG_MORPHOLOGY_OPERATOR_DILATE number}))
(ann-jsnominal
 HTMLSelectElement
 [[]
  :ancestors
  #{}
  :fields
  {validationMessage string,
   autofocus boolean,
   validity ValidityState,
   required boolean,
   willValidate boolean}
  :methods
  {checkValidity [-> boolean], setCustomValidity [string -> void]}])
(ann-jsnominal
 CSSRule
 [[]
  :ancestors
  #{}
  :fields
  {KEYFRAMES_RULE number, KEYFRAME_RULE number, VIEWPORT_RULE number}
  :methods
  {}])
(ann-jsnominal
 SVGFEFuncRElement
 [[]
  :ancestors
  #{SVGComponentTransferFunctionElement}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGFEFuncRElement
 (HJSObj
  :mandatory
  {prototype SVGFEFuncRElement, new [-> SVGFEFuncRElement]}))
(ann-jsnominal
 WindowTimersExtension
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {msSetImmediate [any any * -> number],
   clearImmediate [number -> void],
   msClearImmediate [number -> void],
   setImmediate [any any * -> number]}])
(ann-jsnominal
 SVGFEDisplacementMapElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {scale SVGAnimatedNumber,
   yChannelSelector SVGAnimatedEnumeration,
   in1 SVGAnimatedString,
   SVG_CHANNEL_B number,
   in2 SVGAnimatedString,
   SVG_CHANNEL_A number,
   SVG_CHANNEL_G number,
   xChannelSelector SVGAnimatedEnumeration,
   SVG_CHANNEL_R number,
   SVG_CHANNEL_UNKNOWN number}
  :methods
  {}])
(ann
 js/SVGFEDisplacementMapElement
 (HJSObj
  :mandatory
  {prototype SVGFEDisplacementMapElement,
   new [-> SVGFEDisplacementMapElement],
   SVG_CHANNEL_B number,
   SVG_CHANNEL_R number,
   SVG_CHANNEL_G number,
   SVG_CHANNEL_UNKNOWN number,
   SVG_CHANNEL_A number}))
(ann-jsnominal
 AnimationEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {animationName string, elapsedTime number}
  :methods
  {initAnimationEvent [string boolean boolean string number -> void]}])
(ann
 js/AnimationEvent
 (HJSObj
  :mandatory
  {prototype AnimationEvent, new [-> AnimationEvent]}))
(ann-jsnominal
 SVGComponentTransferFunctionElement
 [[]
  :ancestors
  #{SVGElement}
  :fields
  {SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE number,
   slope SVGAnimatedNumber,
   exponent SVGAnimatedNumber,
   intercept SVGAnimatedNumber,
   tableValues SVGAnimatedNumberList,
   SVG_FECOMPONENTTRANSFER_TYPE_LINEAR number,
   offset SVGAnimatedNumber,
   SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY number,
   SVG_FECOMPONENTTRANSFER_TYPE_TABLE number,
   SVG_FECOMPONENTTRANSFER_TYPE_GAMMA number,
   SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN number,
   amplitude SVGAnimatedNumber,
   type SVGAnimatedEnumeration}
  :methods
  {}])
(ann
 js/SVGComponentTransferFunctionElement
 (HJSObj
  :mandatory
  {prototype SVGComponentTransferFunctionElement,
   new [-> SVGComponentTransferFunctionElement],
   SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN number,
   SVG_FECOMPONENTTRANSFER_TYPE_TABLE number,
   SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY number,
   SVG_FECOMPONENTTRANSFER_TYPE_GAMMA number,
   SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE number,
   SVG_FECOMPONENTTRANSFER_TYPE_LINEAR number}))
(ann-jsnominal
 MSRangeCollection
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> Range]}])
(ann
 js/MSRangeCollection
 (HJSObj
  :mandatory
  {prototype MSRangeCollection, new [-> MSRangeCollection]}))
(ann-jsnominal
 SVGFEDistantLightElement
 [[]
  :ancestors
  #{SVGElement}
  :fields
  {azimuth SVGAnimatedNumber, elevation SVGAnimatedNumber}
  :methods
  {}])
(ann
 js/SVGFEDistantLightElement
 (HJSObj
  :mandatory
  {prototype SVGFEDistantLightElement,
   new [-> SVGFEDistantLightElement]}))
(ann-jsnominal
 SVGException
 [[] :ancestors #{} :fields {name string} :methods {}])
(ann-jsnominal
 SVGFEFuncBElement
 [[]
  :ancestors
  #{SVGComponentTransferFunctionElement}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGFEFuncBElement
 (HJSObj
  :mandatory
  {prototype SVGFEFuncBElement, new [-> SVGFEFuncBElement]}))
(ann-jsnominal
 IDBKeyRange
 [[]
  :ancestors
  #{}
  :fields
  {upper any, upperOpen boolean, lower any, lowerOpen boolean}
  :methods
  {bound
   (Fn
    [any any -> IDBKeyRange]
    [any any boolean -> IDBKeyRange]
    [any any boolean boolean -> IDBKeyRange]),
   only [any -> IDBKeyRange],
   lowerBound (Fn [any -> IDBKeyRange] [any boolean -> IDBKeyRange]),
   upperBound (Fn [any -> IDBKeyRange] [any boolean -> IDBKeyRange])}])
(ann
 js/IDBKeyRange
 (HJSObj :mandatory {prototype IDBKeyRange, new [-> IDBKeyRange]}))
(ann-jsnominal
 WindowConsole
 [[] :ancestors #{} :fields {console Console} :methods {}])
(Value "complete")
(Value "error")
(Value "abort")
(ann-jsnominal
 IDBTransaction
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {mode string,
   db IDBDatabase,
   oncomplete [Event -> any],
   VERSION_CHANGE string,
   onerror [ErrorEvent -> any],
   error DOMError,
   READ_ONLY string,
   onabort [any -> any],
   READ_WRITE string}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   abort [-> void],
   objectStore [string -> IDBObjectStore]}])
(ann
 js/IDBTransaction
 (HJSObj
  :mandatory
  {prototype IDBTransaction,
   new [-> IDBTransaction],
   READ_ONLY string,
   VERSION_CHANGE string,
   READ_WRITE string}))
(ann-jsnominal
 AudioTrack
 [[]
  :ancestors
  #{}
  :fields
  {kind string,
   language string,
   id string,
   label string,
   enabled boolean}
  :methods
  {}])
(ann
 js/AudioTrack
 (HJSObj :mandatory {prototype AudioTrack, new [-> AudioTrack]}))
(ann-jsnominal
 SVGFEConvolveMatrixElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {orderY SVGAnimatedInteger,
   orderX SVGAnimatedInteger,
   SVG_EDGEMODE_NONE number,
   SVG_EDGEMODE_DUPLICATE number,
   preserveAlpha SVGAnimatedBoolean,
   in1 SVGAnimatedString,
   kernelUnitLengthX SVGAnimatedNumber,
   kernelMatrix SVGAnimatedNumberList,
   kernelUnitLengthY SVGAnimatedNumber,
   SVG_EDGEMODE_WRAP number,
   SVG_EDGEMODE_UNKNOWN number,
   targetX SVGAnimatedInteger,
   edgeMode SVGAnimatedEnumeration,
   targetY SVGAnimatedInteger,
   divisor SVGAnimatedNumber,
   bias SVGAnimatedNumber}
  :methods
  {}])
(ann
 js/SVGFEConvolveMatrixElement
 (HJSObj
  :mandatory
  {prototype SVGFEConvolveMatrixElement,
   new [-> SVGFEConvolveMatrixElement],
   SVG_EDGEMODE_WRAP number,
   SVG_EDGEMODE_DUPLICATE number,
   SVG_EDGEMODE_UNKNOWN number,
   SVG_EDGEMODE_NONE number}))
(ann-jsnominal
 TextTrackCueList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> TextTrackCue], getCueById [string -> TextTrackCue]}])
(ann
 js/TextTrackCueList
 (HJSObj
  :mandatory
  {prototype TextTrackCueList, new [-> TextTrackCueList]}))
(ann-jsnominal
 CSSKeyframesRule
 [[]
  :ancestors
  #{CSSRule}
  :fields
  {name string, cssRules CSSRuleList}
  :methods
  {findRule [string -> CSSKeyframeRule],
   deleteRule [string -> void],
   appendRule [string -> void]}])
(ann
 js/CSSKeyframesRule
 (HJSObj
  :mandatory
  {prototype CSSKeyframesRule, new [-> CSSKeyframesRule]}))
(Value "mspointerdown")
(Value "msgesturedoubletap")
(Value "mspointerhover")
(Value "msgesturehold")
(Value "mspointermove")
(Value "msgesturechange")
(Value "msgesturestart")
(Value "mspointercancel")
(Value "msgestureend")
(Value "msgesturetap")
(Value "mspointerout")
(Value "msinertiastart")
(Value "mspointerover")
(Value "popstate")
(Value "mspointerup")
(ann-jsnominal
 Window
 [[]
  :ancestors
  #{WindowConsole WindowBase64 IDBEnvironment}
  :fields
  {onmspointerout [any -> any],
   onmsgestureend [any -> any],
   onmsgesturehold [any -> any],
   onmsgesturedoubletap [any -> any],
   msAnimationStartTime number,
   onmsgesturestart [any -> any],
   onmspointerup [any -> any],
   onmspointerover [any -> any],
   animationStartTime number,
   onmsinertiastart [any -> any],
   onmsgesturechange [any -> any],
   onmspointermove [any -> any],
   onmspointerdown [any -> any],
   applicationCache ApplicationCache,
   onmspointerhover [any -> any],
   onmsgesturetap [any -> any],
   onpopstate [PopStateEvent -> any],
   onmspointercancel [any -> any]}
  :methods
  {addEventListener
   (Fn
    [(Value "\"mspointerup\"") [any -> any] -> void]
    [(Value "\"mspointerup\"") [any -> any] boolean -> void]),
   msCancelRequestAnimationFrame [number -> void],
   matchMedia [string -> MediaQueryList],
   cancelAnimationFrame [number -> void],
   msIsStaticHTML [string -> boolean],
   msMatchMedia [string -> MediaQueryList],
   requestAnimationFrame [FrameRequestCallback -> number],
   msRequestAnimationFrame [FrameRequestCallback -> number]}])
(ann-jsnominal
 SVGFETurbulenceElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {SVG_STITCHTYPE_STITCH number,
   seed SVGAnimatedNumber,
   baseFrequencyX SVGAnimatedNumber,
   baseFrequencyY SVGAnimatedNumber,
   numOctaves SVGAnimatedInteger,
   SVG_STITCHTYPE_NOSTITCH number,
   SVG_STITCHTYPE_UNKNOWN number,
   SVG_TURBULENCE_TYPE_TURBULENCE number,
   SVG_TURBULENCE_TYPE_UNKNOWN number,
   stitchTiles SVGAnimatedEnumeration,
   SVG_TURBULENCE_TYPE_FRACTALNOISE number,
   type SVGAnimatedEnumeration}
  :methods
  {}])
(ann
 js/SVGFETurbulenceElement
 (HJSObj
  :mandatory
  {prototype SVGFETurbulenceElement,
   new [-> SVGFETurbulenceElement],
   SVG_STITCHTYPE_UNKNOWN number,
   SVG_STITCHTYPE_NOSTITCH number,
   SVG_TURBULENCE_TYPE_UNKNOWN number,
   SVG_TURBULENCE_TYPE_TURBULENCE number,
   SVG_TURBULENCE_TYPE_FRACTALNOISE number,
   SVG_STITCHTYPE_STITCH number}))
(ann-jsnominal
 TextTrackList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> TextTrack]}])
(ann
 js/TextTrackList
 (HJSObj :mandatory {prototype TextTrackList, new [-> TextTrackList]}))
(ann-jsnominal
 SVGFEFuncGElement
 [[]
  :ancestors
  #{SVGComponentTransferFunctionElement}
  :fields
  {}
  :methods
  {}])
(ann
 js/SVGFEFuncGElement
 (HJSObj
  :mandatory
  {prototype SVGFEFuncGElement, new [-> SVGFEFuncGElement]}))
(ann-jsnominal
 SVGFEColorMatrixElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {in1 SVGAnimatedString,
   type SVGAnimatedEnumeration,
   values SVGAnimatedNumberList,
   SVG_FECOLORMATRIX_TYPE_SATURATE number,
   SVG_FECOLORMATRIX_TYPE_UNKNOWN number,
   SVG_FECOLORMATRIX_TYPE_MATRIX number,
   SVG_FECOLORMATRIX_TYPE_HUEROTATE number,
   SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA number}
  :methods
  {}])
(ann
 js/SVGFEColorMatrixElement
 (HJSObj
  :mandatory
  {prototype SVGFEColorMatrixElement,
   new [-> SVGFEColorMatrixElement],
   SVG_FECOLORMATRIX_TYPE_SATURATE number,
   SVG_FECOLORMATRIX_TYPE_UNKNOWN number,
   SVG_FECOLORMATRIX_TYPE_MATRIX number,
   SVG_FECOLORMATRIX_TYPE_HUEROTATE number,
   SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA number}))
(ann-jsnominal
 Console
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {clear [-> void],
   profileEnd [-> void],
   msIsIndependentlyComposed [Element -> boolean],
   info (Fn [-> void] [any any * -> void]),
   profile (Fn [-> void] [string -> void]),
   assert
   (Fn [-> void] [boolean -> void] [boolean string any * -> void]),
   log (Fn [-> void] [any any * -> void]),
   dir (Fn [-> void] [any any * -> void]),
   error (Fn [-> void] [any any * -> void]),
   warn (Fn [-> void] [any any * -> void])}])
(ann
 js/Console
 (HJSObj :mandatory {prototype Console, new [-> Console]}))
(ann-jsnominal
 SVGFESpotLightElement
 [[]
  :ancestors
  #{SVGElement}
  :fields
  {pointsAtY SVGAnimatedNumber,
   y SVGAnimatedNumber,
   limitingConeAngle SVGAnimatedNumber,
   specularExponent SVGAnimatedNumber,
   x SVGAnimatedNumber,
   pointsAtZ SVGAnimatedNumber,
   z SVGAnimatedNumber,
   pointsAtX SVGAnimatedNumber}
  :methods
  {}])
(ann
 js/SVGFESpotLightElement
 (HJSObj
  :mandatory
  {prototype SVGFESpotLightElement, new [-> SVGFESpotLightElement]}))
(ann-jsnominal
 HTMLImageElement
 [[]
  :ancestors
  #{}
  :fields
  {msPlayToPrimary boolean,
   msPlayToDisabled boolean,
   msPlayToSource any}
  :methods
  {}])
(ann-jsnominal
 WindowBase64
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {btoa [string -> string], atob [string -> string]}])
(Value "error")
(Value "abort")
(ann-jsnominal
 IDBDatabase
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {version string,
   name string,
   objectStoreNames DOMStringList,
   onerror [ErrorEvent -> any],
   onabort [any -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   createObjectStore
   (Fn [string -> IDBObjectStore] [string any -> IDBObjectStore]),
   close [-> void],
   transaction
   (Fn [any -> IDBTransaction] [any string -> IDBTransaction]),
   deleteObjectStore [string -> void]}])
(ann
 js/IDBDatabase
 (HJSObj :mandatory {prototype IDBDatabase, new [-> IDBDatabase]}))
(ann-jsnominal
 DOMStringList
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {contains [string -> boolean], item [number -> string]}])
(ann
 js/DOMStringList
 (HJSObj :mandatory {prototype DOMStringList, new [-> DOMStringList]}))
(ann-jsnominal
 HTMLButtonElement
 [[]
  :ancestors
  #{}
  :fields
  {validationMessage string,
   formTarget string,
   formAction string,
   formMethod string,
   autofocus boolean,
   willValidate boolean,
   formNoValidate string,
   formEnctype string,
   validity ValidityState}
  :methods
  {checkValidity [-> boolean], setCustomValidity [string -> void]}])
(Value "upgradeneeded")
(Value "blocked")
(ann-jsnominal
 IDBOpenDBRequest
 [[]
  :ancestors
  #{IDBRequest}
  :fields
  {onupgradeneeded [IDBVersionChangeEvent -> any],
   onblocked [Event -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann
 js/IDBOpenDBRequest
 (HJSObj
  :mandatory
  {prototype IDBOpenDBRequest, new [-> IDBOpenDBRequest]}))
(ann-jsnominal
 HTMLProgressElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {value number, max number, position number, form HTMLFormElement}
  :methods
  {}])
(ann
 js/HTMLProgressElement
 (HJSObj
  :mandatory
  {prototype HTMLProgressElement, new [-> HTMLProgressElement]}))
(ann-jsnominal
 MSLaunchUriCallback
 [[] :ancestors #{} :fields {} :methods {call [-> void]}])
(ann-jsnominal
 SVGFEOffsetElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {dy SVGAnimatedNumber, in1 SVGAnimatedString, dx SVGAnimatedNumber}
  :methods
  {}])
(ann
 js/SVGFEOffsetElement
 (HJSObj
  :mandatory
  {prototype SVGFEOffsetElement, new [-> SVGFEOffsetElement]}))
(ann-jsnominal
 HTMLFormElement
 [[]
  :ancestors
  #{}
  :fields
  {autocomplete string, noValidate boolean}
  :methods
  {checkValidity [-> boolean]}])
(ann-jsnominal
 MSUnsafeFunctionCallback
 [[] :ancestors #{} :fields {} :methods {call [-> any]}])
(Value "mspointerdown")
(Value "msgesturedoubletap")
(Value "msmanipulationstatechanged")
(Value "mspointerhover")
(Value "mscontentzoom")
(Value "mspointermove")
(Value "msgesturehold")
(Value "msgesturechange")
(Value "msgesturestart")
(Value "mspointercancel")
(Value "msgestureend")
(Value "msgesturetap")
(Value "mspointerout")
(Value "msinertiastart")
(Value "mspointerover")
(Value "mspointerup")
(ann-jsnominal
 Document
 [[]
  :ancestors
  #{}
  :fields
  {onmspointerout [any -> any],
   onmsgestureend [any -> any],
   onmsgesturehold [any -> any],
   onmsgesturedoubletap [any -> any],
   msCSSOMElementFloatMetrics boolean,
   msHidden boolean,
   onmsgesturestart [any -> any],
   onmspointerup [any -> any],
   msVisibilityState string,
   onmspointerover [any -> any],
   hidden boolean,
   onmsinertiastart [any -> any],
   onmsgesturechange [any -> any],
   onmspointermove [any -> any],
   onmspointerdown [any -> any],
   onmscontentzoom [any -> any],
   onmspointerhover [any -> any],
   onmsgesturetap [any -> any],
   onmsmanipulationstatechanged [any -> any],
   visibilityState string,
   onmspointercancel [any -> any]}
  :methods
  {addEventListener
   (Fn
    [(Value "\"mspointerup\"") [any -> any] -> void]
    [(Value "\"mspointerup\"") [any -> any] boolean -> void]),
   msElementsFromPoint [number number -> NodeList],
   msElementsFromRect [number number number number -> NodeList],
   clear [-> void]}])
(ann-jsnominal
 MessageEvent
 [[] :ancestors #{Event} :fields {ports any} :methods {}])
(ann-jsnominal
 HTMLScriptElement
 [[] :ancestors #{} :fields {async boolean} :methods {}])
(ann-jsnominal
 HTMLMediaElement
 [[]
  :ancestors
  #{}
  :fields
  {msAudioCategory string,
   msRealTime boolean,
   msPlayToPrimary boolean,
   textTracks TextTrackList,
   msPlayToDisabled boolean,
   audioTracks AudioTrackList,
   msPlayToSource any,
   msAudioDeviceType string}
  :methods
  {msClearEffects [-> void],
   msSetMediaProtectionManager (Fn [-> void] [any -> void]),
   msInsertAudioEffect
   (Fn [string boolean -> void] [string boolean any -> void])}])
(Value "cuechange")
(Value "load")
(Value "error")
(ann-jsnominal
 TextTrack
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {cues TextTrackCueList,
   label string,
   mode any,
   DISABLED number,
   oncuechange [Event -> any],
   SHOWING number,
   HIDDEN number,
   kind string,
   readyState number,
   activeCues TextTrackCueList,
   onload [any -> any],
   onerror [ErrorEvent -> any],
   language string,
   ERROR number,
   LOADING number,
   NONE number,
   LOADED number}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann
 js/TextTrack
 (HJSObj
  :mandatory
  {new [-> TextTrack],
   prototype TextTrack,
   DISABLED number,
   SHOWING number,
   HIDDEN number,
   ERROR number,
   LOADING number,
   NONE number,
   LOADED number}))
(ann-jsnominal
 MediaQueryListListener
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {call [MediaQueryList -> void]}])
(Value "success")
(Value "error")
(ann-jsnominal
 IDBRequest
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {source any,
   onsuccess [Event -> any],
   error DOMError,
   transaction IDBTransaction,
   onerror [ErrorEvent -> any],
   readyState string,
   result any}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann
 js/IDBRequest
 (HJSObj :mandatory {prototype IDBRequest, new [-> IDBRequest]}))
(Value "message")
(ann-jsnominal
 MessagePort
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {onmessage [any -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   close [-> void],
   postMessage (Fn [any -> void] [any any -> void]),
   start [-> void]}])
(ann
 js/MessagePort
 (HJSObj :mandatory {prototype MessagePort, new [-> MessagePort]}))
(ann-jsnominal
 FileReader
 [[]
  :ancestors
  #{MSBaseReader}
  :fields
  {error DOMError}
  :methods
  {readAsArrayBuffer [Blob -> void],
   readAsDataURL [Blob -> void],
   readAsText (Fn [Blob -> void] [Blob string -> void])}])
(ann
 js/FileReader
 (HJSObj :mandatory {prototype FileReader, new [-> FileReader]}))
(ann-jsnominal
 BlobPropertyBag
 [[] :ancestors #{} :fields {type string, endings string} :methods {}])
(ann-jsnominal
 Blob
 [[]
  :ancestors
  #{}
  :fields
  {type string, size number}
  :methods
  {msDetachStream [-> any],
   slice
   (Fn
    [-> Blob]
    [number -> Blob]
    [number number -> Blob]
    [number number string -> Blob]),
   close [-> void],
   msClose [-> void]}])
(ann
 js/Blob
 (HJSObj
  :mandatory
  {prototype Blob,
   new
   (Fn
    [-> Blob]
    [(Seq any) -> Blob]
    [(Seq any) BlobPropertyBag -> Blob])}))
(Value "downloading")
(Value "progress")
(Value "updateready")
(Value "cached")
(Value "obsolete")
(Value "error")
(Value "checking")
(Value "noupdate")
(ann-jsnominal
 ApplicationCache
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {ondownloading [Event -> any],
   OBSOLETE number,
   status number,
   oncached [Event -> any],
   onnoupdate [Event -> any],
   UNCACHED number,
   onobsolete [Event -> any],
   onprogress [ProgressEvent -> any],
   onerror [ErrorEvent -> any],
   CHECKING number,
   UPDATEREADY number,
   IDLE number,
   onupdateready [Event -> any],
   DOWNLOADING number,
   onchecking [Event -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   swapCache [-> void],
   abort [-> void],
   update [-> void]}])
(ann
 js/ApplicationCache
 (HJSObj
  :mandatory
  {prototype ApplicationCache,
   new [-> ApplicationCache],
   CHECKING number,
   UNCACHED number,
   UPDATEREADY number,
   DOWNLOADING number,
   IDLE number,
   OBSOLETE number}))
(ann-jsnominal
 FrameRequestCallback
 [[] :ancestors #{} :fields {} :methods {call [number -> void]}])
(Value "progress")
(Value "abort")
(Value "loadend")
(Value "error")
(Value "loadstart")
(ann-jsnominal
 XMLHttpRequest
 [[]
  :ancestors
  #{}
  :fields
  {onloadend [ProgressEvent -> any],
   responseType string,
   response any,
   onprogress [ProgressEvent -> any],
   onerror [ErrorEvent -> any],
   onabort [any -> any],
   onloadstart [any -> any],
   withCredentials boolean,
   upload XMLHttpRequestEventTarget}
  :methods
  {addEventListener
   (Fn
    [(Value "\"loadstart\"") [any -> any] -> void]
    [(Value "\"loadstart\"") [any -> any] boolean -> void])}])
(ann-jsnominal
 PopStateEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {state any}
  :methods
  {initPopStateEvent [string boolean boolean any -> void]}])
(ann
 js/PopStateEvent
 (HJSObj :mandatory {prototype PopStateEvent, new [-> PopStateEvent]}))
(ann-jsnominal
 CSSKeyframeRule
 [[]
  :ancestors
  #{CSSRule}
  :fields
  {keyText string, style CSSStyleDeclaration}
  :methods
  {}])
(ann
 js/CSSKeyframeRule
 (HJSObj
  :mandatory
  {prototype CSSKeyframeRule, new [-> CSSKeyframeRule]}))
(ann-jsnominal
 MSFileSaver
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {msSaveBlob (Fn [any -> boolean] [any string -> boolean]),
   msSaveOrOpenBlob (Fn [any -> boolean] [any string -> boolean])}])
(ann-jsnominal
 MSStream
 [[]
  :ancestors
  #{}
  :fields
  {type string}
  :methods
  {msDetachStream [-> any], msClose [-> void]}])
(ann
 js/MSStream
 (HJSObj :mandatory {prototype MSStream, new [-> MSStream]}))
(ann-jsnominal
 MediaError
 [[] :ancestors #{} :fields {msExtendedCode number} :methods {}])
(ann-jsnominal
 HTMLFieldSetElement
 [[]
  :ancestors
  #{}
  :fields
  {validationMessage string,
   validity ValidityState,
   willValidate boolean}
  :methods
  {checkValidity [-> boolean], setCustomValidity [string -> void]}])
(ann-jsnominal
 MSBlobBuilder
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {append (Fn [any -> void] [any string -> void]),
   getBlob (Fn [-> Blob] [string -> Blob])}])
(ann
 js/MSBlobBuilder
 (HJSObj :mandatory {prototype MSBlobBuilder, new [-> MSBlobBuilder]}))
(Value "mscontentzoom")
(Value "cuechange")
(Value "msmanipulationstatechanged")
(ann-jsnominal
 HTMLElement
 [[]
  :ancestors
  #{}
  :fields
  {onmscontentzoom [any -> any],
   oncuechange [Event -> any],
   spellcheck boolean,
   classList DOMTokenList,
   onmsmanipulationstatechanged [any -> any],
   draggable boolean}
  :methods
  {addEventListener
   (Fn
    [(Value "\"msmanipulationstatechanged\"") [any -> any] -> void]
    [(Value "\"msmanipulationstatechanged\"")
     [any -> any]
     boolean
     ->
     void])}])
(ann-jsnominal
 DataTransfer
 [[]
  :ancestors
  #{}
  :fields
  {types DOMStringList, files FileList}
  :methods
  {}])
(ann-jsnominal
 DOMSettableTokenList
 [[] :ancestors #{DOMTokenList} :fields {value string} :methods {}])
(ann
 js/DOMSettableTokenList
 (HJSObj
  :mandatory
  {prototype DOMSettableTokenList, new [-> DOMSettableTokenList]}))
(ann-jsnominal
 IDBFactory
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {open
   (Fn
    [string -> IDBOpenDBRequest]
    [string number -> IDBOpenDBRequest]),
   cmp [any any -> number],
   deleteDatabase [string -> IDBOpenDBRequest]}])
(ann
 js/IDBFactory
 (HJSObj :mandatory {prototype IDBFactory, new [-> IDBFactory]}))
(ann-jsnominal
 Range
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {createContextualFragment [string -> DocumentFragment]}])
(ann-jsnominal
 HTMLObjectElement
 [[]
  :ancestors
  #{}
  :fields
  {validationMessage string,
   validity ValidityState,
   willValidate boolean}
  :methods
  {checkValidity [-> boolean], setCustomValidity [string -> void]}])
(ann-jsnominal
 MSPointerEvent
 [[]
  :ancestors
  #{MouseEvent}
  :fields
  {MSPOINTER_TYPE_MOUSE number,
   MSPOINTER_TYPE_PEN number,
   height number,
   rotation number,
   pointerType any,
   currentPoint any,
   width number,
   hwTimestamp number,
   isPrimary boolean,
   pressure number,
   MSPOINTER_TYPE_TOUCH number,
   intermediatePoints any,
   tiltY number,
   tiltX number,
   pointerId number}
  :methods
  {initPointerEvent
   [string
    boolean
    boolean
    Window
    number
    number
    number
    number
    number
    boolean
    boolean
    boolean
    boolean
    number
    EventTarget
    number
    number
    number
    number
    number
    number
    number
    number
    number
    any
    number
    boolean
    ->
    void],
   getCurrentPoint [Element -> void],
   getIntermediatePoints [Element -> void]}])
(ann
 js/MSPointerEvent
 (HJSObj
  :mandatory
  {prototype MSPointerEvent,
   new [-> MSPointerEvent],
   MSPOINTER_TYPE_PEN number,
   MSPOINTER_TYPE_MOUSE number,
   MSPOINTER_TYPE_TOUCH number}))
(ann-jsnominal
 DOMException
 [[]
  :ancestors
  #{}
  :fields
  {name string,
   INVALID_NODE_TYPE_ERR number,
   DATA_CLONE_ERR number,
   TIMEOUT_ERR number}
  :methods
  {}])
(ann-jsnominal
 MSManipulationEvent
 [[]
  :ancestors
  #{UIEvent}
  :fields
  {lastState number,
   currentState number,
   MS_MANIPULATION_STATE_STOPPED number,
   MS_MANIPULATION_STATE_ACTIVE number,
   MS_MANIPULATION_STATE_INERTIA number}
  :methods
  {initMSManipulationEvent
   [string boolean boolean Window number number number -> void]}])
(ann
 js/MSManipulationEvent
 (HJSObj
  :mandatory
  {prototype MSManipulationEvent,
   new [-> MSManipulationEvent],
   MS_MANIPULATION_STATE_STOPPED number,
   MS_MANIPULATION_STATE_ACTIVE number,
   MS_MANIPULATION_STATE_INERTIA number}))
(ann-jsnominal
 FormData
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {append (Fn [any any -> void] [any any string -> void])}])
(ann
 js/FormData
 (HJSObj
  :mandatory
  {prototype FormData,
   new (Fn [-> FormData] [HTMLFormElement -> FormData])}))
(ann-jsnominal
 HTMLDataListElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {options HTMLCollection}
  :methods
  {}])
(ann
 js/HTMLDataListElement
 (HJSObj
  :mandatory
  {prototype HTMLDataListElement, new [-> HTMLDataListElement]}))
(ann-jsnominal
 SVGFEImageElement
 [[]
  :ancestors
  #{SVGURIReference SVGExternalResourcesRequired SVGElement
    SVGFilterPrimitiveStandardAttributes SVGLangSpace}
  :fields
  {preserveAspectRatio SVGAnimatedPreserveAspectRatio}
  :methods
  {}])
(ann
 js/SVGFEImageElement
 (HJSObj
  :mandatory
  {prototype SVGFEImageElement, new [-> SVGFEImageElement]}))
(Value "error")
(ann-jsnominal
 AbstractWorker
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {onerror [ErrorEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann-jsnominal
 SVGFECompositeElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {k1 SVGAnimatedNumber,
   k2 SVGAnimatedNumber,
   operator SVGAnimatedEnumeration,
   SVG_FECOMPOSITE_OPERATOR_ARITHMETIC number,
   in1 SVGAnimatedString,
   in2 SVGAnimatedString,
   k4 SVGAnimatedNumber,
   k3 SVGAnimatedNumber,
   SVG_FECOMPOSITE_OPERATOR_OVER number,
   SVG_FECOMPOSITE_OPERATOR_ATOP number,
   SVG_FECOMPOSITE_OPERATOR_XOR number,
   SVG_FECOMPOSITE_OPERATOR_UNKNOWN number,
   SVG_FECOMPOSITE_OPERATOR_IN number,
   SVG_FECOMPOSITE_OPERATOR_OUT number}
  :methods
  {}])
(ann
 js/SVGFECompositeElement
 (HJSObj
  :mandatory
  {new [-> SVGFECompositeElement],
   prototype SVGFECompositeElement,
   SVG_FECOMPOSITE_OPERATOR_ARITHMETIC number,
   SVG_FECOMPOSITE_OPERATOR_OVER number,
   SVG_FECOMPOSITE_OPERATOR_ATOP number,
   SVG_FECOMPOSITE_OPERATOR_XOR number,
   SVG_FECOMPOSITE_OPERATOR_UNKNOWN number,
   SVG_FECOMPOSITE_OPERATOR_IN number,
   SVG_FECOMPOSITE_OPERATOR_OUT number}))
(ann-jsnominal
 ValidityState
 [[]
  :ancestors
  #{}
  :fields
  {rangeUnderflow boolean,
   valid boolean,
   tooLong boolean,
   patternMismatch boolean,
   customError boolean,
   typeMismatch boolean,
   rangeOverflow boolean,
   valueMissing boolean,
   stepMismatch boolean}
  :methods
  {}])
(ann
 js/ValidityState
 (HJSObj :mandatory {prototype ValidityState, new [-> ValidityState]}))
(ann-jsnominal
 HTMLTrackElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {kind string,
   src string,
   srclang string,
   track TextTrack,
   label string,
   default boolean}
  :methods
  {}])
(ann
 js/HTMLTrackElement
 (HJSObj
  :mandatory
  {prototype HTMLTrackElement, new [-> HTMLTrackElement]}))
(ann-jsnominal
 MSApp
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {createBlobFromRandomAccessStream [string any -> Blob],
   createDataPackage [any -> any],
   addPublicLocalApplicationUri [string -> void],
   createStreamFromInputStream [string any -> MSStream],
   createDataPackageFromSelection [-> any],
   getHtmlPrintDocumentSource [any -> any],
   execUnsafeLocalFunction [MSUnsafeFunctionCallback -> any],
   terminateApp [any -> void],
   createFileFromStorageFile [any -> File]}])
(Value "MSVideoOptimalLayoutChanged")
(Value "MSVideoFrameStepCompleted")
(Value "MSVideoFormatChanged")
(ann js/MSApp MSApp)
(ann-jsnominal
 HTMLVideoElement
 [[]
  :ancestors
  #{}
  :fields
  {msHorizontalMirror boolean,
   onMSVideoFrameStepCompleted [any -> any],
   msIsLayoutOptimalForPlayback boolean,
   onMSVideoFormatChanged [any -> any],
   msZoom boolean,
   msIsStereo3D boolean,
   msStereo3DPackingMode string,
   msStereo3DRenderMode string,
   onMSVideoOptimalLayoutChanged [any -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   msInsertVideoEffect
   (Fn [string boolean -> void] [string boolean any -> void]),
   msSetVideoRectangle [number number number number -> void],
   msFrameStep [boolean -> void]}])
(ann-jsnominal
 SVGFEComponentTransferElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {in1 SVGAnimatedString}
  :methods
  {}])
(ann
 js/SVGFEComponentTransferElement
 (HJSObj
  :mandatory
  {prototype SVGFEComponentTransferElement,
   new [-> SVGFEComponentTransferElement]}))
(ann-jsnominal
 SVGFEDiffuseLightingElement
 [[]
  :ancestors
  #{SVGElement SVGFilterPrimitiveStandardAttributes}
  :fields
  {kernelUnitLengthY SVGAnimatedNumber,
   surfaceScale SVGAnimatedNumber,
   in1 SVGAnimatedString,
   kernelUnitLengthX SVGAnimatedNumber,
   diffuseConstant SVGAnimatedNumber}
  :methods
  {}])
(ann
 js/SVGFEDiffuseLightingElement
 (HJSObj
  :mandatory
  {prototype SVGFEDiffuseLightingElement,
   new [-> SVGFEDiffuseLightingElement]}))
(ann-jsnominal
 MSCSSMatrix
 [[]
  :ancestors
  #{}
  :fields
  {m11 number,
   m12 number,
   m13 number,
   m43 number,
   m42 number,
   m44 number,
   m41 number,
   a number,
   m32 number,
   m31 number,
   m33 number,
   m34 number,
   c number,
   b number,
   f number,
   d number,
   e number,
   m21 number,
   m22 number,
   m23 number,
   m24 number,
   m14 number}
  :methods
  {scale
   (Fn
    [number -> MSCSSMatrix]
    [number number -> MSCSSMatrix]
    [number number number -> MSCSSMatrix]),
   translate
   (Fn
    [number number -> MSCSSMatrix]
    [number number number -> MSCSSMatrix]),
   multiply [MSCSSMatrix -> MSCSSMatrix],
   rotateAxisAngle [number number number number -> MSCSSMatrix],
   skewX [number -> MSCSSMatrix],
   skewY [number -> MSCSSMatrix],
   rotate
   (Fn
    [number -> MSCSSMatrix]
    [number number -> MSCSSMatrix]
    [number number number -> MSCSSMatrix]),
   inverse [-> MSCSSMatrix],
   toString [-> string],
   setMatrixValue [string -> void]}])
(ann
 js/MSCSSMatrix
 (HJSObj
  :mandatory
  {prototype MSCSSMatrix,
   new (Fn [-> MSCSSMatrix] [string -> MSCSSMatrix])}))
(Value "message")
(ann-jsnominal
 Worker
 [[]
  :ancestors
  #{AbstractWorker}
  :fields
  {onmessage [any -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   postMessage (Fn [any -> void] [any any -> void]),
   terminate [-> void]}])
(ann
 js/Worker
 (HJSObj :mandatory {prototype Worker, new [string -> Worker]}))
(ann-jsnominal
 HTMLIFrameElement
 [[] :ancestors #{} :fields {sandbox DOMSettableTokenList} :methods {}])
(Value "mspointerdown")
(Value "msgesturedoubletap")
(Value "mspointerhover")
(Value "msgesturehold")
(Value "mspointermove")
(Value "msgesturechange")
(Value "msgesturestart")
(Value "mspointercancel")
(Value "msgestureend")
(Value "msgesturetap")
(Value "mspointerout")
(Value "msinertiastart")
(Value "mspointerover")
(Value "popstate")
(ann js/onmspointerdown [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mspointerdown\"") [any -> any] -> void]
  [(Value "\"mspointerdown\"") [any -> any] boolean -> void]))
(ann js/animationStartTime number)
(ann js/onmsgesturedoubletap [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"msgesturedoubletap\"") [any -> any] -> void]
  [(Value "\"msgesturedoubletap\"") [any -> any] boolean -> void]))
(ann js/onmspointerhover [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mspointerhover\"") [any -> any] -> void]
  [(Value "\"mspointerhover\"") [any -> any] boolean -> void]))
(ann js/onmsgesturehold [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"msgesturehold\"") [any -> any] -> void]
  [(Value "\"msgesturehold\"") [any -> any] boolean -> void]))
(ann js/onmspointermove [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mspointermove\"") [any -> any] -> void]
  [(Value "\"mspointermove\"") [any -> any] boolean -> void]))
(ann js/onmsgesturechange [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"msgesturechange\"") [any -> any] -> void]
  [(Value "\"msgesturechange\"") [any -> any] boolean -> void]))
(ann js/onmsgesturestart [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"msgesturestart\"") [any -> any] -> void]
  [(Value "\"msgesturestart\"") [any -> any] boolean -> void]))
(ann js/onmspointercancel [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mspointercancel\"") [any -> any] -> void]
  [(Value "\"mspointercancel\"") [any -> any] boolean -> void]))
(ann js/onmsgestureend [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"msgestureend\"") [any -> any] -> void]
  [(Value "\"msgestureend\"") [any -> any] boolean -> void]))
(ann js/onmsgesturetap [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"msgesturetap\"") [any -> any] -> void]
  [(Value "\"msgesturetap\"") [any -> any] boolean -> void]))
(ann js/onmspointerout [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mspointerout\"") [any -> any] -> void]
  [(Value "\"mspointerout\"") [any -> any] boolean -> void]))
(ann js/msAnimationStartTime number)
(ann js/applicationCache ApplicationCache)
(ann js/onmsinertiastart [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"msinertiastart\"") [any -> any] -> void]
  [(Value "\"msinertiastart\"") [any -> any] boolean -> void]))
(ann js/onmspointerover [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mspointerover\"") [any -> any] -> void]
  [(Value "\"mspointerover\"") [any -> any] boolean -> void]))
(ann js/onpopstate [PopStateEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"popstate\"") [PopStateEvent -> any] -> void]
  [(Value "\"popstate\"") [PopStateEvent -> any] boolean -> void]))
(ann js/onmspointerup [any -> any])
(Value "mspointerup")
(ann
 js/addEventListener
 (Fn
  [(Value "\"mspointerup\"") [any -> any] -> void]
  [(Value "\"mspointerup\"") [any -> any] boolean -> void]))
(ann js/msCancelRequestAnimationFrame [number -> void])
(ann js/matchMedia [string -> MediaQueryList])
(ann js/cancelAnimationFrame [number -> void])
(ann js/msIsStaticHTML [string -> boolean])
(ann js/msMatchMedia [string -> MediaQueryList])
(ann js/requestAnimationFrame [FrameRequestCallback -> number])
(ann js/msRequestAnimationFrame [FrameRequestCallback -> number])
(ann js/btoa [string -> string])
(ann js/atob [string -> string])
(ann js/msIndexedDB IDBFactory)
(ann js/indexedDB IDBFactory)
(ann js/console Console)
(ann-jsnominal
 StoreExceptionsInformation
 [[]
  :ancestors
  #{ExceptionInformation}
  :fields
  {siteName string, explanationString string, detailURI string}
  :methods
  {}])
(ann-jsnominal
 StoreSiteSpecificExceptionsInformation
 [[]
  :ancestors
  #{StoreExceptionsInformation}
  :fields
  {arrayOfDomainStrings (Array string)}
  :methods
  {}])
(ann-jsnominal
 ConfirmSiteSpecificExceptionsInformation
 [[]
  :ancestors
  #{ExceptionInformation}
  :fields
  {arrayOfDomainStrings (Array string)}
  :methods
  {}])
(ann-jsnominal
 AlgorithmParameters
 [[] :ancestors #{} :fields {} :methods {}])
(ann-jsnominal
 MutationObserverInit
 [[]
  :ancestors
  #{}
  :fields
  {childList boolean,
   attributes boolean,
   characterData boolean,
   subtree boolean,
   attributeOldValue boolean,
   characterDataOldValue boolean,
   attributeFilter (Array string)}
  :methods
  {}])
(ann-jsnominal
 ExceptionInformation
 [[] :ancestors #{} :fields {domain string} :methods {}])
(ann-jsnominal
 MsZoomToOptions
 [[]
  :ancestors
  #{}
  :fields
  {contentX number,
   contentY number,
   viewportX string,
   viewportY string,
   scaleFactor number,
   animate string}
  :methods
  {}])
(ann-jsnominal
 DeviceAccelerationDict
 [[] :ancestors #{} :fields {x number, y number, z number} :methods {}])
(ann-jsnominal
 DeviceRotationRateDict
 [[]
  :ancestors
  #{}
  :fields
  {alpha number, beta number, gamma number}
  :methods
  {}])
(ann-jsnominal
 Algorithm
 [[]
  :ancestors
  #{}
  :fields
  {name string, params AlgorithmParameters}
  :methods
  {}])
(ann-jsnominal
 NavigatorID
 [[]
  :ancestors
  #{}
  :fields
  {product string, vendor string}
  :methods
  {}])
(ann
 js/NavigatorID
 (HJSObj :mandatory {prototype NavigatorID, new [-> NavigatorID]}))
(Value "pageshow")
(Value "pagehide")
(ann-jsnominal
 HTMLBodyElement
 [[]
  :ancestors
  #{}
  :fields
  {onpageshow [PageTransitionEvent -> any],
   onpagehide [PageTransitionEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [(Value "\"pagehide\"") [PageTransitionEvent -> any] -> void]
    [(Value "\"pagehide\"")
     [PageTransitionEvent -> any]
     boolean
     ->
     void])}])
(ann-jsnominal
 MSExecAtPriorityFunctionCallback
 [[] :ancestors #{} :fields {} :methods {call [any * -> any]}])
(ann-jsnominal
 MSWindowExtensions
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {captureEvents [-> void], releaseEvents [-> void]}])
(ann
 js/MSWindowExtensions
 (HJSObj
  :mandatory
  {prototype MSWindowExtensions, new [-> MSWindowExtensions]}))
(ann-jsnominal
 MSGraphicsTrust
 [[]
  :ancestors
  #{}
  :fields
  {status string, constrictionActive boolean}
  :methods
  {}])
(ann
 js/MSGraphicsTrust
 (HJSObj
  :mandatory
  {prototype MSGraphicsTrust, new [-> MSGraphicsTrust]}))
(ann-jsnominal
 AudioTrack
 [[] :ancestors #{} :fields {sourceBuffer SourceBuffer} :methods {}])
(ann-jsnominal
 DragEvent
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {msConvertURL
   (Fn [File string -> boolean] [File string string -> boolean])}])
(ann-jsnominal
 SubtleCrypto
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {unwrapKey
   (Fn
    [ArrayBufferView any Key -> KeyOperation]
    [ArrayBufferView any Key boolean -> KeyOperation]
    [ArrayBufferView any Key boolean (Seq string) -> KeyOperation]),
   generateKey
   (Fn
    [any -> KeyOperation]
    [any boolean -> KeyOperation]
    [any boolean (Seq string) -> KeyOperation]),
   importKey
   (Fn
    [string ArrayBufferView any -> KeyOperation]
    [string ArrayBufferView any boolean -> KeyOperation]
    [string ArrayBufferView any boolean (Seq string) -> KeyOperation]),
   verify
   (Fn
    [any Key ArrayBufferView -> CryptoOperation]
    [any Key ArrayBufferView ArrayBufferView -> CryptoOperation]),
   digest
   (Fn
    [any -> CryptoOperation]
    [any ArrayBufferView -> CryptoOperation]),
   exportKey [string Key -> KeyOperation],
   decrypt
   (Fn
    [any Key -> CryptoOperation]
    [any Key ArrayBufferView -> CryptoOperation]),
   wrapKey [Key Key any -> KeyOperation],
   sign
   (Fn
    [any Key -> CryptoOperation]
    [any Key ArrayBufferView -> CryptoOperation]),
   encrypt
   (Fn
    [any Key -> CryptoOperation]
    [any Key ArrayBufferView -> CryptoOperation]),
   deriveKey
   (Fn
    [any Key any -> KeyOperation]
    [any Key any boolean -> KeyOperation]
    [any Key any boolean (Seq string) -> KeyOperation])}])
(ann
 js/SubtleCrypto
 (HJSObj :mandatory {prototype SubtleCrypto, new [-> SubtleCrypto]}))
(ann-jsnominal
 Crypto
 [[]
  :ancestors
  #{RandomSource}
  :fields
  {subtle SubtleCrypto}
  :methods
  {}])
(ann js/Crypto (HJSObj :mandatory {prototype Crypto, new [-> Crypto]}))
(ann-jsnominal
 VideoPlaybackQuality
 [[]
  :ancestors
  #{}
  :fields
  {creationTime number,
   totalVideoFrames number,
   droppedVideoFrames number}
  :methods
  {}])
(ann
 js/VideoPlaybackQuality
 (HJSObj
  :mandatory
  {prototype VideoPlaybackQuality, new [-> VideoPlaybackQuality]}))
(Value "pageshow")
(Value "devicemotion")
(Value "deviceorientation")
(Value "mspointerenter")
(Value "pagehide")
(Value "mspointerleave")
(ann-jsnominal
 Window
 [[]
  :ancestors
  #{}
  :fields
  {onpageshow [PageTransitionEvent -> any],
   ondevicemotion [DeviceMotionEvent -> any],
   devicePixelRatio number,
   msCrypto Crypto,
   ondeviceorientation [DeviceOrientationEvent -> any],
   onmspointerenter [any -> any],
   onpagehide [PageTransitionEvent -> any],
   onmspointerleave [any -> any]}
  :methods
  {addEventListener
   (Fn
    [(Value "\"mspointerleave\"") [any -> any] -> void]
    [(Value "\"mspointerleave\"") [any -> any] boolean -> void])}])
(ann-jsnominal
 Key
 [[]
  :ancestors
  #{}
  :fields
  {algorithm Algorithm,
   type string,
   extractable boolean,
   keyUsage (Seq string)}
  :methods
  {}])
(ann js/Key (HJSObj :mandatory {prototype Key, new [-> Key]}))
(Value "addtrack")
(ann-jsnominal
 TextTrackList
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {onaddtrack [any -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann-jsnominal
 DeviceAcceleration
 [[] :ancestors #{} :fields {y number, x number, z number} :methods {}])
(ann
 js/DeviceAcceleration
 (HJSObj
  :mandatory
  {prototype DeviceAcceleration, new [-> DeviceAcceleration]}))
(ann-jsnominal
 Console
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {time (Fn [-> void] [string -> void]),
   timeEnd (Fn [-> void] [string -> void]),
   select [Element -> void],
   groupCollapsed (Fn [-> void] [string -> void]),
   group (Fn [-> void] [string -> void]),
   groupEnd [-> void],
   trace [-> void],
   count (Fn [-> void] [string -> void]),
   dirxml [any -> void],
   debug (Fn [-> void] [string any * -> void])}])
(ann-jsnominal
 MSNavigatorDoNotTrack
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {removeSiteSpecificTrackingException
   [ExceptionInformation -> boolean],
   removeWebWideTrackingException [ExceptionInformation -> boolean],
   storeWebWideTrackingException [StoreExceptionsInformation -> void],
   storeSiteSpecificTrackingException
   [StoreSiteSpecificExceptionsInformation -> void],
   confirmSiteSpecificTrackingException
   [ConfirmSiteSpecificExceptionsInformation -> boolean],
   confirmWebWideTrackingException [ExceptionInformation -> boolean]}])
(ann
 js/MSNavigatorDoNotTrack
 (HJSObj
  :mandatory
  {prototype MSNavigatorDoNotTrack, new [-> MSNavigatorDoNotTrack]}))
(ann-jsnominal
 HTMLImageElement
 [[] :ancestors #{} :fields {crossOrigin string} :methods {}])
(ann-jsnominal
 HTMLAllCollection
 [[]
  :ancestors
  #{HTMLCollection}
  :fields
  {}
  :methods
  {namedItem [string -> Element]}])
(ann
 js/HTMLAllCollection
 (HJSObj
  :mandatory
  {prototype HTMLAllCollection, new [-> HTMLAllCollection]}))
(ann-jsnominal
 MSNavigatorExtensions
 [[] :ancestors #{} :fields {language string} :methods {}])
(ann
 js/MSNavigatorExtensions
 (HJSObj
  :mandatory
  {prototype MSNavigatorExtensions, new [-> MSNavigatorExtensions]}))
(ann-jsnominal
 AesGcmEncryptResult
 [[]
  :ancestors
  #{}
  :fields
  {ciphertext ArrayBuffer, tag ArrayBuffer}
  :methods
  {}])
(ann
 js/AesGcmEncryptResult
 (HJSObj
  :mandatory
  {prototype AesGcmEncryptResult, new [-> AesGcmEncryptResult]}))
(ann-jsnominal
 CSSStyleDeclaration
 [[]
  :ancestors
  #{}
  :fields
  {borderImageWidth string,
   justifyContent string,
   order string,
   alignSelf string,
   flexGrow string,
   borderImageSlice string,
   borderImageOutset string,
   msTextCombineHorizontal string,
   flexFlow string,
   flex string,
   flexBasis string,
   msImeAlign string,
   borderImageSource string,
   borderImageRepeat string,
   flexWrap string,
   alignContent string,
   flexShrink string,
   borderImage string,
   flexDirection string,
   alignItems string}
  :methods
  {}])
(ann-jsnominal
 HTMLSourceElement
 [[] :ancestors #{} :fields {msKeySystem string} :methods {}])
(ann-jsnominal
 NavigationCompletedEvent
 [[]
  :ancestors
  #{NavigationEvent}
  :fields
  {webErrorStatus number, isSuccess boolean}
  :methods
  {}])
(ann
 js/NavigationCompletedEvent
 (HJSObj
  :mandatory
  {prototype NavigationCompletedEvent,
   new [-> NavigationCompletedEvent]}))
(ann-jsnominal
 MutationRecord
 [[]
  :ancestors
  #{}
  :fields
  {previousSibling Node,
   nextSibling Node,
   target Node,
   addedNodes NodeList,
   attributeName string,
   oldValue string,
   removedNodes NodeList,
   type string,
   attributeNamespace string}
  :methods
  {}])
(ann
 js/MutationRecord
 (HJSObj
  :mandatory
  {prototype MutationRecord, new [-> MutationRecord]}))
(Value "msfullscreenerror")
(Value "mspointerenter")
(Value "msfullscreenchange")
(Value "mspointerleave")
(ann-jsnominal
 Document
 [[]
  :ancestors
  #{MSDocumentExtensions}
  :fields
  {msFullscreenEnabled boolean,
   onmsfullscreenerror [any -> any],
   onmspointerenter [any -> any],
   msFullscreenElement Element,
   onmsfullscreenchange [any -> any],
   onmspointerleave [any -> any]}
  :methods
  {addEventListener
   (Fn
    [(Value "\"mspointerleave\"") [any -> any] -> void]
    [(Value "\"mspointerleave\"") [any -> any] boolean -> void]),
   msExitFullscreen [-> void]}])
(ann-jsnominal
 MimeTypeArray
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {item [number -> Plugin], namedItem [string -> Plugin]}])
(ann
 js/MimeTypeArray
 (HJSObj :mandatory {prototype MimeTypeArray, new [-> MimeTypeArray]}))
(Value "msneedkey")
(ann-jsnominal
 HTMLMediaElement
 [[]
  :ancestors
  #{}
  :fields
  {msPlayToPreferredSourceUri string,
   onmsneedkey [MSMediaKeyNeededEvent -> any],
   msKeys MSMediaKeys,
   msGraphicsTrustStatus MSGraphicsTrust}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   msSetMediaKeys [MSMediaKeys -> void],
   addTextTrack
   (Fn
    [string -> TextTrack]
    [string string -> TextTrack]
    [string string string -> TextTrack])}])
(ann-jsnominal
 TextTrack
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {addCue [TextTrackCue -> void], removeCue [TextTrackCue -> void]}])
(Value "complete")
(Value "error")
(ann-jsnominal
 KeyOperation
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {oncomplete [any -> any], onerror [any -> any], result any}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void])}])
(ann
 js/KeyOperation
 (HJSObj :mandatory {prototype KeyOperation, new [-> KeyOperation]}))
(ann-jsnominal DOMStringMap [[] :ancestors #{} :fields {} :methods {}])
(ann
 js/DOMStringMap
 (HJSObj :mandatory {prototype DOMStringMap, new [-> DOMStringMap]}))
(ann-jsnominal
 DeviceOrientationEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {gamma number, alpha number, absolute boolean, beta number}
  :methods
  {initDeviceOrientationEvent
   [string boolean boolean number number number boolean -> void]}])
(ann
 js/DeviceOrientationEvent
 (HJSObj
  :mandatory
  {prototype DeviceOrientationEvent, new [-> DeviceOrientationEvent]}))
(ann-jsnominal
 MSMediaKeyMessageEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {destinationURL string, message Uint8Array}
  :methods
  {}])
(ann
 js/MSMediaKeyMessageEvent
 (HJSObj
  :mandatory
  {prototype MSMediaKeyMessageEvent, new [-> MSMediaKeyMessageEvent]}))
(ann-jsnominal
 MSMediaKeys
 [[]
  :ancestors
  #{}
  :fields
  {keySystem string}
  :methods
  {createSession
   (Fn
    [string Uint8Array -> MSMediaKeySession]
    [string Uint8Array Uint8Array -> MSMediaKeySession]),
   isTypeSupported
   (Fn [string -> boolean] [string string -> boolean])}])
(ann
 js/MSMediaKeys
 (HJSObj :mandatory {prototype MSMediaKeys, new [-> MSMediaKeys]}))
(ann-jsnominal
 MSHTMLWebViewElement
 [[]
  :ancestors
  #{HTMLElement}
  :fields
  {documentTitle string,
   width number,
   src string,
   canGoForward boolean,
   height number,
   canGoBack boolean}
  :methods
  {capturePreviewToBlobAsync [-> MSWebViewAsyncOperation],
   navigate [string -> void],
   navigateToString [string -> void],
   buildLocalStreamUri [string string -> string],
   captureSelectedContentToDataPackageAsync
   [-> MSWebViewAsyncOperation],
   navigateToLocalStreamUri [string any -> void],
   refresh [-> void],
   goForward [-> void],
   invokeScriptAsync [string any * -> MSWebViewAsyncOperation],
   navigateWithHttpRequestMessage [any -> void],
   goBack [-> void],
   stop [-> void]}])
(ann
 js/MSHTMLWebViewElement
 (HJSObj
  :mandatory
  {prototype MSHTMLWebViewElement, new [-> MSHTMLWebViewElement]}))
(ann-jsnominal
 NavigationEvent
 [[] :ancestors #{Event} :fields {uri string} :methods {}])
(ann
 js/NavigationEvent
 (HJSObj
  :mandatory
  {prototype NavigationEvent, new [-> NavigationEvent]}))
(Value "mspointerenter")
(Value "mspointerleave")
(ann-jsnominal
 Element
 [[]
  :ancestors
  #{}
  :fields
  {onmspointerenter [any -> any], onmspointerleave [any -> any]}
  :methods
  {addEventListener
   (Fn
    [(Value "\"mspointerleave\"") [any -> any] -> void]
    [(Value "\"mspointerleave\"") [any -> any] boolean -> void]),
   msZoomTo [MsZoomToOptions -> void],
   msGetUntransformedBounds [-> ClientRect],
   msRequestFullscreen [-> void]}])
(ann-jsnominal
 RandomSource
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {getRandomValues [ArrayBufferView -> ArrayBufferView]}])
(ann-jsnominal
 XMLHttpRequest
 [[]
  :ancestors
  #{}
  :fields
  {msCaching string}
  :methods
  {msCachingEnabled [-> boolean], overrideMimeType [string -> void]}])
(ann-jsnominal
 SourceBuffer
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {updating boolean,
   appendWindowStart number,
   appendWindowEnd number,
   buffered TimeRanges,
   timestampOffset number,
   audioTracks AudioTrackList}
  :methods
  {appendBuffer [ArrayBuffer -> void],
   remove [number number -> void],
   abort [-> void],
   appendStream (Fn [MSStream -> void] [MSStream number -> void])}])
(ann
 js/SourceBuffer
 (HJSObj :mandatory {prototype SourceBuffer, new [-> SourceBuffer]}))
(Value "candidatewindowshow")
(Value "candidatewindowhide")
(Value "candidatewindowupdate")
(ann-jsnominal
 MSInputMethodContext
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {oncandidatewindowshow [any -> any],
   target HTMLElement,
   compositionStartOffset number,
   oncandidatewindowhide [any -> any],
   oncandidatewindowupdate [any -> any],
   compositionEndOffset number}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   getCompositionAlternatives [-> (Seq string)],
   getCandidateWindowClientRect [-> ClientRect],
   hasComposition [-> boolean],
   isCandidateWindowVisible [-> boolean]}])
(ann
 js/MSInputMethodContext
 (HJSObj
  :mandatory
  {prototype MSInputMethodContext, new [-> MSInputMethodContext]}))
(ann-jsnominal
 DeviceRotationRate
 [[]
  :ancestors
  #{}
  :fields
  {gamma number, alpha number, beta number}
  :methods
  {}])
(ann
 js/DeviceRotationRate
 (HJSObj
  :mandatory
  {prototype DeviceRotationRate, new [-> DeviceRotationRate]}))
(ann-jsnominal
 PluginArray
 [[]
  :ancestors
  #{}
  :fields
  {length number}
  :methods
  {refresh (Fn [-> void] [boolean -> void]),
   item [number -> Plugin],
   namedItem [string -> Plugin]}])
(ann
 js/PluginArray
 (HJSObj :mandatory {prototype PluginArray, new [-> PluginArray]}))
(ann-jsnominal
 MSMediaKeyError
 [[]
  :ancestors
  #{}
  :fields
  {systemCode number,
   code number,
   MS_MEDIA_KEYERR_SERVICE number,
   MS_MEDIA_KEYERR_HARDWARECHANGE number,
   MS_MEDIA_KEYERR_OUTPUT number,
   MS_MEDIA_KEYERR_DOMAIN number,
   MS_MEDIA_KEYERR_UNKNOWN number,
   MS_MEDIA_KEYERR_CLIENT number}
  :methods
  {}])
(ann
 js/MSMediaKeyError
 (HJSObj
  :mandatory
  {prototype MSMediaKeyError,
   new [-> MSMediaKeyError],
   MS_MEDIA_KEYERR_SERVICE number,
   MS_MEDIA_KEYERR_HARDWARECHANGE number,
   MS_MEDIA_KEYERR_OUTPUT number,
   MS_MEDIA_KEYERR_DOMAIN number,
   MS_MEDIA_KEYERR_UNKNOWN number,
   MS_MEDIA_KEYERR_CLIENT number}))
(ann-jsnominal
 Plugin
 [[]
  :ancestors
  #{}
  :fields
  {length number,
   filename string,
   version string,
   name string,
   description string}
  :methods
  {item [number -> MimeType], namedItem [string -> MimeType]}])
(ann js/Plugin (HJSObj :mandatory {prototype Plugin, new [-> Plugin]}))
(Value "pageshow")
(Value "pagehide")
(ann-jsnominal
 HTMLFrameSetElement
 [[]
  :ancestors
  #{}
  :fields
  {onpageshow [PageTransitionEvent -> any],
   onpagehide [PageTransitionEvent -> any]}
  :methods
  {addEventListener
   (Fn
    [(Value "\"pagehide\"") [PageTransitionEvent -> any] -> void]
    [(Value "\"pagehide\"")
     [PageTransitionEvent -> any]
     boolean
     ->
     void])}])
(Value "msorientationchange")
(ann-jsnominal
 Screen
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {msOrientation string, onmsorientationchange [any -> any]}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   msLockOrientation [(Seq string) -> boolean],
   msUnlockOrientation [-> void]}])
(ann-jsnominal
 MediaSource
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {sourceBuffers SourceBufferList,
   duration string,
   readyState any,
   activeSourceBuffers SourceBufferList}
  :methods
  {addSourceBuffer [string -> SourceBuffer],
   endOfStream (Fn [-> void] [string -> void]),
   isTypeSupported [string -> boolean],
   removeSourceBuffer [SourceBuffer -> void]}])
(ann
 js/MediaSource
 (HJSObj :mandatory {prototype MediaSource, new [-> MediaSource]}))
(ann-jsnominal
 MediaError
 [[]
  :ancestors
  #{}
  :fields
  {MS_MEDIA_ERR_ENCRYPTED number}
  :methods
  {}])
(ann-jsnominal
 SourceBufferList
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {length number}
  :methods
  {item [number -> SourceBuffer]}])
(ann
 js/SourceBufferList
 (HJSObj
  :mandatory
  {prototype SourceBufferList, new [-> SourceBufferList]}))
(ann-jsnominal
 XMLDocument
 [[] :ancestors #{Document} :fields {} :methods {}])
(ann
 js/XMLDocument
 (HJSObj :mandatory {prototype XMLDocument, new [-> XMLDocument]}))
(ann-jsnominal
 DeviceMotionEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {rotationRate DeviceRotationRate,
   acceleration DeviceAcceleration,
   interval number,
   accelerationIncludingGravity DeviceAcceleration}
  :methods
  {initDeviceMotionEvent
   [string
    boolean
    boolean
    DeviceAccelerationDict
    DeviceAccelerationDict
    DeviceRotationRateDict
    number
    ->
    void]}])
(ann
 js/DeviceMotionEvent
 (HJSObj
  :mandatory
  {prototype DeviceMotionEvent, new [-> DeviceMotionEvent]}))
(ann-jsnominal
 MimeType
 [[]
  :ancestors
  #{}
  :fields
  {enabledPlugin Plugin,
   suffixes string,
   type string,
   description string}
  :methods
  {}])
(ann
 js/MimeType
 (HJSObj :mandatory {prototype MimeType, new [-> MimeType]}))
(ann-jsnominal
 MSDocumentExtensions
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {captureEvents [-> void], releaseEvents [-> void]}])
(ann-jsnominal
 HTMLElement
 [[]
  :ancestors
  #{}
  :fields
  {dataset DOMStringMap, hidden boolean}
  :methods
  {msGetInputContext [-> MSInputMethodContext]}])
(ann-jsnominal
 MutationObserver
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {observe [Node MutationObserverInit -> void],
   takeRecords [-> (Seq MutationRecord)],
   disconnect [-> void]}])
(ann
 js/MutationObserver
 (HJSObj
  :mandatory
  {prototype MutationObserver, new [-> MutationObserver]}))
(ann-jsnominal
 AudioTrackList
 [[]
  :ancestors
  #{}
  :fields
  {onremovetrack [PluginArray -> any]}
  :methods
  {}])
(ann-jsnominal
 HTMLObjectElement
 [[]
  :ancestors
  #{}
  :fields
  {msPlayToPreferredSourceUri string,
   msPlayToPrimary boolean,
   msPlayToDisabled boolean,
   msPlayToSource any}
  :methods
  {}])
(ann-jsnominal
 HTMLEmbedElement
 [[]
  :ancestors
  #{}
  :fields
  {msPlayToPreferredSourceUri string,
   msPlayToPrimary boolean,
   msPlayToDisabled boolean,
   msPlayToSource any}
  :methods
  {}])
(Value "complete")
(Value "error")
(ann-jsnominal
 MSWebViewAsyncOperation
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM number,
   oncomplete [any -> any],
   COMPLETED number,
   TYPE_INVOKE_SCRIPT number,
   readyState number,
   target MSHTMLWebViewElement,
   STARTED number,
   onerror [any -> any],
   error DOMError,
   TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION number,
   ERROR number,
   result any,
   type number}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   start [-> void]}])
(ann
 js/MSWebViewAsyncOperation
 (HJSObj
  :mandatory
  {prototype MSWebViewAsyncOperation,
   new [-> MSWebViewAsyncOperation],
   ERROR number,
   TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION number,
   TYPE_INVOKE_SCRIPT number,
   COMPLETED number,
   TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM number,
   STARTED number}))
(ann-jsnominal
 ScriptNotifyEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {value string, callingUri string}
  :methods
  {}])
(ann
 js/ScriptNotifyEvent
 (HJSObj
  :mandatory
  {prototype ScriptNotifyEvent, new [-> ScriptNotifyEvent]}))
(ann-jsnominal
 PerformanceNavigationTiming
 [[]
  :ancestors
  #{PerformanceEntry}
  :fields
  {responseStart number,
   fetchStart number,
   domComplete number,
   domLoading number,
   domainLookupStart number,
   connectStart number,
   domInteractive number,
   navigationStart number,
   connectEnd number,
   unloadEventStart number,
   requestStart number,
   redirectCount number,
   domContentLoadedEventStart number,
   redirectEnd number,
   redirectStart number,
   responseEnd number,
   loadEventEnd number,
   domContentLoadedEventEnd number,
   unloadEventEnd number,
   loadEventStart number,
   domainLookupEnd number,
   type string}
  :methods
  {}])
(ann
 js/PerformanceNavigationTiming
 (HJSObj
  :mandatory
  {prototype PerformanceNavigationTiming,
   new [-> PerformanceNavigationTiming]}))
(ann-jsnominal
 MSMediaKeyNeededEvent
 [[] :ancestors #{Event} :fields {initData Uint8Array} :methods {}])
(ann
 js/MSMediaKeyNeededEvent
 (HJSObj
  :mandatory
  {prototype MSMediaKeyNeededEvent, new [-> MSMediaKeyNeededEvent]}))
(ann-jsnominal
 MSManipulationEvent
 [[]
  :ancestors
  #{}
  :fields
  {MS_MANIPULATION_STATE_SELECTING number,
   MS_MANIPULATION_STATE_COMMITTED number,
   MS_MANIPULATION_STATE_PRESELECT number,
   MS_MANIPULATION_STATE_DRAGGING number,
   MS_MANIPULATION_STATE_CANCELLED number}
  :methods
  {}])
(ann-jsnominal
 LongRunningScriptDetectedEvent
 [[]
  :ancestors
  #{Event}
  :fields
  {stopPageScriptExecution boolean, executionTime number}
  :methods
  {}])
(ann
 js/LongRunningScriptDetectedEvent
 (HJSObj
  :mandatory
  {prototype LongRunningScriptDetectedEvent,
   new [-> LongRunningScriptDetectedEvent]}))
(ann-jsnominal
 MSAppView
 [[]
  :ancestors
  #{}
  :fields
  {viewId number}
  :methods
  {close [-> void],
   postMessage (Fn [any string -> void] [any string any -> void])}])
(ann
 js/MSAppView
 (HJSObj :mandatory {prototype MSAppView, new [-> MSAppView]}))
(ann-jsnominal
 PerfWidgetExternal
 [[]
  :ancestors
  #{}
  :fields
  {maxCpuSpeed number,
   performanceCounterFrequency number,
   performanceCounter number,
   averagePaintTime number,
   activeNetworkRequestCount number,
   paintRequestsPerSecond number}
  :methods
  {addEventListener [string [any -> any] -> void],
   getRecentCpuUsage [number -> any],
   removeEventListener [string [any -> any] -> void],
   getRecentPaintRequests [number -> any],
   resizeWindow [number number -> void],
   getRecentMemoryUsage [number -> any],
   getProcessCpuUsage [-> number],
   repositionWindow [number number -> void],
   getMemoryUsage [-> number]}])
(ann
 js/PerfWidgetExternal
 (HJSObj
  :mandatory
  {prototype PerfWidgetExternal, new [-> PerfWidgetExternal]}))
(ann-jsnominal
 PageTransitionEvent
 [[] :ancestors #{Event} :fields {persisted boolean} :methods {}])
(ann
 js/PageTransitionEvent
 (HJSObj
  :mandatory
  {prototype PageTransitionEvent, new [-> PageTransitionEvent]}))
(ann-jsnominal
 MutationCallback
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {call [(Seq MutationRecord) MutationObserver -> void]}])
(ann-jsnominal
 HTMLDocument
 [[] :ancestors #{Document} :fields {} :methods {}])
(ann
 js/HTMLDocument
 (HJSObj :mandatory {prototype HTMLDocument, new [-> HTMLDocument]}))
(ann-jsnominal
 KeyPair
 [[]
  :ancestors
  #{}
  :fields
  {privateKey Key, publicKey Key}
  :methods
  {}])
(ann
 js/KeyPair
 (HJSObj :mandatory {prototype KeyPair, new [-> KeyPair]}))
(ann-jsnominal
 MSApp
 [[]
  :ancestors
  #{}
  :fields
  {NORMAL string, HIGH string, IDLE string, CURRENT string}
  :methods
  {getViewOpener [-> MSAppView],
   suppressSubdownloadCredentialPrompts [boolean -> void],
   execAsyncAtPriority
   [MSExecAtPriorityFunctionCallback string any * -> void],
   isTaskScheduledAtPriorityOrHigher [string -> boolean],
   execAtPriority
   [MSExecAtPriorityFunctionCallback string any * -> any],
   createNewView [string -> MSAppView],
   getCurrentPriority [-> string]}])
(ann-jsnominal
 HTMLTrackElement
 [[]
  :ancestors
  #{}
  :fields
  {readyState number,
   ERROR number,
   LOADING number,
   LOADED number,
   NONE number}
  :methods
  {}])
(ann-jsnominal
 MSMediaKeySession
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {sessionId string, error MSMediaKeyError, keySystem string}
  :methods
  {close [-> void], update [Uint8Array -> void]}])
(ann
 js/MSMediaKeySession
 (HJSObj
  :mandatory
  {prototype MSMediaKeySession, new [-> MSMediaKeySession]}))
(ann-jsnominal
 HTMLVideoElement
 [[]
  :ancestors
  #{}
  :fields
  {videoPlaybackQuality VideoPlaybackQuality}
  :methods
  {}])
(ann-jsnominal
 UnviewableContentIdentifiedEvent
 [[]
  :ancestors
  #{NavigationEvent}
  :fields
  {referrer string}
  :methods
  {}])
(ann
 js/UnviewableContentIdentifiedEvent
 (HJSObj
  :mandatory
  {prototype UnviewableContentIdentifiedEvent,
   new [-> UnviewableContentIdentifiedEvent]}))
(Value "complete")
(Value "error")
(Value "progress")
(Value "abort")
(ann-jsnominal
 CryptoOperation
 [[]
  :ancestors
  #{EventTarget}
  :fields
  {algorithm Algorithm,
   oncomplete [any -> any],
   onerror [any -> any],
   onprogress [any -> any],
   onabort [any -> any],
   key Key,
   result any}
  :methods
  {addEventListener
   (Fn
    [string EventListener -> void]
    [string EventListener boolean -> void]),
   abort [-> void],
   finish [-> void],
   process [ArrayBufferView -> void]}])
(ann
 js/CryptoOperation
 (HJSObj
  :mandatory
  {prototype CryptoOperation, new [-> CryptoOperation]}))
(Value "pageshow")
(Value "devicemotion")
(Value "deviceorientation")
(Value "mspointerenter")
(Value "pagehide")
(Value "mspointerleave")
(ann js/onpageshow [PageTransitionEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"pageshow\"") [PageTransitionEvent -> any] -> void]
  [(Value "\"pageshow\"")
   [PageTransitionEvent -> any]
   boolean
   ->
   void]))
(ann js/ondevicemotion [DeviceMotionEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"devicemotion\"") [DeviceMotionEvent -> any] -> void]
  [(Value "\"devicemotion\"")
   [DeviceMotionEvent -> any]
   boolean
   ->
   void]))
(ann js/devicePixelRatio number)
(ann js/msCrypto Crypto)
(ann js/ondeviceorientation [DeviceOrientationEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"deviceorientation\"")
   [DeviceOrientationEvent -> any]
   ->
   void]
  [(Value "\"deviceorientation\"")
   [DeviceOrientationEvent -> any]
   boolean
   ->
   void]))
(ann js/onmspointerenter [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mspointerenter\"") [any -> any] -> void]
  [(Value "\"mspointerenter\"") [any -> any] boolean -> void]))
(ann js/onpagehide [PageTransitionEvent -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"pagehide\"") [PageTransitionEvent -> any] -> void]
  [(Value "\"pagehide\"")
   [PageTransitionEvent -> any]
   boolean
   ->
   void]))
(ann js/onmspointerleave [any -> any])
(ann
 js/addEventListener
 (Fn
  [(Value "\"mspointerleave\"") [any -> any] -> void]
  [(Value "\"mspointerleave\"") [any -> any] boolean -> void]))
(ann js/importScripts [string * -> void])
(ann js/ActiveXObject (HJSObj :mandatory {new [string -> any]}))
(ann-jsnominal
 ITextWriter
 [[]
  :ancestors
  #{}
  :fields
  {}
  :methods
  {Write [string -> void],
   WriteLine [string -> void],
   Close [-> void]}])
