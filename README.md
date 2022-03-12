# TupulCompiler
Tupul is a low level compiled primarily imperative, functional capable systems programming language. It supports limited Object Oriented styles to provide structure, but lacks true inheritance. 

The idea behind Tupul is one of Explicit knowledge, most things seen and just understood to be remembered, in a program need to be stated. This can be exemplified by the type system, which uses a set theory like construction to place requirements on variable arguments far more strict than other systems languages, such a validation and requirement that arrays only be accessed with positive natural numbers.

Tupul aims to limit side-effects and "side-conditions", by making functions unable to produce side effects, and unable to access variables outside the scope of parameters, limiting side-conditions, unless explicitly stated.

Tupul also aims to prevent invalid states of programs through a system of "tags" on variables that are required to call certain functions on or as arguments, and by disallowing any variables to hold a true "null" value.

Tupul's priorities are #1 safety, #2 speed, and #3 memory, which means sacrifices in memory are made to ensure certain checks, but most of Tupul's abstractions are Zero cost.

#The Goal of Tupul
Tupul aims to be as safe as a Systems language can get, while still being nearly on par with languages like C or Rust.

#Relevant Links
https://tupulcompiler.readthedocs.io/en/latest/index.html
