=========
Functions
=========

Functions can be standalone in a file, or a part of a class.

Access Level
------------

If a function is in a class, it can be made ``public``, or ``private``.
A public function can be called directly by accessing the Object instance::

    MyClass class = new MyClass();
    class.myFunction();

A private function can only be called on by classes the extend the class within the class


Purity
------

Functions can have 3 different levels of purity.

pure > tidy > dirty



dirty
=====

The first level is dirty this is the default for most imperative programming languages.

* Any and all I/O operations must happen within a dirty function as I/O is inherently messy business.
* A dirty function can access and call anything it has within scope.


tidy
====

The tidy function is useful mostly only in how it can be used for pure functions. The requirements for a tidy function are:

* All variables or functions in the class that are modified or affected by a static variable are out-of-scope.





pure
====

The pure function however has more caveats. It promises to return the same value if the same parameters are input.
This comes with some interesting consequences to give the maximum amount of flexibility while still holding true.


You can call any pure function from within your pure function with any variables as arguments.
The only variables that are in scope are the function parameters, and the variables declared inside the function.
You can call tidy or functions in pure functions provided:

    * The arguments are not parameters to the enclosing function
    * The function is not called on a parameter to the enclosing function


These rules would allow you to, for example, create a map inside a pure function and use it, even though all the operations done on a map are not pure in the
functional language sense. Purity is more of a container around groups of things, and you get less pure as you climb up the ladder.
The ideal is to create a function as pure as you can.

These restrictions by the compiler allow for full control, hackery, and tomfoolery when needed, but also help safe-guard and enforce
a safer more repeatable style of programming.



Immutable Functions
-------------------

functions can have 3 different levels of immutability

fixed > const > fluid

fluid
=====

fluid is what would be the "default" in most programming languages.

* Both parameters and variables in the enclosing class can be mutated.

const
=====

A const function pulls from the C++ idea of const.
You promise to not modify the parameters passed into the function, however, any variables that are not parameters,
such as static or non-static variables within the enclosing class are free game.

* If you don't pass a const parameter as an argument, then you can call any function within your const function.
* If you **do** pass a const parameter as an argument then the function you call must be const or fixed.


fixed
=====

A fixed function is like a higher level of a C++ const. fixed means the function not only promises to not change the values of parameters,
but it promises to not change any variables in any enclosing class. A side effect of this is that all variables except for the return value are automatically freed if
they are on the stack or created within the function.

* You can **only** call fixed functions within fixed functions.