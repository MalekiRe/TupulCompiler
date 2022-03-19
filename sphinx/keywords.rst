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


Unless a method is private, one can call its parent method from the class using the super keyword, so, following from the 'type' example, this would be valid.

.. code-block::Java

    interface I1 {
        void func(int i) {
          print(i-1);
        }
    }
    interface I2 {
        void func(int i) {
          print(i+1);
        }
    }
    type MyType extends I2, I1{
        resolve(I2, I1)
        void func(int i){
          super(I2).func(i);
          super(I1).func(i)
        }
    }

.. code-block:: Java

    type MyClass {
        public void main() {
            MyType myType;
            myType.func(0);
            myType.super(I1).func(0);
            myType.super(I2).func(0);
        }
    }

