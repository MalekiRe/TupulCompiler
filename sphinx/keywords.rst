Keywords
========

this
----

The `this` keyword can only be called within non-static functions in a Type or a Interface.
It is the object itself, functioning the same as the word in Java.

super
-----

Super behaves differently then how it does in Java, this is because a method with the same signature may exist in multiple extending interfaces.
Therefore, super takes in the interface of which you are calling the method from.

.. code-block::

    interface Bar {
        void otherFunc() {
        //...code
        }
    }
    interface Foo extends Bar {
        void myFunc() {
            super(Bar).otherFunc();
        }
    }

