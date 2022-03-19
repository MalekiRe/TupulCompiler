====
Type
====

A type is very similar to a "class" in other languages. Types are called types however, even though they have most features of classes, because
they are often actually combinations of other types, and do not experience normal class inheritance.

Types cannot extend other types, types simply implement :doc:`interfaces</interface>` .

I know this may be painful, I know this may be somewhat more laborius than the common standard ability to inheret from other types.
However, this provides several key benefits.

1: Documentation and standards.
-------------------------------

Documentation can more easily exist inside interfaces, when functions haven't been implemented, to say how they
should be implemented.


2: Issues with Inheritance
--------------------------

Inheritance can cause MANY issues, but one I want to focus on here is that extending from multiple classes, with multiple constructors, just doesn't work
Even if you want to achieve some small functionality from some other class, you must use an instance of that class, and make it a wrapper.



A big difference between types and interfaces, is that types must 'resolve' conflicts in the interfaces they have extended.
This is done by means of the 'resolve' keyword, and functions like so.

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
    type myType extends I2, I1{
        resolve(I2, I1)
        void func(int i){
          super(I2).func(i);
          super(I1).func(i)
        }
    }

This can ALSO be done in an interface, but it is not required.
