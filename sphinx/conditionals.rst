============
Conditionals
============

Conditionals operate similarly to C/C++ and Java but with some caviates(or bonuses depending on how you look at it).

The first difference is that any variable, unless it is specifically the value 'false' of a boolean or boolean subset, is true.

This means any function you run, unless it is of a boolean subset, like the '.optional' type, will return true when evaluated in a conditional.

You can extract an instance of a variable when using a function:

.. code-block:: Java

    int myFunc() {//...code}

    if((myFunc() : int savedInt) == 1) {
        print(savedInt);
        //run some code.
    }

This also works with multiple return values

.. code-block:: Java

    int string bool myFunc() {//...code}

    if( (myFunc() : (int savedInt, string myStr, bool myBoolean))[0] == 1) {
        //code
    }

With multiple return values, if you declare them as above, you can actually use multiple of them to check conditions

.. code-block:: Java

    int string bool myFunc() {//...code}

    //Anything that isn't of the boolean type false is true.
    //This means that the myFunc() return type is true when evaluated here.
    //Then you evaluate with all the variables now in scope.
    if( (myFunc() : (int savedInt, string myStr, bool myBoolean)) && savedInt == 1 && myStr.equals("hi") && !myBoolean) {
        //code
    }