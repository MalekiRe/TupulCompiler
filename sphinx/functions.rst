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

Functions can have 4 different levels of purity.

* Dirty
* Const
* Tidy
* Pure



dirty
=====

The first level is ``dirty`` this is implicit and assumed, you do not declare a function as ``dirty``.
A dirty function can access and call anything it has within scope.

const
=====

A const function pulls from the C++ idea of const.

* You promise to not modify the parameters passed into the function.
* You can call any dirty or const functions however
    -You can only call const functions within your const function if it passes a const parameter.

tidy
====

The ``tidy`` function is useful mostly only in how it can be used for ``pure`` functions. The requirements for a ``tidy`` function are:

* All variables or functions in the class that are modified or affected by a static variable are out-of-scope.

A function can be **both** const and tidy.

pure
====

The pure function however has more caveats. It promises to return the same value if the same parameters are input.
This comes with some interesting consequences to give the maximum amount of flexibility while still holding true.

1. You can call any ``pure`` function from within your pure function.
2. The only variables that are in scope are the function parameters, and the variables declared inside the function.
3. You can call any ``tidy`` function on any Objects instantiated within the scope of the ``pure`` function
    - You can only do this if the arguments are NOT any parameters of the original pure function unless it is also a ``const`` function
4. You can call any ``pure`` function within a pure function.
5. All memory allocated within a ``pure`` function is guaranteed to be freed after its return.

These rules would allow you to, for example, create a map inside a pure function and use it, even though all the operations done on a map are not ``pure`` in the
functional language sense. Purity is more of a container around groups of things, and you get less pure as you climb up the ladder.
The ideal is to create a function as pure as you can, and aim for creating objects composed entirely of ``tidy-const``, ``tidy`` and ``pure`` functions.

These restrictions by the compiler allow for full control, hackery, and tomfoolery when needed, but also help safe-guard and enforce
a safer more repeatable style of programming.