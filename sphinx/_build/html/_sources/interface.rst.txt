=========
Interface
=========

Interfaces exist. You cannot use an interface as a type, you must create a type that implements that interface.
A type and an interface can have the same name however, as how they are used are completely different.
An interface is more similar to an Abstract Class in Java, then a Java interface.

An interface:

1. Defines functions (hopefully with documentation on why it exists).
2. Defines static and non-static variables.
3. May implement functions.
4. Extends other interfaces.
5. Overrides other interfaces methods.

All of these should be understandable by anyone who has used Java or C/C++ before, except for how the overriding of methods works.

Simply put, if an interface extends another interface, and they share the same names, return values, and arguments for a function the extending interface
does **not** override that parent interface inherently.
This is because, with the design philosophy of Tupul, everything that could cause (and has caused me) confusion and headaches should
instead be stated explicitly. There are actually very few times where overriding is necessary, so it must happen explicitly.
Instead, you must prefix with the 'override' keyword if you wish to override a method. You must also prefix the method name with
the interface you are overriding it from. You also **cannot** name a method with the same arguments in a interface without overriding the one where
it originates from.
For example:

.. code-block:: Java

    interface Foo {
        void myFunc() {
            //...some code
        }
    }

    interface Bar extends Foo{
        void myFunc() { //is invalid syntax.

        }

    }

.. code-block:: Java

    interface Foo {
        void myFunc() {
            //...some code
        }
    }

    interface Bar extends Foo{
        //Prefer to have the 'override' keyword on its own line, but not necessary.
        override
        void Foo::myFunc() { //Is valid syntax
            //..some code.
        }

    }

This is to make it so you can't accidentally override a method without realizing it, and cause a headache for yourself or anyone looking through
your code.

You need to use the keyword 'implement' when implementing an unimplemented function from extending interface

.. code-block:: Java

    interface Foo {
        void myFunc();
    }

    interface Bar extends Foo {
        implement
        void Foo::myFunc() {
            //...code
        }
    }

This is so as to not accidentally think you are writing your own function, and instead implementing some other function with the same name
and parameters.