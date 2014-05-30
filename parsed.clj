Chopped up the input into 1002 chunks
({:op :var, :id NaN, :annotation number}
 {:op :var, :id Infinity, :annotation number}
 {:op :function,
  :id eval,
  :signature
  {:op :call,
   :t-params nil,
   :param-ts
   ({:op :req-param, :access-lev nil, :id x, :annotation string}),
   :annotation any}}
 {:op :function,
  :id parseInt,
  :signature
  {:op :call,
   :t-params nil,
   :param-ts
   ({:op :req-param, :access-lev nil, :id s, :annotation string}
    {:op :opt-param,
     :access-lev nil,
     :id radix,
     :annotation number,
     :init nil}),
   :annotation number}}
 {:op :function,
  :id parseFloat,
  :signature
  {:op :call,
   :t-params nil,
   :param-ts
   ({:op :req-param, :access-lev nil, :id string, :annotation string}),
   :annotation number}}
 {:op :function,
  :id isNaN,
  :signature
  {:op :call,
   :t-params nil,
   :param-ts
   ({:op :req-param, :access-lev nil, :id number, :annotation number}),
   :annotation boolean}}
 {:op :function,
  :id isFinite,
  :signature
  {:op :call,
   :t-params nil,
   :param-ts
   ({:op :req-param, :access-lev nil, :id number, :annotation number}),
   :annotation boolean}}
 {:op :function,
  :id decodeURI,
  :signature
  {:op :call,
   :t-params nil,
   :param-ts
   ({:op :req-param,
     :access-lev nil,
     :id encodedURI,
     :annotation string}),
   :annotation string}}
 {:op :function,
  :id decodeURIComponent,
  :signature
  {:op :call,
   :t-params nil,
   :param-ts
   ({:op :req-param,
     :access-lev nil,
     :id encodedURIComponent,
     :annotation string}),
   :annotation string}}
 {:op :function,
  :id encodeURI,
  :signature
  {:op :call,
   :t-params nil,
   :param-ts
   ({:op :req-param, :access-lev nil, :id uri, :annotation string}),
   :annotation string}}
 {:op :function,
  :id encodeURIComponent,
  :signature
  {:op :call,
   :t-params nil,
   :param-ts
   ({:op :req-param,
     :access-lev nil,
     :id uriComponent,
     :annotation string}),
   :annotation string}}
 {:op :interface,
  :id PropertyDescriptor,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ((:property configurable boolean)
    (:property enumerable boolean)
    (:property value any)
    (:property writable boolean)
    {:op :method,
     :id get,
     :call {:op :call, :t-params nil, :param-ts nil, :annotation any}}
    {:op :method,
     :id set,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id v, :annotation any}),
      :annotation void}})}})
({:op :interface,
  :id PropertyDescriptorMap,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ({:op :index,
     :id s,
     :key-t "string",
     :annotation PropertyDescriptor})}})
({:op :interface,
  :id Object,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ({:op :method,
     :id toString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toLocaleString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id valueOf,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation Object}}
    {:op :method,
     :id hasOwnProperty,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id v, :annotation string}),
      :annotation boolean}}
    {:op :method,
     :id isPrototypeOf,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id v, :annotation Object}),
      :annotation boolean}}
    {:op :method,
     :id propertyIsEnumerable,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id v, :annotation string}),
      :annotation boolean}}
    {:op :index, :id s, :key-t "string", :annotation any})}})
({:op :var, :id Object, :annotation [:op :obj-t]})
({:op :interface,
  :id Function,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ({:op :method,
     :id apply,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id thisArg, :annotation any}
       {:op :opt-param,
        :access-lev nil,
        :id argArray,
        :annotation any,
        :init nil}),
      :annotation any}}
    {:op :method,
     :id call,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id thisArg, :annotation any}
       {:op :rest-param, :annotation :array-t}),
      :annotation any}}
    {:op :method,
     :id bind,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id thisArg, :annotation any}
       {:op :rest-param, :annotation :array-t}),
      :annotation any}}
    (:property prototype any)
    (:property length number)
    (:property arguments any)
    (:property caller Function))}})
({:op :var, :id Function, :annotation [:op :obj-t]})
({:op :interface,
  :id IArguments,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ({:op :index, :id index, :key-t "number", :annotation any}
    (:property length number)
    (:property callee Function))}})
({:op :interface,
  :id String,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ({:op :method,
     :id toString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id charAt,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id pos, :annotation number}),
      :annotation string}}
    {:op :method,
     :id charCodeAt,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id index,
        :annotation number}),
      :annotation number}}
    {:op :method,
     :id concat,
     :call
     {:op :call,
      :t-params nil,
      :param-ts ({:op :rest-param, :annotation :array-t}),
      :annotation string}}
    {:op :method,
     :id indexOf,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id searchString,
        :annotation string}
       {:op :opt-param,
        :access-lev nil,
        :id position,
        :annotation number,
        :init nil}),
      :annotation number}}
    {:op :method,
     :id lastIndexOf,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id searchString,
        :annotation string}
       {:op :opt-param,
        :access-lev nil,
        :id position,
        :annotation number,
        :init nil}),
      :annotation number}}
    {:op :method,
     :id localeCompare,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id that,
        :annotation string}),
      :annotation number}}
    {:op :method,
     :id match,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id regexp,
        :annotation string}),
      :annotation :array-t}}
    {:op :method,
     :id match,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id regexp,
        :annotation RegExp}),
      :annotation :array-t}}
    {:op :method,
     :id replace,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id searchValue,
        :annotation string}
       {:op :req-param,
        :access-lev nil,
        :id replaceValue,
        :annotation string}),
      :annotation string}}
    {:op :method,
     :id replace,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id searchValue,
        :annotation string}
       {:op :req-param,
        :access-lev nil,
        :id replaceValue,
        :annotation [:op :fn-t]}),
      :annotation string}}
    {:op :method,
     :id replace,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id searchValue,
        :annotation RegExp}
       {:op :req-param,
        :access-lev nil,
        :id replaceValue,
        :annotation string}),
      :annotation string}}
    {:op :method,
     :id replace,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id searchValue,
        :annotation RegExp}
       {:op :req-param,
        :access-lev nil,
        :id replaceValue,
        :annotation [:op :fn-t]}),
      :annotation string}}
    {:op :method,
     :id search,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id regexp,
        :annotation string}),
      :annotation number}}
    {:op :method,
     :id search,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id regexp,
        :annotation RegExp}),
      :annotation number}}
    {:op :method,
     :id slice,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id start, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id end,
        :annotation number,
        :init nil}),
      :annotation string}}
    {:op :method,
     :id split,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id separator,
        :annotation string}
       {:op :opt-param,
        :access-lev nil,
        :id limit,
        :annotation number,
        :init nil}),
      :annotation :array-t}}
    {:op :method,
     :id split,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id separator,
        :annotation RegExp}
       {:op :opt-param,
        :access-lev nil,
        :id limit,
        :annotation number,
        :init nil}),
      :annotation :array-t}}
    {:op :method,
     :id substring,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id start, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id end,
        :annotation number,
        :init nil}),
      :annotation string}}
    {:op :method,
     :id toLowerCase,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toLocaleLowerCase,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toUpperCase,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toLocaleUpperCase,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id trim,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    (:property length number)
    {:op :method,
     :id substr,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id from, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id length,
        :annotation number,
        :init nil}),
      :annotation string}})}})
({:op :var, :id String, :annotation [:op :obj-t]})
({:op :interface,
  :id Boolean,
  :t-params nil,
  :extends nil,
  :type {:op :obj-t, :body nil}})
({:op :var, :id Boolean, :annotation [:op :obj-t]})
({:op :interface,
  :id Number,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ({:op :method,
     :id toString,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :opt-param,
        :access-lev nil,
        :id radix,
        :annotation number,
        :init nil}),
      :annotation string}}
    {:op :method,
     :id toFixed,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :opt-param,
        :access-lev nil,
        :id fractionDigits,
        :annotation number,
        :init nil}),
      :annotation string}}
    {:op :method,
     :id toExponential,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :opt-param,
        :access-lev nil,
        :id fractionDigits,
        :annotation number,
        :init nil}),
      :annotation string}}
    {:op :method,
     :id toPrecision,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id precision,
        :annotation number}),
      :annotation string}})}})
({:op :var, :id Number, :annotation [:op :obj-t]})
({:op :interface,
  :id Math,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ((:property E number)
    (:property LN10 number)
    (:property LN2 number)
    (:property LOG2E number)
    (:property LOG10E number)
    (:property PI number)
    (:property SQRT1_2 number)
    (:property SQRT2 number)
    {:op :method,
     :id abs,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id acos,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id asin,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id atan,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id atan2,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id y, :annotation number}
       {:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id ceil,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id cos,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id exp,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id floor,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id log,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id max,
     :call
     {:op :call,
      :t-params nil,
      :param-ts ({:op :rest-param, :annotation :array-t}),
      :annotation number}}
    {:op :method,
     :id min,
     :call
     {:op :call,
      :t-params nil,
      :param-ts ({:op :rest-param, :annotation :array-t}),
      :annotation number}}
    {:op :method,
     :id pow,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}
       {:op :req-param, :access-lev nil, :id y, :annotation number}),
      :annotation number}}
    {:op :method,
     :id random,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id round,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id sin,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id sqrt,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}}
    {:op :method,
     :id tan,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id x, :annotation number}),
      :annotation number}})}})
({:op :var, :id Math, :annotation Math}
 {:op :interface,
  :id Date,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ({:op :method,
     :id toString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toDateString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toTimeString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toLocaleString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toLocaleDateString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toLocaleTimeString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id valueOf,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getTime,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getFullYear,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getUTCFullYear,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getMonth,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getUTCMonth,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getDate,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getUTCDate,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getDay,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getUTCDay,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getHours,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getUTCHours,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getMinutes,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getUTCMinutes,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getSeconds,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getUTCSeconds,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getMilliseconds,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getUTCMilliseconds,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id getTimezoneOffset,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation number}}
    {:op :method,
     :id setTime,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id time,
        :annotation number}),
      :annotation void}}
    {:op :method,
     :id setMilliseconds,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id ms, :annotation number}),
      :annotation void}}
    {:op :method,
     :id setUTCMilliseconds,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id ms, :annotation number}),
      :annotation void}}
    {:op :method,
     :id setSeconds,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id sec, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id ms,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id setUTCSeconds,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id sec, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id ms,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id setMinutes,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id min, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id sec,
        :annotation number,
        :init nil}
       {:op :opt-param,
        :access-lev nil,
        :id ms,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id setUTCMinutes,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id min, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id sec,
        :annotation number,
        :init nil}
       {:op :opt-param,
        :access-lev nil,
        :id ms,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id setHours,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id hours, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id min,
        :annotation number,
        :init nil}
       {:op :opt-param,
        :access-lev nil,
        :id sec,
        :annotation number,
        :init nil}
       {:op :opt-param,
        :access-lev nil,
        :id ms,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id setUTCHours,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id hours, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id min,
        :annotation number,
        :init nil}
       {:op :opt-param,
        :access-lev nil,
        :id sec,
        :annotation number,
        :init nil}
       {:op :opt-param,
        :access-lev nil,
        :id ms,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id setDate,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id date,
        :annotation number}),
      :annotation void}}
    {:op :method,
     :id setUTCDate,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id date,
        :annotation number}),
      :annotation void}}
    {:op :method,
     :id setMonth,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id month, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id date,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id setUTCMonth,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id month, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id date,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id setFullYear,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id year, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id month,
        :annotation number,
        :init nil}
       {:op :opt-param,
        :access-lev nil,
        :id date,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id setUTCFullYear,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id year, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id month,
        :annotation number,
        :init nil}
       {:op :opt-param,
        :access-lev nil,
        :id date,
        :annotation number,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id toUTCString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toISOString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toJSON,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :opt-param,
        :access-lev nil,
        :id key,
        :annotation any,
        :init nil}),
      :annotation string}})}})
({:op :var, :id Date, :annotation [:op :obj-t]})
({:op :interface,
  :id RegExpExecArray,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ({:op :index, :id index, :key-t "number", :annotation string}
    (:property length number)
    (:property index number)
    (:property input string)
    {:op :method,
     :id toString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id toLocaleString,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id concat,
     :call
     {:op :call,
      :t-params nil,
      :param-ts ({:op :rest-param, :annotation :array-t}),
      :annotation :array-t}}
    {:op :method,
     :id join,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :opt-param,
        :access-lev nil,
        :id separator,
        :annotation string,
        :init nil}),
      :annotation string}}
    {:op :method,
     :id pop,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id push,
     :call
     {:op :call,
      :t-params nil,
      :param-ts ({:op :rest-param, :annotation :array-t}),
      :annotation number}}
    {:op :method,
     :id reverse,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation :array-t}}
    {:op :method,
     :id shift,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation string}}
    {:op :method,
     :id slice,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id start, :annotation number}
       {:op :opt-param,
        :access-lev nil,
        :id end,
        :annotation number,
        :init nil}),
      :annotation :array-t}}
    {:op :method,
     :id sort,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :opt-param,
        :access-lev nil,
        :id compareFn,
        :annotation [:op :fn-t],
        :init nil}),
      :annotation :array-t}}
    {:op :method,
     :id splice,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id start,
        :annotation number}),
      :annotation :array-t}}
    {:op :method,
     :id splice,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param, :access-lev nil, :id start, :annotation number}
       {:op :req-param,
        :access-lev nil,
        :id deleteCount,
        :annotation number}
       {:op :rest-param, :annotation :array-t}),
      :annotation :array-t}}
    {:op :method,
     :id unshift,
     :call
     {:op :call,
      :t-params nil,
      :param-ts ({:op :rest-param, :annotation :array-t}),
      :annotation number}}
    {:op :method,
     :id indexOf,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id searchElement,
        :annotation string}
       {:op :opt-param,
        :access-lev nil,
        :id fromIndex,
        :annotation number,
        :init nil}),
      :annotation number}}
    {:op :method,
     :id lastIndexOf,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id searchElement,
        :annotation string}
       {:op :opt-param,
        :access-lev nil,
        :id fromIndex,
        :annotation number,
        :init nil}),
      :annotation number}}
    {:op :method,
     :id every,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id callbackfn,
        :annotation [:op :fn-t]}
       {:op :opt-param,
        :access-lev nil,
        :id thisArg,
        :annotation any,
        :init nil}),
      :annotation boolean}}
    {:op :method,
     :id some,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id callbackfn,
        :annotation [:op :fn-t]}
       {:op :opt-param,
        :access-lev nil,
        :id thisArg,
        :annotation any,
        :init nil}),
      :annotation boolean}}
    {:op :method,
     :id forEach,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id callbackfn,
        :annotation [:op :fn-t]}
       {:op :opt-param,
        :access-lev nil,
        :id thisArg,
        :annotation any,
        :init nil}),
      :annotation void}}
    {:op :method,
     :id map,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id callbackfn,
        :annotation [:op :fn-t]}
       {:op :opt-param,
        :access-lev nil,
        :id thisArg,
        :annotation any,
        :init nil}),
      :annotation :array-t}}
    {:op :method,
     :id filter,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id callbackfn,
        :annotation [:op :fn-t]}
       {:op :opt-param,
        :access-lev nil,
        :id thisArg,
        :annotation any,
        :init nil}),
      :annotation :array-t}}
    {:op :method,
     :id reduce,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id callbackfn,
        :annotation [:op :fn-t]}
       {:op :opt-param,
        :access-lev nil,
        :id initialValue,
        :annotation any,
        :init nil}),
      :annotation any}}
    {:op :method,
     :id reduceRight,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id callbackfn,
        :annotation [:op :fn-t]}
       {:op :opt-param,
        :access-lev nil,
        :id initialValue,
        :annotation any,
        :init nil}),
      :annotation any}})}})
({:op :interface,
  :id RegExp,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body
   ({:op :method,
     :id exec,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id string,
        :annotation string}),
      :annotation RegExpExecArray}}
    {:op :method,
     :id test,
     :call
     {:op :call,
      :t-params nil,
      :param-ts
      ({:op :req-param,
        :access-lev nil,
        :id string,
        :annotation string}),
      :annotation boolean}}
    (:property source string)
    (:property global boolean)
    (:property ignoreCase boolean)
    (:property multiline boolean)
    (:property lastIndex number)
    {:op :method,
     :id compile,
     :call
     {:op :call, :t-params nil, :param-ts nil, :annotation RegExp}})}})
({:op :var, :id RegExp, :annotation [:op :obj-t]})
({:op :interface,
  :id Error,
  :t-params nil,
  :extends nil,
  :type
  {:op :obj-t,
   :body ((:property name string) (:property message string))}})
