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

All functions default to pure, and must be specified otherwise.

dirty
=====

The first level is dirty this is the default for most imperative programming languages.

* Any and all I/O operations must happen within a dirty function as I/O is inherently messy business.
* A dirty function can access and call anything it has within scope.


tidy
====

The tidy function is useful mostly only in how it can be used for pure functions. The requirements for a tidy function are:

* All variables or functions in the class that are modified or affected by a static variable are out-of-scope.

The reason an I/O operation is not valid for tidy is that a file is considered for the purposes of purity to be a static variable.





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


.. code-block::

    myClass {
      static field1;

      field2;

      dirty func1() {
        if(field1)//Valid
        if(field2)//Valid
      }
      tidy func2() {
        if(field1) //Invalid
        if(field2) //Valid
      }
      pure func3() {
        if(field1)//Invalid
        if(field2)//Invalid
      }
    }


Immutable Functions
-------------------

Functions can have 3 different levels of immutability.

fixed > const > fluid

All functions default to Fixed and must be specified otherwise.

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
* You can call fixed functions on your parameters.

In order to assure that const functions do not modify parameters some additional safety checks and requirements are made.

* A variable assigned to a const parameter is considered the same as that parameter for immutability purposes.
* If an object that is equivalent to a parameter is returned, a copy-reference-object of that object is returned which is a pointer to the object and is equivalent to the object, except only fixed functions can be run on it. This does **not** affect the original parameter returned.

.. code-block::

    class Main {
        class Foo {
            //data
            const myFunction() {...}
            fixed secondFunction() {...}
        }

        const Foo getGreater(Foo bar, Foo baz) {
            return bar > baz ? bar : baz;
        }
        fluid main() {
            Foo first;
            Foo second;

            Foo returnValue = getGreater(first, second);

            first.myFunction(); //This is valid
            first.secondFunction(); //Also valid
            second.myFunction(); //This is also valid
            second.myFunction(); //Also valid

            returnValue.myFunction(); //This is invalid!
            returnValue.secondFunction(); //But this is valid!

        }
    }


fixed
=====

A fixed function is like a higher level of a C++ const. fixed means the function not only promises to not change the values of parameters,
but it promises to not change any variables in any enclosing class. A side effect of this is that all variables except for the return value are automatically freed if
they are on the stack or created within the function.

* the only function you can call within fixed functions are other fixed functions.