;;This is an automatically generated file. Do not modify.
;;LOG: Chopped up the input into 1002 chunks
((ann NaN number)
 (ann Infinity number)
 (ann eval [string -> any])
 (ann parseInt [string {:opt number} -> number])
 (ann parseFloat [string -> number])
 (ann isNaN [number -> boolean])
 (ann isFinite [number -> boolean])
 (ann decodeURI [string -> string])
 (ann decodeURIComponent [string -> string])
 (ann encodeURI [string -> string])
 (ann encodeURIComponent [string -> string])
 (ann-interface
  PropertyDescriptor
  configurable
  boolean
  enumerable
  boolean
  value
  any
  writable
  boolean
  get
  [-> any]
  set
  [any -> void]))
((ann-interface
  PropertyDescriptorMap
  []
  [string -> PropertyDescriptor]))
((ann-interface
  Object
  toString
  [-> string]
  toLocaleString
  [-> string]
  valueOf
  [-> Object]
  hasOwnProperty
  [string -> boolean]
  isPrototypeOf
  [Object -> boolean]
  propertyIsEnumerable
  [string -> boolean]
  []
  [string -> any]))
((ann
  Object
  (nil
   [{:opt any} -> Object]
   ->
   any
   any
   ->
   any
   prototype
   Object
   getPrototypeOf
   [any -> any]
   getOwnPropertyDescriptor
   [any string -> PropertyDescriptor]
   getOwnPropertyNames
   [any -> (string *)]
   create
   [any {:opt PropertyDescriptorMap} -> any]
   defineProperty
   [any string PropertyDescriptor -> any]
   defineProperties
   [any PropertyDescriptorMap -> any]
   seal
   [any -> any]
   freeze
   [any -> any]
   preventExtensions
   [any -> any]
   isSealed
   [any -> boolean]
   isFrozen
   [any -> boolean]
   isExtensible
   [any -> boolean]
   keys
   [any -> (string *)])))
((ann-interface
  Function
  apply
  [any {:opt any} -> any]
  call
  [any (any *) -> any]
  bind
  [any (any *) -> any]
  prototype
  any
  length
  number
  arguments
  any
  caller
  Function))
((ann
  Function
  (nil
   [(string *) -> Function]
   (string *)
   ->
   Function
   prototype
   Function)))
((ann-interface
  IArguments
  []
  [number -> any]
  length
  number
  callee
  Function))
((ann-interface
  String
  toString
  [-> string]
  charAt
  [number -> string]
  charCodeAt
  [number -> number]
  concat
  [(string *) -> string]
  indexOf
  [string {:opt number} -> number]
  lastIndexOf
  [string {:opt number} -> number]
  localeCompare
  [string -> number]
  match
  [string -> (string *)]
  match
  [RegExp -> (string *)]
  replace
  [string string -> string]
  replace
  [string [string (any *) -> string] -> string]
  replace
  [RegExp string -> string]
  replace
  [RegExp [string (any *) -> string] -> string]
  search
  [string -> number]
  search
  [RegExp -> number]
  slice
  [number {:opt number} -> string]
  split
  [string {:opt number} -> (string *)]
  split
  [RegExp {:opt number} -> (string *)]
  substring
  [number {:opt number} -> string]
  toLowerCase
  [-> string]
  toLocaleLowerCase
  [-> string]
  toUpperCase
  [-> string]
  toLocaleUpperCase
  [-> string]
  trim
  [-> string]
  length
  number
  substr
  [number {:opt number} -> string]))
((ann
  String
  (nil
   [{:opt any} -> String]
   {:opt any}
   ->
   string
   prototype
   String
   fromCharCode
   [(number *) -> string])))
((ann-interface Boolean))
((ann
  Boolean
  (nil
   [{:opt any} -> Boolean]
   {:opt any}
   ->
   boolean
   prototype
   Boolean)))
((ann-interface
  Number
  toString
  [{:opt number} -> string]
  toFixed
  [{:opt number} -> string]
  toExponential
  [{:opt number} -> string]
  toPrecision
  [number -> string]))
((ann
  Number
  (nil
   [{:opt any} -> Number]
   {:opt any}
   ->
   number
   prototype
   Number
   MAX_VALUE
   number
   MIN_VALUE
   number
   NaN
   number
   NEGATIVE_INFINITY
   number
   POSITIVE_INFINITY
   number)))
((ann-interface
  Math
  E
  number
  LN10
  number
  LN2
  number
  LOG2E
  number
  LOG10E
  number
  PI
  number
  SQRT1_2
  number
  SQRT2
  number
  abs
  [number -> number]
  acos
  [number -> number]
  asin
  [number -> number]
  atan
  [number -> number]
  atan2
  [number number -> number]
  ceil
  [number -> number]
  cos
  [number -> number]
  exp
  [number -> number]
  floor
  [number -> number]
  log
  [number -> number]
  max
  [(number *) -> number]
  min
  [(number *) -> number]
  pow
  [number number -> number]
  random
  [-> number]
  round
  [number -> number]
  sin
  [number -> number]
  sqrt
  [number -> number]
  tan
  [number -> number]))
((ann Math Math)
 (ann-interface
  Date
  toString
  [-> string]
  toDateString
  [-> string]
  toTimeString
  [-> string]
  toLocaleString
  [-> string]
  toLocaleDateString
  [-> string]
  toLocaleTimeString
  [-> string]
  valueOf
  [-> number]
  getTime
  [-> number]
  getFullYear
  [-> number]
  getUTCFullYear
  [-> number]
  getMonth
  [-> number]
  getUTCMonth
  [-> number]
  getDate
  [-> number]
  getUTCDate
  [-> number]
  getDay
  [-> number]
  getUTCDay
  [-> number]
  getHours
  [-> number]
  getUTCHours
  [-> number]
  getMinutes
  [-> number]
  getUTCMinutes
  [-> number]
  getSeconds
  [-> number]
  getUTCSeconds
  [-> number]
  getMilliseconds
  [-> number]
  getUTCMilliseconds
  [-> number]
  getTimezoneOffset
  [-> number]
  setTime
  [number -> void]
  setMilliseconds
  [number -> void]
  setUTCMilliseconds
  [number -> void]
  setSeconds
  [number {:opt number} -> void]
  setUTCSeconds
  [number {:opt number} -> void]
  setMinutes
  [number {:opt number} {:opt number} -> void]
  setUTCMinutes
  [number {:opt number} {:opt number} -> void]
  setHours
  [number {:opt number} {:opt number} {:opt number} -> void]
  setUTCHours
  [number {:opt number} {:opt number} {:opt number} -> void]
  setDate
  [number -> void]
  setUTCDate
  [number -> void]
  setMonth
  [number {:opt number} -> void]
  setUTCMonth
  [number {:opt number} -> void]
  setFullYear
  [number {:opt number} {:opt number} -> void]
  setUTCFullYear
  [number {:opt number} {:opt number} -> void]
  toUTCString
  [-> string]
  toISOString
  [-> string]
  toJSON
  [{:opt any} -> string]))
((ann
  Date
  (nil
   [-> Date]
   nil
   [number -> Date]
   nil
   [string -> Date]
   nil
   [number
    number
    {:opt number}
    {:opt number}
    {:opt number}
    {:opt number}
    {:opt number}
    ->
    Date]
   ->
   string
   prototype
   Date
   parse
   [string -> number]
   UTC
   [number
    number
    {:opt number}
    {:opt number}
    {:opt number}
    {:opt number}
    {:opt number}
    ->
    number]
   now
   [-> number])))
((ann-interface
  RegExpExecArray
  []
  [number -> string]
  length
  number
  index
  number
  input
  string
  toString
  [-> string]
  toLocaleString
  [-> string]
  concat
  [((string *) *) -> (string *)]
  join
  [{:opt string} -> string]
  pop
  [-> string]
  push
  [(string *) -> number]
  reverse
  [-> (string *)]
  shift
  [-> string]
  slice
  [number {:opt number} -> (string *)]
  sort
  [{:opt [string string -> number]} -> (string *)]
  splice
  [number -> (string *)]
  splice
  [number number (string *) -> (string *)]
  unshift
  [(string *) -> number]
  indexOf
  [string {:opt number} -> number]
  lastIndexOf
  [string {:opt number} -> number]
  every
  [[string number (string *) -> boolean] {:opt any} -> boolean]
  some
  [[string number (string *) -> boolean] {:opt any} -> boolean]
  forEach
  [[string number (string *) -> void] {:opt any} -> void]
  map
  [[string number (string *) -> any] {:opt any} -> (any *)]
  filter
  [[string number (string *) -> boolean] {:opt any} -> (string *)]
  reduce
  [[any any number (string *) -> any] {:opt any} -> any]
  reduceRight
  [[any any number (string *) -> any] {:opt any} -> any]))
((ann-interface
  RegExp
  exec
  [string -> RegExpExecArray]
  test
  [string -> boolean]
  source
  string
  global
  boolean
  ignoreCase
  boolean
  multiline
  boolean
  lastIndex
  number
  compile
  [-> RegExp]))
((ann
  RegExp
  (nil
   [string {:opt string} -> RegExp]
   string
   {:opt string}
   ->
   RegExp
   $1
   string
   $2
   string
   $3
   string
   $4
   string
   $5
   string
   $6
   string
   $7
   string
   $8
   string
   $9
   string
   lastMatch
   string)))
((ann-interface Error name string message string))
((ann
  Error
  (nil
   [{:opt string} -> Error]
   {:opt string}
   ->
   Error
   prototype
   Error)))
((ann-interface EvalError))
((ann
  EvalError
  (nil
   [{:opt string} -> EvalError]
   {:opt string}
   ->
   EvalError
   prototype
   EvalError)))
((ann-interface RangeError))
((ann
  RangeError
  (nil
   [{:opt string} -> RangeError]
   {:opt string}
   ->
   RangeError
   prototype
   RangeError)))
((ann-interface ReferenceError))
((ann
  ReferenceError
  (nil
   [{:opt string} -> ReferenceError]
   {:opt string}
   ->
   ReferenceError
   prototype
   ReferenceError)))
((ann-interface SyntaxError))
((ann
  SyntaxError
  (nil
   [{:opt string} -> SyntaxError]
   {:opt string}
   ->
   SyntaxError
   prototype
   SyntaxError)))
((ann-interface TypeError))
((ann
  TypeError
  (nil
   [{:opt string} -> TypeError]
   {:opt string}
   ->
   TypeError
   prototype
   TypeError)))
((ann-interface URIError))
((ann
  URIError
  (nil
   [{:opt string} -> URIError]
   {:opt string}
   ->
   URIError
   prototype
   URIError)))
((ann-interface
  JSON
  parse
  [string {:opt [any any -> any]} -> any]
  stringify
  [any -> string]
  stringify
  [any [string any -> any] -> string]
  stringify
  [any (any *) -> string]
  stringify
  [any [string any -> any] any -> string]
  stringify
  [any (any *) any -> string]))
((ann JSON JSON)
 (ann-interface
  Array
  toString
  [-> string]
  toLocaleString
  [-> string]
  concat
  (All [U] [(U *) -> (T *)])
  concat
  [(T *) -> (T *)]
  join
  [{:opt string} -> string]
  pop
  [-> T]
  push
  [(T *) -> number]
  reverse
  [-> (T *)]
  shift
  [-> T]
  slice
  [number {:opt number} -> (T *)]
  sort
  [{:opt [T T -> number]} -> (T *)]
  splice
  [number -> (T *)]
  splice
  [number number (T *) -> (T *)]
  unshift
  [(T *) -> number]
  indexOf
  [T {:opt number} -> number]
  lastIndexOf
  [T {:opt number} -> number]
  every
  [[T number (T *) -> boolean] {:opt any} -> boolean]
  some
  [[T number (T *) -> boolean] {:opt any} -> boolean]
  forEach
  [[T number (T *) -> void] {:opt any} -> void]
  map
  (All [U] [[T number (T *) -> U] {:opt any} -> (U *)])
  filter
  [[T number (T *) -> boolean] {:opt any} -> (T *)]
  reduce
  [[T T number (T *) -> T] {:opt T} -> T]
  reduce
  (All [U] [[U T number (T *) -> U] U -> U])
  reduceRight
  [[T T number (T *) -> T] {:opt T} -> T]
  reduceRight
  (All [U] [[U T number (T *) -> U] U -> U])
  length
  number
  []
  [number -> T]))
((ann
  Array
  (nil
   (All [T] [number -> (T *)])
   nil
   (All [T] [(T *) -> (T *)])
   All
   [T]
   [number -> (T *)]
   All
   [T]
   [(T *) -> (T *)]
   isArray
   [any -> boolean]
   prototype
   Array)))
((ann-interface ArrayBuffer byteLength number))
((ann ArrayBuffer (prototype ArrayBuffer nil [number -> ArrayBuffer])))
((ann-interface
  ArrayBufferView
  buffer
  ArrayBuffer
  byteOffset
  number
  byteLength
  number))
((ann-interface
  Int8Array
  BYTES_PER_ELEMENT
  number
  length
  number
  []
  [number -> number]
  get
  [number -> number]
  set
  [number number -> void]
  set
  [Int8Array {:opt number} -> void]
  set
  [(number *) {:opt number} -> void]
  subarray
  [number {:opt number} -> Int8Array]))
((ann
  Int8Array
  (prototype
   Int8Array
   nil
   [number -> Int8Array]
   nil
   [Int8Array -> Int8Array]
   nil
   [(number *) -> Int8Array]
   nil
   [ArrayBuffer {:opt number} {:opt number} -> Int8Array]
   BYTES_PER_ELEMENT
   number)))
((ann-interface
  Uint8Array
  BYTES_PER_ELEMENT
  number
  length
  number
  []
  [number -> number]
  get
  [number -> number]
  set
  [number number -> void]
  set
  [Uint8Array {:opt number} -> void]
  set
  [(number *) {:opt number} -> void]
  subarray
  [number {:opt number} -> Uint8Array]))
((ann
  Uint8Array
  (prototype
   Uint8Array
   nil
   [number -> Uint8Array]
   nil
   [Uint8Array -> Uint8Array]
   nil
   [(number *) -> Uint8Array]
   nil
   [ArrayBuffer {:opt number} {:opt number} -> Uint8Array]
   BYTES_PER_ELEMENT
   number)))
((ann-interface
  Int16Array
  BYTES_PER_ELEMENT
  number
  length
  number
  []
  [number -> number]
  get
  [number -> number]
  set
  [number number -> void]
  set
  [Int16Array {:opt number} -> void]
  set
  [(number *) {:opt number} -> void]
  subarray
  [number {:opt number} -> Int16Array]))
((ann
  Int16Array
  (prototype
   Int16Array
   nil
   [number -> Int16Array]
   nil
   [Int16Array -> Int16Array]
   nil
   [(number *) -> Int16Array]
   nil
   [ArrayBuffer {:opt number} {:opt number} -> Int16Array]
   BYTES_PER_ELEMENT
   number)))
((ann-interface
  Uint16Array
  BYTES_PER_ELEMENT
  number
  length
  number
  []
  [number -> number]
  get
  [number -> number]
  set
  [number number -> void]
  set
  [Uint16Array {:opt number} -> void]
  set
  [(number *) {:opt number} -> void]
  subarray
  [number {:opt number} -> Uint16Array]))
((ann
  Uint16Array
  (prototype
   Uint16Array
   nil
   [number -> Uint16Array]
   nil
   [Uint16Array -> Uint16Array]
   nil
   [(number *) -> Uint16Array]
   nil
   [ArrayBuffer {:opt number} {:opt number} -> Uint16Array]
   BYTES_PER_ELEMENT
   number)))
((ann-interface
  Int32Array
  BYTES_PER_ELEMENT
  number
  length
  number
  []
  [number -> number]
  get
  [number -> number]
  set
  [number number -> void]
  set
  [Int32Array {:opt number} -> void]
  set
  [(number *) {:opt number} -> void]
  subarray
  [number {:opt number} -> Int32Array]))
((ann
  Int32Array
  (prototype
   Int32Array
   nil
   [number -> Int32Array]
   nil
   [Int32Array -> Int32Array]
   nil
   [(number *) -> Int32Array]
   nil
   [ArrayBuffer {:opt number} {:opt number} -> Int32Array]
   BYTES_PER_ELEMENT
   number)))
((ann-interface
  Uint32Array
  BYTES_PER_ELEMENT
  number
  length
  number
  []
  [number -> number]
  get
  [number -> number]
  set
  [number number -> void]
  set
  [Uint32Array {:opt number} -> void]
  set
  [(number *) {:opt number} -> void]
  subarray
  [number {:opt number} -> Uint32Array]))
((ann
  Uint32Array
  (prototype
   Uint32Array
   nil
   [number -> Uint32Array]
   nil
   [Uint32Array -> Uint32Array]
   nil
   [(number *) -> Uint32Array]
   nil
   [ArrayBuffer {:opt number} {:opt number} -> Uint32Array]
   BYTES_PER_ELEMENT
   number)))
((ann-interface
  Float32Array
  BYTES_PER_ELEMENT
  number
  length
  number
  []
  [number -> number]
  get
  [number -> number]
  set
  [number number -> void]
  set
  [Float32Array {:opt number} -> void]
  set
  [(number *) {:opt number} -> void]
  subarray
  [number {:opt number} -> Float32Array]))
((ann
  Float32Array
  (prototype
   Float32Array
   nil
   [number -> Float32Array]
   nil
   [Float32Array -> Float32Array]
   nil
   [(number *) -> Float32Array]
   nil
   [ArrayBuffer {:opt number} {:opt number} -> Float32Array]
   BYTES_PER_ELEMENT
   number)))
((ann-interface
  Float64Array
  BYTES_PER_ELEMENT
  number
  length
  number
  []
  [number -> number]
  get
  [number -> number]
  set
  [number number -> void]
  set
  [Float64Array {:opt number} -> void]
  set
  [(number *) {:opt number} -> void]
  subarray
  [number {:opt number} -> Float64Array]))
((ann
  Float64Array
  (prototype
   Float64Array
   nil
   [number -> Float64Array]
   nil
   [Float64Array -> Float64Array]
   nil
   [(number *) -> Float64Array]
   nil
   [ArrayBuffer {:opt number} {:opt number} -> Float64Array]
   BYTES_PER_ELEMENT
   number)))
((ann-interface
  DataView
  getInt8
  [number -> number]
  getUint8
  [number -> number]
  getInt16
  [number {:opt boolean} -> number]
  getUint16
  [number {:opt boolean} -> number]
  getInt32
  [number {:opt boolean} -> number]
  getUint32
  [number {:opt boolean} -> number]
  getFloat32
  [number {:opt boolean} -> number]
  getFloat64
  [number {:opt boolean} -> number]
  setInt8
  [number number -> void]
  setUint8
  [number number -> void]
  setInt16
  [number number {:opt boolean} -> void]
  setUint16
  [number number {:opt boolean} -> void]
  setInt32
  [number number {:opt boolean} -> void]
  setUint32
  [number number {:opt boolean} -> void]
  setFloat32
  [number number {:opt boolean} -> void]
  setFloat64
  [number number {:opt boolean} -> void]))
((ann
  DataView
  (prototype
   DataView
   nil
   [ArrayBuffer {:opt number} {:opt number} -> DataView])))
((ann-interface
  Map
  clear
  [-> void]
  delete
  [K -> boolean]
  forEach
  [[V K Map -> void] {:opt any} -> void]
  get
  [K -> V]
  has
  [K -> boolean]
  set
  [K V -> Map]
  size
  number))
((ann Map (nil (All [K V] [-> Map]))))
((ann-interface
  WeakMap
  clear
  [-> void]
  delete
  [K -> boolean]
  get
  [K -> V]
  has
  [K -> boolean]
  set
  [K V -> WeakMap]))
((ann WeakMap (nil (All [K V] [-> WeakMap]))))
((ann-interface
  Set
  add
  [T -> Set]
  clear
  [-> void]
  delete
  [T -> boolean]
  forEach
  [[T T Set -> void] {:opt any} -> void]
  has
  [T -> boolean]
  size
  number))
((ann Set (nil (All [T] [-> Set]))))
(*not-implemented*)
((ann-interface
  String
  localeCompare
  [string (string *) {:opt *not-implemented*} -> number]
  localeCompare
  [string string {:opt *not-implemented*} -> number]))
((ann-interface
  Numer
  toLocaleString
  [(string *) {:opt *not-implemented*} -> string]
  toLocaleString
  [string {:opt *not-implemented*} -> string]))
((ann-interface
  Date
  toLocaleString
  [(string *) {:opt *not-implemented*} -> string]
  toLocaleString
  [string {:opt *not-implemented*} -> string]))
((ann-interface
  PositionOptions
  enableHighAccuracy
  boolean
  timeout
  number
  maximumAge
  number))
((ann-interface
  NavigatorID
  appVersion
  string
  appName
  string
  userAgent
  string
  platform
  string))
((ann-interface
  HTMLTableElement
  width
  string
  borderColorLight
  any
  cellSpacing
  string
  tFoot
  HTMLTableSectionElement
  frame
  string
  borderColor
  any
  rows
  HTMLCollection
  rules
  string
  cols
  number
  summary
  string
  caption
  HTMLTableCaptionElement
  tBodies
  HTMLCollection
  tHead
  HTMLTableSectionElement
  align
  string
  cells
  HTMLCollection
  height
  any
  cellPadding
  string
  border
  string
  borderColorDark
  any
  deleteRow
  [{:opt number} -> void]
  createTBody
  [-> HTMLElement]
  deleteCaption
  [-> void]
  insertRow
  [{:opt number} -> HTMLElement]
  deleteTFoot
  [-> void]
  createTHead
  [-> HTMLElement]
  deleteTHead
  [-> void]
  createCaption
  [-> HTMLElement]
  moveRow
  [{:opt number} {:opt number} -> Object]
  createTFoot
  [-> HTMLElement]))
((ann
  HTMLTableElement
  (prototype HTMLTableElement nil [-> HTMLTableElement])))
((ann-interface
  TreeWalker
  whatToShow
  number
  filter
  NodeFilter
  root
  Node
  currentNode
  Node
  expandEntityReferences
  boolean
  previousSibling
  [-> Node]
  lastChild
  [-> Node]
  nextSibling
  [-> Node]
  nextNode
  [-> Node]
  parentNode
  [-> Node]
  firstChild
  [-> Node]
  previousNode
  [-> Node]))
((ann TreeWalker (prototype TreeWalker nil [-> TreeWalker])))
((ann-interface GetSVGDocument getSVGDocument [-> Document]))
((ann-interface
  SVGPathSegCurvetoQuadraticRel
  y
  number
  y1
  number
  x
  number
  x1
  number))
((ann
  SVGPathSegCurvetoQuadraticRel
  (prototype
   SVGPathSegCurvetoQuadraticRel
   nil
   [-> SVGPathSegCurvetoQuadraticRel])))
((ann-interface
  Performance
  navigation
  PerformanceNavigation
  timing
  PerformanceTiming
  getEntriesByType
  [string -> any]
  toJSON
  [-> any]
  getMeasures
  [{:opt string} -> any]
  clearMarks
  [{:opt string} -> void]
  getMarks
  [{:opt string} -> any]
  clearResourceTimings
  [-> void]
  mark
  [string -> void]
  measure
  [string {:opt string} {:opt string} -> void]
  getEntriesByName
  [string {:opt string} -> any]
  getEntries
  [-> any]
  clearMeasures
  [{:opt string} -> void]
  setResourceTimingBufferSize
  [number -> void]))
((ann Performance (prototype Performance nil [-> Performance])))
((ann-interface
  MSDataBindingTableExtensions
  dataPageSize
  number
  nextPage
  [-> void]
  firstPage
  [-> void]
  refresh
  [-> void]
  previousPage
  [-> void]
  lastPage
  [-> void]))
((ann-interface
  CompositionEvent
  data
  string
  locale
  string
  initCompositionEvent
  [string boolean boolean Window string string -> void]))
((ann
  CompositionEvent
  (prototype CompositionEvent nil [-> CompositionEvent])))
((ann-interface
  WindowTimers
  clearTimeout
  [number -> void]
  setTimeout
  [any {:opt any} (any *) -> number]
  clearInterval
  [number -> void]
  setInterval
  [any {:opt any} (any *) -> number]))
((ann-interface
  SVGMarkerElement
  orientType
  SVGAnimatedEnumeration
  markerUnits
  SVGAnimatedEnumeration
  markerWidth
  SVGAnimatedLength
  markerHeight
  SVGAnimatedLength
  orientAngle
  SVGAnimatedAngle
  refY
  SVGAnimatedLength
  refX
  SVGAnimatedLength
  setOrientToAngle
  [SVGAngle -> void]
  setOrientToAuto
  [-> void]
  SVG_MARKER_ORIENT_UNKNOWN
  number
  SVG_MARKER_ORIENT_ANGLE
  number
  SVG_MARKERUNITS_UNKNOWN
  number
  SVG_MARKERUNITS_STROKEWIDTH
  number
  SVG_MARKER_ORIENT_AUTO
  number
  SVG_MARKERUNITS_USERSPACEONUSE
  number))
((ann
  SVGMarkerElement
  (prototype
   SVGMarkerElement
   nil
   [-> SVGMarkerElement]
   SVG_MARKER_ORIENT_UNKNOWN
   number
   SVG_MARKER_ORIENT_ANGLE
   number
   SVG_MARKERUNITS_UNKNOWN
   number
   SVG_MARKERUNITS_STROKEWIDTH
   number
   SVG_MARKER_ORIENT_AUTO
   number
   SVG_MARKERUNITS_USERSPACEONUSE
   number)))
((ann-interface
  CSSStyleDeclaration
  backgroundAttachment
  string
  visibility
  string
  textAlignLast
  string
  borderRightStyle
  string
  counterIncrement
  string
  orphans
  string
  cssText
  string
  borderStyle
  string
  pointerEvents
  string
  borderTopColor
  string
  markerEnd
  string
  textIndent
  string
  listStyleImage
  string
  cursor
  string
  listStylePosition
  string
  wordWrap
  string
  borderTopStyle
  string
  alignmentBaseline
  string
  opacity
  string
  direction
  string
  strokeMiterlimit
  string
  maxWidth
  string
  color
  string
  clip
  string
  borderRightWidth
  string
  verticalAlign
  string
  overflow
  string
  mask
  string
  borderLeftStyle
  string
  emptyCells
  string
  stopOpacity
  string
  paddingRight
  string
  parentRule
  CSSRule
  background
  string
  boxSizing
  string
  textJustify
  string
  height
  string
  paddingTop
  string
  length
  number
  right
  string
  baselineShift
  string
  borderLeft
  string
  widows
  string
  lineHeight
  string
  left
  string
  textUnderlinePosition
  string
  glyphOrientationHorizontal
  string
  display
  string
  textAnchor
  string
  cssFloat
  string
  strokeDasharray
  string
  rubyAlign
  string
  fontSizeAdjust
  string
  borderLeftColor
  string
  backgroundImage
  string
  listStyleType
  string
  strokeWidth
  string
  textOverflow
  string
  fillRule
  string
  borderBottomColor
  string
  zIndex
  string
  position
  string
  listStyle
  string
  msTransformOrigin
  string
  dominantBaseline
  string
  overflowY
  string
  fill
  string
  captionSide
  string
  borderCollapse
  string
  boxShadow
  string
  quotes
  string
  tableLayout
  string
  unicodeBidi
  string
  borderBottomWidth
  string
  backgroundSize
  string
  textDecoration
  string
  strokeDashoffset
  string
  fontSize
  string
  border
  string
  pageBreakBefore
  string
  borderTopRightRadius
  string
  msTransform
  string
  borderBottomLeftRadius
  string
  textTransform
  string
  rubyPosition
  string
  strokeLinejoin
  string
  clipPath
  string
  borderRightColor
  string
  fontFamily
  string
  clear
  string
  content
  string
  backgroundClip
  string
  marginBottom
  string
  counterReset
  string
  outlineWidth
  string
  marginRight
  string
  paddingLeft
  string
  borderBottom
  string
  wordBreak
  string
  marginTop
  string
  top
  string
  fontWeight
  string
  borderRight
  string
  width
  string
  kerning
  string
  pageBreakAfter
  string
  borderBottomStyle
  string
  fontStretch
  string
  padding
  string
  strokeOpacity
  string
  markerStart
  string
  bottom
  string
  borderLeftWidth
  string
  clipRule
  string
  backgroundPosition
  string
  backgroundColor
  string
  pageBreakInside
  string
  backgroundOrigin
  string
  strokeLinecap
  string
  borderTopWidth
  string
  outlineStyle
  string
  borderTop
  string
  outlineColor
  string
  paddingBottom
  string
  marginLeft
  string
  font
  string
  outline
  string
  wordSpacing
  string
  maxHeight
  string
  fillOpacity
  string
  letterSpacing
  string
  borderSpacing
  string
  backgroundRepeat
  string
  borderRadius
  string
  borderWidth
  string
  borderBottomRightRadius
  string
  whiteSpace
  string
  fontStyle
  string
  minWidth
  string
  stopColor
  string
  borderTopLeftRadius
  string
  borderColor
  string
  marker
  string
  glyphOrientationVertical
  string
  markerMid
  string
  fontVariant
  string
  minHeight
  string
  stroke
  string
  rubyOverhang
  string
  overflowX
  string
  textAlign
  string
  margin
  string
  getPropertyPriority
  [string -> string]
  getPropertyValue
  [string -> string]
  removeProperty
  [string -> string]
  item
  [number -> string]
  []
  [number -> string]
  setProperty
  [string string {:opt string} -> void]))
((ann
  CSSStyleDeclaration
  (prototype CSSStyleDeclaration nil [-> CSSStyleDeclaration])))
((ann-interface SVGGElement))
((ann SVGGElement (prototype SVGGElement nil [-> SVGGElement])))
((ann-interface
  MSStyleCSSProperties
  pixelWidth
  number
  posHeight
  number
  posLeft
  number
  pixelTop
  number
  pixelBottom
  number
  textDecorationNone
  boolean
  pixelLeft
  number
  posTop
  number
  posBottom
  number
  textDecorationOverline
  boolean
  posWidth
  number
  textDecorationLineThrough
  boolean
  pixelHeight
  number
  textDecorationBlink
  boolean
  posRight
  number
  pixelRight
  number
  textDecorationUnderline
  boolean))
((ann
  MSStyleCSSProperties
  (prototype MSStyleCSSProperties nil [-> MSStyleCSSProperties])))
((ann-interface Navigator))
((ann Navigator (prototype Navigator nil [-> Navigator])))
((ann-interface
  SVGPathSegCurvetoCubicSmoothAbs
  y
  number
  x2
  number
  x
  number
  y2
  number))
((ann
  SVGPathSegCurvetoCubicSmoothAbs
  (prototype
   SVGPathSegCurvetoCubicSmoothAbs
   nil
   [-> SVGPathSegCurvetoCubicSmoothAbs])))
((ann-interface
  SVGZoomEvent
  zoomRectScreen
  SVGRect
  previousScale
  number
  newScale
  number
  previousTranslate
  SVGPoint
  newTranslate
  SVGPoint))
((ann SVGZoomEvent (prototype SVGZoomEvent nil [-> SVGZoomEvent])))
((ann-interface
  NodeSelector
  querySelectorAll
  [string -> NodeList]
  querySelector
  [string -> Element]))
((ann-interface HTMLTableDataCellElement))
((ann
  HTMLTableDataCellElement
  (prototype
   HTMLTableDataCellElement
   nil
   [-> HTMLTableDataCellElement])))
((ann-interface HTMLBaseElement target string href string))
((ann
  HTMLBaseElement
  (prototype HTMLBaseElement nil [-> HTMLBaseElement])))
((ann-interface
  ClientRect
  left
  number
  width
  number
  right
  number
  top
  number
  bottom
  number
  height
  number))
((ann ClientRect (prototype ClientRect nil [-> ClientRect])))
((ann-interface PositionErrorCallback PositionError -> void))
((ann-interface
  DOMImplementation
  createDocumentType
  [string string string -> DocumentType]
  createDocument
  [string string DocumentType -> Document]
  hasFeature
  [string {:opt string} -> boolean]
  createHTMLDocument
  [string -> Document]))
((ann
  DOMImplementation
  (prototype DOMImplementation nil [-> DOMImplementation])))
((ann-interface
  SVGUnitTypes
  SVG_UNIT_TYPE_UNKNOWN
  number
  SVG_UNIT_TYPE_OBJECTBOUNDINGBOX
  number
  SVG_UNIT_TYPE_USERSPACEONUSE
  number))
((ann
  SVGUnitTypes
  (prototype
   SVGUnitTypes
   nil
   [-> SVGUnitTypes]
   SVG_UNIT_TYPE_UNKNOWN
   number
   SVG_UNIT_TYPE_OBJECTBOUNDINGBOX
   number
   SVG_UNIT_TYPE_USERSPACEONUSE
   number)))
((ann-interface
  Element
  scrollTop
  number
  clientLeft
  number
  scrollLeft
  number
  tagName
  string
  clientWidth
  number
  scrollWidth
  number
  clientHeight
  number
  clientTop
  number
  scrollHeight
  number
  getAttribute
  [{:opt string} -> string]
  getElementsByTagNameNS
  [string string -> NodeList]
  hasAttributeNS
  [string string -> boolean]
  getBoundingClientRect
  [-> ClientRect]
  getAttributeNS
  [string string -> string]
  getAttributeNodeNS
  [string string -> Attr]
  setAttributeNodeNS
  [Attr -> Attr]
  msMatchesSelector
  [string -> boolean]
  hasAttribute
  [string -> boolean]
  removeAttribute
  [{:opt string} -> void]
  setAttributeNS
  [string string string -> void]
  getAttributeNode
  [string -> Attr]
  fireEvent
  [string {:opt any} -> boolean]
  getElementsByTagName
  [string -> NodeList]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getClientRects
  [-> ClientRectList]
  setAttributeNode
  [Attr -> Attr]
  removeAttributeNode
  [Attr -> Attr]
  setAttribute
  [{:opt string} {:opt string} -> void]
  removeAttributeNS
  [string string -> void]))
((ann Element (prototype Element nil [-> Element])))
((ann-interface HTMLNextIdElement n string))
((ann
  HTMLNextIdElement
  (prototype HTMLNextIdElement nil [-> HTMLNextIdElement])))
((ann-interface SVGPathSegMovetoRel y number x number))
((ann
  SVGPathSegMovetoRel
  (prototype SVGPathSegMovetoRel nil [-> SVGPathSegMovetoRel])))
((ann-interface
  SVGLineElement
  y1
  SVGAnimatedLength
  x2
  SVGAnimatedLength
  x1
  SVGAnimatedLength
  y2
  SVGAnimatedLength))
((ann
  SVGLineElement
  (prototype SVGLineElement nil [-> SVGLineElement])))
((ann-interface HTMLParagraphElement align string))
((ann
  HTMLParagraphElement
  (prototype HTMLParagraphElement nil [-> HTMLParagraphElement])))
((ann-interface
  HTMLAreasCollection
  remove
  [{:opt number} -> void]
  add
  [HTMLElement {:opt any} -> void]))
((ann
  HTMLAreasCollection
  (prototype HTMLAreasCollection nil [-> HTMLAreasCollection])))
((ann-interface SVGDescElement))
((ann
  SVGDescElement
  (prototype SVGDescElement nil [-> SVGDescElement])))
((ann-interface
  Node
  nodeType
  number
  previousSibling
  Node
  localName
  string
  namespaceURI
  string
  textContent
  string
  parentNode
  Node
  nextSibling
  Node
  nodeValue
  string
  lastChild
  Node
  childNodes
  NodeList
  nodeName
  string
  ownerDocument
  Document
  attributes
  NamedNodeMap
  firstChild
  Node
  prefix
  string
  removeChild
  [Node -> Node]
  appendChild
  [Node -> Node]
  isSupported
  [string string -> boolean]
  isEqualNode
  [Node -> boolean]
  lookupPrefix
  [string -> string]
  isDefaultNamespace
  [string -> boolean]
  compareDocumentPosition
  [Node -> number]
  normalize
  [-> void]
  isSameNode
  [Node -> boolean]
  hasAttributes
  [-> boolean]
  lookupNamespaceURI
  [string -> string]
  cloneNode
  [{:opt boolean} -> Node]
  hasChildNodes
  [-> boolean]
  replaceChild
  [Node Node -> Node]
  insertBefore
  [Node {:opt Node} -> Node]
  ENTITY_REFERENCE_NODE
  number
  ATTRIBUTE_NODE
  number
  DOCUMENT_FRAGMENT_NODE
  number
  TEXT_NODE
  number
  ELEMENT_NODE
  number
  COMMENT_NODE
  number
  DOCUMENT_POSITION_DISCONNECTED
  number
  DOCUMENT_POSITION_CONTAINED_BY
  number
  DOCUMENT_POSITION_CONTAINS
  number
  DOCUMENT_TYPE_NODE
  number
  DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC
  number
  DOCUMENT_NODE
  number
  ENTITY_NODE
  number
  PROCESSING_INSTRUCTION_NODE
  number
  CDATA_SECTION_NODE
  number
  NOTATION_NODE
  number
  DOCUMENT_POSITION_FOLLOWING
  number
  DOCUMENT_POSITION_PRECEDING
  number))
((ann
  Node
  (prototype
   Node
   nil
   [-> Node]
   ENTITY_REFERENCE_NODE
   number
   ATTRIBUTE_NODE
   number
   DOCUMENT_FRAGMENT_NODE
   number
   TEXT_NODE
   number
   ELEMENT_NODE
   number
   COMMENT_NODE
   number
   DOCUMENT_POSITION_DISCONNECTED
   number
   DOCUMENT_POSITION_CONTAINED_BY
   number
   DOCUMENT_POSITION_CONTAINS
   number
   DOCUMENT_TYPE_NODE
   number
   DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC
   number
   DOCUMENT_NODE
   number
   ENTITY_NODE
   number
   PROCESSING_INSTRUCTION_NODE
   number
   CDATA_SECTION_NODE
   number
   NOTATION_NODE
   number
   DOCUMENT_POSITION_FOLLOWING
   number
   DOCUMENT_POSITION_PRECEDING
   number)))
((ann-interface SVGPathSegCurvetoQuadraticSmoothRel y number x number))
((ann
  SVGPathSegCurvetoQuadraticSmoothRel
  (prototype
   SVGPathSegCurvetoQuadraticSmoothRel
   nil
   [-> SVGPathSegCurvetoQuadraticSmoothRel])))
((ann-interface DOML2DeprecatedListSpaceReduction compact boolean))
((ann-interface MSScriptHost))
((ann MSScriptHost (prototype MSScriptHost nil [-> MSScriptHost])))
((ann-interface
  SVGClipPathElement
  clipPathUnits
  SVGAnimatedEnumeration))
((ann
  SVGClipPathElement
  (prototype SVGClipPathElement nil [-> SVGClipPathElement])))
((ann-interface
  MouseEvent
  toElement
  Element
  layerY
  number
  fromElement
  Element
  which
  number
  pageX
  number
  offsetY
  number
  x
  number
  y
  number
  metaKey
  boolean
  altKey
  boolean
  ctrlKey
  boolean
  offsetX
  number
  screenX
  number
  clientY
  number
  shiftKey
  boolean
  layerX
  number
  screenY
  number
  relatedTarget
  EventTarget
  button
  number
  pageY
  number
  buttons
  number
  clientX
  number
  initMouseEvent
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
   void]
  getModifierState
  [string -> boolean]))
((ann MouseEvent (prototype MouseEvent nil [-> MouseEvent])))
((ann-interface
  RangeException
  code
  number
  message
  string
  toString
  [-> string]
  INVALID_NODE_TYPE_ERR
  number
  BAD_BOUNDARYPOINTS_ERR
  number))
((ann
  RangeException
  (prototype
   RangeException
   nil
   [-> RangeException]
   INVALID_NODE_TYPE_ERR
   number
   BAD_BOUNDARYPOINTS_ERR
   number)))
((ann-interface
  SVGTextPositioningElement
  y
  SVGAnimatedLengthList
  rotate
  SVGAnimatedNumberList
  dy
  SVGAnimatedLengthList
  x
  SVGAnimatedLengthList
  dx
  SVGAnimatedLengthList))
((ann
  SVGTextPositioningElement
  (prototype
   SVGTextPositioningElement
   nil
   [-> SVGTextPositioningElement])))
((ann-interface
  HTMLAppletElement
  width
  number
  codeType
  string
  object
  string
  form
  HTMLFormElement
  code
  string
  archive
  string
  alt
  string
  standby
  string
  classid
  string
  name
  string
  useMap
  string
  data
  string
  height
  string
  altHtml
  string
  contentDocument
  Document
  codeBase
  string
  declare
  boolean
  type
  string
  BaseHref
  string))
((ann
  HTMLAppletElement
  (prototype HTMLAppletElement nil [-> HTMLAppletElement])))
((ann-interface TextMetrics width number))
((ann TextMetrics (prototype TextMetrics nil [-> TextMetrics])))
((ann-interface DocumentEvent createEvent [string -> Event]))
((ann-interface HTMLOListElement start number))
((ann
  HTMLOListElement
  (prototype HTMLOListElement nil [-> HTMLOListElement])))
((ann-interface SVGPathSegLinetoVerticalRel y number))
((ann
  SVGPathSegLinetoVerticalRel
  (prototype
   SVGPathSegLinetoVerticalRel
   nil
   [-> SVGPathSegLinetoVerticalRel])))
((ann-interface SVGAnimatedString animVal string baseVal string))
((ann
  SVGAnimatedString
  (prototype SVGAnimatedString nil [-> SVGAnimatedString])))
((ann-interface CDATASection))
((ann CDATASection (prototype CDATASection nil [-> CDATASection])))
((ann-interface StyleMedia type string matchMedium [string -> boolean]))
((ann StyleMedia (prototype StyleMedia nil [-> StyleMedia])))
((ann-interface
  HTMLSelectElement
  options
  HTMLSelectElement
  value
  string
  form
  HTMLFormElement
  name
  string
  size
  number
  length
  number
  selectedIndex
  number
  multiple
  boolean
  type
  string
  remove
  [{:opt number} -> void]
  add
  [HTMLElement {:opt any} -> void]
  item
  [{:opt any} {:opt any} -> any]
  namedItem
  [string -> any]
  []
  [string -> any]))
((ann
  HTMLSelectElement
  (prototype HTMLSelectElement nil [-> HTMLSelectElement])))
((ann-interface
  TextRange
  boundingLeft
  number
  htmlText
  string
  offsetLeft
  number
  boundingWidth
  number
  boundingHeight
  number
  boundingTop
  number
  text
  string
  offsetTop
  number
  moveToPoint
  [number number -> void]
  queryCommandValue
  [string -> any]
  getBookmark
  [-> string]
  move
  [string {:opt number} -> number]
  queryCommandIndeterm
  [string -> boolean]
  scrollIntoView
  [{:opt boolean} -> void]
  findText
  [string {:opt number} {:opt number} -> boolean]
  execCommand
  [string {:opt boolean} {:opt any} -> boolean]
  getBoundingClientRect
  [-> ClientRect]
  moveToBookmark
  [string -> boolean]
  isEqual
  [TextRange -> boolean]
  duplicate
  [-> TextRange]
  collapse
  [{:opt boolean} -> void]
  queryCommandText
  [string -> string]
  select
  [-> void]
  pasteHTML
  [string -> void]
  inRange
  [TextRange -> boolean]
  moveEnd
  [string {:opt number} -> number]
  getClientRects
  [-> ClientRectList]
  moveStart
  [string {:opt number} -> number]
  parentElement
  [-> Element]
  queryCommandState
  [string -> boolean]
  compareEndPoints
  [string TextRange -> number]
  execCommandShowHelp
  [string -> boolean]
  moveToElementText
  [Element -> void]
  expand
  [string -> boolean]
  queryCommandSupported
  [string -> boolean]
  setEndPoint
  [string TextRange -> void]
  queryCommandEnabled
  [string -> boolean]))
((ann TextRange (prototype TextRange nil [-> TextRange])))
((ann-interface
  SVGTests
  requiredFeatures
  SVGStringList
  requiredExtensions
  SVGStringList
  systemLanguage
  SVGStringList
  hasExtension
  [string -> boolean]))
((ann-interface HTMLBlockElement width number cite string))
((ann
  HTMLBlockElement
  (prototype HTMLBlockElement nil [-> HTMLBlockElement])))
((ann-interface
  CSSStyleSheet
  owningElement
  Element
  imports
  StyleSheetList
  isAlternate
  boolean
  rules
  MSCSSRuleList
  isPrefAlternate
  boolean
  readOnly
  boolean
  cssText
  string
  ownerRule
  CSSRule
  href
  string
  cssRules
  CSSRuleList
  id
  string
  pages
  StyleSheetPageList
  addImport
  [string {:opt number} -> number]
  addPageRule
  [string string {:opt number} -> number]
  insertRule
  [string {:opt number} -> number]
  removeRule
  [number -> void]
  deleteRule
  [{:opt number} -> void]
  addRule
  [string {:opt string} {:opt number} -> number]
  removeImport
  [number -> void]))
((ann CSSStyleSheet (prototype CSSStyleSheet nil [-> CSSStyleSheet])))
((ann-interface
  MSSelection
  type
  string
  typeDetail
  string
  createRange
  [-> TextRange]
  clear
  [-> void]
  createRangeCollection
  [-> TextRangeCollection]
  empty
  [-> void]))
((ann MSSelection (prototype MSSelection nil [-> MSSelection])))
((ann-interface
  HTMLMetaElement
  httpEquiv
  string
  name
  string
  content
  string
  url
  string
  scheme
  string
  charset
  string))
((ann
  HTMLMetaElement
  (prototype HTMLMetaElement nil [-> HTMLMetaElement])))
((ann-interface
  SVGPatternElement
  patternUnits
  SVGAnimatedEnumeration
  y
  SVGAnimatedLength
  width
  SVGAnimatedLength
  x
  SVGAnimatedLength
  patternContentUnits
  SVGAnimatedEnumeration
  patternTransform
  SVGAnimatedTransformList
  height
  SVGAnimatedLength))
((ann
  SVGPatternElement
  (prototype SVGPatternElement nil [-> SVGPatternElement])))
((ann-interface SVGAnimatedAngle animVal SVGAngle baseVal SVGAngle))
((ann
  SVGAnimatedAngle
  (prototype SVGAnimatedAngle nil [-> SVGAnimatedAngle])))
((ann-interface
  Selection
  isCollapsed
  boolean
  anchorNode
  Node
  focusNode
  Node
  anchorOffset
  number
  focusOffset
  number
  rangeCount
  number
  addRange
  [Range -> void]
  collapseToEnd
  [-> void]
  toString
  [-> string]
  selectAllChildren
  [Node -> void]
  getRangeAt
  [number -> Range]
  collapse
  [Node number -> void]
  removeAllRanges
  [-> void]
  collapseToStart
  [-> void]
  deleteFromDocument
  [-> void]
  removeRange
  [Range -> void]))
((ann Selection (prototype Selection nil [-> Selection])))
((ann-interface SVGScriptElement type string))
((ann
  SVGScriptElement
  (prototype SVGScriptElement nil [-> SVGScriptElement])))
((ann-interface HTMLDDElement noWrap boolean))
((ann HTMLDDElement (prototype HTMLDDElement nil [-> HTMLDDElement])))
((ann-interface
  MSDataBindingRecordSetReadonlyExtensions
  recordset
  Object
  namedRecordset
  [string {:opt any} -> Object]))
((ann-interface
  CSSStyleRule
  selectorText
  string
  style
  MSStyleCSSProperties
  readOnly
  boolean))
((ann CSSStyleRule (prototype CSSStyleRule nil [-> CSSStyleRule])))
((ann-interface
  NodeIterator
  whatToShow
  number
  filter
  NodeFilter
  root
  Node
  expandEntityReferences
  boolean
  nextNode
  [-> Node]
  detach
  [-> void]
  previousNode
  [-> Node]))
((ann NodeIterator (prototype NodeIterator nil [-> NodeIterator])))
((ann-interface SVGViewElement viewTarget SVGStringList))
((ann
  SVGViewElement
  (prototype SVGViewElement nil [-> SVGViewElement])))
((ann-interface
  HTMLLinkElement
  rel
  string
  target
  string
  href
  string
  media
  string
  rev
  string
  type
  string
  charset
  string
  hreflang
  string))
((ann
  HTMLLinkElement
  (prototype HTMLLinkElement nil [-> HTMLLinkElement])))
((ann-interface
  SVGLocatable
  farthestViewportElement
  SVGElement
  nearestViewportElement
  SVGElement
  getBBox
  [-> SVGRect]
  getTransformToElement
  [SVGElement -> SVGMatrix]
  getCTM
  [-> SVGMatrix]
  getScreenCTM
  [-> SVGMatrix]))
((ann-interface HTMLFontElement face string))
((ann
  HTMLFontElement
  (prototype HTMLFontElement nil [-> HTMLFontElement])))
((ann-interface SVGTitleElement))
((ann
  SVGTitleElement
  (prototype SVGTitleElement nil [-> SVGTitleElement])))
((ann-interface
  ControlRangeCollection
  length
  number
  queryCommandValue
  [string -> any]
  remove
  [number -> void]
  add
  [Element -> void]
  queryCommandIndeterm
  [string -> boolean]
  scrollIntoView
  [{:opt any} -> void]
  item
  [number -> Element]
  []
  [number -> Element]
  execCommand
  [string {:opt boolean} {:opt any} -> boolean]
  addElement
  [Element -> void]
  queryCommandState
  [string -> boolean]
  queryCommandSupported
  [string -> boolean]
  queryCommandEnabled
  [string -> boolean]
  queryCommandText
  [string -> string]
  select
  [-> void]))
((ann
  ControlRangeCollection
  (prototype ControlRangeCollection nil [-> ControlRangeCollection])))
((ann-interface
  MSNamespaceInfo
  urn
  string
  onreadystatechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  name
  string
  readyState
  string
  doImport
  [string -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  MSNamespaceInfo
  (prototype MSNamespaceInfo nil [-> MSNamespaceInfo])))
((ann-interface WindowSessionStorage sessionStorage Storage))
((ann-interface
  SVGAnimatedTransformList
  animVal
  SVGTransformList
  baseVal
  SVGTransformList))
((ann
  SVGAnimatedTransformList
  (prototype
   SVGAnimatedTransformList
   nil
   [-> SVGAnimatedTransformList])))
((ann-interface HTMLTableCaptionElement align string vAlign string))
((ann
  HTMLTableCaptionElement
  (prototype HTMLTableCaptionElement nil [-> HTMLTableCaptionElement])))
((ann-interface
  HTMLOptionElement
  index
  number
  defaultSelected
  boolean
  value
  string
  text
  string
  form
  HTMLFormElement
  label
  string
  selected
  boolean
  create
  [-> HTMLOptionElement]))
((ann
  HTMLOptionElement
  (prototype HTMLOptionElement nil [-> HTMLOptionElement])))
((ann-interface HTMLMapElement name string areas HTMLAreasCollection))
((ann
  HTMLMapElement
  (prototype HTMLMapElement nil [-> HTMLMapElement])))
((ann-interface HTMLMenuElement type string))
((ann
  HTMLMenuElement
  (prototype HTMLMenuElement nil [-> HTMLMenuElement])))
((ann-interface
  MouseWheelEvent
  wheelDelta
  number
  initMouseWheelEvent
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
   void]))
((ann
  MouseWheelEvent
  (prototype MouseWheelEvent nil [-> MouseWheelEvent])))
((ann-interface
  SVGFitToViewBox
  viewBox
  SVGAnimatedRect
  preserveAspectRatio
  SVGAnimatedPreserveAspectRatio))
((ann-interface
  SVGPointList
  numberOfItems
  number
  replaceItem
  [SVGPoint number -> SVGPoint]
  getItem
  [number -> SVGPoint]
  clear
  [-> void]
  appendItem
  [SVGPoint -> SVGPoint]
  initialize
  [SVGPoint -> SVGPoint]
  removeItem
  [number -> SVGPoint]
  insertItemBefore
  [SVGPoint number -> SVGPoint]))
((ann SVGPointList (prototype SVGPointList nil [-> SVGPointList])))
((ann-interface
  SVGAnimatedLengthList
  animVal
  SVGLengthList
  baseVal
  SVGLengthList))
((ann
  SVGAnimatedLengthList
  (prototype SVGAnimatedLengthList nil [-> SVGAnimatedLengthList])))
((ann-interface
  Window
  ondragend
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onkeydown
  [KeyboardEvent -> any]
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void]
  ondragover
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onkeyup
  [KeyboardEvent -> any]
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void]
  onreset
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onmouseup
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  ondragstart
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  ondrag
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  screenX
  number
  onmouseover
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  ondragleave
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  history
  History
  pageXOffset
  number
  name
  string
  onafterprint
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onpause
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onbeforeprint
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  top
  Window
  onmousedown
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onseeked
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  opener
  Window
  onclick
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  innerHeight
  number
  onwaiting
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  ononline
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  ondurationchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  frames
  Window
  onblur
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  onemptied
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onseeking
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  oncanplay
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  outerWidth
  number
  onstalled
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onmousemove
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  innerWidth
  number
  onoffline
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  length
  number
  screen
  Screen
  onbeforeunload
  [BeforeUnloadEvent -> any]
  addEventListener
  [*not-implemented* [BeforeUnloadEvent -> any] {:opt boolean} -> void]
  onratechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onstorage
  [StorageEvent -> any]
  addEventListener
  [*not-implemented* [StorageEvent -> any] {:opt boolean} -> void]
  onloadstart
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  ondragenter
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onsubmit
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  self
  Window
  document
  Document
  onprogress
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  ondblclick
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  pageYOffset
  number
  oncontextmenu
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onloadedmetadata
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onplay
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onerror
  ErrorEventHandler
  onplaying
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  parent
  Window
  location
  Location
  oncanplaythrough
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onabort
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  onreadystatechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  outerHeight
  number
  onkeypress
  [KeyboardEvent -> any]
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void]
  frameElement
  Element
  onloadeddata
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onsuspend
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  window
  Window
  onfocus
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  onmessage
  [MessageEvent -> any]
  addEventListener
  [*not-implemented* [MessageEvent -> any] {:opt boolean} -> void]
  ontimeupdate
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onresize
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  onselect
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  navigator
  Navigator
  styleMedia
  StyleMedia
  ondrop
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onmouseout
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onended
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onhashchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onunload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onscroll
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  screenY
  number
  onmousewheel
  [MouseWheelEvent -> any]
  addEventListener
  [*not-implemented* [MouseWheelEvent -> any] {:opt boolean} -> void]
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onvolumechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  oninput
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  performance
  Performance
  alert
  [{:opt string} -> void]
  scroll
  [{:opt number} {:opt number} -> void]
  focus
  [-> void]
  scrollTo
  [{:opt number} {:opt number} -> void]
  print
  [-> void]
  prompt
  [{:opt string} {:opt string} -> string]
  toString
  [-> string]
  open
  [{:opt string} {:opt string} {:opt string} {:opt boolean} -> Window]
  scrollBy
  [{:opt number} {:opt number} -> void]
  confirm
  [{:opt string} -> boolean]
  close
  [-> void]
  postMessage
  [any string {:opt any} -> void]
  showModalDialog
  [{:opt string} {:opt any} {:opt any} -> any]
  blur
  [-> void]
  getSelection
  [-> Selection]
  getComputedStyle
  [Element {:opt string} -> CSSStyleDeclaration]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann Window (prototype Window nil [-> Window])))
((ann-interface
  SVGAnimatedPreserveAspectRatio
  animVal
  SVGPreserveAspectRatio
  baseVal
  SVGPreserveAspectRatio))
((ann
  SVGAnimatedPreserveAspectRatio
  (prototype
   SVGAnimatedPreserveAspectRatio
   nil
   [-> SVGAnimatedPreserveAspectRatio])))
((ann-interface MSSiteModeEvent buttonID number actionURL string))
((ann
  MSSiteModeEvent
  (prototype MSSiteModeEvent nil [-> MSSiteModeEvent])))
((ann-interface DOML2DeprecatedTextFlowControl clear string))
((ann-interface
  StyleSheetPageList
  length
  number
  item
  [number -> CSSPageRule]
  []
  [number -> CSSPageRule]))
((ann
  StyleSheetPageList
  (prototype StyleSheetPageList nil [-> StyleSheetPageList])))
((ann-interface
  MSCSSProperties
  scrollbarShadowColor
  string
  scrollbarHighlightColor
  string
  layoutGridChar
  string
  layoutGridType
  string
  textAutospace
  string
  textKashidaSpace
  string
  writingMode
  string
  scrollbarFaceColor
  string
  backgroundPositionY
  string
  lineBreak
  string
  imeMode
  string
  msBlockProgression
  string
  layoutGridLine
  string
  scrollbarBaseColor
  string
  layoutGrid
  string
  layoutFlow
  string
  textKashida
  string
  filter
  string
  zoom
  string
  scrollbarArrowColor
  string
  behavior
  string
  backgroundPositionX
  string
  accelerator
  string
  layoutGridMode
  string
  textJustifyTrim
  string
  scrollbar3dLightColor
  string
  msInterpolationMode
  string
  scrollbarTrackColor
  string
  scrollbarDarkShadowColor
  string
  styleFloat
  string
  getAttribute
  [string {:opt number} -> any]
  setAttribute
  [string any {:opt number} -> void]
  removeAttribute
  [string {:opt number} -> boolean]))
((ann
  MSCSSProperties
  (prototype MSCSSProperties nil [-> MSCSSProperties])))
((ann-interface
  HTMLCollection
  length
  number
  item
  [{:opt any} {:opt any} -> Element]
  namedItem
  [string -> Element]
  []
  [number -> Element]))
((ann
  HTMLCollection
  (prototype HTMLCollection nil [-> HTMLCollection])))
((ann-interface
  SVGExternalResourcesRequired
  externalResourcesRequired
  SVGAnimatedBoolean))
((ann-interface
  HTMLImageElement
  width
  number
  vspace
  number
  naturalHeight
  number
  alt
  string
  align
  string
  src
  string
  useMap
  string
  naturalWidth
  number
  name
  string
  height
  number
  border
  string
  hspace
  number
  longDesc
  string
  href
  string
  isMap
  boolean
  complete
  boolean
  create
  [-> HTMLImageElement]))
((ann
  HTMLImageElement
  (prototype HTMLImageElement nil [-> HTMLImageElement])))
((ann-interface
  HTMLAreaElement
  protocol
  string
  search
  string
  alt
  string
  coords
  string
  hostname
  string
  port
  string
  pathname
  string
  host
  string
  hash
  string
  target
  string
  href
  string
  noHref
  boolean
  shape
  string
  toString
  [-> string]))
((ann
  HTMLAreaElement
  (prototype HTMLAreaElement nil [-> HTMLAreaElement])))
((ann-interface
  EventTarget
  removeEventListener
  [string EventListener {:opt boolean} -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]
  dispatchEvent
  [Event -> boolean]))
((ann-interface
  SVGAngle
  valueAsString
  string
  valueInSpecifiedUnits
  number
  value
  number
  unitType
  number
  newValueSpecifiedUnits
  [number number -> void]
  convertToSpecifiedUnits
  [number -> void]
  SVG_ANGLETYPE_RAD
  number
  SVG_ANGLETYPE_UNKNOWN
  number
  SVG_ANGLETYPE_UNSPECIFIED
  number
  SVG_ANGLETYPE_DEG
  number
  SVG_ANGLETYPE_GRAD
  number))
((ann
  SVGAngle
  (prototype
   SVGAngle
   nil
   [-> SVGAngle]
   SVG_ANGLETYPE_RAD
   number
   SVG_ANGLETYPE_UNKNOWN
   number
   SVG_ANGLETYPE_UNSPECIFIED
   number
   SVG_ANGLETYPE_DEG
   number
   SVG_ANGLETYPE_GRAD
   number)))
((ann-interface
  HTMLButtonElement
  value
  string
  status
  any
  form
  HTMLFormElement
  name
  string
  type
  string
  createTextRange
  [-> TextRange]))
((ann
  HTMLButtonElement
  (prototype HTMLButtonElement nil [-> HTMLButtonElement])))
((ann-interface HTMLSourceElement src string media string type string))
((ann
  HTMLSourceElement
  (prototype HTMLSourceElement nil [-> HTMLSourceElement])))
((ann-interface CanvasGradient addColorStop [number string -> void]))
((ann
  CanvasGradient
  (prototype CanvasGradient nil [-> CanvasGradient])))
((ann-interface
  KeyboardEvent
  location
  number
  keyCode
  number
  shiftKey
  boolean
  which
  number
  locale
  string
  key
  string
  altKey
  boolean
  metaKey
  boolean
  char
  string
  ctrlKey
  boolean
  repeat
  boolean
  charCode
  number
  getModifierState
  [string -> boolean]
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
   void]
  DOM_KEY_LOCATION_RIGHT
  number
  DOM_KEY_LOCATION_STANDARD
  number
  DOM_KEY_LOCATION_LEFT
  number
  DOM_KEY_LOCATION_NUMPAD
  number
  DOM_KEY_LOCATION_JOYSTICK
  number
  DOM_KEY_LOCATION_MOBILE
  number))
((ann
  KeyboardEvent
  (prototype
   KeyboardEvent
   nil
   [-> KeyboardEvent]
   DOM_KEY_LOCATION_RIGHT
   number
   DOM_KEY_LOCATION_STANDARD
   number
   DOM_KEY_LOCATION_LEFT
   number
   DOM_KEY_LOCATION_NUMPAD
   number
   DOM_KEY_LOCATION_JOYSTICK
   number
   DOM_KEY_LOCATION_MOBILE
   number)))
((ann-interface
  Document
  compatible
  MSCompatibleInfoCollection
  onkeydown
  [KeyboardEvent -> any]
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void]
  onkeyup
  [KeyboardEvent -> any]
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void]
  implementation
  DOMImplementation
  onreset
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  scripts
  HTMLCollection
  onhelp
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  ondragleave
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  charset
  string
  onfocusin
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  vlinkColor
  string
  onseeked
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  security
  string
  title
  string
  namespaces
  MSNamespaceInfoCollection
  defaultCharset
  string
  embeds
  HTMLCollection
  styleSheets
  StyleSheetList
  frames
  Window
  ondurationchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  all
  HTMLCollection
  forms
  HTMLCollection
  onblur
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  dir
  string
  onemptied
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  designMode
  string
  onseeking
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  ondeactivate
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  oncanplay
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  ondatasetchanged
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onrowsdelete
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  Script
  MSScriptHost
  onloadstart
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  URLUnencoded
  string
  defaultView
  Window
  oncontrolselect
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  ondragenter
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onsubmit
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  inputEncoding
  string
  activeElement
  Element
  onchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  links
  HTMLCollection
  uniqueID
  string
  URL
  string
  onbeforeactivate
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  head
  HTMLHeadElement
  cookie
  string
  xmlEncoding
  string
  oncanplaythrough
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  documentMode
  number
  characterSet
  string
  anchors
  HTMLCollection
  onbeforeupdate
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  ondatasetcomplete
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  plugins
  HTMLCollection
  onsuspend
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  rootElement
  SVGSVGElement
  readyState
  string
  referrer
  string
  alinkColor
  string
  onerrorupdate
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  parentWindow
  Window
  onmouseout
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onmsthumbnailclick
  [MSSiteModeEvent -> any]
  addEventListener
  [*not-implemented* [MSSiteModeEvent -> any] {:opt boolean} -> void]
  onmousewheel
  [MouseWheelEvent -> any]
  addEventListener
  [*not-implemented* [MouseWheelEvent -> any] {:opt boolean} -> void]
  onvolumechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  oncellchange
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onrowexit
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onrowsinserted
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  xmlVersion
  string
  msCapsLockWarningOff
  boolean
  onpropertychange
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  ondragend
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  doctype
  DocumentType
  ondragover
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  bgColor
  string
  ondragstart
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onmouseup
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  ondrag
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onmouseover
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  linkColor
  string
  onpause
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onmousedown
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onclick
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onwaiting
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onstop
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onmssitemodejumplistitemremoved
  [MSSiteModeEvent -> any]
  addEventListener
  [*not-implemented* [MSSiteModeEvent -> any] {:opt boolean} -> void]
  applets
  HTMLCollection
  body
  HTMLElement
  domain
  string
  xmlStandalone
  boolean
  selection
  MSSelection
  onstalled
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onmousemove
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  documentElement
  Element
  onbeforeeditfocus
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onratechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onprogress
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  ondblclick
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  oncontextmenu
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onloadedmetadata
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  media
  string
  onerror
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onplay
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onafterupdate
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onplaying
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  images
  HTMLCollection
  location
  Location
  onabort
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  onfocusout
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  onselectionchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onstoragecommit
  [StorageEvent -> any]
  addEventListener
  [*not-implemented* [StorageEvent -> any] {:opt boolean} -> void]
  ondataavailable
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onreadystatechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  lastModified
  string
  onkeypress
  [KeyboardEvent -> any]
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void]
  onloadeddata
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onbeforedeactivate
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  onactivate
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  onselectstart
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onfocus
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  fgColor
  string
  ontimeupdate
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onselect
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  ondrop
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onended
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  compatMode
  string
  onscroll
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  onrowenter
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  oninput
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  queryCommandValue
  [string -> string]
  adoptNode
  [Node -> Node]
  queryCommandIndeterm
  [string -> boolean]
  getElementsByTagNameNS
  [string string -> NodeList]
  createProcessingInstruction
  [string string -> ProcessingInstruction]
  execCommand
  [string {:opt boolean} {:opt any} -> boolean]
  elementFromPoint
  [number number -> Element]
  createCDATASection
  [string -> CDATASection]
  queryCommandText
  [string -> string]
  write
  [(string *) -> void]
  updateSettings
  [-> void]
  createElement
  [string -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLAnchorElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLAreaElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLAudioElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLBaseElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLQuoteElement]
  createElement
  [*not-implemented* -> HTMLBodyElement]
  createElement
  [*not-implemented* -> HTMLBRElement]
  createElement
  [*not-implemented* -> HTMLButtonElement]
  createElement
  [*not-implemented* -> HTMLCanvasElement]
  createElement
  [*not-implemented* -> HTMLTableCaptionElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLTableColElement]
  createElement
  [*not-implemented* -> HTMLTableColElement]
  createElement
  [*not-implemented* -> HTMLDataListElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLModElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLDivElement]
  createElement
  [*not-implemented* -> HTMLDListElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLEmbedElement]
  createElement
  [*not-implemented* -> HTMLFieldSetElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLFormElement]
  createElement
  [*not-implemented* -> HTMLHeadingElement]
  createElement
  [*not-implemented* -> HTMLHeadingElement]
  createElement
  [*not-implemented* -> HTMLHeadingElement]
  createElement
  [*not-implemented* -> HTMLHeadingElement]
  createElement
  [*not-implemented* -> HTMLHeadingElement]
  createElement
  [*not-implemented* -> HTMLHeadingElement]
  createElement
  [*not-implemented* -> HTMLHeadElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLHRElement]
  createElement
  [*not-implemented* -> HTMLHtmlElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLIFrameElement]
  createElement
  [*not-implemented* -> HTMLImageElement]
  createElement
  [*not-implemented* -> HTMLInputElement]
  createElement
  [*not-implemented* -> HTMLModElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLLabelElement]
  createElement
  [*not-implemented* -> HTMLLegendElement]
  createElement
  [*not-implemented* -> HTMLLIElement]
  createElement
  [*not-implemented* -> HTMLLinkElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLMapElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLMenuElement]
  createElement
  [*not-implemented* -> HTMLMetaElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLObjectElement]
  createElement
  [*not-implemented* -> HTMLOListElement]
  createElement
  [*not-implemented* -> HTMLOptGroupElement]
  createElement
  [*not-implemented* -> HTMLOptionElement]
  createElement
  [*not-implemented* -> HTMLParagraphElement]
  createElement
  [*not-implemented* -> HTMLParamElement]
  createElement
  [*not-implemented* -> HTMLPreElement]
  createElement
  [*not-implemented* -> HTMLProgressElement]
  createElement
  [*not-implemented* -> HTMLQuoteElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLScriptElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLSelectElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLSourceElement]
  createElement
  [*not-implemented* -> HTMLSpanElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLStyleElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLTableElement]
  createElement
  [*not-implemented* -> HTMLTableSectionElement]
  createElement
  [*not-implemented* -> HTMLTableDataCellElement]
  createElement
  [*not-implemented* -> HTMLTextAreaElement]
  createElement
  [*not-implemented* -> HTMLTableSectionElement]
  createElement
  [*not-implemented* -> HTMLTableHeaderCellElement]
  createElement
  [*not-implemented* -> HTMLTableSectionElement]
  createElement
  [*not-implemented* -> HTMLTitleElement]
  createElement
  [*not-implemented* -> HTMLTableRowElement]
  createElement
  [*not-implemented* -> HTMLTrackElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLUListElement]
  createElement
  [*not-implemented* -> HTMLElement]
  createElement
  [*not-implemented* -> HTMLVideoElement]
  createElement
  [*not-implemented* -> HTMLElement]
  releaseCapture
  [-> void]
  writeln
  [(string *) -> void]
  createElementNS
  [string string -> Element]
  open
  [{:opt string} {:opt string} {:opt string} {:opt boolean} -> any]
  queryCommandSupported
  [string -> boolean]
  createTreeWalker
  [Node number NodeFilter boolean -> TreeWalker]
  createAttributeNS
  [string string -> Attr]
  queryCommandEnabled
  [string -> boolean]
  focus
  [-> void]
  close
  [-> void]
  getElementsByClassName
  [string -> NodeList]
  importNode
  [Node boolean -> Node]
  createRange
  [-> Range]
  fireEvent
  [string {:opt any} -> boolean]
  createComment
  [string -> Comment]
  getElementsByTagName
  [string -> NodeList]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  getElementsByTagName
  [*not-implemented* -> NodeListOf]
  createDocumentFragment
  [-> DocumentFragment]
  createStyleSheet
  [{:opt string} {:opt number} -> CSSStyleSheet]
  getElementsByName
  [string -> NodeList]
  queryCommandState
  [string -> boolean]
  hasFocus
  [-> boolean]
  execCommandShowHelp
  [string -> boolean]
  createAttribute
  [string -> Attr]
  createTextNode
  [string -> Text]
  createNodeIterator
  [Node number NodeFilter boolean -> NodeIterator]
  createEventObject
  [{:opt any} -> MSEventObj]
  getSelection
  [-> Selection]
  getElementById
  [string -> HTMLElement]
  addEventListener
  [string EventListener {:opt boolean} -> void]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]))
((ann Document (prototype Document nil [-> Document])))
((ann-interface
  MessageEvent
  source
  Window
  origin
  string
  data
  any
  initMessageEvent
  [string boolean boolean any string string Window -> void]))
((ann MessageEvent (prototype MessageEvent nil [-> MessageEvent])))
((ann-interface
  SVGElement
  onmouseover
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  viewportElement
  SVGElement
  onmousemove
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onmouseout
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  ondblclick
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onfocusout
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  onfocusin
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  xmlbase
  string
  onmousedown
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onmouseup
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onclick
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  ownerSVGElement
  SVGSVGElement
  id
  string
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann SVGElement (prototype SVGElement nil [-> SVGElement])))
((ann-interface
  HTMLScriptElement
  defer
  boolean
  text
  string
  src
  string
  htmlFor
  string
  charset
  string
  type
  string
  event
  string))
((ann
  HTMLScriptElement
  (prototype HTMLScriptElement nil [-> HTMLScriptElement])))
((ann-interface
  HTMLTableRowElement
  rowIndex
  number
  cells
  HTMLCollection
  align
  string
  borderColorLight
  any
  sectionRowIndex
  number
  borderColor
  any
  height
  any
  borderColorDark
  any
  deleteCell
  [{:opt number} -> void]
  insertCell
  [{:opt number} -> HTMLElement]))
((ann
  HTMLTableRowElement
  (prototype HTMLTableRowElement nil [-> HTMLTableRowElement])))
((ann-interface
  CanvasRenderingContext2D
  miterLimit
  number
  font
  string
  globalCompositeOperation
  string
  msFillRule
  string
  lineCap
  string
  msImageSmoothingEnabled
  boolean
  lineDashOffset
  number
  shadowColor
  string
  lineJoin
  string
  shadowOffsetX
  number
  lineWidth
  number
  canvas
  HTMLCanvasElement
  strokeStyle
  any
  globalAlpha
  number
  shadowOffsetY
  number
  fillStyle
  any
  shadowBlur
  number
  textAlign
  string
  textBaseline
  string
  restore
  [-> void]
  setTransform
  [number number number number number number -> void]
  save
  [-> void]
  arc
  [number number number number number {:opt boolean} -> void]
  measureText
  [string -> TextMetrics]
  isPointInPath
  [number number {:opt string} -> boolean]
  quadraticCurveTo
  [number number number number -> void]
  putImageData
  [ImageData
   number
   number
   {:opt number}
   {:opt number}
   {:opt number}
   {:opt number}
   ->
   void]
  rotate
  [number -> void]
  fillText
  [string number number {:opt number} -> void]
  translate
  [number number -> void]
  scale
  [number number -> void]
  createRadialGradient
  [number number number number number number -> CanvasGradient]
  lineTo
  [number number -> void]
  getLineDash
  [-> Array]
  fill
  [{:opt string} -> void]
  createImageData
  [any {:opt number} -> ImageData]
  createPattern
  [HTMLElement string -> CanvasPattern]
  closePath
  [-> void]
  rect
  [number number number number -> void]
  clip
  [{:opt string} -> void]
  clearRect
  [number number number number -> void]
  moveTo
  [number number -> void]
  getImageData
  [number number number number -> ImageData]
  fillRect
  [number number number number -> void]
  bezierCurveTo
  [number number number number number number -> void]
  drawImage
  [HTMLElement
   number
   number
   {:opt number}
   {:opt number}
   {:opt number}
   {:opt number}
   {:opt number}
   {:opt number}
   ->
   void]
  transform
  [number number number number number number -> void]
  stroke
  [-> void]
  strokeRect
  [number number number number -> void]
  setLineDash
  [Array -> void]
  strokeText
  [string number number {:opt number} -> void]
  beginPath
  [-> void]
  arcTo
  [number number number number number -> void]
  createLinearGradient
  [number number number number -> CanvasGradient]))
((ann
  CanvasRenderingContext2D
  (prototype
   CanvasRenderingContext2D
   nil
   [-> CanvasRenderingContext2D])))
((ann-interface
  MSCSSRuleList
  length
  number
  item
  [{:opt number} -> CSSStyleRule]
  []
  [number -> CSSStyleRule]))
((ann MSCSSRuleList (prototype MSCSSRuleList nil [-> MSCSSRuleList])))
((ann-interface SVGPathSegLinetoHorizontalAbs x number))
((ann
  SVGPathSegLinetoHorizontalAbs
  (prototype
   SVGPathSegLinetoHorizontalAbs
   nil
   [-> SVGPathSegLinetoHorizontalAbs])))
((ann-interface
  SVGPathSegArcAbs
  y
  number
  sweepFlag
  boolean
  r2
  number
  x
  number
  angle
  number
  r1
  number
  largeArcFlag
  boolean))
((ann
  SVGPathSegArcAbs
  (prototype SVGPathSegArcAbs nil [-> SVGPathSegArcAbs])))
((ann-interface
  SVGTransformList
  numberOfItems
  number
  getItem
  [number -> SVGTransform]
  consolidate
  [-> SVGTransform]
  clear
  [-> void]
  appendItem
  [SVGTransform -> SVGTransform]
  initialize
  [SVGTransform -> SVGTransform]
  removeItem
  [number -> SVGTransform]
  insertItemBefore
  [SVGTransform number -> SVGTransform]
  replaceItem
  [SVGTransform number -> SVGTransform]
  createSVGTransformFromMatrix
  [SVGMatrix -> SVGTransform]))
((ann
  SVGTransformList
  (prototype SVGTransformList nil [-> SVGTransformList])))
((ann-interface HTMLHtmlElement version string))
((ann
  HTMLHtmlElement
  (prototype HTMLHtmlElement nil [-> HTMLHtmlElement])))
((ann-interface SVGPathSegClosePath))
((ann
  SVGPathSegClosePath
  (prototype SVGPathSegClosePath nil [-> SVGPathSegClosePath])))
((ann-interface
  HTMLFrameElement
  width
  any
  scrolling
  string
  marginHeight
  string
  marginWidth
  string
  borderColor
  any
  frameSpacing
  any
  frameBorder
  string
  noResize
  boolean
  contentWindow
  Window
  src
  string
  name
  string
  height
  any
  contentDocument
  Document
  border
  string
  longDesc
  string
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  security
  any
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  HTMLFrameElement
  (prototype HTMLFrameElement nil [-> HTMLFrameElement])))
((ann-interface SVGAnimatedLength animVal SVGLength baseVal SVGLength))
((ann
  SVGAnimatedLength
  (prototype SVGAnimatedLength nil [-> SVGAnimatedLength])))
((ann-interface
  SVGAnimatedPoints
  points
  SVGPointList
  animatedPoints
  SVGPointList))
((ann-interface SVGDefsElement))
((ann
  SVGDefsElement
  (prototype SVGDefsElement nil [-> SVGDefsElement])))
((ann-interface HTMLQuoteElement dateTime string cite string))
((ann
  HTMLQuoteElement
  (prototype HTMLQuoteElement nil [-> HTMLQuoteElement])))
((ann-interface
  CSSMediaRule
  media
  MediaList
  cssRules
  CSSRuleList
  insertRule
  [string {:opt number} -> number]
  deleteRule
  [{:opt number} -> void]))
((ann CSSMediaRule (prototype CSSMediaRule nil [-> CSSMediaRule])))
((ann-interface WindowModal dialogArguments any returnValue any))
((ann-interface
  XMLHttpRequest
  responseBody
  any
  status
  number
  readyState
  number
  responseText
  string
  responseXML
  Document
  ontimeout
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  statusText
  string
  onreadystatechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  timeout
  number
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  open
  [string string {:opt boolean} {:opt string} {:opt string} -> void]
  create
  [-> XMLHttpRequest]
  send
  [{:opt any} -> void]
  abort
  [-> void]
  getAllResponseHeaders
  [-> string]
  setRequestHeader
  [string string -> void]
  getResponseHeader
  [string -> string]
  addEventListener
  [string EventListener {:opt boolean} -> void]
  LOADING
  number
  DONE
  number
  UNSENT
  number
  OPENED
  number
  HEADERS_RECEIVED
  number))
((ann
  XMLHttpRequest
  (prototype
   XMLHttpRequest
   nil
   [-> XMLHttpRequest]
   LOADING
   number
   DONE
   number
   UNSENT
   number
   OPENED
   number
   HEADERS_RECEIVED
   number)))
((ann-interface HTMLTableHeaderCellElement scope string))
((ann
  HTMLTableHeaderCellElement
  (prototype
   HTMLTableHeaderCellElement
   nil
   [-> HTMLTableHeaderCellElement])))
((ann-interface HTMLDListElement))
((ann
  HTMLDListElement
  (prototype HTMLDListElement nil [-> HTMLDListElement])))
((ann-interface
  MSDataBindingExtensions
  dataSrc
  string
  dataFormatAs
  string
  dataFld
  string))
((ann-interface SVGPathSegLinetoHorizontalRel x number))
((ann
  SVGPathSegLinetoHorizontalRel
  (prototype
   SVGPathSegLinetoHorizontalRel
   nil
   [-> SVGPathSegLinetoHorizontalRel])))
((ann-interface
  SVGEllipseElement
  ry
  SVGAnimatedLength
  cx
  SVGAnimatedLength
  rx
  SVGAnimatedLength
  cy
  SVGAnimatedLength))
((ann
  SVGEllipseElement
  (prototype SVGEllipseElement nil [-> SVGEllipseElement])))
((ann-interface SVGAElement target SVGAnimatedString))
((ann SVGAElement (prototype SVGAElement nil [-> SVGAElement])))
((ann-interface
  SVGStylable
  className
  SVGAnimatedString
  style
  CSSStyleDeclaration))
((ann-interface SVGTransformable transform SVGAnimatedTransformList))
((ann-interface
  HTMLFrameSetElement
  ononline
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  borderColor
  any
  rows
  string
  cols
  string
  onblur
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  frameSpacing
  any
  onfocus
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  onmessage
  [MessageEvent -> any]
  addEventListener
  [*not-implemented* [MessageEvent -> any] {:opt boolean} -> void]
  onerror
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  frameBorder
  string
  onresize
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  name
  string
  onafterprint
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onbeforeprint
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onoffline
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  border
  string
  onunload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onhashchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onbeforeunload
  [BeforeUnloadEvent -> any]
  addEventListener
  [*not-implemented* [BeforeUnloadEvent -> any] {:opt boolean} -> void]
  onstorage
  [StorageEvent -> any]
  addEventListener
  [*not-implemented* [StorageEvent -> any] {:opt boolean} -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  HTMLFrameSetElement
  (prototype HTMLFrameSetElement nil [-> HTMLFrameSetElement])))
((ann-interface
  Screen
  width
  number
  deviceXDPI
  number
  fontSmoothingEnabled
  boolean
  bufferDepth
  number
  logicalXDPI
  number
  systemXDPI
  number
  availHeight
  number
  height
  number
  logicalYDPI
  number
  systemYDPI
  number
  updateInterval
  number
  colorDepth
  number
  availWidth
  number
  deviceYDPI
  number
  pixelDepth
  number))
((ann Screen (prototype Screen nil [-> Screen])))
((ann-interface
  Coordinates
  altitudeAccuracy
  number
  longitude
  number
  latitude
  number
  speed
  number
  heading
  number
  altitude
  number
  accuracy
  number))
((ann Coordinates (prototype Coordinates nil [-> Coordinates])))
((ann-interface NavigatorGeolocation geolocation Geolocation))
((ann-interface NavigatorContentUtils))
((ann-interface EventListener Event -> void))
((ann-interface SVGLangSpace xmllang string xmlspace string))
((ann-interface
  DataTransfer
  effectAllowed
  string
  dropEffect
  string
  clearData
  [{:opt string} -> boolean]
  setData
  [string string -> boolean]
  getData
  [string -> string]))
((ann DataTransfer (prototype DataTransfer nil [-> DataTransfer])))
((ann-interface
  FocusEvent
  relatedTarget
  EventTarget
  initFocusEvent
  [string boolean boolean Window number EventTarget -> void]))
((ann FocusEvent (prototype FocusEvent nil [-> FocusEvent])))
((ann-interface
  Range
  startOffset
  number
  collapsed
  boolean
  endOffset
  number
  startContainer
  Node
  endContainer
  Node
  commonAncestorContainer
  Node
  setStart
  [Node number -> void]
  setEndBefore
  [Node -> void]
  setStartBefore
  [Node -> void]
  selectNode
  [Node -> void]
  detach
  [-> void]
  getBoundingClientRect
  [-> ClientRect]
  toString
  [-> string]
  compareBoundaryPoints
  [number Range -> number]
  insertNode
  [Node -> void]
  collapse
  [boolean -> void]
  selectNodeContents
  [Node -> void]
  cloneContents
  [-> DocumentFragment]
  setEnd
  [Node number -> void]
  cloneRange
  [-> Range]
  getClientRects
  [-> ClientRectList]
  surroundContents
  [Node -> void]
  deleteContents
  [-> void]
  setStartAfter
  [Node -> void]
  extractContents
  [-> DocumentFragment]
  setEndAfter
  [Node -> void]
  END_TO_END
  number
  START_TO_START
  number
  START_TO_END
  number
  END_TO_START
  number))
((ann
  Range
  (prototype
   Range
   nil
   [-> Range]
   END_TO_END
   number
   START_TO_START
   number
   START_TO_END
   number
   END_TO_START
   number)))
((ann-interface
  SVGPoint
  y
  number
  x
  number
  matrixTransform
  [SVGMatrix -> SVGPoint]))
((ann SVGPoint (prototype SVGPoint nil [-> SVGPoint])))
((ann-interface
  MSPluginsCollection
  length
  number
  refresh
  [{:opt boolean} -> void]))
((ann
  MSPluginsCollection
  (prototype MSPluginsCollection nil [-> MSPluginsCollection])))
((ann-interface
  SVGAnimatedNumberList
  animVal
  SVGNumberList
  baseVal
  SVGNumberList))
((ann
  SVGAnimatedNumberList
  (prototype SVGAnimatedNumberList nil [-> SVGAnimatedNumberList])))
((ann-interface
  SVGSVGElement
  width
  SVGAnimatedLength
  x
  SVGAnimatedLength
  contentStyleType
  string
  onzoom
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  y
  SVGAnimatedLength
  viewport
  SVGRect
  onerror
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  pixelUnitToMillimeterY
  number
  onresize
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  screenPixelToMillimeterY
  number
  height
  SVGAnimatedLength
  onabort
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  contentScriptType
  string
  pixelUnitToMillimeterX
  number
  currentTranslate
  SVGPoint
  onunload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  currentScale
  number
  onscroll
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  screenPixelToMillimeterX
  number
  setCurrentTime
  [number -> void]
  createSVGLength
  [-> SVGLength]
  getIntersectionList
  [SVGRect SVGElement -> NodeList]
  unpauseAnimations
  [-> void]
  createSVGRect
  [-> SVGRect]
  checkIntersection
  [SVGElement SVGRect -> boolean]
  unsuspendRedrawAll
  [-> void]
  pauseAnimations
  [-> void]
  suspendRedraw
  [number -> number]
  deselectAll
  [-> void]
  createSVGAngle
  [-> SVGAngle]
  getEnclosureList
  [SVGRect SVGElement -> NodeList]
  createSVGTransform
  [-> SVGTransform]
  unsuspendRedraw
  [number -> void]
  forceRedraw
  [-> void]
  getCurrentTime
  [-> number]
  checkEnclosure
  [SVGElement SVGRect -> boolean]
  createSVGMatrix
  [-> SVGMatrix]
  createSVGPoint
  [-> SVGPoint]
  createSVGNumber
  [-> SVGNumber]
  createSVGTransformFromMatrix
  [SVGMatrix -> SVGTransform]
  getComputedStyle
  [Element {:opt string} -> CSSStyleDeclaration]
  getElementById
  [string -> Element]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann SVGSVGElement (prototype SVGSVGElement nil [-> SVGSVGElement])))
((ann-interface HTMLLabelElement htmlFor string form HTMLFormElement))
((ann
  HTMLLabelElement
  (prototype HTMLLabelElement nil [-> HTMLLabelElement])))
((ann-interface
  MSResourceMetadata
  protocol
  string
  fileSize
  string
  fileUpdatedDate
  string
  nameProp
  string
  fileCreatedDate
  string
  fileModifiedDate
  string
  mimeType
  string))
((ann-interface HTMLLegendElement align string form HTMLFormElement))
((ann
  HTMLLegendElement
  (prototype HTMLLegendElement nil [-> HTMLLegendElement])))
((ann-interface HTMLDirectoryElement))
((ann
  HTMLDirectoryElement
  (prototype HTMLDirectoryElement nil [-> HTMLDirectoryElement])))
((ann-interface SVGAnimatedInteger animVal number baseVal number))
((ann
  SVGAnimatedInteger
  (prototype SVGAnimatedInteger nil [-> SVGAnimatedInteger])))
((ann-interface SVGTextElement))
((ann
  SVGTextElement
  (prototype SVGTextElement nil [-> SVGTextElement])))
((ann-interface SVGTSpanElement))
((ann
  SVGTSpanElement
  (prototype SVGTSpanElement nil [-> SVGTSpanElement])))
((ann-interface HTMLLIElement value number))
((ann HTMLLIElement (prototype HTMLLIElement nil [-> HTMLLIElement])))
((ann-interface SVGPathSegLinetoVerticalAbs y number))
((ann
  SVGPathSegLinetoVerticalAbs
  (prototype
   SVGPathSegLinetoVerticalAbs
   nil
   [-> SVGPathSegLinetoVerticalAbs])))
((ann-interface MSStorageExtensions remainingSpace number))
((ann-interface SVGStyleElement media string type string title string))
((ann
  SVGStyleElement
  (prototype SVGStyleElement nil [-> SVGStyleElement])))
((ann-interface
  MSCurrentStyleCSSProperties
  blockDirection
  string
  clipBottom
  string
  clipLeft
  string
  clipRight
  string
  clipTop
  string
  hasLayout
  string))
((ann
  MSCurrentStyleCSSProperties
  (prototype
   MSCurrentStyleCSSProperties
   nil
   [-> MSCurrentStyleCSSProperties])))
((ann-interface
  MSHTMLCollectionExtensions
  urns
  [any -> Object]
  tags
  [any -> Object]))
((ann-interface
  Storage
  length
  number
  getItem
  [string -> any]
  []
  [string -> any]
  setItem
  [string string -> void]
  clear
  [-> void]
  removeItem
  [string -> void]
  key
  [number -> string]
  []
  [number -> any]))
((ann Storage (prototype Storage nil [-> Storage])))
((ann-interface
  HTMLIFrameElement
  width
  string
  scrolling
  string
  marginHeight
  string
  marginWidth
  string
  frameSpacing
  any
  frameBorder
  string
  noResize
  boolean
  vspace
  number
  contentWindow
  Window
  align
  string
  src
  string
  name
  string
  height
  string
  border
  string
  contentDocument
  Document
  hspace
  number
  longDesc
  string
  security
  any
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  HTMLIFrameElement
  (prototype HTMLIFrameElement nil [-> HTMLIFrameElement])))
((ann-interface
  TextRangeCollection
  length
  number
  item
  [number -> TextRange]
  []
  [number -> TextRange]))
((ann
  TextRangeCollection
  (prototype TextRangeCollection nil [-> TextRangeCollection])))
((ann-interface
  HTMLBodyElement
  scroll
  string
  ononline
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onblur
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  noWrap
  boolean
  onfocus
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  onmessage
  [MessageEvent -> any]
  addEventListener
  [*not-implemented* [MessageEvent -> any] {:opt boolean} -> void]
  text
  any
  onerror
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  bgProperties
  string
  onresize
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  link
  any
  aLink
  any
  bottomMargin
  any
  topMargin
  any
  onafterprint
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  vLink
  any
  onbeforeprint
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onoffline
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onunload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onhashchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  rightMargin
  any
  onbeforeunload
  [BeforeUnloadEvent -> any]
  addEventListener
  [*not-implemented* [BeforeUnloadEvent -> any] {:opt boolean} -> void]
  leftMargin
  any
  onstorage
  [StorageEvent -> any]
  addEventListener
  [*not-implemented* [StorageEvent -> any] {:opt boolean} -> void]
  createTextRange
  [-> TextRange]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  HTMLBodyElement
  (prototype HTMLBodyElement nil [-> HTMLBodyElement])))
((ann-interface
  DocumentType
  name
  string
  notations
  NamedNodeMap
  systemId
  string
  internalSubset
  string
  entities
  NamedNodeMap
  publicId
  string))
((ann DocumentType (prototype DocumentType nil [-> DocumentType])))
((ann-interface
  SVGRadialGradientElement
  cx
  SVGAnimatedLength
  r
  SVGAnimatedLength
  cy
  SVGAnimatedLength
  fx
  SVGAnimatedLength
  fy
  SVGAnimatedLength))
((ann
  SVGRadialGradientElement
  (prototype
   SVGRadialGradientElement
   nil
   [-> SVGRadialGradientElement])))
((ann-interface
  MutationEvent
  newValue
  string
  attrChange
  number
  attrName
  string
  prevValue
  string
  relatedNode
  Node
  initMutationEvent
  [string boolean boolean Node string string string number -> void]
  MODIFICATION
  number
  REMOVAL
  number
  ADDITION
  number))
((ann
  MutationEvent
  (prototype
   MutationEvent
   nil
   [-> MutationEvent]
   MODIFICATION
   number
   REMOVAL
   number
   ADDITION
   number)))
((ann-interface
  DragEvent
  dataTransfer
  DataTransfer
  initDragEvent
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
   void]))
((ann DragEvent (prototype DragEvent nil [-> DragEvent])))
((ann-interface
  HTMLTableSectionElement
  align
  string
  rows
  HTMLCollection
  deleteRow
  [{:opt number} -> void]
  moveRow
  [{:opt number} {:opt number} -> Object]
  insertRow
  [{:opt number} -> HTMLElement]))
((ann
  HTMLTableSectionElement
  (prototype HTMLTableSectionElement nil [-> HTMLTableSectionElement])))
((ann-interface DOML2DeprecatedListNumberingAndBulletStyle type string))
((ann-interface
  HTMLInputElement
  width
  string
  status
  boolean
  form
  HTMLFormElement
  selectionStart
  number
  indeterminate
  boolean
  readOnly
  boolean
  size
  number
  loop
  number
  selectionEnd
  number
  vrml
  string
  lowsrc
  string
  vspace
  number
  accept
  string
  alt
  string
  defaultChecked
  boolean
  align
  string
  value
  string
  src
  string
  name
  string
  useMap
  string
  height
  string
  border
  string
  dynsrc
  string
  checked
  boolean
  hspace
  number
  maxLength
  number
  type
  string
  defaultValue
  string
  complete
  boolean
  start
  string
  createTextRange
  [-> TextRange]
  setSelectionRange
  [number number -> void]
  select
  [-> void]))
((ann
  HTMLInputElement
  (prototype HTMLInputElement nil [-> HTMLInputElement])))
((ann-interface
  HTMLAnchorElement
  rel
  string
  protocol
  string
  search
  string
  coords
  string
  hostname
  string
  pathname
  string
  Methods
  string
  target
  string
  protocolLong
  string
  href
  string
  name
  string
  charset
  string
  hreflang
  string
  port
  string
  host
  string
  hash
  string
  nameProp
  string
  urn
  string
  rev
  string
  shape
  string
  type
  string
  mimeType
  string
  toString
  [-> string]))
((ann
  HTMLAnchorElement
  (prototype HTMLAnchorElement nil [-> HTMLAnchorElement])))
((ann-interface
  HTMLParamElement
  value
  string
  name
  string
  type
  string
  valueType
  string))
((ann
  HTMLParamElement
  (prototype HTMLParamElement nil [-> HTMLParamElement])))
((ann-interface
  SVGImageElement
  y
  SVGAnimatedLength
  width
  SVGAnimatedLength
  preserveAspectRatio
  SVGAnimatedPreserveAspectRatio
  x
  SVGAnimatedLength
  height
  SVGAnimatedLength))
((ann
  SVGImageElement
  (prototype SVGImageElement nil [-> SVGImageElement])))
((ann-interface SVGAnimatedNumber animVal number baseVal number))
((ann
  SVGAnimatedNumber
  (prototype SVGAnimatedNumber nil [-> SVGAnimatedNumber])))
((ann-interface
  PerformanceTiming
  redirectStart
  number
  domainLookupEnd
  number
  responseStart
  number
  domComplete
  number
  domainLookupStart
  number
  loadEventStart
  number
  msFirstPaint
  number
  unloadEventEnd
  number
  fetchStart
  number
  requestStart
  number
  domInteractive
  number
  navigationStart
  number
  connectEnd
  number
  loadEventEnd
  number
  connectStart
  number
  responseEnd
  number
  domLoading
  number
  redirectEnd
  number
  unloadEventStart
  number
  domContentLoadedEventStart
  number
  domContentLoadedEventEnd
  number
  toJSON
  [-> any]))
((ann
  PerformanceTiming
  (prototype PerformanceTiming nil [-> PerformanceTiming])))
((ann-interface HTMLPreElement width number cite string))
((ann
  HTMLPreElement
  (prototype HTMLPreElement nil [-> HTMLPreElement])))
((ann-interface
  EventException
  code
  number
  message
  string
  toString
  [-> string]
  DISPATCH_REQUEST_ERR
  number
  UNSPECIFIED_EVENT_TYPE_ERR
  number))
((ann
  EventException
  (prototype
   EventException
   nil
   [-> EventException]
   DISPATCH_REQUEST_ERR
   number
   UNSPECIFIED_EVENT_TYPE_ERR
   number)))
((ann-interface MSNavigatorDoNotTrack msDoNotTrack string))
((ann-interface NavigatorOnLine onLine boolean))
((ann-interface WindowLocalStorage localStorage Storage))
((ann-interface SVGMetadataElement))
((ann
  SVGMetadataElement
  (prototype SVGMetadataElement nil [-> SVGMetadataElement])))
((ann-interface
  SVGPathSegArcRel
  y
  number
  sweepFlag
  boolean
  r2
  number
  x
  number
  angle
  number
  r1
  number
  largeArcFlag
  boolean))
((ann
  SVGPathSegArcRel
  (prototype SVGPathSegArcRel nil [-> SVGPathSegArcRel])))
((ann-interface SVGPathSegMovetoAbs y number x number))
((ann
  SVGPathSegMovetoAbs
  (prototype SVGPathSegMovetoAbs nil [-> SVGPathSegMovetoAbs])))
((ann-interface
  SVGStringList
  numberOfItems
  number
  replaceItem
  [string number -> string]
  getItem
  [number -> string]
  clear
  [-> void]
  appendItem
  [string -> string]
  initialize
  [string -> string]
  removeItem
  [number -> string]
  insertItemBefore
  [string number -> string]))
((ann SVGStringList (prototype SVGStringList nil [-> SVGStringList])))
((ann-interface
  XDomainRequest
  timeout
  number
  onerror
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onprogress
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  ontimeout
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  responseText
  string
  contentType
  string
  open
  [string string -> void]
  create
  [-> XDomainRequest]
  abort
  [-> void]
  send
  [{:opt any} -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  XDomainRequest
  (prototype XDomainRequest nil [-> XDomainRequest])))
((ann-interface DOML2DeprecatedBackgroundColorStyle bgColor any))
((ann-interface
  ElementTraversal
  childElementCount
  number
  previousElementSibling
  Element
  lastElementChild
  Element
  nextElementSibling
  Element
  firstElementChild
  Element))
((ann-interface
  SVGLength
  valueAsString
  string
  valueInSpecifiedUnits
  number
  value
  number
  unitType
  number
  newValueSpecifiedUnits
  [number number -> void]
  convertToSpecifiedUnits
  [number -> void]
  SVG_LENGTHTYPE_NUMBER
  number
  SVG_LENGTHTYPE_CM
  number
  SVG_LENGTHTYPE_PC
  number
  SVG_LENGTHTYPE_PERCENTAGE
  number
  SVG_LENGTHTYPE_MM
  number
  SVG_LENGTHTYPE_PT
  number
  SVG_LENGTHTYPE_IN
  number
  SVG_LENGTHTYPE_EMS
  number
  SVG_LENGTHTYPE_PX
  number
  SVG_LENGTHTYPE_UNKNOWN
  number
  SVG_LENGTHTYPE_EXS
  number))
((ann
  SVGLength
  (prototype
   SVGLength
   nil
   [-> SVGLength]
   SVG_LENGTHTYPE_NUMBER
   number
   SVG_LENGTHTYPE_CM
   number
   SVG_LENGTHTYPE_PC
   number
   SVG_LENGTHTYPE_PERCENTAGE
   number
   SVG_LENGTHTYPE_MM
   number
   SVG_LENGTHTYPE_PT
   number
   SVG_LENGTHTYPE_IN
   number
   SVG_LENGTHTYPE_EMS
   number
   SVG_LENGTHTYPE_PX
   number
   SVG_LENGTHTYPE_UNKNOWN
   number
   SVG_LENGTHTYPE_EXS
   number)))
((ann-interface SVGPolygonElement))
((ann
  SVGPolygonElement
  (prototype SVGPolygonElement nil [-> SVGPolygonElement])))
((ann-interface HTMLPhraseElement dateTime string cite string))
((ann
  HTMLPhraseElement
  (prototype HTMLPhraseElement nil [-> HTMLPhraseElement])))
((ann-interface NavigatorStorageUtils))
((ann-interface
  SVGPathSegCurvetoCubicRel
  y
  number
  y1
  number
  x2
  number
  x
  number
  x1
  number
  y2
  number))
((ann
  SVGPathSegCurvetoCubicRel
  (prototype
   SVGPathSegCurvetoCubicRel
   nil
   [-> SVGPathSegCurvetoCubicRel])))
((ann-interface
  MSEventObj
  nextPage
  string
  keyCode
  number
  toElement
  Element
  returnValue
  any
  dataFld
  string
  y
  number
  dataTransfer
  DataTransfer
  propertyName
  string
  url
  string
  offsetX
  number
  recordset
  Object
  screenX
  number
  buttonID
  number
  wheelDelta
  number
  reason
  number
  origin
  string
  data
  string
  srcFilter
  Object
  boundElements
  HTMLCollection
  cancelBubble
  boolean
  altLeft
  boolean
  behaviorCookie
  number
  bookmarks
  BookmarkCollection
  type
  string
  repeat
  boolean
  srcElement
  Element
  source
  Window
  fromElement
  Element
  offsetY
  number
  x
  number
  behaviorPart
  number
  qualifier
  string
  altKey
  boolean
  ctrlKey
  boolean
  clientY
  number
  shiftKey
  boolean
  shiftLeft
  boolean
  contentOverflow
  boolean
  screenY
  number
  ctrlLeft
  boolean
  button
  number
  srcUrn
  string
  clientX
  number
  actionURL
  string
  getAttribute
  [string {:opt number} -> any]
  setAttribute
  [string any {:opt number} -> void]
  removeAttribute
  [string {:opt number} -> boolean]))
((ann MSEventObj (prototype MSEventObj nil [-> MSEventObj])))
((ann-interface
  SVGTextContentElement
  textLength
  SVGAnimatedLength
  lengthAdjust
  SVGAnimatedEnumeration
  getCharNumAtPosition
  [SVGPoint -> number]
  getStartPositionOfChar
  [number -> SVGPoint]
  getExtentOfChar
  [number -> SVGRect]
  getComputedTextLength
  [-> number]
  getSubStringLength
  [number number -> number]
  selectSubString
  [number number -> void]
  getNumberOfChars
  [-> number]
  getRotationOfChar
  [number -> number]
  getEndPositionOfChar
  [number -> SVGPoint]
  LENGTHADJUST_SPACING
  number
  LENGTHADJUST_SPACINGANDGLYPHS
  number
  LENGTHADJUST_UNKNOWN
  number))
((ann
  SVGTextContentElement
  (prototype
   SVGTextContentElement
   nil
   [-> SVGTextContentElement]
   LENGTHADJUST_SPACING
   number
   LENGTHADJUST_SPACINGANDGLYPHS
   number
   LENGTHADJUST_UNKNOWN
   number)))
((ann-interface DOML2DeprecatedColorProperty color string))
((ann-interface
  HTMLCanvasElement
  width
  number
  height
  number
  toDataURL
  [{:opt string} (any *) -> string]
  getContext
  [string (any *) -> any]
  getContext
  [*not-implemented* -> CanvasRenderingContext2D]))
((ann
  HTMLCanvasElement
  (prototype HTMLCanvasElement nil [-> HTMLCanvasElement])))
((ann-interface
  Location
  hash
  string
  protocol
  string
  search
  string
  href
  string
  hostname
  string
  port
  string
  pathname
  string
  host
  string
  reload
  [{:opt boolean} -> void]
  replace
  [string -> void]
  assign
  [string -> void]
  toString
  [-> string]))
((ann Location (prototype Location nil [-> Location])))
((ann-interface HTMLTitleElement text string))
((ann
  HTMLTitleElement
  (prototype HTMLTitleElement nil [-> HTMLTitleElement])))
((ann-interface HTMLStyleElement media string type string))
((ann
  HTMLStyleElement
  (prototype HTMLStyleElement nil [-> HTMLStyleElement])))
((ann-interface
  PerformanceEntry
  name
  string
  startTime
  number
  duration
  number
  entryType
  string))
((ann
  PerformanceEntry
  (prototype PerformanceEntry nil [-> PerformanceEntry])))
((ann-interface
  SVGTransform
  type
  number
  angle
  number
  matrix
  SVGMatrix
  setTranslate
  [number number -> void]
  setScale
  [number number -> void]
  setMatrix
  [SVGMatrix -> void]
  setSkewY
  [number -> void]
  setRotate
  [number number number -> void]
  setSkewX
  [number -> void]
  SVG_TRANSFORM_SKEWX
  number
  SVG_TRANSFORM_UNKNOWN
  number
  SVG_TRANSFORM_SCALE
  number
  SVG_TRANSFORM_TRANSLATE
  number
  SVG_TRANSFORM_MATRIX
  number
  SVG_TRANSFORM_ROTATE
  number
  SVG_TRANSFORM_SKEWY
  number))
((ann
  SVGTransform
  (prototype
   SVGTransform
   nil
   [-> SVGTransform]
   SVG_TRANSFORM_SKEWX
   number
   SVG_TRANSFORM_UNKNOWN
   number
   SVG_TRANSFORM_SCALE
   number
   SVG_TRANSFORM_TRANSLATE
   number
   SVG_TRANSFORM_MATRIX
   number
   SVG_TRANSFORM_ROTATE
   number
   SVG_TRANSFORM_SKEWY
   number)))
((ann-interface
  UIEvent
  detail
  number
  view
  Window
  initUIEvent
  [string boolean boolean Window number -> void]))
((ann UIEvent (prototype UIEvent nil [-> UIEvent])))
((ann-interface SVGURIReference href SVGAnimatedString))
((ann-interface
  SVGPathSeg
  pathSegType
  number
  pathSegTypeAsLetter
  string
  PATHSEG_MOVETO_REL
  number
  PATHSEG_LINETO_VERTICAL_REL
  number
  PATHSEG_CURVETO_CUBIC_SMOOTH_ABS
  number
  PATHSEG_CURVETO_QUADRATIC_REL
  number
  PATHSEG_CURVETO_CUBIC_ABS
  number
  PATHSEG_LINETO_HORIZONTAL_ABS
  number
  PATHSEG_CURVETO_QUADRATIC_ABS
  number
  PATHSEG_LINETO_ABS
  number
  PATHSEG_CLOSEPATH
  number
  PATHSEG_LINETO_HORIZONTAL_REL
  number
  PATHSEG_CURVETO_CUBIC_SMOOTH_REL
  number
  PATHSEG_LINETO_REL
  number
  PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS
  number
  PATHSEG_ARC_REL
  number
  PATHSEG_CURVETO_CUBIC_REL
  number
  PATHSEG_UNKNOWN
  number
  PATHSEG_LINETO_VERTICAL_ABS
  number
  PATHSEG_ARC_ABS
  number
  PATHSEG_MOVETO_ABS
  number
  PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL
  number))
((ann
  SVGPathSeg
  (prototype
   SVGPathSeg
   nil
   [-> SVGPathSeg]
   PATHSEG_MOVETO_REL
   number
   PATHSEG_LINETO_VERTICAL_REL
   number
   PATHSEG_CURVETO_CUBIC_SMOOTH_ABS
   number
   PATHSEG_CURVETO_QUADRATIC_REL
   number
   PATHSEG_CURVETO_CUBIC_ABS
   number
   PATHSEG_LINETO_HORIZONTAL_ABS
   number
   PATHSEG_CURVETO_QUADRATIC_ABS
   number
   PATHSEG_LINETO_ABS
   number
   PATHSEG_CLOSEPATH
   number
   PATHSEG_LINETO_HORIZONTAL_REL
   number
   PATHSEG_CURVETO_CUBIC_SMOOTH_REL
   number
   PATHSEG_LINETO_REL
   number
   PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS
   number
   PATHSEG_ARC_REL
   number
   PATHSEG_CURVETO_CUBIC_REL
   number
   PATHSEG_UNKNOWN
   number
   PATHSEG_LINETO_VERTICAL_ABS
   number
   PATHSEG_ARC_ABS
   number
   PATHSEG_MOVETO_ABS
   number
   PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL
   number)))
((ann-interface
  WheelEvent
  deltaZ
  number
  deltaX
  number
  deltaMode
  number
  deltaY
  number
  initWheelEvent
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
   void]
  DOM_DELTA_PIXEL
  number
  DOM_DELTA_LINE
  number
  DOM_DELTA_PAGE
  number))
((ann
  WheelEvent
  (prototype
   WheelEvent
   nil
   [-> WheelEvent]
   DOM_DELTA_PIXEL
   number
   DOM_DELTA_LINE
   number
   DOM_DELTA_PAGE
   number)))
((ann-interface
  MSEventAttachmentTarget
  attachEvent
  [string EventListener -> boolean]
  detachEvent
  [string EventListener -> void]))
((ann-interface SVGNumber value number))
((ann SVGNumber (prototype SVGNumber nil [-> SVGNumber])))
((ann-interface
  SVGPathElement
  getPathSegAtLength
  [number -> number]
  getPointAtLength
  [number -> SVGPoint]
  createSVGPathSegCurvetoQuadraticAbs
  [number number number number -> SVGPathSegCurvetoQuadraticAbs]
  createSVGPathSegLinetoRel
  [number number -> SVGPathSegLinetoRel]
  createSVGPathSegCurvetoQuadraticRel
  [number number number number -> SVGPathSegCurvetoQuadraticRel]
  createSVGPathSegCurvetoCubicAbs
  [number
   number
   number
   number
   number
   number
   ->
   SVGPathSegCurvetoCubicAbs]
  createSVGPathSegLinetoAbs
  [number number -> SVGPathSegLinetoAbs]
  createSVGPathSegClosePath
  [-> SVGPathSegClosePath]
  createSVGPathSegCurvetoCubicRel
  [number
   number
   number
   number
   number
   number
   ->
   SVGPathSegCurvetoCubicRel]
  createSVGPathSegCurvetoQuadraticSmoothRel
  [number number -> SVGPathSegCurvetoQuadraticSmoothRel]
  createSVGPathSegMovetoRel
  [number number -> SVGPathSegMovetoRel]
  createSVGPathSegCurvetoCubicSmoothAbs
  [number number number number -> SVGPathSegCurvetoCubicSmoothAbs]
  createSVGPathSegMovetoAbs
  [number number -> SVGPathSegMovetoAbs]
  createSVGPathSegLinetoVerticalRel
  [number -> SVGPathSegLinetoVerticalRel]
  createSVGPathSegArcRel
  [number
   number
   number
   number
   number
   boolean
   boolean
   ->
   SVGPathSegArcRel]
  createSVGPathSegCurvetoQuadraticSmoothAbs
  [number number -> SVGPathSegCurvetoQuadraticSmoothAbs]
  createSVGPathSegLinetoHorizontalRel
  [number -> SVGPathSegLinetoHorizontalRel]
  getTotalLength
  [-> number]
  createSVGPathSegCurvetoCubicSmoothRel
  [number number number number -> SVGPathSegCurvetoCubicSmoothRel]
  createSVGPathSegLinetoHorizontalAbs
  [number -> SVGPathSegLinetoHorizontalAbs]
  createSVGPathSegLinetoVerticalAbs
  [number -> SVGPathSegLinetoVerticalAbs]
  createSVGPathSegArcAbs
  [number
   number
   number
   number
   number
   boolean
   boolean
   ->
   SVGPathSegArcAbs]))
((ann
  SVGPathElement
  (prototype SVGPathElement nil [-> SVGPathElement])))
((ann-interface MSCompatibleInfo version string userAgent string))
((ann
  MSCompatibleInfo
  (prototype MSCompatibleInfo nil [-> MSCompatibleInfo])))
((ann-interface
  Text
  wholeText
  string
  splitText
  [number -> Text]
  replaceWholeText
  [string -> Text]))
((ann Text (prototype Text nil [-> Text])))
((ann-interface SVGAnimatedRect animVal SVGRect baseVal SVGRect))
((ann
  SVGAnimatedRect
  (prototype SVGAnimatedRect nil [-> SVGAnimatedRect])))
((ann-interface CSSNamespaceRule namespaceURI string prefix string))
((ann
  CSSNamespaceRule
  (prototype CSSNamespaceRule nil [-> CSSNamespaceRule])))
((ann-interface
  SVGPathSegList
  numberOfItems
  number
  replaceItem
  [SVGPathSeg number -> SVGPathSeg]
  getItem
  [number -> SVGPathSeg]
  clear
  [-> void]
  appendItem
  [SVGPathSeg -> SVGPathSeg]
  initialize
  [SVGPathSeg -> SVGPathSeg]
  removeItem
  [number -> SVGPathSeg]
  insertItemBefore
  [SVGPathSeg number -> SVGPathSeg]))
((ann
  SVGPathSegList
  (prototype SVGPathSegList nil [-> SVGPathSegList])))
((ann-interface HTMLUnknownElement))
((ann
  HTMLUnknownElement
  (prototype HTMLUnknownElement nil [-> HTMLUnknownElement])))
((ann-interface HTMLAudioElement))
((ann
  HTMLAudioElement
  (prototype HTMLAudioElement nil [-> HTMLAudioElement])))
((ann-interface
  MSImageResourceExtensions
  dynsrc
  string
  vrml
  string
  lowsrc
  string
  start
  string
  loop
  number))
((ann-interface
  PositionError
  code
  number
  message
  string
  toString
  [-> string]
  POSITION_UNAVAILABLE
  number
  PERMISSION_DENIED
  number
  TIMEOUT
  number))
((ann
  PositionError
  (prototype
   PositionError
   nil
   [-> PositionError]
   POSITION_UNAVAILABLE
   number
   PERMISSION_DENIED
   number
   TIMEOUT
   number)))
((ann-interface
  HTMLTableCellElement
  width
  number
  headers
  string
  cellIndex
  number
  align
  string
  borderColorLight
  any
  colSpan
  number
  borderColor
  any
  axis
  string
  height
  any
  noWrap
  boolean
  abbr
  string
  rowSpan
  number
  scope
  string
  borderColorDark
  any))
((ann
  HTMLTableCellElement
  (prototype HTMLTableCellElement nil [-> HTMLTableCellElement])))
((ann-interface
  SVGElementInstance
  previousSibling
  SVGElementInstance
  parentNode
  SVGElementInstance
  lastChild
  SVGElementInstance
  nextSibling
  SVGElementInstance
  childNodes
  SVGElementInstanceList
  correspondingUseElement
  SVGUseElement
  correspondingElement
  SVGElement
  firstChild
  SVGElementInstance))
((ann
  SVGElementInstance
  (prototype SVGElementInstance nil [-> SVGElementInstance])))
((ann-interface
  MSNamespaceInfoCollection
  length
  number
  add
  [{:opt string} {:opt string} {:opt any} -> Object]
  item
  [any -> Object]
  []
  [string -> Object]))
((ann
  MSNamespaceInfoCollection
  (prototype
   MSNamespaceInfoCollection
   nil
   [-> MSNamespaceInfoCollection])))
((ann-interface
  SVGCircleElement
  cx
  SVGAnimatedLength
  r
  SVGAnimatedLength
  cy
  SVGAnimatedLength))
((ann
  SVGCircleElement
  (prototype SVGCircleElement nil [-> SVGCircleElement])))
((ann-interface
  StyleSheetList
  length
  number
  item
  [{:opt number} -> StyleSheet]
  []
  [number -> StyleSheet]))
((ann
  StyleSheetList
  (prototype StyleSheetList nil [-> StyleSheetList])))
((ann-interface
  CSSImportRule
  styleSheet
  CSSStyleSheet
  href
  string
  media
  MediaList))
((ann CSSImportRule (prototype CSSImportRule nil [-> CSSImportRule])))
((ann-interface
  CustomEvent
  detail
  Object
  initCustomEvent
  [string boolean boolean Object -> void]))
((ann CustomEvent (prototype CustomEvent nil [-> CustomEvent])))
((ann-interface HTMLBaseFontElement face string size number))
((ann
  HTMLBaseFontElement
  (prototype HTMLBaseFontElement nil [-> HTMLBaseFontElement])))
((ann-interface
  HTMLTextAreaElement
  value
  string
  status
  any
  form
  HTMLFormElement
  name
  string
  selectionStart
  number
  rows
  number
  cols
  number
  readOnly
  boolean
  wrap
  string
  selectionEnd
  number
  type
  string
  defaultValue
  string
  createTextRange
  [-> TextRange]
  setSelectionRange
  [number number -> void]
  select
  [-> void]))
((ann
  HTMLTextAreaElement
  (prototype HTMLTextAreaElement nil [-> HTMLTextAreaElement])))
((ann-interface
  Geolocation
  clearWatch
  [number -> void]
  getCurrentPosition
  [PositionCallback
   {:opt PositionErrorCallback}
   {:opt PositionOptions}
   ->
   void]
  watchPosition
  [PositionCallback
   {:opt PositionErrorCallback}
   {:opt PositionOptions}
   ->
   number]))
((ann Geolocation (prototype Geolocation nil [-> Geolocation])))
((ann-interface DOML2DeprecatedMarginStyle vspace number hspace number))
((ann-interface
  MSWindowModeless
  dialogTop
  any
  dialogLeft
  any
  dialogWidth
  any
  dialogHeight
  any
  menuArguments
  any))
((ann-interface DOML2DeprecatedAlignmentStyle align string))
((ann-interface
  HTMLMarqueeElement
  width
  string
  onbounce
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  vspace
  number
  trueSpeed
  boolean
  scrollAmount
  number
  scrollDelay
  number
  behavior
  string
  height
  string
  loop
  number
  direction
  string
  hspace
  number
  onstart
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onfinish
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  stop
  [-> void]
  start
  [-> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  HTMLMarqueeElement
  (prototype HTMLMarqueeElement nil [-> HTMLMarqueeElement])))
((ann-interface SVGRect y number width number x number height number))
((ann SVGRect (prototype SVGRect nil [-> SVGRect])))
((ann-interface
  MSNodeExtensions
  swapNode
  [Node -> Node]
  removeNode
  [{:opt boolean} -> Node]
  replaceNode
  [Node -> Node]))
((ann-interface
  History
  length
  number
  back
  [{:opt any} -> void]
  forward
  [{:opt any} -> void]
  go
  [{:opt any} -> void]))
((ann History (prototype History nil [-> History])))
((ann-interface
  SVGPathSegCurvetoCubicAbs
  y
  number
  y1
  number
  x2
  number
  x
  number
  x1
  number
  y2
  number))
((ann
  SVGPathSegCurvetoCubicAbs
  (prototype
   SVGPathSegCurvetoCubicAbs
   nil
   [-> SVGPathSegCurvetoCubicAbs])))
((ann-interface
  SVGPathSegCurvetoQuadraticAbs
  y
  number
  y1
  number
  x
  number
  x1
  number))
((ann
  SVGPathSegCurvetoQuadraticAbs
  (prototype
   SVGPathSegCurvetoQuadraticAbs
   nil
   [-> SVGPathSegCurvetoQuadraticAbs])))
((ann-interface
  TimeRanges
  length
  number
  start
  [number -> number]
  end
  [number -> number]))
((ann TimeRanges (prototype TimeRanges nil [-> TimeRanges])))
((ann-interface
  CSSRule
  cssText
  string
  parentStyleSheet
  CSSStyleSheet
  parentRule
  CSSRule
  type
  number
  IMPORT_RULE
  number
  MEDIA_RULE
  number
  STYLE_RULE
  number
  NAMESPACE_RULE
  number
  PAGE_RULE
  number
  UNKNOWN_RULE
  number
  FONT_FACE_RULE
  number
  CHARSET_RULE
  number))
((ann
  CSSRule
  (prototype
   CSSRule
   nil
   [-> CSSRule]
   IMPORT_RULE
   number
   MEDIA_RULE
   number
   STYLE_RULE
   number
   NAMESPACE_RULE
   number
   PAGE_RULE
   number
   UNKNOWN_RULE
   number
   FONT_FACE_RULE
   number
   CHARSET_RULE
   number)))
((ann-interface SVGPathSegLinetoAbs y number x number))
((ann
  SVGPathSegLinetoAbs
  (prototype SVGPathSegLinetoAbs nil [-> SVGPathSegLinetoAbs])))
((ann-interface HTMLModElement dateTime string cite string))
((ann
  HTMLModElement
  (prototype HTMLModElement nil [-> HTMLModElement])))
((ann-interface
  SVGMatrix
  e
  number
  c
  number
  a
  number
  b
  number
  d
  number
  f
  number
  multiply
  [SVGMatrix -> SVGMatrix]
  flipY
  [-> SVGMatrix]
  skewY
  [number -> SVGMatrix]
  inverse
  [-> SVGMatrix]
  scaleNonUniform
  [number number -> SVGMatrix]
  rotate
  [number -> SVGMatrix]
  flipX
  [-> SVGMatrix]
  translate
  [number number -> SVGMatrix]
  scale
  [number -> SVGMatrix]
  rotateFromVector
  [number number -> SVGMatrix]
  skewX
  [number -> SVGMatrix]))
((ann SVGMatrix (prototype SVGMatrix nil [-> SVGMatrix])))
((ann-interface
  MSPopupWindow
  document
  Document
  isOpen
  boolean
  show
  [number number number number {:opt any} -> void]
  hide
  [-> void]))
((ann MSPopupWindow (prototype MSPopupWindow nil [-> MSPopupWindow])))
((ann-interface BeforeUnloadEvent returnValue string))
((ann
  BeforeUnloadEvent
  (prototype BeforeUnloadEvent nil [-> BeforeUnloadEvent])))
((ann-interface
  SVGUseElement
  y
  SVGAnimatedLength
  width
  SVGAnimatedLength
  animatedInstanceRoot
  SVGElementInstance
  instanceRoot
  SVGElementInstance
  x
  SVGAnimatedLength
  height
  SVGAnimatedLength))
((ann SVGUseElement (prototype SVGUseElement nil [-> SVGUseElement])))
((ann-interface
  Event
  timeStamp
  number
  defaultPrevented
  boolean
  isTrusted
  boolean
  currentTarget
  EventTarget
  cancelBubble
  boolean
  target
  EventTarget
  eventPhase
  number
  cancelable
  boolean
  type
  string
  srcElement
  Element
  bubbles
  boolean
  initEvent
  [string boolean boolean -> void]
  stopPropagation
  [-> void]
  stopImmediatePropagation
  [-> void]
  preventDefault
  [-> void]
  CAPTURING_PHASE
  number
  AT_TARGET
  number
  BUBBLING_PHASE
  number))
((ann
  Event
  (prototype
   Event
   nil
   [-> Event]
   CAPTURING_PHASE
   number
   AT_TARGET
   number
   BUBBLING_PHASE
   number)))
((ann-interface ImageData width number data (number *) height number))
((ann ImageData (prototype ImageData nil [-> ImageData])))
((ann-interface HTMLTableColElement width any align string span number))
((ann
  HTMLTableColElement
  (prototype HTMLTableColElement nil [-> HTMLTableColElement])))
((ann-interface
  SVGException
  code
  number
  message
  string
  toString
  [-> string]
  SVG_MATRIX_NOT_INVERTABLE
  number
  SVG_WRONG_TYPE_ERR
  number
  SVG_INVALID_VALUE_ERR
  number))
((ann
  SVGException
  (prototype
   SVGException
   nil
   [-> SVGException]
   SVG_MATRIX_NOT_INVERTABLE
   number
   SVG_WRONG_TYPE_ERR
   number
   SVG_INVALID_VALUE_ERR
   number)))
((ann-interface
  SVGLinearGradientElement
  y1
  SVGAnimatedLength
  x2
  SVGAnimatedLength
  x1
  SVGAnimatedLength
  y2
  SVGAnimatedLength))
((ann
  SVGLinearGradientElement
  (prototype
   SVGLinearGradientElement
   nil
   [-> SVGLinearGradientElement])))
((ann-interface
  HTMLTableAlignment
  ch
  string
  vAlign
  string
  chOff
  string))
((ann-interface SVGAnimatedEnumeration animVal number baseVal number))
((ann
  SVGAnimatedEnumeration
  (prototype SVGAnimatedEnumeration nil [-> SVGAnimatedEnumeration])))
((ann-interface DOML2DeprecatedSizeProperty size number))
((ann-interface HTMLUListElement))
((ann
  HTMLUListElement
  (prototype HTMLUListElement nil [-> HTMLUListElement])))
((ann-interface
  SVGRectElement
  y
  SVGAnimatedLength
  width
  SVGAnimatedLength
  ry
  SVGAnimatedLength
  rx
  SVGAnimatedLength
  x
  SVGAnimatedLength
  height
  SVGAnimatedLength))
((ann
  SVGRectElement
  (prototype SVGRectElement nil [-> SVGRectElement])))
((ann-interface ErrorEventHandler Event string number number -> void))
((ann-interface HTMLDivElement align string noWrap boolean))
((ann
  HTMLDivElement
  (prototype HTMLDivElement nil [-> HTMLDivElement])))
((ann-interface DOML2DeprecatedBorderStyle border string))
((ann-interface
  NamedNodeMap
  length
  number
  removeNamedItemNS
  [string string -> Attr]
  item
  [number -> Attr]
  []
  [number -> Attr]
  removeNamedItem
  [string -> Attr]
  getNamedItem
  [string -> Attr]
  setNamedItem
  [Attr -> Attr]
  getNamedItemNS
  [string string -> Attr]
  setNamedItemNS
  [Attr -> Attr]))
((ann NamedNodeMap (prototype NamedNodeMap nil [-> NamedNodeMap])))
((ann-interface
  MediaList
  length
  number
  mediaText
  string
  deleteMedium
  [string -> void]
  appendMedium
  [string -> void]
  item
  [number -> string]
  []
  [number -> string]
  toString
  [-> string]))
((ann MediaList (prototype MediaList nil [-> MediaList])))
((ann-interface SVGPathSegCurvetoQuadraticSmoothAbs y number x number))
((ann
  SVGPathSegCurvetoQuadraticSmoothAbs
  (prototype
   SVGPathSegCurvetoQuadraticSmoothAbs
   nil
   [-> SVGPathSegCurvetoQuadraticSmoothAbs])))
((ann-interface
  SVGPathSegCurvetoCubicSmoothRel
  y
  number
  x2
  number
  x
  number
  y2
  number))
((ann
  SVGPathSegCurvetoCubicSmoothRel
  (prototype
   SVGPathSegCurvetoCubicSmoothRel
   nil
   [-> SVGPathSegCurvetoCubicSmoothRel])))
((ann-interface
  SVGLengthList
  numberOfItems
  number
  replaceItem
  [SVGLength number -> SVGLength]
  getItem
  [number -> SVGLength]
  clear
  [-> void]
  appendItem
  [SVGLength -> SVGLength]
  initialize
  [SVGLength -> SVGLength]
  removeItem
  [number -> SVGLength]
  insertItemBefore
  [SVGLength number -> SVGLength]))
((ann SVGLengthList (prototype SVGLengthList nil [-> SVGLengthList])))
((ann-interface ProcessingInstruction target string data string))
((ann
  ProcessingInstruction
  (prototype ProcessingInstruction nil [-> ProcessingInstruction])))
((ann-interface
  MSWindowExtensions
  status
  string
  onmouseleave
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  screenLeft
  number
  offscreenBuffering
  any
  maxConnectionsPerServer
  number
  onmouseenter
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  clipboardData
  DataTransfer
  defaultStatus
  string
  clientInformation
  Navigator
  closed
  boolean
  onhelp
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  external
  External
  event
  MSEventObj
  onfocusout
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  screenTop
  number
  onfocusin
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  showModelessDialog
  [{:opt string} {:opt any} {:opt any} -> Window]
  navigate
  [string -> void]
  resizeBy
  [{:opt number} {:opt number} -> void]
  item
  [any -> any]
  resizeTo
  [{:opt number} {:opt number} -> void]
  createPopup
  [{:opt any} -> MSPopupWindow]
  toStaticHTML
  [string -> string]
  execScript
  [string {:opt string} -> any]
  msWriteProfilerMark
  [string -> void]
  moveTo
  [{:opt number} {:opt number} -> void]
  moveBy
  [{:opt number} {:opt number} -> void]
  showHelp
  [string {:opt any} {:opt string} -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann-interface
  MSBehaviorUrnsCollection
  length
  number
  item
  [number -> string]))
((ann
  MSBehaviorUrnsCollection
  (prototype
   MSBehaviorUrnsCollection
   nil
   [-> MSBehaviorUrnsCollection])))
((ann-interface CSSFontFaceRule style CSSStyleDeclaration))
((ann
  CSSFontFaceRule
  (prototype CSSFontFaceRule nil [-> CSSFontFaceRule])))
((ann-interface DOML2DeprecatedBackgroundStyle background string))
((ann-interface
  TextEvent
  inputMethod
  number
  data
  string
  locale
  string
  initTextEvent
  [string boolean boolean Window string number string -> void]
  DOM_INPUT_METHOD_KEYBOARD
  number
  DOM_INPUT_METHOD_DROP
  number
  DOM_INPUT_METHOD_IME
  number
  DOM_INPUT_METHOD_SCRIPT
  number
  DOM_INPUT_METHOD_VOICE
  number
  DOM_INPUT_METHOD_UNKNOWN
  number
  DOM_INPUT_METHOD_PASTE
  number
  DOM_INPUT_METHOD_HANDWRITING
  number
  DOM_INPUT_METHOD_OPTION
  number
  DOM_INPUT_METHOD_MULTIMODAL
  number))
((ann
  TextEvent
  (prototype
   TextEvent
   nil
   [-> TextEvent]
   DOM_INPUT_METHOD_KEYBOARD
   number
   DOM_INPUT_METHOD_DROP
   number
   DOM_INPUT_METHOD_IME
   number
   DOM_INPUT_METHOD_SCRIPT
   number
   DOM_INPUT_METHOD_VOICE
   number
   DOM_INPUT_METHOD_UNKNOWN
   number
   DOM_INPUT_METHOD_PASTE
   number
   DOM_INPUT_METHOD_HANDWRITING
   number
   DOM_INPUT_METHOD_OPTION
   number
   DOM_INPUT_METHOD_MULTIMODAL
   number)))
((ann-interface DocumentFragment))
((ann
  DocumentFragment
  (prototype DocumentFragment nil [-> DocumentFragment])))
((ann-interface SVGPolylineElement))
((ann
  SVGPolylineElement
  (prototype SVGPolylineElement nil [-> SVGPolylineElement])))
((ann-interface SVGAnimatedPathData pathSegList SVGPathSegList))
((ann-interface Position timestamp number coords Coordinates))
((ann Position (prototype Position nil [-> Position])))
((ann-interface
  BookmarkCollection
  length
  number
  item
  [number -> any]
  []
  [number -> any]))
((ann
  BookmarkCollection
  (prototype BookmarkCollection nil [-> BookmarkCollection])))
((ann-interface PerformanceMark))
((ann
  PerformanceMark
  (prototype PerformanceMark nil [-> PerformanceMark])))
((ann-interface
  CSSPageRule
  pseudoClass
  string
  selectorText
  string
  selector
  string
  style
  CSSStyleDeclaration))
((ann CSSPageRule (prototype CSSPageRule nil [-> CSSPageRule])))
((ann-interface HTMLBRElement clear string))
((ann HTMLBRElement (prototype HTMLBRElement nil [-> HTMLBRElement])))
((ann-interface
  MSNavigatorExtensions
  userLanguage
  string
  plugins
  MSPluginsCollection
  cookieEnabled
  boolean
  appCodeName
  string
  cpuClass
  string
  appMinorVersion
  string
  connectionSpeed
  number
  browserLanguage
  string
  mimeTypes
  MSMimeTypesCollection
  systemLanguage
  string
  javaEnabled
  [-> boolean]
  taintEnabled
  [-> boolean]))
((ann-interface HTMLSpanElement))
((ann
  HTMLSpanElement
  (prototype HTMLSpanElement nil [-> HTMLSpanElement])))
((ann-interface HTMLHeadElement profile string))
((ann
  HTMLHeadElement
  (prototype HTMLHeadElement nil [-> HTMLHeadElement])))
((ann-interface HTMLHeadingElement align string))
((ann
  HTMLHeadingElement
  (prototype HTMLHeadingElement nil [-> HTMLHeadingElement])))
((ann-interface
  HTMLFormElement
  length
  number
  target
  string
  acceptCharset
  string
  enctype
  string
  elements
  HTMLCollection
  action
  string
  name
  string
  method
  string
  encoding
  string
  reset
  [-> void]
  item
  [{:opt any} {:opt any} -> any]
  submit
  [-> void]
  namedItem
  [string -> any]
  []
  [string -> any]))
((ann
  HTMLFormElement
  (prototype HTMLFormElement nil [-> HTMLFormElement])))
((ann-interface
  SVGZoomAndPan
  zoomAndPan
  number
  SVG_ZOOMANDPAN_MAGNIFY
  number
  SVG_ZOOMANDPAN_UNKNOWN
  number
  SVG_ZOOMANDPAN_DISABLE
  number))
((ann
  SVGZoomAndPan
  (prototype
   SVGZoomAndPan
   nil
   [-> SVGZoomAndPan]
   SVG_ZOOMANDPAN_MAGNIFY
   number
   SVG_ZOOMANDPAN_UNKNOWN
   number
   SVG_ZOOMANDPAN_DISABLE
   number)))
((ann-interface
  HTMLMediaElement
  initialTime
  number
  played
  TimeRanges
  currentSrc
  string
  readyState
  any
  autobuffer
  boolean
  loop
  boolean
  ended
  boolean
  buffered
  TimeRanges
  error
  MediaError
  seekable
  TimeRanges
  autoplay
  boolean
  controls
  boolean
  volume
  number
  src
  string
  playbackRate
  number
  duration
  number
  muted
  boolean
  defaultPlaybackRate
  number
  paused
  boolean
  seeking
  boolean
  currentTime
  number
  preload
  string
  networkState
  number
  pause
  [-> void]
  play
  [-> void]
  load
  [-> void]
  canPlayType
  [string -> string]
  HAVE_METADATA
  number
  HAVE_CURRENT_DATA
  number
  HAVE_NOTHING
  number
  NETWORK_NO_SOURCE
  number
  HAVE_ENOUGH_DATA
  number
  NETWORK_EMPTY
  number
  NETWORK_LOADING
  number
  NETWORK_IDLE
  number
  HAVE_FUTURE_DATA
  number))
((ann
  HTMLMediaElement
  (prototype
   HTMLMediaElement
   nil
   [-> HTMLMediaElement]
   HAVE_METADATA
   number
   HAVE_CURRENT_DATA
   number
   HAVE_NOTHING
   number
   NETWORK_NO_SOURCE
   number
   HAVE_ENOUGH_DATA
   number
   NETWORK_EMPTY
   number
   NETWORK_LOADING
   number
   NETWORK_IDLE
   number
   HAVE_FUTURE_DATA
   number)))
((ann-interface
  ElementCSSInlineStyle
  runtimeStyle
  MSStyleCSSProperties
  currentStyle
  MSCurrentStyleCSSProperties
  doScroll
  [{:opt any} -> void]
  componentFromPoint
  [number number -> string]))
((ann-interface DOMParser parseFromString [string string -> Document]))
((ann DOMParser (prototype DOMParser nil [-> DOMParser])))
((ann-interface MSMimeTypesCollection length number))
((ann
  MSMimeTypesCollection
  (prototype MSMimeTypesCollection nil [-> MSMimeTypesCollection])))
((ann-interface
  StyleSheet
  disabled
  boolean
  ownerNode
  Node
  parentStyleSheet
  StyleSheet
  href
  string
  media
  MediaList
  type
  string
  title
  string))
((ann StyleSheet (prototype StyleSheet nil [-> StyleSheet])))
((ann-interface
  SVGTextPathElement
  startOffset
  SVGAnimatedLength
  method
  SVGAnimatedEnumeration
  spacing
  SVGAnimatedEnumeration
  TEXTPATH_SPACINGTYPE_EXACT
  number
  TEXTPATH_METHODTYPE_STRETCH
  number
  TEXTPATH_SPACINGTYPE_AUTO
  number
  TEXTPATH_SPACINGTYPE_UNKNOWN
  number
  TEXTPATH_METHODTYPE_UNKNOWN
  number
  TEXTPATH_METHODTYPE_ALIGN
  number))
((ann
  SVGTextPathElement
  (prototype
   SVGTextPathElement
   nil
   [-> SVGTextPathElement]
   TEXTPATH_SPACINGTYPE_EXACT
   number
   TEXTPATH_METHODTYPE_STRETCH
   number
   TEXTPATH_SPACINGTYPE_AUTO
   number
   TEXTPATH_SPACINGTYPE_UNKNOWN
   number
   TEXTPATH_METHODTYPE_UNKNOWN
   number
   TEXTPATH_METHODTYPE_ALIGN
   number)))
((ann-interface HTMLDTElement noWrap boolean))
((ann HTMLDTElement (prototype HTMLDTElement nil [-> HTMLDTElement])))
((ann-interface
  NodeList
  length
  number
  item
  [number -> Node]
  []
  [number -> Node]))
((ann NodeList (prototype NodeList nil [-> NodeList])))
((ann-interface
  NodeListOf
  length
  number
  item
  [number -> TNode]
  []
  [number -> TNode]))
((ann-interface XMLSerializer serializeToString [Node -> string]))
((ann XMLSerializer (prototype XMLSerializer nil [-> XMLSerializer])))
((ann-interface PerformanceMeasure))
((ann
  PerformanceMeasure
  (prototype PerformanceMeasure nil [-> PerformanceMeasure])))
((ann-interface
  SVGGradientElement
  spreadMethod
  SVGAnimatedEnumeration
  gradientTransform
  SVGAnimatedTransformList
  gradientUnits
  SVGAnimatedEnumeration
  SVG_SPREADMETHOD_REFLECT
  number
  SVG_SPREADMETHOD_PAD
  number
  SVG_SPREADMETHOD_UNKNOWN
  number
  SVG_SPREADMETHOD_REPEAT
  number))
((ann
  SVGGradientElement
  (prototype
   SVGGradientElement
   nil
   [-> SVGGradientElement]
   SVG_SPREADMETHOD_REFLECT
   number
   SVG_SPREADMETHOD_PAD
   number
   SVG_SPREADMETHOD_UNKNOWN
   number
   SVG_SPREADMETHOD_REPEAT
   number)))
((ann-interface
  NodeFilter
  acceptNode
  [Node -> number]
  SHOW_ENTITY_REFERENCE
  number
  SHOW_NOTATION
  number
  SHOW_ENTITY
  number
  SHOW_DOCUMENT
  number
  SHOW_PROCESSING_INSTRUCTION
  number
  FILTER_REJECT
  number
  SHOW_CDATA_SECTION
  number
  FILTER_ACCEPT
  number
  SHOW_ALL
  number
  SHOW_DOCUMENT_TYPE
  number
  SHOW_TEXT
  number
  SHOW_ELEMENT
  number
  SHOW_COMMENT
  number
  FILTER_SKIP
  number
  SHOW_ATTRIBUTE
  number
  SHOW_DOCUMENT_FRAGMENT
  number))
((ann
  NodeFilter
  (prototype
   NodeFilter
   nil
   [-> NodeFilter]
   SHOW_ENTITY_REFERENCE
   number
   SHOW_NOTATION
   number
   SHOW_ENTITY
   number
   SHOW_DOCUMENT
   number
   SHOW_PROCESSING_INSTRUCTION
   number
   FILTER_REJECT
   number
   SHOW_CDATA_SECTION
   number
   FILTER_ACCEPT
   number
   SHOW_ALL
   number
   SHOW_DOCUMENT_TYPE
   number
   SHOW_TEXT
   number
   SHOW_ELEMENT
   number
   SHOW_COMMENT
   number
   FILTER_SKIP
   number
   SHOW_ATTRIBUTE
   number
   SHOW_DOCUMENT_FRAGMENT
   number)))
((ann-interface
  SVGNumberList
  numberOfItems
  number
  replaceItem
  [SVGNumber number -> SVGNumber]
  getItem
  [number -> SVGNumber]
  clear
  [-> void]
  appendItem
  [SVGNumber -> SVGNumber]
  initialize
  [SVGNumber -> SVGNumber]
  removeItem
  [number -> SVGNumber]
  insertItemBefore
  [SVGNumber number -> SVGNumber]))
((ann SVGNumberList (prototype SVGNumberList nil [-> SVGNumberList])))
((ann-interface
  MediaError
  code
  number
  MEDIA_ERR_ABORTED
  number
  MEDIA_ERR_NETWORK
  number
  MEDIA_ERR_SRC_NOT_SUPPORTED
  number
  MEDIA_ERR_DECODE
  number))
((ann
  MediaError
  (prototype
   MediaError
   nil
   [-> MediaError]
   MEDIA_ERR_ABORTED
   number
   MEDIA_ERR_NETWORK
   number
   MEDIA_ERR_SRC_NOT_SUPPORTED
   number
   MEDIA_ERR_DECODE
   number)))
((ann-interface HTMLFieldSetElement align string form HTMLFormElement))
((ann
  HTMLFieldSetElement
  (prototype HTMLFieldSetElement nil [-> HTMLFieldSetElement])))
((ann-interface
  HTMLBGSoundElement
  balance
  any
  volume
  any
  src
  string
  loop
  number))
((ann
  HTMLBGSoundElement
  (prototype HTMLBGSoundElement nil [-> HTMLBGSoundElement])))
((ann-interface
  HTMLElement
  onmouseleave
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onbeforecut
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onkeydown
  [KeyboardEvent -> any]
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void]
  onmove
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onkeyup
  [KeyboardEvent -> any]
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void]
  onreset
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onhelp
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  ondragleave
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  className
  string
  onfocusin
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  onseeked
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  recordNumber
  any
  title
  string
  parentTextEdit
  Element
  outerHTML
  string
  ondurationchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  offsetHeight
  number
  all
  HTMLCollection
  onblur
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  dir
  string
  onemptied
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onseeking
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  oncanplay
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  ondeactivate
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  ondatasetchanged
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onrowsdelete
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  sourceIndex
  number
  onloadstart
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onlosecapture
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  ondragenter
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  oncontrolselect
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onsubmit
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  behaviorUrns
  MSBehaviorUrnsCollection
  scopeName
  string
  onchange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  id
  string
  onlayoutcomplete
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  uniqueID
  string
  onbeforeactivate
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  oncanplaythrough
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onbeforeupdate
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onfilterchange
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  offsetParent
  Element
  ondatasetcomplete
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onsuspend
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  readyState
  any
  onmouseenter
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  innerText
  string
  onerrorupdate
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onmouseout
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  parentElement
  HTMLElement
  onmousewheel
  [MouseWheelEvent -> any]
  addEventListener
  [*not-implemented* [MouseWheelEvent -> any] {:opt boolean} -> void]
  onvolumechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  oncellchange
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onrowexit
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onrowsinserted
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onpropertychange
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  filters
  Object
  children
  HTMLCollection
  ondragend
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onbeforepaste
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  ondragover
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  offsetTop
  number
  onmouseup
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  ondragstart
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onbeforecopy
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  ondrag
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  innerHTML
  string
  onmouseover
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  lang
  string
  uniqueNumber
  number
  onpause
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  tagUrn
  string
  onmousedown
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onclick
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onwaiting
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onresizestart
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  offsetLeft
  number
  isTextEdit
  boolean
  isDisabled
  boolean
  onpaste
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  canHaveHTML
  boolean
  onmoveend
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  language
  string
  onstalled
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onmousemove
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  style
  MSStyleCSSProperties
  isContentEditable
  boolean
  onbeforeeditfocus
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onratechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  contentEditable
  string
  tabIndex
  number
  document
  Document
  onprogress
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  ondblclick
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  oncontextmenu
  [MouseEvent -> any]
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void]
  onloadedmetadata
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onafterupdate
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onerror
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onplay
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onresizeend
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onplaying
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  isMultiLine
  boolean
  onfocusout
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  onabort
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  ondataavailable
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  hideFocus
  boolean
  onreadystatechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onkeypress
  [KeyboardEvent -> any]
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void]
  onloadeddata
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onbeforedeactivate
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  outerText
  string
  disabled
  boolean
  onactivate
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  accessKey
  string
  onmovestart
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onselectstart
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onfocus
  [FocusEvent -> any]
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void]
  ontimeupdate
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onresize
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  oncut
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onselect
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  ondrop
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  offsetWidth
  number
  oncopy
  [DragEvent -> any]
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void]
  onended
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onscroll
  [UIEvent -> any]
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void]
  onrowenter
  [MSEventObj -> any]
  addEventListener
  [*not-implemented* [MSEventObj -> any] {:opt boolean} -> void]
  onload
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  canHaveChildren
  boolean
  oninput
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  dragDrop
  [-> boolean]
  scrollIntoView
  [{:opt boolean} -> void]
  addFilter
  [Object -> void]
  setCapture
  [{:opt boolean} -> void]
  focus
  [-> void]
  getAdjacentText
  [string -> string]
  insertAdjacentText
  [string string -> void]
  getElementsByClassName
  [string -> NodeList]
  setActive
  [-> void]
  removeFilter
  [Object -> void]
  blur
  [-> void]
  clearAttributes
  [-> void]
  releaseCapture
  [-> void]
  createControlRange
  [-> ControlRangeCollection]
  removeBehavior
  [number -> boolean]
  contains
  [HTMLElement -> boolean]
  click
  [-> void]
  insertAdjacentElement
  [string Element -> Element]
  mergeAttributes
  [HTMLElement {:opt boolean} -> void]
  replaceAdjacentText
  [string string -> string]
  applyElement
  [Element {:opt string} -> Element]
  addBehavior
  [string {:opt any} -> number]
  insertAdjacentHTML
  [string string -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann HTMLElement (prototype HTMLElement nil [-> HTMLElement])))
((ann-interface Comment text string))
((ann Comment (prototype Comment nil [-> Comment])))
((ann-interface
  PerformanceResourceTiming
  redirectStart
  number
  redirectEnd
  number
  domainLookupEnd
  number
  responseStart
  number
  domainLookupStart
  number
  fetchStart
  number
  requestStart
  number
  connectEnd
  number
  connectStart
  number
  initiatorType
  string
  responseEnd
  number))
((ann
  PerformanceResourceTiming
  (prototype
   PerformanceResourceTiming
   nil
   [-> PerformanceResourceTiming])))
((ann-interface CanvasPattern))
((ann CanvasPattern (prototype CanvasPattern nil [-> CanvasPattern])))
((ann-interface
  HTMLHRElement
  width
  number
  align
  string
  noShade
  boolean))
((ann HTMLHRElement (prototype HTMLHRElement nil [-> HTMLHRElement])))
((ann-interface
  HTMLObjectElement
  width
  string
  codeType
  string
  object
  Object
  form
  HTMLFormElement
  code
  string
  archive
  string
  standby
  string
  alt
  string
  classid
  string
  name
  string
  useMap
  string
  data
  string
  height
  string
  contentDocument
  Document
  altHtml
  string
  codeBase
  string
  declare
  boolean
  type
  string
  BaseHref
  string))
((ann
  HTMLObjectElement
  (prototype HTMLObjectElement nil [-> HTMLObjectElement])))
((ann-interface
  HTMLEmbedElement
  width
  string
  palette
  string
  src
  string
  name
  string
  pluginspage
  string
  height
  string
  units
  string))
((ann
  HTMLEmbedElement
  (prototype HTMLEmbedElement nil [-> HTMLEmbedElement])))
((ann-interface
  StorageEvent
  oldValue
  any
  newValue
  any
  url
  string
  storageArea
  Storage
  key
  string
  initStorageEvent
  [string boolean boolean string any any string Storage -> void]))
((ann StorageEvent (prototype StorageEvent nil [-> StorageEvent])))
((ann-interface
  CharacterData
  length
  number
  data
  string
  deleteData
  [number number -> void]
  replaceData
  [number number string -> void]
  appendData
  [string -> void]
  insertData
  [number string -> void]
  substringData
  [number number -> string]))
((ann CharacterData (prototype CharacterData nil [-> CharacterData])))
((ann-interface
  HTMLOptGroupElement
  index
  number
  defaultSelected
  boolean
  text
  string
  value
  string
  form
  HTMLFormElement
  label
  string
  selected
  boolean))
((ann
  HTMLOptGroupElement
  (prototype HTMLOptGroupElement nil [-> HTMLOptGroupElement])))
((ann-interface
  HTMLIsIndexElement
  form
  HTMLFormElement
  action
  string
  prompt
  string))
((ann
  HTMLIsIndexElement
  (prototype HTMLIsIndexElement nil [-> HTMLIsIndexElement])))
((ann-interface SVGPathSegLinetoRel y number x number))
((ann
  SVGPathSegLinetoRel
  (prototype SVGPathSegLinetoRel nil [-> SVGPathSegLinetoRel])))
((ann-interface
  DOMException
  code
  number
  message
  string
  toString
  [-> string]
  HIERARCHY_REQUEST_ERR
  number
  NO_MODIFICATION_ALLOWED_ERR
  number
  INVALID_MODIFICATION_ERR
  number
  NAMESPACE_ERR
  number
  INVALID_CHARACTER_ERR
  number
  TYPE_MISMATCH_ERR
  number
  ABORT_ERR
  number
  INVALID_STATE_ERR
  number
  SECURITY_ERR
  number
  NETWORK_ERR
  number
  WRONG_DOCUMENT_ERR
  number
  QUOTA_EXCEEDED_ERR
  number
  INDEX_SIZE_ERR
  number
  DOMSTRING_SIZE_ERR
  number
  SYNTAX_ERR
  number
  SERIALIZE_ERR
  number
  VALIDATION_ERR
  number
  NOT_FOUND_ERR
  number
  URL_MISMATCH_ERR
  number
  PARSE_ERR
  number
  NO_DATA_ALLOWED_ERR
  number
  NOT_SUPPORTED_ERR
  number
  INVALID_ACCESS_ERR
  number
  INUSE_ATTRIBUTE_ERR
  number))
((ann
  DOMException
  (prototype
   DOMException
   nil
   [-> DOMException]
   HIERARCHY_REQUEST_ERR
   number
   NO_MODIFICATION_ALLOWED_ERR
   number
   INVALID_MODIFICATION_ERR
   number
   NAMESPACE_ERR
   number
   INVALID_CHARACTER_ERR
   number
   TYPE_MISMATCH_ERR
   number
   ABORT_ERR
   number
   INVALID_STATE_ERR
   number
   SECURITY_ERR
   number
   NETWORK_ERR
   number
   WRONG_DOCUMENT_ERR
   number
   QUOTA_EXCEEDED_ERR
   number
   INDEX_SIZE_ERR
   number
   DOMSTRING_SIZE_ERR
   number
   SYNTAX_ERR
   number
   SERIALIZE_ERR
   number
   VALIDATION_ERR
   number
   NOT_FOUND_ERR
   number
   URL_MISMATCH_ERR
   number
   PARSE_ERR
   number
   NO_DATA_ALLOWED_ERR
   number
   NOT_SUPPORTED_ERR
   number
   INVALID_ACCESS_ERR
   number
   INUSE_ATTRIBUTE_ERR
   number)))
((ann-interface SVGAnimatedBoolean animVal boolean baseVal boolean))
((ann
  SVGAnimatedBoolean
  (prototype SVGAnimatedBoolean nil [-> SVGAnimatedBoolean])))
((ann-interface
  MSCompatibleInfoCollection
  length
  number
  item
  [number -> MSCompatibleInfo]))
((ann
  MSCompatibleInfoCollection
  (prototype
   MSCompatibleInfoCollection
   nil
   [-> MSCompatibleInfoCollection])))
((ann-interface SVGSwitchElement))
((ann
  SVGSwitchElement
  (prototype SVGSwitchElement nil [-> SVGSwitchElement])))
((ann-interface
  SVGPreserveAspectRatio
  align
  number
  meetOrSlice
  number
  SVG_PRESERVEASPECTRATIO_NONE
  number
  SVG_PRESERVEASPECTRATIO_XMINYMID
  number
  SVG_PRESERVEASPECTRATIO_XMAXYMIN
  number
  SVG_PRESERVEASPECTRATIO_XMINYMAX
  number
  SVG_PRESERVEASPECTRATIO_XMAXYMAX
  number
  SVG_MEETORSLICE_UNKNOWN
  number
  SVG_PRESERVEASPECTRATIO_XMAXYMID
  number
  SVG_PRESERVEASPECTRATIO_XMIDYMAX
  number
  SVG_PRESERVEASPECTRATIO_XMINYMIN
  number
  SVG_MEETORSLICE_MEET
  number
  SVG_PRESERVEASPECTRATIO_XMIDYMID
  number
  SVG_PRESERVEASPECTRATIO_XMIDYMIN
  number
  SVG_MEETORSLICE_SLICE
  number
  SVG_PRESERVEASPECTRATIO_UNKNOWN
  number))
((ann
  SVGPreserveAspectRatio
  (prototype
   SVGPreserveAspectRatio
   nil
   [-> SVGPreserveAspectRatio]
   SVG_PRESERVEASPECTRATIO_NONE
   number
   SVG_PRESERVEASPECTRATIO_XMINYMID
   number
   SVG_PRESERVEASPECTRATIO_XMAXYMIN
   number
   SVG_PRESERVEASPECTRATIO_XMINYMAX
   number
   SVG_PRESERVEASPECTRATIO_XMAXYMAX
   number
   SVG_MEETORSLICE_UNKNOWN
   number
   SVG_PRESERVEASPECTRATIO_XMAXYMID
   number
   SVG_PRESERVEASPECTRATIO_XMIDYMAX
   number
   SVG_PRESERVEASPECTRATIO_XMINYMIN
   number
   SVG_MEETORSLICE_MEET
   number
   SVG_PRESERVEASPECTRATIO_XMIDYMID
   number
   SVG_PRESERVEASPECTRATIO_XMIDYMIN
   number
   SVG_MEETORSLICE_SLICE
   number
   SVG_PRESERVEASPECTRATIO_UNKNOWN
   number)))
((ann-interface
  Attr
  expando
  boolean
  specified
  boolean
  ownerElement
  Element
  value
  string
  name
  string))
((ann Attr (prototype Attr nil [-> Attr])))
((ann-interface
  PerformanceNavigation
  redirectCount
  number
  type
  number
  toJSON
  [-> any]
  TYPE_RELOAD
  number
  TYPE_RESERVED
  number
  TYPE_BACK_FORWARD
  number
  TYPE_NAVIGATE
  number))
((ann
  PerformanceNavigation
  (prototype
   PerformanceNavigation
   nil
   [-> PerformanceNavigation]
   TYPE_RELOAD
   number
   TYPE_RESERVED
   number
   TYPE_BACK_FORWARD
   number
   TYPE_NAVIGATE
   number)))
((ann-interface SVGStopElement offset SVGAnimatedNumber))
((ann
  SVGStopElement
  (prototype SVGStopElement nil [-> SVGStopElement])))
((ann-interface PositionCallback Position -> void))
((ann-interface SVGSymbolElement))
((ann
  SVGSymbolElement
  (prototype SVGSymbolElement nil [-> SVGSymbolElement])))
((ann-interface
  SVGElementInstanceList
  length
  number
  item
  [number -> SVGElementInstance]))
((ann
  SVGElementInstanceList
  (prototype SVGElementInstanceList nil [-> SVGElementInstanceList])))
((ann-interface
  CSSRuleList
  length
  number
  item
  [number -> CSSRule]
  []
  [number -> CSSRule]))
((ann CSSRuleList (prototype CSSRuleList nil [-> CSSRuleList])))
((ann-interface
  MSDataBindingRecordSetExtensions
  recordset
  Object
  namedRecordset
  [string {:opt any} -> Object]))
((ann-interface LinkStyle styleSheet StyleSheet sheet StyleSheet))
((ann-interface
  HTMLVideoElement
  width
  number
  videoWidth
  number
  videoHeight
  number
  height
  number
  poster
  string))
((ann
  HTMLVideoElement
  (prototype HTMLVideoElement nil [-> HTMLVideoElement])))
((ann-interface
  ClientRectList
  length
  number
  item
  [number -> ClientRect]
  []
  [number -> ClientRect]))
((ann
  ClientRectList
  (prototype ClientRectList nil [-> ClientRectList])))
((ann-interface
  SVGMaskElement
  y
  SVGAnimatedLength
  width
  SVGAnimatedLength
  maskUnits
  SVGAnimatedEnumeration
  maskContentUnits
  SVGAnimatedEnumeration
  x
  SVGAnimatedLength
  height
  SVGAnimatedLength))
((ann
  SVGMaskElement
  (prototype SVGMaskElement nil [-> SVGMaskElement])))
((ann-interface External))
((ann External (prototype External nil [-> External])))
((ann Audio (nil [{:opt string} -> HTMLAudioElement]))
 (ann
  Option
  (nil
   [{:opt string}
    {:opt string}
    {:opt boolean}
    {:opt boolean}
    ->
    HTMLOptionElement]))
 (ann Image (nil [{:opt number} {:opt number} -> HTMLImageElement]))
 (ann ondragend [DragEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void])
 (ann onkeydown [KeyboardEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void])
 (ann ondragover [DragEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void])
 (ann onkeyup [KeyboardEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void])
 (ann onreset [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onmouseup [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann ondragstart [DragEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void])
 (ann ondrag [DragEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void])
 (ann screenX number)
 (ann onmouseover [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann ondragleave [DragEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void])
 (ann history History)
 (ann pageXOffset number)
 (ann name string)
 (ann onafterprint [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onpause [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onbeforeprint [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann top Window)
 (ann onmousedown [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann onseeked [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann opener Window)
 (ann onclick [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann innerHeight number)
 (ann onwaiting [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann ononline [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann ondurationchange [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann frames Window)
 (ann onblur [FocusEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void])
 (ann onemptied [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onseeking [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann oncanplay [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann outerWidth number)
 (ann onstalled [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onmousemove [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann innerWidth number)
 (ann onoffline [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann length number)
 (ann screen Screen)
 (ann onbeforeunload [BeforeUnloadEvent -> any])
 (ann
  addEventListener
  [*not-implemented*
   [BeforeUnloadEvent -> any]
   {:opt boolean}
   ->
   void])
 (ann onratechange [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onstorage [StorageEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [StorageEvent -> any] {:opt boolean} -> void])
 (ann onloadstart [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann ondragenter [DragEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void])
 (ann onsubmit [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann self Window)
 (ann document Document)
 (ann onprogress [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann ondblclick [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann pageYOffset number)
 (ann oncontextmenu [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann onchange [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onloadedmetadata [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onplay [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onerror ErrorEventHandler)
 (ann onplaying [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann parent Window)
 (ann location Location)
 (ann oncanplaythrough [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onabort [UIEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void])
 (ann onreadystatechange [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann outerHeight number)
 (ann onkeypress [KeyboardEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [KeyboardEvent -> any] {:opt boolean} -> void])
 (ann frameElement Element)
 (ann onloadeddata [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onsuspend [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann window Window)
 (ann onfocus [FocusEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void])
 (ann onmessage [MessageEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MessageEvent -> any] {:opt boolean} -> void])
 (ann ontimeupdate [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onresize [UIEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void])
 (ann onselect [UIEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void])
 (ann navigator Navigator)
 (ann styleMedia StyleMedia)
 (ann ondrop [DragEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [DragEvent -> any] {:opt boolean} -> void])
 (ann onmouseout [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann onended [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onhashchange [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onunload [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onscroll [UIEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [UIEvent -> any] {:opt boolean} -> void])
 (ann screenY number)
 (ann onmousewheel [MouseWheelEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseWheelEvent -> any] {:opt boolean} -> void])
 (ann onload [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann onvolumechange [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann oninput [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann performance Performance)
 (ann alert [{:opt string} -> void])
 (ann scroll [{:opt number} {:opt number} -> void])
 (ann focus [-> void])
 (ann scrollTo [{:opt number} {:opt number} -> void])
 (ann print [-> void])
 (ann prompt [{:opt string} {:opt string} -> string])
 (ann toString [-> string])
 (ann
  open
  [{:opt string} {:opt string} {:opt string} {:opt boolean} -> Window])
 (ann scrollBy [{:opt number} {:opt number} -> void])
 (ann confirm [{:opt string} -> boolean])
 (ann close [-> void])
 (ann postMessage [any string {:opt any} -> void])
 (ann showModalDialog [{:opt string} {:opt any} {:opt any} -> any])
 (ann blur [-> void])
 (ann getSelection [-> Selection])
 (ann getComputedStyle [Element {:opt string} -> CSSStyleDeclaration])
 (ann addEventListener [string EventListener {:opt boolean} -> void])
 (ann
  removeEventListener
  [string EventListener {:opt boolean} -> void])
 (ann dispatchEvent [Event -> boolean])
 (ann attachEvent [string EventListener -> boolean])
 (ann detachEvent [string EventListener -> void])
 (ann localStorage Storage)
 (ann status string)
 (ann onmouseleave [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann screenLeft number)
 (ann offscreenBuffering any)
 (ann maxConnectionsPerServer number)
 (ann onmouseenter [MouseEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [MouseEvent -> any] {:opt boolean} -> void])
 (ann clipboardData DataTransfer)
 (ann defaultStatus string)
 (ann clientInformation Navigator)
 (ann closed boolean)
 (ann onhelp [Event -> any])
 (ann
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void])
 (ann external External)
 (ann event MSEventObj)
 (ann onfocusout [FocusEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void])
 (ann screenTop number)
 (ann onfocusin [FocusEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [FocusEvent -> any] {:opt boolean} -> void])
 (ann
  showModelessDialog
  [{:opt string} {:opt any} {:opt any} -> Window])
 (ann navigate [string -> void])
 (ann resizeBy [{:opt number} {:opt number} -> void])
 (ann item [any -> any])
 (ann resizeTo [{:opt number} {:opt number} -> void])
 (ann createPopup [{:opt any} -> MSPopupWindow])
 (ann toStaticHTML [string -> string])
 (ann execScript [string {:opt string} -> any])
 (ann msWriteProfilerMark [string -> void])
 (ann moveTo [{:opt number} {:opt number} -> void])
 (ann moveBy [{:opt number} {:opt number} -> void])
 (ann showHelp [string {:opt any} {:opt string} -> void])
 (ann sessionStorage Storage)
 (ann clearTimeout [number -> void])
 (ann setTimeout [any {:opt any} (any *) -> number])
 (ann clearInterval [number -> void])
 (ann setInterval [any {:opt any} (any *) -> number])
 (ann-interface ObjectURLOptions oneTimeOnly boolean))
((ann-interface
  HTMLBodyElement
  onpopstate
  [PopStateEvent -> any]
  addEventListener
  [*not-implemented* [PopStateEvent -> any] {:opt boolean} -> void]))
((ann-interface
  MSGestureEvent
  offsetY
  number
  translationY
  number
  velocityExpansion
  number
  velocityY
  number
  velocityAngular
  number
  translationX
  number
  velocityX
  number
  hwTimestamp
  number
  offsetX
  number
  screenX
  number
  rotation
  number
  expansion
  number
  clientY
  number
  screenY
  number
  scale
  number
  gestureObject
  any
  clientX
  number
  initGestureEvent
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
   void]
  MSGESTURE_FLAG_BEGIN
  number
  MSGESTURE_FLAG_END
  number
  MSGESTURE_FLAG_CANCEL
  number
  MSGESTURE_FLAG_INERTIA
  number
  MSGESTURE_FLAG_NONE
  number))
((ann
  MSGestureEvent
  (prototype
   MSGestureEvent
   nil
   [-> MSGestureEvent]
   MSGESTURE_FLAG_BEGIN
   number
   MSGESTURE_FLAG_END
   number
   MSGESTURE_FLAG_CANCEL
   number
   MSGESTURE_FLAG_INERTIA
   number
   MSGESTURE_FLAG_NONE
   number)))
((ann-interface HTMLAnchorElement text string))
((ann-interface
  HTMLInputElement
  validationMessage
  string
  files
  FileList
  max
  string
  formTarget
  string
  willValidate
  boolean
  step
  string
  autofocus
  boolean
  required
  boolean
  formEnctype
  string
  valueAsNumber
  number
  placeholder
  string
  formMethod
  string
  list
  HTMLElement
  autocomplete
  string
  min
  string
  formAction
  string
  pattern
  string
  validity
  ValidityState
  formNoValidate
  string
  multiple
  boolean
  checkValidity
  [-> boolean]
  stepDown
  [{:opt number} -> void]
  stepUp
  [{:opt number} -> void]
  setCustomValidity
  [string -> void]))
((ann-interface
  ErrorEvent
  colno
  number
  filename
  string
  lineno
  number
  message
  string
  initErrorEvent
  [string boolean boolean string string number -> void]))
((ann ErrorEvent (prototype ErrorEvent nil [-> ErrorEvent])))
((ann-interface
  SVGFilterElement
  y
  SVGAnimatedLength
  width
  SVGAnimatedLength
  filterResX
  SVGAnimatedInteger
  filterUnits
  SVGAnimatedEnumeration
  primitiveUnits
  SVGAnimatedEnumeration
  x
  SVGAnimatedLength
  height
  SVGAnimatedLength
  filterResY
  SVGAnimatedInteger
  setFilterRes
  [number number -> void]))
((ann
  SVGFilterElement
  (prototype SVGFilterElement nil [-> SVGFilterElement])))
((ann-interface TrackEvent track any))
((ann TrackEvent (prototype TrackEvent nil [-> TrackEvent])))
((ann-interface SVGFEMergeNodeElement in1 SVGAnimatedString))
((ann
  SVGFEMergeNodeElement
  (prototype SVGFEMergeNodeElement nil [-> SVGFEMergeNodeElement])))
((ann-interface SVGFEFloodElement))
((ann
  SVGFEFloodElement
  (prototype SVGFEFloodElement nil [-> SVGFEFloodElement])))
((ann-interface
  MSGesture
  target
  Element
  addPointer
  [number -> void]
  stop
  [-> void]))
((ann MSGesture (prototype MSGesture nil [-> MSGesture])))
((ann-interface
  TextTrackCue
  onenter
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  track
  TextTrack
  endTime
  number
  text
  string
  pauseOnExit
  boolean
  id
  string
  startTime
  number
  onexit
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  getCueAsHTML
  [-> DocumentFragment]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann TextTrackCue (prototype TextTrackCue nil [-> TextTrackCue])))
((ann-interface
  MSStreamReader
  error
  DOMError
  readAsArrayBuffer
  [MSStream {:opt number} -> void]
  readAsBlob
  [MSStream {:opt number} -> void]
  readAsDataURL
  [MSStream {:opt number} -> void]
  readAsText
  [MSStream {:opt string} {:opt number} -> void]))
((ann
  MSStreamReader
  (prototype MSStreamReader nil [-> MSStreamReader])))
((ann-interface
  DOMTokenList
  length
  number
  contains
  [string -> boolean]
  remove
  [string -> void]
  toggle
  [string -> boolean]
  add
  [string -> void]
  item
  [number -> string]
  []
  [number -> string]
  toString
  [-> string]))
((ann DOMTokenList (prototype DOMTokenList nil [-> DOMTokenList])))
((ann-interface EventException name string))
((ann-interface Performance now [-> number]))
((ann-interface SVGFEFuncAElement))
((ann
  SVGFEFuncAElement
  (prototype SVGFEFuncAElement nil [-> SVGFEFuncAElement])))
((ann-interface SVGFETileElement in1 SVGAnimatedString))
((ann
  SVGFETileElement
  (prototype SVGFETileElement nil [-> SVGFETileElement])))
((ann-interface
  SVGFEBlendElement
  in2
  SVGAnimatedString
  mode
  SVGAnimatedEnumeration
  in1
  SVGAnimatedString
  SVG_FEBLEND_MODE_DARKEN
  number
  SVG_FEBLEND_MODE_UNKNOWN
  number
  SVG_FEBLEND_MODE_MULTIPLY
  number
  SVG_FEBLEND_MODE_NORMAL
  number
  SVG_FEBLEND_MODE_SCREEN
  number
  SVG_FEBLEND_MODE_LIGHTEN
  number))
((ann
  SVGFEBlendElement
  (prototype
   SVGFEBlendElement
   nil
   [-> SVGFEBlendElement]
   SVG_FEBLEND_MODE_DARKEN
   number
   SVG_FEBLEND_MODE_UNKNOWN
   number
   SVG_FEBLEND_MODE_MULTIPLY
   number
   SVG_FEBLEND_MODE_NORMAL
   number
   SVG_FEBLEND_MODE_SCREEN
   number
   SVG_FEBLEND_MODE_LIGHTEN
   number)))
((ann-interface WindowTimers))
((ann WindowTimers (prototype WindowTimers nil [-> WindowTimers])))
((ann-interface
  CSSStyleDeclaration
  animationFillMode
  string
  floodColor
  string
  animationIterationCount
  string
  textShadow
  string
  backfaceVisibility
  string
  msAnimationIterationCount
  string
  animationDelay
  string
  animationTimingFunction
  string
  columnWidth
  any
  msScrollSnapX
  string
  columnRuleColor
  any
  columnRuleWidth
  any
  transitionDelay
  string
  transition
  string
  msFlowFrom
  string
  msScrollSnapType
  string
  msContentZoomSnapType
  string
  msGridColumns
  string
  msAnimationName
  string
  msGridRowAlign
  string
  msContentZoomChaining
  string
  msGridColumn
  any
  msHyphenateLimitZone
  any
  msScrollRails
  string
  msAnimationDelay
  string
  enableBackground
  string
  msWrapThrough
  string
  columnRuleStyle
  string
  msAnimation
  string
  msFlexFlow
  string
  msScrollSnapY
  string
  msHyphenateLimitLines
  any
  msTouchAction
  string
  msScrollLimit
  string
  animation
  string
  transform
  string
  filter
  string
  colorInterpolationFilters
  string
  transitionTimingFunction
  string
  msBackfaceVisibility
  string
  animationPlayState
  string
  transformOrigin
  string
  msScrollLimitYMin
  any
  msFontFeatureSettings
  string
  msContentZoomLimitMin
  any
  columnGap
  any
  transitionProperty
  string
  msAnimationDuration
  string
  msAnimationFillMode
  string
  msFlexDirection
  string
  msTransitionDuration
  string
  fontFeatureSettings
  string
  breakBefore
  string
  msFlexWrap
  string
  perspective
  string
  msFlowInto
  string
  msTransformStyle
  string
  msScrollTranslation
  string
  msTransitionProperty
  string
  msUserSelect
  string
  msOverflowStyle
  string
  msScrollSnapPointsY
  string
  animationDirection
  string
  animationDuration
  string
  msFlex
  string
  msTransitionTimingFunction
  string
  animationName
  string
  columnRule
  string
  msGridColumnSpan
  any
  msFlexNegative
  string
  columnFill
  string
  msGridRow
  any
  msFlexOrder
  string
  msFlexItemAlign
  string
  msFlexPositive
  string
  msContentZoomLimitMax
  any
  msScrollLimitYMax
  any
  msGridColumnAlign
  string
  perspectiveOrigin
  string
  lightingColor
  string
  columns
  string
  msScrollChaining
  string
  msHyphenateLimitChars
  string
  msTouchSelect
  string
  floodOpacity
  string
  msAnimationDirection
  string
  msAnimationPlayState
  string
  columnSpan
  string
  msContentZooming
  string
  msPerspective
  string
  msFlexPack
  string
  msScrollSnapPointsX
  string
  msContentZoomSnapPoints
  string
  msGridRowSpan
  any
  msContentZoomSnap
  string
  msScrollLimitXMin
  any
  breakInside
  string
  msHighContrastAdjust
  string
  msFlexLinePack
  string
  msGridRows
  string
  transitionDuration
  string
  msHyphens
  string
  breakAfter
  string
  msTransition
  string
  msPerspectiveOrigin
  string
  msContentZoomLimit
  string
  msScrollLimitXMax
  any
  msFlexAlign
  string
  msWrapMargin
  any
  columnCount
  any
  msAnimationTimingFunction
  string
  msTransitionDelay
  string
  transformStyle
  string
  msWrapFlow
  string
  msFlexPreferredSize
  string))
((ann-interface MessageChannel port2 MessagePort port1 MessagePort))
((ann
  MessageChannel
  (prototype MessageChannel nil [-> MessageChannel])))
((ann-interface SVGFEMergeElement))
((ann
  SVGFEMergeElement
  (prototype SVGFEMergeElement nil [-> SVGFEMergeElement])))
((ann-interface
  Navigator
  msMaxTouchPoints
  number
  msPointerEnabled
  boolean
  msManipulationViewsEnabled
  boolean
  msLaunchUri
  [string
   {:opt MSLaunchUriCallback}
   {:opt MSLaunchUriCallback}
   ->
   void]))
((ann-interface
  TransitionEvent
  propertyName
  string
  elapsedTime
  number
  initTransitionEvent
  [string boolean boolean string number -> void]))
((ann
  TransitionEvent
  (prototype TransitionEvent nil [-> TransitionEvent])))
((ann-interface
  MediaQueryList
  matches
  boolean
  media
  string
  addListener
  [MediaQueryListListener -> void]
  removeListener
  [MediaQueryListListener -> void]))
((ann
  MediaQueryList
  (prototype MediaQueryList nil [-> MediaQueryList])))
((ann-interface DOMError name string toString [-> string]))
((ann DOMError (prototype DOMError nil [-> DOMError])))
((ann-interface
  CloseEvent
  wasClean
  boolean
  reason
  string
  code
  number
  initCloseEvent
  [string boolean boolean boolean number string -> void]))
((ann CloseEvent (prototype CloseEvent nil [-> CloseEvent])))
((ann-interface
  WebSocket
  protocol
  string
  readyState
  number
  bufferedAmount
  number
  onopen
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  extensions
  string
  onmessage
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onclose
  [CloseEvent -> any]
  addEventListener
  [*not-implemented* [CloseEvent -> any] {:opt boolean} -> void]
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  binaryType
  string
  url
  string
  close
  [{:opt number} {:opt string} -> void]
  send
  [any -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]
  OPEN
  number
  CLOSING
  number
  CONNECTING
  number
  CLOSED
  number))
((ann
  WebSocket
  (prototype
   WebSocket
   nil
   [string -> WebSocket]
   nil
   [string string -> WebSocket]
   nil
   [string (string *) -> WebSocket]
   OPEN
   number
   CLOSING
   number
   CONNECTING
   number
   CLOSED
   number)))
((ann-interface
  SVGFEPointLightElement
  y
  SVGAnimatedNumber
  x
  SVGAnimatedNumber
  z
  SVGAnimatedNumber))
((ann
  SVGFEPointLightElement
  (prototype SVGFEPointLightElement nil [-> SVGFEPointLightElement])))
((ann-interface
  ProgressEvent
  loaded
  number
  lengthComputable
  boolean
  total
  number
  initProgressEvent
  [string boolean boolean boolean number number -> void]))
((ann ProgressEvent (prototype ProgressEvent nil [-> ProgressEvent])))
((ann-interface
  IDBObjectStore
  indexNames
  DOMStringList
  name
  string
  transaction
  IDBTransaction
  keyPath
  string
  count
  [{:opt any} -> IDBRequest]
  add
  [any {:opt any} -> IDBRequest]
  clear
  [-> IDBRequest]
  createIndex
  [string string {:opt any} -> IDBIndex]
  put
  [any {:opt any} -> IDBRequest]
  openCursor
  [{:opt any} {:opt string} -> IDBRequest]
  deleteIndex
  [string -> void]
  index
  [string -> IDBIndex]
  get
  [any -> IDBRequest]
  delete
  [any -> IDBRequest]))
((ann
  IDBObjectStore
  (prototype IDBObjectStore nil [-> IDBObjectStore])))
((ann-interface HTMLCanvasElement msToBlob [-> Blob]))
((ann-interface
  SVGFEGaussianBlurElement
  stdDeviationX
  SVGAnimatedNumber
  in1
  SVGAnimatedString
  stdDeviationY
  SVGAnimatedNumber
  setStdDeviation
  [number number -> void]))
((ann
  SVGFEGaussianBlurElement
  (prototype
   SVGFEGaussianBlurElement
   nil
   [-> SVGFEGaussianBlurElement])))
((ann-interface
  SVGFilterPrimitiveStandardAttributes
  y
  SVGAnimatedLength
  width
  SVGAnimatedLength
  x
  SVGAnimatedLength
  height
  SVGAnimatedLength
  result
  SVGAnimatedString))
((ann-interface
  Element
  msRegionOverflow
  string
  onmspointerdown
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgotpointercapture
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturedoubletap
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerhover
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturehold
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointermove
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturechange
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturestart
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointercancel
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgestureend
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturetap
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerout
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsinertiastart
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmslostpointercapture
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerover
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msContentZoomFactor
  number
  onmspointerup
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msGetRegionContent
  [-> MSRangeCollection]
  msReleasePointerCapture
  [number -> void]
  msSetPointerCapture
  [number -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann-interface
  IDBVersionChangeEvent
  newVersion
  number
  oldVersion
  number))
((ann
  IDBVersionChangeEvent
  (prototype IDBVersionChangeEvent nil [-> IDBVersionChangeEvent])))
((ann-interface
  IDBIndex
  unique
  boolean
  name
  string
  keyPath
  string
  objectStore
  IDBObjectStore
  count
  [{:opt any} -> IDBRequest]
  getKey
  [any -> IDBRequest]
  openKeyCursor
  [{:opt IDBKeyRange} {:opt string} -> IDBRequest]
  get
  [any -> IDBRequest]
  openCursor
  [{:opt IDBKeyRange} {:opt string} -> IDBRequest]))
((ann IDBIndex (prototype IDBIndex nil [-> IDBIndex])))
((ann-interface WheelEvent getCurrentPoint [Element -> void]))
((ann-interface
  FileList
  length
  number
  item
  [number -> File]
  []
  [number -> File]))
((ann FileList (prototype FileList nil [-> FileList])))
((ann-interface
  IDBCursor
  source
  any
  direction
  string
  key
  any
  primaryKey
  any
  advance
  [number -> void]
  delete
  [-> IDBRequest]
  continue
  [{:opt any} -> void]
  update
  [any -> IDBRequest]
  PREV
  string
  PREV_NO_DUPLICATE
  string
  NEXT
  string
  NEXT_NO_DUPLICATE
  string))
((ann
  IDBCursor
  (prototype
   IDBCursor
   nil
   [-> IDBCursor]
   PREV
   string
   PREV_NO_DUPLICATE
   string
   NEXT
   string
   NEXT_NO_DUPLICATE
   string)))
((ann-interface
  SVGFESpecularLightingElement
  kernelUnitLengthY
  SVGAnimatedNumber
  surfaceScale
  SVGAnimatedNumber
  specularExponent
  SVGAnimatedNumber
  in1
  SVGAnimatedString
  kernelUnitLengthX
  SVGAnimatedNumber
  specularConstant
  SVGAnimatedNumber))
((ann
  SVGFESpecularLightingElement
  (prototype
   SVGFESpecularLightingElement
   nil
   [-> SVGFESpecularLightingElement])))
((ann-interface File lastModifiedDate any name string))
((ann File (prototype File nil [-> File])))
((ann-interface
  URL
  revokeObjectURL
  [string -> void]
  createObjectURL
  [any {:opt ObjectURLOptions} -> string]))
((ann URL URL) (ann-interface RangeException name string))
((ann-interface IDBCursorWithValue value any))
((ann
  IDBCursorWithValue
  (prototype IDBCursorWithValue nil [-> IDBCursorWithValue])))
((ann-interface
  HTMLTextAreaElement
  validationMessage
  string
  autofocus
  boolean
  validity
  ValidityState
  required
  boolean
  maxLength
  number
  willValidate
  boolean
  placeholder
  string
  checkValidity
  [-> boolean]
  setCustomValidity
  [string -> void]))
((ann-interface
  XMLHttpRequestEventTarget
  onprogress
  [ProgressEvent -> any]
  addEventListener
  [*not-implemented* [ProgressEvent -> any] {:opt boolean} -> void]
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  onload
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  ontimeout
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onabort
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onloadstart
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onloadend
  [ProgressEvent -> any]
  addEventListener
  [*not-implemented* [ProgressEvent -> any] {:opt boolean} -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  XMLHttpRequestEventTarget
  (prototype
   XMLHttpRequestEventTarget
   nil
   [-> XMLHttpRequestEventTarget])))
((ann-interface
  IDBEnvironment
  msIndexedDB
  IDBFactory
  indexedDB
  IDBFactory))
((ann-interface
  AudioTrackList
  length
  number
  onchange
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onaddtrack
  [TrackEvent -> any]
  addEventListener
  [*not-implemented* [TrackEvent -> any] {:opt boolean} -> void]
  getTrackById
  [string -> AudioTrack]
  item
  [number -> AudioTrack]
  []
  [number -> AudioTrack]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  AudioTrackList
  (prototype AudioTrackList nil [-> AudioTrackList])))
((ann-interface
  MSBaseReader
  onprogress
  [ProgressEvent -> any]
  addEventListener
  [*not-implemented* [ProgressEvent -> any] {:opt boolean} -> void]
  readyState
  number
  onabort
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onloadend
  [ProgressEvent -> any]
  addEventListener
  [*not-implemented* [ProgressEvent -> any] {:opt boolean} -> void]
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  onload
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onloadstart
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  result
  any
  abort
  [-> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]
  LOADING
  number
  EMPTY
  number
  DONE
  number))
((ann-interface
  History
  state
  any
  replaceState
  [any string {:opt string} -> void]
  pushState
  [any string {:opt string} -> void]))
((ann-interface
  SVGFEMorphologyElement
  operator
  SVGAnimatedEnumeration
  radiusX
  SVGAnimatedNumber
  radiusY
  SVGAnimatedNumber
  in1
  SVGAnimatedString
  SVG_MORPHOLOGY_OPERATOR_UNKNOWN
  number
  SVG_MORPHOLOGY_OPERATOR_ERODE
  number
  SVG_MORPHOLOGY_OPERATOR_DILATE
  number))
((ann
  SVGFEMorphologyElement
  (prototype
   SVGFEMorphologyElement
   nil
   [-> SVGFEMorphologyElement]
   SVG_MORPHOLOGY_OPERATOR_UNKNOWN
   number
   SVG_MORPHOLOGY_OPERATOR_ERODE
   number
   SVG_MORPHOLOGY_OPERATOR_DILATE
   number)))
((ann-interface
  HTMLSelectElement
  validationMessage
  string
  autofocus
  boolean
  validity
  ValidityState
  required
  boolean
  willValidate
  boolean
  checkValidity
  [-> boolean]
  setCustomValidity
  [string -> void]))
((ann-interface
  CSSRule
  KEYFRAMES_RULE
  number
  KEYFRAME_RULE
  number
  VIEWPORT_RULE
  number))
((ann-interface SVGFEFuncRElement))
((ann
  SVGFEFuncRElement
  (prototype SVGFEFuncRElement nil [-> SVGFEFuncRElement])))
((ann-interface
  WindowTimersExtension
  msSetImmediate
  [any (any *) -> number]
  clearImmediate
  [number -> void]
  msClearImmediate
  [number -> void]
  setImmediate
  [any (any *) -> number]))
((ann-interface
  SVGFEDisplacementMapElement
  in2
  SVGAnimatedString
  xChannelSelector
  SVGAnimatedEnumeration
  yChannelSelector
  SVGAnimatedEnumeration
  scale
  SVGAnimatedNumber
  in1
  SVGAnimatedString
  SVG_CHANNEL_B
  number
  SVG_CHANNEL_R
  number
  SVG_CHANNEL_G
  number
  SVG_CHANNEL_UNKNOWN
  number
  SVG_CHANNEL_A
  number))
((ann
  SVGFEDisplacementMapElement
  (prototype
   SVGFEDisplacementMapElement
   nil
   [-> SVGFEDisplacementMapElement]
   SVG_CHANNEL_B
   number
   SVG_CHANNEL_R
   number
   SVG_CHANNEL_G
   number
   SVG_CHANNEL_UNKNOWN
   number
   SVG_CHANNEL_A
   number)))
((ann-interface
  AnimationEvent
  animationName
  string
  elapsedTime
  number
  initAnimationEvent
  [string boolean boolean string number -> void]))
((ann
  AnimationEvent
  (prototype AnimationEvent nil [-> AnimationEvent])))
((ann-interface
  SVGComponentTransferFunctionElement
  tableValues
  SVGAnimatedNumberList
  slope
  SVGAnimatedNumber
  type
  SVGAnimatedEnumeration
  exponent
  SVGAnimatedNumber
  amplitude
  SVGAnimatedNumber
  intercept
  SVGAnimatedNumber
  offset
  SVGAnimatedNumber
  SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN
  number
  SVG_FECOMPONENTTRANSFER_TYPE_TABLE
  number
  SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY
  number
  SVG_FECOMPONENTTRANSFER_TYPE_GAMMA
  number
  SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE
  number
  SVG_FECOMPONENTTRANSFER_TYPE_LINEAR
  number))
((ann
  SVGComponentTransferFunctionElement
  (prototype
   SVGComponentTransferFunctionElement
   nil
   [-> SVGComponentTransferFunctionElement]
   SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN
   number
   SVG_FECOMPONENTTRANSFER_TYPE_TABLE
   number
   SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY
   number
   SVG_FECOMPONENTTRANSFER_TYPE_GAMMA
   number
   SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE
   number
   SVG_FECOMPONENTTRANSFER_TYPE_LINEAR
   number)))
((ann-interface
  MSRangeCollection
  length
  number
  item
  [number -> Range]
  []
  [number -> Range]))
((ann
  MSRangeCollection
  (prototype MSRangeCollection nil [-> MSRangeCollection])))
((ann-interface
  SVGFEDistantLightElement
  azimuth
  SVGAnimatedNumber
  elevation
  SVGAnimatedNumber))
((ann
  SVGFEDistantLightElement
  (prototype
   SVGFEDistantLightElement
   nil
   [-> SVGFEDistantLightElement])))
((ann-interface SVGException name string))
((ann-interface SVGFEFuncBElement))
((ann
  SVGFEFuncBElement
  (prototype SVGFEFuncBElement nil [-> SVGFEFuncBElement])))
((ann-interface
  IDBKeyRange
  upper
  any
  upperOpen
  boolean
  lower
  any
  lowerOpen
  boolean
  bound
  [any any {:opt boolean} {:opt boolean} -> IDBKeyRange]
  only
  [any -> IDBKeyRange]
  lowerBound
  [any {:opt boolean} -> IDBKeyRange]
  upperBound
  [any {:opt boolean} -> IDBKeyRange]))
((ann IDBKeyRange (prototype IDBKeyRange nil [-> IDBKeyRange])))
((ann-interface WindowConsole console Console))
((ann-interface
  IDBTransaction
  oncomplete
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  db
  IDBDatabase
  mode
  string
  error
  DOMError
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  onabort
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  abort
  [-> void]
  objectStore
  [string -> IDBObjectStore]
  addEventListener
  [string EventListener {:opt boolean} -> void]
  READ_ONLY
  string
  VERSION_CHANGE
  string
  READ_WRITE
  string))
((ann
  IDBTransaction
  (prototype
   IDBTransaction
   nil
   [-> IDBTransaction]
   READ_ONLY
   string
   VERSION_CHANGE
   string
   READ_WRITE
   string)))
((ann-interface
  AudioTrack
  kind
  string
  language
  string
  id
  string
  label
  string
  enabled
  boolean))
((ann AudioTrack (prototype AudioTrack nil [-> AudioTrack])))
((ann-interface
  SVGFEConvolveMatrixElement
  orderY
  SVGAnimatedInteger
  kernelUnitLengthY
  SVGAnimatedNumber
  orderX
  SVGAnimatedInteger
  preserveAlpha
  SVGAnimatedBoolean
  kernelMatrix
  SVGAnimatedNumberList
  edgeMode
  SVGAnimatedEnumeration
  kernelUnitLengthX
  SVGAnimatedNumber
  bias
  SVGAnimatedNumber
  targetX
  SVGAnimatedInteger
  targetY
  SVGAnimatedInteger
  divisor
  SVGAnimatedNumber
  in1
  SVGAnimatedString
  SVG_EDGEMODE_WRAP
  number
  SVG_EDGEMODE_DUPLICATE
  number
  SVG_EDGEMODE_UNKNOWN
  number
  SVG_EDGEMODE_NONE
  number))
((ann
  SVGFEConvolveMatrixElement
  (prototype
   SVGFEConvolveMatrixElement
   nil
   [-> SVGFEConvolveMatrixElement]
   SVG_EDGEMODE_WRAP
   number
   SVG_EDGEMODE_DUPLICATE
   number
   SVG_EDGEMODE_UNKNOWN
   number
   SVG_EDGEMODE_NONE
   number)))
((ann-interface
  TextTrackCueList
  length
  number
  item
  [number -> TextTrackCue]
  []
  [number -> TextTrackCue]
  getCueById
  [string -> TextTrackCue]))
((ann
  TextTrackCueList
  (prototype TextTrackCueList nil [-> TextTrackCueList])))
((ann-interface
  CSSKeyframesRule
  name
  string
  cssRules
  CSSRuleList
  findRule
  [string -> CSSKeyframeRule]
  deleteRule
  [string -> void]
  appendRule
  [string -> void]))
((ann
  CSSKeyframesRule
  (prototype CSSKeyframesRule nil [-> CSSKeyframesRule])))
((ann-interface
  Window
  onmspointerdown
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  animationStartTime
  number
  onmsgesturedoubletap
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerhover
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturehold
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointermove
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturechange
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturestart
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointercancel
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgestureend
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturetap
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerout
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msAnimationStartTime
  number
  applicationCache
  ApplicationCache
  onmsinertiastart
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerover
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onpopstate
  [PopStateEvent -> any]
  addEventListener
  [*not-implemented* [PopStateEvent -> any] {:opt boolean} -> void]
  onmspointerup
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msCancelRequestAnimationFrame
  [number -> void]
  matchMedia
  [string -> MediaQueryList]
  cancelAnimationFrame
  [number -> void]
  msIsStaticHTML
  [string -> boolean]
  msMatchMedia
  [string -> MediaQueryList]
  requestAnimationFrame
  [FrameRequestCallback -> number]
  msRequestAnimationFrame
  [FrameRequestCallback -> number]))
((ann-interface
  SVGFETurbulenceElement
  baseFrequencyX
  SVGAnimatedNumber
  numOctaves
  SVGAnimatedInteger
  type
  SVGAnimatedEnumeration
  baseFrequencyY
  SVGAnimatedNumber
  stitchTiles
  SVGAnimatedEnumeration
  seed
  SVGAnimatedNumber
  SVG_STITCHTYPE_UNKNOWN
  number
  SVG_STITCHTYPE_NOSTITCH
  number
  SVG_TURBULENCE_TYPE_UNKNOWN
  number
  SVG_TURBULENCE_TYPE_TURBULENCE
  number
  SVG_TURBULENCE_TYPE_FRACTALNOISE
  number
  SVG_STITCHTYPE_STITCH
  number))
((ann
  SVGFETurbulenceElement
  (prototype
   SVGFETurbulenceElement
   nil
   [-> SVGFETurbulenceElement]
   SVG_STITCHTYPE_UNKNOWN
   number
   SVG_STITCHTYPE_NOSTITCH
   number
   SVG_TURBULENCE_TYPE_UNKNOWN
   number
   SVG_TURBULENCE_TYPE_TURBULENCE
   number
   SVG_TURBULENCE_TYPE_FRACTALNOISE
   number
   SVG_STITCHTYPE_STITCH
   number)))
((ann-interface
  TextTrackList
  length
  number
  item
  [number -> TextTrack]
  []
  [number -> TextTrack]))
((ann TextTrackList (prototype TextTrackList nil [-> TextTrackList])))
((ann-interface SVGFEFuncGElement))
((ann
  SVGFEFuncGElement
  (prototype SVGFEFuncGElement nil [-> SVGFEFuncGElement])))
((ann-interface
  SVGFEColorMatrixElement
  in1
  SVGAnimatedString
  type
  SVGAnimatedEnumeration
  values
  SVGAnimatedNumberList
  SVG_FECOLORMATRIX_TYPE_SATURATE
  number
  SVG_FECOLORMATRIX_TYPE_UNKNOWN
  number
  SVG_FECOLORMATRIX_TYPE_MATRIX
  number
  SVG_FECOLORMATRIX_TYPE_HUEROTATE
  number
  SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA
  number))
((ann
  SVGFEColorMatrixElement
  (prototype
   SVGFEColorMatrixElement
   nil
   [-> SVGFEColorMatrixElement]
   SVG_FECOLORMATRIX_TYPE_SATURATE
   number
   SVG_FECOLORMATRIX_TYPE_UNKNOWN
   number
   SVG_FECOLORMATRIX_TYPE_MATRIX
   number
   SVG_FECOLORMATRIX_TYPE_HUEROTATE
   number
   SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA
   number)))
((ann-interface
  Console
  info
  [{:opt any} (any *) -> void]
  profile
  [{:opt string} -> void]
  assert
  [{:opt boolean} {:opt string} (any *) -> void]
  msIsIndependentlyComposed
  [Element -> boolean]
  clear
  [-> void]
  dir
  [{:opt any} (any *) -> void]
  warn
  [{:opt any} (any *) -> void]
  error
  [{:opt any} (any *) -> void]
  log
  [{:opt any} (any *) -> void]
  profileEnd
  [-> void]))
((ann Console (prototype Console nil [-> Console])))
((ann-interface
  SVGFESpotLightElement
  pointsAtY
  SVGAnimatedNumber
  y
  SVGAnimatedNumber
  limitingConeAngle
  SVGAnimatedNumber
  specularExponent
  SVGAnimatedNumber
  x
  SVGAnimatedNumber
  pointsAtZ
  SVGAnimatedNumber
  z
  SVGAnimatedNumber
  pointsAtX
  SVGAnimatedNumber))
((ann
  SVGFESpotLightElement
  (prototype SVGFESpotLightElement nil [-> SVGFESpotLightElement])))
((ann-interface
  HTMLImageElement
  msPlayToPrimary
  boolean
  msPlayToDisabled
  boolean
  msPlayToSource
  any))
((ann-interface
  WindowBase64
  btoa
  [string -> string]
  atob
  [string -> string]))
((ann-interface
  IDBDatabase
  version
  string
  name
  string
  objectStoreNames
  DOMStringList
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  onabort
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  createObjectStore
  [string {:opt any} -> IDBObjectStore]
  close
  [-> void]
  transaction
  [any {:opt string} -> IDBTransaction]
  deleteObjectStore
  [string -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann IDBDatabase (prototype IDBDatabase nil [-> IDBDatabase])))
((ann-interface
  DOMStringList
  length
  number
  contains
  [string -> boolean]
  item
  [number -> string]
  []
  [number -> string]))
((ann DOMStringList (prototype DOMStringList nil [-> DOMStringList])))
((ann-interface
  HTMLButtonElement
  validationMessage
  string
  formTarget
  string
  willValidate
  boolean
  formAction
  string
  autofocus
  boolean
  validity
  ValidityState
  formNoValidate
  string
  formEnctype
  string
  formMethod
  string
  checkValidity
  [-> boolean]
  setCustomValidity
  [string -> void]))
((ann-interface
  IDBOpenDBRequest
  onupgradeneeded
  [IDBVersionChangeEvent -> any]
  addEventListener
  [*not-implemented*
   [IDBVersionChangeEvent -> any]
   {:opt boolean}
   ->
   void]
  onblocked
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  IDBOpenDBRequest
  (prototype IDBOpenDBRequest nil [-> IDBOpenDBRequest])))
((ann-interface
  HTMLProgressElement
  value
  number
  max
  number
  position
  number
  form
  HTMLFormElement))
((ann
  HTMLProgressElement
  (prototype HTMLProgressElement nil [-> HTMLProgressElement])))
((ann-interface MSLaunchUriCallback -> void))
((ann-interface
  SVGFEOffsetElement
  dy
  SVGAnimatedNumber
  in1
  SVGAnimatedString
  dx
  SVGAnimatedNumber))
((ann
  SVGFEOffsetElement
  (prototype SVGFEOffsetElement nil [-> SVGFEOffsetElement])))
((ann-interface
  HTMLFormElement
  autocomplete
  string
  noValidate
  boolean
  checkValidity
  [-> boolean]))
((ann-interface MSUnsafeFunctionCallback -> any))
((ann-interface
  Document
  onmspointerdown
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msHidden
  boolean
  msVisibilityState
  string
  onmsgesturedoubletap
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  visibilityState
  string
  onmsmanipulationstatechanged
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerhover
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmscontentzoom
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointermove
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturehold
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturechange
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturestart
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointercancel
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgestureend
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsgesturetap
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerout
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmsinertiastart
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msCSSOMElementFloatMetrics
  boolean
  onmspointerover
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  hidden
  boolean
  onmspointerup
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msElementsFromPoint
  [number number -> NodeList]
  msElementsFromRect
  [number number number number -> NodeList]
  clear
  [-> void]))
((ann-interface MessageEvent ports any))
((ann-interface HTMLScriptElement async boolean))
((ann-interface
  HTMLMediaElement
  msAudioCategory
  string
  msRealTime
  boolean
  msPlayToPrimary
  boolean
  textTracks
  TextTrackList
  msPlayToDisabled
  boolean
  audioTracks
  AudioTrackList
  msPlayToSource
  any
  msAudioDeviceType
  string
  msClearEffects
  [-> void]
  msSetMediaProtectionManager
  [{:opt any} -> void]
  msInsertAudioEffect
  [string boolean {:opt any} -> void]))
((ann-interface
  TextTrack
  language
  string
  mode
  any
  readyState
  number
  activeCues
  TextTrackCueList
  cues
  TextTrackCueList
  oncuechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  kind
  string
  onload
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  label
  string
  addEventListener
  [string EventListener {:opt boolean} -> void]
  ERROR
  number
  SHOWING
  number
  LOADING
  number
  LOADED
  number
  NONE
  number
  HIDDEN
  number
  DISABLED
  number))
((ann
  TextTrack
  (prototype
   TextTrack
   nil
   [-> TextTrack]
   ERROR
   number
   SHOWING
   number
   LOADING
   number
   LOADED
   number
   NONE
   number
   HIDDEN
   number
   DISABLED
   number)))
((ann-interface MediaQueryListListener MediaQueryList -> void))
((ann-interface
  IDBRequest
  source
  any
  onsuccess
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  error
  DOMError
  transaction
  IDBTransaction
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  readyState
  string
  result
  any
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann IDBRequest (prototype IDBRequest nil [-> IDBRequest])))
((ann-interface
  MessagePort
  onmessage
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  close
  [-> void]
  postMessage
  [any {:opt any} -> void]
  start
  [-> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann MessagePort (prototype MessagePort nil [-> MessagePort])))
((ann-interface
  FileReader
  error
  DOMError
  readAsArrayBuffer
  [Blob -> void]
  readAsDataURL
  [Blob -> void]
  readAsText
  [Blob {:opt string} -> void]))
((ann FileReader (prototype FileReader nil [-> FileReader])))
((ann-interface BlobPropertyBag type string endings string))
((ann-interface
  Blob
  type
  string
  size
  number
  msDetachStream
  [-> any]
  slice
  [{:opt number} {:opt number} {:opt string} -> Blob]
  close
  [-> void]
  msClose
  [-> void]))
((ann
  Blob
  (prototype Blob nil [{:opt (any *)} {:opt BlobPropertyBag} -> Blob])))
((ann-interface
  ApplicationCache
  status
  number
  ondownloading
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onprogress
  [ProgressEvent -> any]
  addEventListener
  [*not-implemented* [ProgressEvent -> any] {:opt boolean} -> void]
  onupdateready
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  oncached
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onobsolete
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  onchecking
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  onnoupdate
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  swapCache
  [-> void]
  abort
  [-> void]
  update
  [-> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]
  CHECKING
  number
  UNCACHED
  number
  UPDATEREADY
  number
  DOWNLOADING
  number
  IDLE
  number
  OBSOLETE
  number))
((ann
  ApplicationCache
  (prototype
   ApplicationCache
   nil
   [-> ApplicationCache]
   CHECKING
   number
   UNCACHED
   number
   UPDATEREADY
   number
   DOWNLOADING
   number
   IDLE
   number
   OBSOLETE
   number)))
((ann-interface FrameRequestCallback number -> void))
((ann-interface
  XMLHttpRequest
  response
  any
  withCredentials
  boolean
  onprogress
  [ProgressEvent -> any]
  addEventListener
  [*not-implemented* [ProgressEvent -> any] {:opt boolean} -> void]
  onabort
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  responseType
  string
  onloadend
  [ProgressEvent -> any]
  addEventListener
  [*not-implemented* [ProgressEvent -> any] {:opt boolean} -> void]
  upload
  XMLHttpRequestEventTarget
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  onloadstart
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]))
((ann-interface
  PopStateEvent
  state
  any
  initPopStateEvent
  [string boolean boolean any -> void]))
((ann PopStateEvent (prototype PopStateEvent nil [-> PopStateEvent])))
((ann-interface
  CSSKeyframeRule
  keyText
  string
  style
  CSSStyleDeclaration))
((ann
  CSSKeyframeRule
  (prototype CSSKeyframeRule nil [-> CSSKeyframeRule])))
((ann-interface
  MSFileSaver
  msSaveBlob
  [any {:opt string} -> boolean]
  msSaveOrOpenBlob
  [any {:opt string} -> boolean]))
((ann-interface
  MSStream
  type
  string
  msDetachStream
  [-> any]
  msClose
  [-> void]))
((ann MSStream (prototype MSStream nil [-> MSStream])))
((ann-interface MediaError msExtendedCode number))
((ann-interface
  HTMLFieldSetElement
  validationMessage
  string
  validity
  ValidityState
  willValidate
  boolean
  checkValidity
  [-> boolean]
  setCustomValidity
  [string -> void]))
((ann-interface
  MSBlobBuilder
  append
  [any {:opt string} -> void]
  getBlob
  [{:opt string} -> Blob]))
((ann MSBlobBuilder (prototype MSBlobBuilder nil [-> MSBlobBuilder])))
((ann-interface
  HTMLElement
  onmscontentzoom
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  oncuechange
  [Event -> any]
  addEventListener
  [*not-implemented* [Event -> any] {:opt boolean} -> void]
  spellcheck
  boolean
  classList
  DOMTokenList
  onmsmanipulationstatechanged
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  draggable
  boolean))
((ann-interface DataTransfer types DOMStringList files FileList))
((ann-interface DOMSettableTokenList value string))
((ann
  DOMSettableTokenList
  (prototype DOMSettableTokenList nil [-> DOMSettableTokenList])))
((ann-interface
  IDBFactory
  open
  [string {:opt number} -> IDBOpenDBRequest]
  cmp
  [any any -> number]
  deleteDatabase
  [string -> IDBOpenDBRequest]))
((ann IDBFactory (prototype IDBFactory nil [-> IDBFactory])))
((ann-interface
  Range
  createContextualFragment
  [string -> DocumentFragment]))
((ann-interface
  HTMLObjectElement
  validationMessage
  string
  validity
  ValidityState
  willValidate
  boolean
  checkValidity
  [-> boolean]
  setCustomValidity
  [string -> void]))
((ann-interface
  MSPointerEvent
  width
  number
  rotation
  number
  pressure
  number
  pointerType
  any
  isPrimary
  boolean
  tiltY
  number
  height
  number
  intermediatePoints
  any
  currentPoint
  any
  tiltX
  number
  hwTimestamp
  number
  pointerId
  number
  initPointerEvent
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
   void]
  getCurrentPoint
  [Element -> void]
  getIntermediatePoints
  [Element -> void]
  MSPOINTER_TYPE_PEN
  number
  MSPOINTER_TYPE_MOUSE
  number
  MSPOINTER_TYPE_TOUCH
  number))
((ann
  MSPointerEvent
  (prototype
   MSPointerEvent
   nil
   [-> MSPointerEvent]
   MSPOINTER_TYPE_PEN
   number
   MSPOINTER_TYPE_MOUSE
   number
   MSPOINTER_TYPE_TOUCH
   number)))
((ann-interface
  DOMException
  name
  string
  INVALID_NODE_TYPE_ERR
  number
  DATA_CLONE_ERR
  number
  TIMEOUT_ERR
  number))
((ann-interface
  MSManipulationEvent
  lastState
  number
  currentState
  number
  initMSManipulationEvent
  [string boolean boolean Window number number number -> void]
  MS_MANIPULATION_STATE_STOPPED
  number
  MS_MANIPULATION_STATE_ACTIVE
  number
  MS_MANIPULATION_STATE_INERTIA
  number))
((ann
  MSManipulationEvent
  (prototype
   MSManipulationEvent
   nil
   [-> MSManipulationEvent]
   MS_MANIPULATION_STATE_STOPPED
   number
   MS_MANIPULATION_STATE_ACTIVE
   number
   MS_MANIPULATION_STATE_INERTIA
   number)))
((ann-interface FormData append [any any {:opt string} -> void]))
((ann
  FormData
  (prototype FormData nil [{:opt HTMLFormElement} -> FormData])))
((ann-interface HTMLDataListElement options HTMLCollection))
((ann
  HTMLDataListElement
  (prototype HTMLDataListElement nil [-> HTMLDataListElement])))
((ann-interface
  SVGFEImageElement
  preserveAspectRatio
  SVGAnimatedPreserveAspectRatio))
((ann
  SVGFEImageElement
  (prototype SVGFEImageElement nil [-> SVGFEImageElement])))
((ann-interface
  AbstractWorker
  onerror
  [ErrorEvent -> any]
  addEventListener
  [*not-implemented* [ErrorEvent -> any] {:opt boolean} -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann-interface
  SVGFECompositeElement
  operator
  SVGAnimatedEnumeration
  in2
  SVGAnimatedString
  k2
  SVGAnimatedNumber
  k1
  SVGAnimatedNumber
  k3
  SVGAnimatedNumber
  in1
  SVGAnimatedString
  k4
  SVGAnimatedNumber
  SVG_FECOMPOSITE_OPERATOR_OUT
  number
  SVG_FECOMPOSITE_OPERATOR_OVER
  number
  SVG_FECOMPOSITE_OPERATOR_XOR
  number
  SVG_FECOMPOSITE_OPERATOR_ARITHMETIC
  number
  SVG_FECOMPOSITE_OPERATOR_UNKNOWN
  number
  SVG_FECOMPOSITE_OPERATOR_IN
  number
  SVG_FECOMPOSITE_OPERATOR_ATOP
  number))
((ann
  SVGFECompositeElement
  (prototype
   SVGFECompositeElement
   nil
   [-> SVGFECompositeElement]
   SVG_FECOMPOSITE_OPERATOR_OUT
   number
   SVG_FECOMPOSITE_OPERATOR_OVER
   number
   SVG_FECOMPOSITE_OPERATOR_XOR
   number
   SVG_FECOMPOSITE_OPERATOR_ARITHMETIC
   number
   SVG_FECOMPOSITE_OPERATOR_UNKNOWN
   number
   SVG_FECOMPOSITE_OPERATOR_IN
   number
   SVG_FECOMPOSITE_OPERATOR_ATOP
   number)))
((ann-interface
  ValidityState
  customError
  boolean
  valueMissing
  boolean
  stepMismatch
  boolean
  rangeUnderflow
  boolean
  rangeOverflow
  boolean
  typeMismatch
  boolean
  patternMismatch
  boolean
  tooLong
  boolean
  valid
  boolean))
((ann ValidityState (prototype ValidityState nil [-> ValidityState])))
((ann-interface
  HTMLTrackElement
  kind
  string
  src
  string
  srclang
  string
  track
  TextTrack
  label
  string
  default
  boolean))
((ann
  HTMLTrackElement
  (prototype HTMLTrackElement nil [-> HTMLTrackElement])))
((ann-interface
  MSApp
  createFileFromStorageFile
  [any -> File]
  createBlobFromRandomAccessStream
  [string any -> Blob]
  createStreamFromInputStream
  [string any -> MSStream]
  terminateApp
  [any -> void]
  createDataPackage
  [any -> any]
  execUnsafeLocalFunction
  [MSUnsafeFunctionCallback -> any]
  getHtmlPrintDocumentSource
  [any -> any]
  addPublicLocalApplicationUri
  [string -> void]
  createDataPackageFromSelection
  [-> any]))
((ann MSApp MSApp)
 (ann-interface
  HTMLVideoElement
  msIsStereo3D
  boolean
  msStereo3DPackingMode
  string
  onMSVideoOptimalLayoutChanged
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onMSVideoFrameStepCompleted
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msStereo3DRenderMode
  string
  msIsLayoutOptimalForPlayback
  boolean
  msHorizontalMirror
  boolean
  onMSVideoFormatChanged
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msZoom
  boolean
  msInsertVideoEffect
  [string boolean {:opt any} -> void]
  msSetVideoRectangle
  [number number number number -> void]
  msFrameStep
  [boolean -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann-interface SVGFEComponentTransferElement in1 SVGAnimatedString))
((ann
  SVGFEComponentTransferElement
  (prototype
   SVGFEComponentTransferElement
   nil
   [-> SVGFEComponentTransferElement])))
((ann-interface
  SVGFEDiffuseLightingElement
  kernelUnitLengthY
  SVGAnimatedNumber
  surfaceScale
  SVGAnimatedNumber
  in1
  SVGAnimatedString
  kernelUnitLengthX
  SVGAnimatedNumber
  diffuseConstant
  SVGAnimatedNumber))
((ann
  SVGFEDiffuseLightingElement
  (prototype
   SVGFEDiffuseLightingElement
   nil
   [-> SVGFEDiffuseLightingElement])))
((ann-interface
  MSCSSMatrix
  m24
  number
  m34
  number
  a
  number
  d
  number
  m32
  number
  m41
  number
  m11
  number
  f
  number
  e
  number
  m23
  number
  m14
  number
  m33
  number
  m22
  number
  m21
  number
  c
  number
  m12
  number
  b
  number
  m42
  number
  m31
  number
  m43
  number
  m13
  number
  m44
  number
  multiply
  [MSCSSMatrix -> MSCSSMatrix]
  skewY
  [number -> MSCSSMatrix]
  setMatrixValue
  [string -> void]
  inverse
  [-> MSCSSMatrix]
  rotateAxisAngle
  [number number number number -> MSCSSMatrix]
  toString
  [-> string]
  rotate
  [number {:opt number} {:opt number} -> MSCSSMatrix]
  translate
  [number number {:opt number} -> MSCSSMatrix]
  scale
  [number {:opt number} {:opt number} -> MSCSSMatrix]
  skewX
  [number -> MSCSSMatrix]))
((ann
  MSCSSMatrix
  (prototype MSCSSMatrix nil [{:opt string} -> MSCSSMatrix])))
((ann-interface
  Worker
  onmessage
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  postMessage
  [any {:opt any} -> void]
  terminate
  [-> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann Worker (prototype Worker nil [string -> Worker])))
((ann-interface HTMLIFrameElement sandbox DOMSettableTokenList))
((ann onmspointerdown [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann animationStartTime number)
 (ann onmsgesturedoubletap [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmspointerhover [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmsgesturehold [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmspointermove [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmsgesturechange [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmsgesturestart [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmspointercancel [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmsgestureend [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmsgesturetap [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmspointerout [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann msAnimationStartTime number)
 (ann applicationCache ApplicationCache)
 (ann onmsinertiastart [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onmspointerover [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onpopstate [PopStateEvent -> any])
 (ann
  addEventListener
  [*not-implemented* [PopStateEvent -> any] {:opt boolean} -> void])
 (ann onmspointerup [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann msCancelRequestAnimationFrame [number -> void])
 (ann matchMedia [string -> MediaQueryList])
 (ann cancelAnimationFrame [number -> void])
 (ann msIsStaticHTML [string -> boolean])
 (ann msMatchMedia [string -> MediaQueryList])
 (ann requestAnimationFrame [FrameRequestCallback -> number])
 (ann msRequestAnimationFrame [FrameRequestCallback -> number])
 (ann btoa [string -> string])
 (ann atob [string -> string])
 (ann msIndexedDB IDBFactory)
 (ann indexedDB IDBFactory)
 (ann console Console)
 (ann-interface
  StoreExceptionsInformation
  siteName
  string
  explanationString
  string
  detailURI
  string))
((ann-interface
  StoreSiteSpecificExceptionsInformation
  arrayOfDomainStrings
  Array))
((ann-interface
  ConfirmSiteSpecificExceptionsInformation
  arrayOfDomainStrings
  Array))
((ann-interface AlgorithmParameters))
((ann-interface
  MutationObserverInit
  childList
  boolean
  attributes
  boolean
  characterData
  boolean
  subtree
  boolean
  attributeOldValue
  boolean
  characterDataOldValue
  boolean
  attributeFilter
  Array))
((ann-interface ExceptionInformation domain string))
((ann-interface
  MsZoomToOptions
  contentX
  number
  contentY
  number
  viewportX
  string
  viewportY
  string
  scaleFactor
  number
  animate
  string))
((ann-interface DeviceAccelerationDict x number y number z number))
((ann-interface
  DeviceRotationRateDict
  alpha
  number
  beta
  number
  gamma
  number))
((ann-interface Algorithm name string params AlgorithmParameters))
((ann-interface NavigatorID product string vendor string))
((ann NavigatorID (prototype NavigatorID nil [-> NavigatorID])))
((ann-interface
  HTMLBodyElement
  onpageshow
  [PageTransitionEvent -> any]
  addEventListener
  [*not-implemented*
   [PageTransitionEvent -> any]
   {:opt boolean}
   ->
   void]
  onpagehide
  [PageTransitionEvent -> any]
  addEventListener
  [*not-implemented*
   [PageTransitionEvent -> any]
   {:opt boolean}
   ->
   void]))
((ann-interface MSExecAtPriorityFunctionCallback (any *) -> any))
((ann-interface
  MSWindowExtensions
  captureEvents
  [-> void]
  releaseEvents
  [-> void]))
((ann
  MSWindowExtensions
  (prototype MSWindowExtensions nil [-> MSWindowExtensions])))
((ann-interface
  MSGraphicsTrust
  status
  string
  constrictionActive
  boolean))
((ann
  MSGraphicsTrust
  (prototype MSGraphicsTrust nil [-> MSGraphicsTrust])))
((ann-interface AudioTrack sourceBuffer SourceBuffer))
((ann-interface
  DragEvent
  msConvertURL
  [File string {:opt string} -> boolean]))
((ann-interface
  SubtleCrypto
  unwrapKey
  [ArrayBufferView
   any
   Key
   {:opt boolean}
   {:opt (string *)}
   ->
   KeyOperation]
  encrypt
  [any Key {:opt ArrayBufferView} -> CryptoOperation]
  importKey
  [string
   ArrayBufferView
   any
   {:opt boolean}
   {:opt (string *)}
   ->
   KeyOperation]
  wrapKey
  [Key Key any -> KeyOperation]
  verify
  [any Key ArrayBufferView {:opt ArrayBufferView} -> CryptoOperation]
  deriveKey
  [any Key any {:opt boolean} {:opt (string *)} -> KeyOperation]
  digest
  [any {:opt ArrayBufferView} -> CryptoOperation]
  exportKey
  [string Key -> KeyOperation]
  generateKey
  [any {:opt boolean} {:opt (string *)} -> KeyOperation]
  sign
  [any Key {:opt ArrayBufferView} -> CryptoOperation]
  decrypt
  [any Key {:opt ArrayBufferView} -> CryptoOperation]))
((ann SubtleCrypto (prototype SubtleCrypto nil [-> SubtleCrypto])))
((ann-interface Crypto subtle SubtleCrypto))
((ann Crypto (prototype Crypto nil [-> Crypto])))
((ann-interface
  VideoPlaybackQuality
  creationTime
  number
  totalVideoFrames
  number
  droppedVideoFrames
  number))
((ann
  VideoPlaybackQuality
  (prototype VideoPlaybackQuality nil [-> VideoPlaybackQuality])))
((ann-interface
  Window
  onpageshow
  [PageTransitionEvent -> any]
  addEventListener
  [*not-implemented*
   [PageTransitionEvent -> any]
   {:opt boolean}
   ->
   void]
  ondevicemotion
  [DeviceMotionEvent -> any]
  addEventListener
  [*not-implemented* [DeviceMotionEvent -> any] {:opt boolean} -> void]
  devicePixelRatio
  number
  msCrypto
  Crypto
  ondeviceorientation
  [DeviceOrientationEvent -> any]
  addEventListener
  [*not-implemented*
   [DeviceOrientationEvent -> any]
   {:opt boolean}
   ->
   void]
  onmspointerenter
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onpagehide
  [PageTransitionEvent -> any]
  addEventListener
  [*not-implemented*
   [PageTransitionEvent -> any]
   {:opt boolean}
   ->
   void]
  onmspointerleave
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]))
((ann-interface
  Key
  algorithm
  Algorithm
  type
  string
  extractable
  boolean
  keyUsage
  (string *)))
((ann Key (prototype Key nil [-> Key])))
((ann-interface
  TextTrackList
  onaddtrack
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann-interface DeviceAcceleration y number x number z number))
((ann
  DeviceAcceleration
  (prototype DeviceAcceleration nil [-> DeviceAcceleration])))
((ann-interface
  Console
  count
  [{:opt string} -> void]
  groupEnd
  [-> void]
  time
  [{:opt string} -> void]
  timeEnd
  [{:opt string} -> void]
  trace
  [-> void]
  group
  [{:opt string} -> void]
  dirxml
  [any -> void]
  debug
  [{:opt string} (any *) -> void]
  groupCollapsed
  [{:opt string} -> void]
  select
  [Element -> void]))
((ann-interface
  MSNavigatorDoNotTrack
  removeSiteSpecificTrackingException
  [ExceptionInformation -> boolean]
  removeWebWideTrackingException
  [ExceptionInformation -> boolean]
  storeWebWideTrackingException
  [StoreExceptionsInformation -> void]
  storeSiteSpecificTrackingException
  [StoreSiteSpecificExceptionsInformation -> void]
  confirmSiteSpecificTrackingException
  [ConfirmSiteSpecificExceptionsInformation -> boolean]
  confirmWebWideTrackingException
  [ExceptionInformation -> boolean]))
((ann
  MSNavigatorDoNotTrack
  (prototype MSNavigatorDoNotTrack nil [-> MSNavigatorDoNotTrack])))
((ann-interface HTMLImageElement crossOrigin string))
((ann-interface HTMLAllCollection namedItem [string -> Element]))
((ann
  HTMLAllCollection
  (prototype HTMLAllCollection nil [-> HTMLAllCollection])))
((ann-interface MSNavigatorExtensions language string))
((ann
  MSNavigatorExtensions
  (prototype MSNavigatorExtensions nil [-> MSNavigatorExtensions])))
((ann-interface
  AesGcmEncryptResult
  ciphertext
  ArrayBuffer
  tag
  ArrayBuffer))
((ann
  AesGcmEncryptResult
  (prototype AesGcmEncryptResult nil [-> AesGcmEncryptResult])))
((ann-interface
  CSSStyleDeclaration
  alignItems
  string
  borderImageSource
  string
  flexBasis
  string
  borderImageWidth
  string
  borderImageRepeat
  string
  order
  string
  flex
  string
  alignContent
  string
  msImeAlign
  string
  flexShrink
  string
  flexGrow
  string
  borderImageSlice
  string
  flexWrap
  string
  borderImageOutset
  string
  flexDirection
  string
  flexFlow
  string
  borderImage
  string
  justifyContent
  string
  alignSelf
  string
  msTextCombineHorizontal
  string))
((ann-interface HTMLSourceElement msKeySystem string))
((ann-interface
  NavigationCompletedEvent
  webErrorStatus
  number
  isSuccess
  boolean))
((ann
  NavigationCompletedEvent
  (prototype
   NavigationCompletedEvent
   nil
   [-> NavigationCompletedEvent])))
((ann-interface
  MutationRecord
  oldValue
  string
  previousSibling
  Node
  addedNodes
  NodeList
  attributeName
  string
  removedNodes
  NodeList
  target
  Node
  nextSibling
  Node
  attributeNamespace
  string
  type
  string))
((ann
  MutationRecord
  (prototype MutationRecord nil [-> MutationRecord])))
((ann-interface
  Document
  msFullscreenEnabled
  boolean
  onmsfullscreenerror
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerenter
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msFullscreenElement
  Element
  onmsfullscreenchange
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerleave
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msExitFullscreen
  [-> void]))
((ann-interface
  MimeTypeArray
  length
  number
  item
  [number -> Plugin]
  []
  [number -> Plugin]
  namedItem
  [string -> Plugin]))
((ann MimeTypeArray (prototype MimeTypeArray nil [-> MimeTypeArray])))
((ann-interface
  HTMLMediaElement
  msPlayToPreferredSourceUri
  string
  onmsneedkey
  [MSMediaKeyNeededEvent -> any]
  addEventListener
  [*not-implemented*
   [MSMediaKeyNeededEvent -> any]
   {:opt boolean}
   ->
   void]
  msKeys
  MSMediaKeys
  msGraphicsTrustStatus
  MSGraphicsTrust
  msSetMediaKeys
  [MSMediaKeys -> void]
  addTextTrack
  [string {:opt string} {:opt string} -> TextTrack]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann-interface
  TextTrack
  addCue
  [TextTrackCue -> void]
  removeCue
  [TextTrackCue -> void]))
((ann-interface
  KeyOperation
  oncomplete
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onerror
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  result
  any
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann KeyOperation (prototype KeyOperation nil [-> KeyOperation])))
((ann-interface DOMStringMap))
((ann DOMStringMap (prototype DOMStringMap nil [-> DOMStringMap])))
((ann-interface
  DeviceOrientationEvent
  gamma
  number
  alpha
  number
  absolute
  boolean
  beta
  number
  initDeviceOrientationEvent
  [string boolean boolean number number number boolean -> void]))
((ann
  DeviceOrientationEvent
  (prototype DeviceOrientationEvent nil [-> DeviceOrientationEvent])))
((ann-interface
  MSMediaKeyMessageEvent
  destinationURL
  string
  message
  Uint8Array))
((ann
  MSMediaKeyMessageEvent
  (prototype MSMediaKeyMessageEvent nil [-> MSMediaKeyMessageEvent])))
((ann-interface
  MSMediaKeys
  keySystem
  string
  createSession
  [string Uint8Array {:opt Uint8Array} -> MSMediaKeySession]
  isTypeSupported
  [string {:opt string} -> boolean]))
((ann MSMediaKeys (prototype MSMediaKeys nil [-> MSMediaKeys])))
((ann-interface
  MSHTMLWebViewElement
  documentTitle
  string
  width
  number
  src
  string
  canGoForward
  boolean
  height
  number
  canGoBack
  boolean
  navigateWithHttpRequestMessage
  [any -> void]
  goBack
  [-> void]
  navigate
  [string -> void]
  stop
  [-> void]
  navigateToString
  [string -> void]
  captureSelectedContentToDataPackageAsync
  [-> MSWebViewAsyncOperation]
  capturePreviewToBlobAsync
  [-> MSWebViewAsyncOperation]
  refresh
  [-> void]
  goForward
  [-> void]
  navigateToLocalStreamUri
  [string any -> void]
  invokeScriptAsync
  [string (any *) -> MSWebViewAsyncOperation]
  buildLocalStreamUri
  [string string -> string]))
((ann
  MSHTMLWebViewElement
  (prototype MSHTMLWebViewElement nil [-> MSHTMLWebViewElement])))
((ann-interface NavigationEvent uri string))
((ann
  NavigationEvent
  (prototype NavigationEvent nil [-> NavigationEvent])))
((ann-interface
  Element
  onmspointerenter
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onmspointerleave
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msZoomTo
  [MsZoomToOptions -> void]
  msGetUntransformedBounds
  [-> ClientRect]
  msRequestFullscreen
  [-> void]))
((ann-interface
  RandomSource
  getRandomValues
  [ArrayBufferView -> ArrayBufferView]))
((ann-interface
  XMLHttpRequest
  msCaching
  string
  msCachingEnabled
  [-> boolean]
  overrideMimeType
  [string -> void]))
((ann-interface
  SourceBuffer
  updating
  boolean
  appendWindowStart
  number
  appendWindowEnd
  number
  buffered
  TimeRanges
  timestampOffset
  number
  audioTracks
  AudioTrackList
  appendBuffer
  [ArrayBuffer -> void]
  remove
  [number number -> void]
  abort
  [-> void]
  appendStream
  [MSStream {:opt number} -> void]))
((ann SourceBuffer (prototype SourceBuffer nil [-> SourceBuffer])))
((ann-interface
  MSInputMethodContext
  oncandidatewindowshow
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  target
  HTMLElement
  compositionStartOffset
  number
  oncandidatewindowhide
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  oncandidatewindowupdate
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  compositionEndOffset
  number
  getCompositionAlternatives
  [-> (string *)]
  getCandidateWindowClientRect
  [-> ClientRect]
  hasComposition
  [-> boolean]
  isCandidateWindowVisible
  [-> boolean]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  MSInputMethodContext
  (prototype MSInputMethodContext nil [-> MSInputMethodContext])))
((ann-interface
  DeviceRotationRate
  gamma
  number
  alpha
  number
  beta
  number))
((ann
  DeviceRotationRate
  (prototype DeviceRotationRate nil [-> DeviceRotationRate])))
((ann-interface
  PluginArray
  length
  number
  refresh
  [{:opt boolean} -> void]
  item
  [number -> Plugin]
  []
  [number -> Plugin]
  namedItem
  [string -> Plugin]))
((ann PluginArray (prototype PluginArray nil [-> PluginArray])))
((ann-interface
  MSMediaKeyError
  systemCode
  number
  code
  number
  MS_MEDIA_KEYERR_SERVICE
  number
  MS_MEDIA_KEYERR_HARDWARECHANGE
  number
  MS_MEDIA_KEYERR_OUTPUT
  number
  MS_MEDIA_KEYERR_DOMAIN
  number
  MS_MEDIA_KEYERR_UNKNOWN
  number
  MS_MEDIA_KEYERR_CLIENT
  number))
((ann
  MSMediaKeyError
  (prototype
   MSMediaKeyError
   nil
   [-> MSMediaKeyError]
   MS_MEDIA_KEYERR_SERVICE
   number
   MS_MEDIA_KEYERR_HARDWARECHANGE
   number
   MS_MEDIA_KEYERR_OUTPUT
   number
   MS_MEDIA_KEYERR_DOMAIN
   number
   MS_MEDIA_KEYERR_UNKNOWN
   number
   MS_MEDIA_KEYERR_CLIENT
   number)))
((ann-interface
  Plugin
  length
  number
  filename
  string
  version
  string
  name
  string
  description
  string
  item
  [number -> MimeType]
  []
  [number -> MimeType]
  namedItem
  [string -> MimeType]))
((ann Plugin (prototype Plugin nil [-> Plugin])))
((ann-interface
  HTMLFrameSetElement
  onpageshow
  [PageTransitionEvent -> any]
  addEventListener
  [*not-implemented*
   [PageTransitionEvent -> any]
   {:opt boolean}
   ->
   void]
  onpagehide
  [PageTransitionEvent -> any]
  addEventListener
  [*not-implemented*
   [PageTransitionEvent -> any]
   {:opt boolean}
   ->
   void]))
((ann-interface
  Screen
  msOrientation
  string
  onmsorientationchange
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  msLockOrientation
  [(string *) -> boolean]
  msUnlockOrientation
  [-> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann-interface
  MediaSource
  sourceBuffers
  SourceBufferList
  duration
  string
  readyState
  any
  activeSourceBuffers
  SourceBufferList
  addSourceBuffer
  [string -> SourceBuffer]
  endOfStream
  [{:opt string} -> void]
  isTypeSupported
  [string -> boolean]
  removeSourceBuffer
  [SourceBuffer -> void]))
((ann MediaSource (prototype MediaSource nil [-> MediaSource])))
((ann-interface MediaError MS_MEDIA_ERR_ENCRYPTED number))
((ann-interface
  SourceBufferList
  length
  number
  item
  [number -> SourceBuffer]
  []
  [number -> SourceBuffer]))
((ann
  SourceBufferList
  (prototype SourceBufferList nil [-> SourceBufferList])))
((ann-interface XMLDocument))
((ann XMLDocument (prototype XMLDocument nil [-> XMLDocument])))
((ann-interface
  DeviceMotionEvent
  rotationRate
  DeviceRotationRate
  acceleration
  DeviceAcceleration
  interval
  number
  accelerationIncludingGravity
  DeviceAcceleration
  initDeviceMotionEvent
  [string
   boolean
   boolean
   DeviceAccelerationDict
   DeviceAccelerationDict
   DeviceRotationRateDict
   number
   ->
   void]))
((ann
  DeviceMotionEvent
  (prototype DeviceMotionEvent nil [-> DeviceMotionEvent])))
((ann-interface
  MimeType
  enabledPlugin
  Plugin
  suffixes
  string
  type
  string
  description
  string))
((ann MimeType (prototype MimeType nil [-> MimeType])))
((ann-interface
  MSDocumentExtensions
  captureEvents
  [-> void]
  releaseEvents
  [-> void]))
((ann-interface
  HTMLElement
  dataset
  DOMStringMap
  hidden
  boolean
  msGetInputContext
  [-> MSInputMethodContext]))
((ann-interface
  MutationObserver
  observe
  [Node MutationObserverInit -> void]
  takeRecords
  [-> (MutationRecord *)]
  disconnect
  [-> void]))
((ann
  MutationObserver
  (prototype MutationObserver nil [-> MutationObserver])))
((ann-interface AudioTrackList onremovetrack [PluginArray -> any]))
((ann-interface
  HTMLObjectElement
  msPlayToPreferredSourceUri
  string
  msPlayToPrimary
  boolean
  msPlayToDisabled
  boolean
  msPlayToSource
  any))
((ann-interface
  HTMLEmbedElement
  msPlayToPreferredSourceUri
  string
  msPlayToPrimary
  boolean
  msPlayToDisabled
  boolean
  msPlayToSource
  any))
((ann-interface
  MSWebViewAsyncOperation
  target
  MSHTMLWebViewElement
  oncomplete
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  error
  DOMError
  onerror
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  readyState
  number
  type
  number
  result
  any
  start
  [-> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]
  ERROR
  number
  TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION
  number
  TYPE_INVOKE_SCRIPT
  number
  COMPLETED
  number
  TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM
  number
  STARTED
  number))
((ann
  MSWebViewAsyncOperation
  (prototype
   MSWebViewAsyncOperation
   nil
   [-> MSWebViewAsyncOperation]
   ERROR
   number
   TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION
   number
   TYPE_INVOKE_SCRIPT
   number
   COMPLETED
   number
   TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM
   number
   STARTED
   number)))
((ann-interface ScriptNotifyEvent value string callingUri string))
((ann
  ScriptNotifyEvent
  (prototype ScriptNotifyEvent nil [-> ScriptNotifyEvent])))
((ann-interface
  PerformanceNavigationTiming
  redirectStart
  number
  domainLookupEnd
  number
  responseStart
  number
  domComplete
  number
  domainLookupStart
  number
  loadEventStart
  number
  unloadEventEnd
  number
  fetchStart
  number
  requestStart
  number
  domInteractive
  number
  navigationStart
  number
  connectEnd
  number
  loadEventEnd
  number
  connectStart
  number
  responseEnd
  number
  domLoading
  number
  redirectEnd
  number
  redirectCount
  number
  unloadEventStart
  number
  domContentLoadedEventStart
  number
  domContentLoadedEventEnd
  number
  type
  string))
((ann
  PerformanceNavigationTiming
  (prototype
   PerformanceNavigationTiming
   nil
   [-> PerformanceNavigationTiming])))
((ann-interface MSMediaKeyNeededEvent initData Uint8Array))
((ann
  MSMediaKeyNeededEvent
  (prototype MSMediaKeyNeededEvent nil [-> MSMediaKeyNeededEvent])))
((ann-interface
  MSManipulationEvent
  MS_MANIPULATION_STATE_SELECTING
  number
  MS_MANIPULATION_STATE_COMMITTED
  number
  MS_MANIPULATION_STATE_PRESELECT
  number
  MS_MANIPULATION_STATE_DRAGGING
  number
  MS_MANIPULATION_STATE_CANCELLED
  number))
((ann-interface
  LongRunningScriptDetectedEvent
  stopPageScriptExecution
  boolean
  executionTime
  number))
((ann
  LongRunningScriptDetectedEvent
  (prototype
   LongRunningScriptDetectedEvent
   nil
   [-> LongRunningScriptDetectedEvent])))
((ann-interface
  MSAppView
  viewId
  number
  close
  [-> void]
  postMessage
  [any string {:opt any} -> void]))
((ann MSAppView (prototype MSAppView nil [-> MSAppView])))
((ann-interface
  PerfWidgetExternal
  maxCpuSpeed
  number
  performanceCounterFrequency
  number
  performanceCounter
  number
  averagePaintTime
  number
  activeNetworkRequestCount
  number
  paintRequestsPerSecond
  number
  repositionWindow
  [number number -> void]
  getRecentMemoryUsage
  [number -> any]
  getMemoryUsage
  [-> number]
  resizeWindow
  [number number -> void]
  getProcessCpuUsage
  [-> number]
  removeEventListener
  [string [any -> any] -> void]
  getRecentCpuUsage
  [number -> any]
  addEventListener
  [string [any -> any] -> void]
  getRecentPaintRequests
  [number -> any]))
((ann
  PerfWidgetExternal
  (prototype PerfWidgetExternal nil [-> PerfWidgetExternal])))
((ann-interface PageTransitionEvent persisted boolean))
((ann
  PageTransitionEvent
  (prototype PageTransitionEvent nil [-> PageTransitionEvent])))
((ann-interface
  MutationCallback
  (MutationRecord *)
  MutationObserver
  ->
  void))
((ann-interface HTMLDocument))
((ann HTMLDocument (prototype HTMLDocument nil [-> HTMLDocument])))
((ann-interface KeyPair privateKey Key publicKey Key))
((ann KeyPair (prototype KeyPair nil [-> KeyPair])))
((ann-interface
  MSApp
  getViewOpener
  [-> MSAppView]
  suppressSubdownloadCredentialPrompts
  [boolean -> void]
  execAsyncAtPriority
  [MSExecAtPriorityFunctionCallback string (any *) -> void]
  isTaskScheduledAtPriorityOrHigher
  [string -> boolean]
  execAtPriority
  [MSExecAtPriorityFunctionCallback string (any *) -> any]
  createNewView
  [string -> MSAppView]
  getCurrentPriority
  [-> string]
  NORMAL
  string
  HIGH
  string
  IDLE
  string
  CURRENT
  string))
((ann-interface
  HTMLTrackElement
  readyState
  number
  ERROR
  number
  LOADING
  number
  LOADED
  number
  NONE
  number))
((ann-interface
  MSMediaKeySession
  sessionId
  string
  error
  MSMediaKeyError
  keySystem
  string
  close
  [-> void]
  update
  [Uint8Array -> void]))
((ann
  MSMediaKeySession
  (prototype MSMediaKeySession nil [-> MSMediaKeySession])))
((ann-interface
  HTMLVideoElement
  videoPlaybackQuality
  VideoPlaybackQuality))
((ann-interface UnviewableContentIdentifiedEvent referrer string))
((ann
  UnviewableContentIdentifiedEvent
  (prototype
   UnviewableContentIdentifiedEvent
   nil
   [-> UnviewableContentIdentifiedEvent])))
((ann-interface
  CryptoOperation
  algorithm
  Algorithm
  oncomplete
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onerror
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onprogress
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  onabort
  [any -> any]
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void]
  key
  Key
  result
  any
  abort
  [-> void]
  finish
  [-> void]
  process
  [ArrayBufferView -> void]
  addEventListener
  [string EventListener {:opt boolean} -> void]))
((ann
  CryptoOperation
  (prototype CryptoOperation nil [-> CryptoOperation])))
((ann onpageshow [PageTransitionEvent -> any])
 (ann
  addEventListener
  [*not-implemented*
   [PageTransitionEvent -> any]
   {:opt boolean}
   ->
   void])
 (ann ondevicemotion [DeviceMotionEvent -> any])
 (ann
  addEventListener
  [*not-implemented*
   [DeviceMotionEvent -> any]
   {:opt boolean}
   ->
   void])
 (ann devicePixelRatio number)
 (ann msCrypto Crypto)
 (ann ondeviceorientation [DeviceOrientationEvent -> any])
 (ann
  addEventListener
  [*not-implemented*
   [DeviceOrientationEvent -> any]
   {:opt boolean}
   ->
   void])
 (ann onmspointerenter [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann onpagehide [PageTransitionEvent -> any])
 (ann
  addEventListener
  [*not-implemented*
   [PageTransitionEvent -> any]
   {:opt boolean}
   ->
   void])
 (ann onmspointerleave [any -> any])
 (ann
  addEventListener
  [*not-implemented* [any -> any] {:opt boolean} -> void])
 (ann importScripts [(string *) -> void])
 (ann ActiveXObject (nil [string -> any]))
 (ann-interface
  ITextWriter
  Write
  [string -> void]
  WriteLine
  [string -> void]
  Close
  [-> void]))
((ann
  WScript
  (Echo
   [any -> void]
   StdErr
   ITextWriter
   StdOut
   ITextWriter
   Arguments
   (length number Item [number -> string])
   ScriptFullName
   string
   Quit
   [{:opt number} -> number])))
