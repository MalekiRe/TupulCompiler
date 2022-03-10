=========
Set Types
=========

Tupul's types are derived from many of the ideas and notations of Zermelo–Fraenkel set theory

These allow for defining functions that guarantee return values because of parameter types.

This is confusing, I will explain.

In something like Java one might see a function like this

.. code-block:: Java

    Item getItem(int i) {
        if(i < 0) {
            return null;
        }
        //... code that gets the item.
    }

Or errors in using arrays

.. code-block:: Java

    char[] myCharArray;
    int i = -1;
    System.out.println(myCharArray[i]); //Causes an error.

There is some argument to be made for simply passing these errors on, and ignoring the fact that types don't really show
what kind of types should be used for functions. However, Tupul allows you to define (and any type defined equivelently as another type
is interchangable) custom types using Set theory.

This means that along with having types certiantly return a value, you can also union the type "false" which is part of boolean, with
any other type.


.. code-block:: Java

    typedef ItemOptional : Item union false; //Also valid is Item | false

    ItemOptional getItem(int i){//...code}

However, because having an optional thing is so common, all types have a .optional extension that is this.

.. code-block:: Java

    Item.optional getItem(int i){//...code}

Any conversion between a type and a type that is a strict subset of it happens without casting.

.. code-block:: Java

    typedef PositiveInt : Set.naturalNumbers.greater(-1);

    PostiveInt myPositiveInt = 1;

    int mySecondInt = myPositiveInt; //Doesn't need casting because it is a strict subset.

In this case though, you would need some extra steps called validation, which we will go over later.

.. code-block:: Java

    typedef PosIntString : Set.naturalNumbers.greater(-1) union string;

    PosIntString customNum = 1; //Valid

    int mySecondInt = customNum; //Invalid.

If you want to check if a type is a subset of another you use the subset keyword.


.. code-block:: Java

    typedef PosInt : Set.naturalNumbers.greater(-1);
    typedef PosIntString : Set.naturalNumbers.greater(-1) union string;
    /*
    also valid would be
    typedef PosInt : Set.naturalNumbers.greater(-1);
    typedef PosIntString : PosInt | string;
    */

    PosIntString customNum = 1; //Valid

    int mySecondInt = customNum; //Invalid.

    int myInt = -1;

    if(myInt.class subset PosIntString) {
        //This is true
    }

    if(myInt.class strictsubset PosIntString) {
        //This is false becuase 'string' isn't a part of the 'int' type
    }

    if(myInt instanceof PosIntString) {
        //This is false, because -1 isn't in the PosIntString set.
    }
    if(myInt instanceof PosInt) {
        //This is false, because -1 isn't in the PosInt set.
    }
    myInt = 1;
    if(myInt instanceof PosIntString) {
        //This is true
    }
    if(myInt instanceof PosInt) {
        //This is true
    }

Now, this leads into a second piece about Set syntax in tupul.
You can define new, or redifine existing types if they are a subsets within conditionals.
Reusing our example from earlier:

.. code-block:: Java

    typedef PosInt : Set.naturalNumbers.greater(-1);
    int myInt = 1;

    if(myInt instanceof PosInt -> PosInt newInt) {
        print(newInt); //This creates a newInt that is the value of myInt.
    }

    //But you can also just redefine a variable within the scope of the conditional.

    if(myInt instanceof PosInt -> myInt) {
        print(myInt); //myInt within this scope is no longer a 'int' type it is a 'PosInt' type.
    }


This can be changed together by isolating with parenthesis.

.. code-block:: Java

    int int1 = 1, int2 = 2;

    if( (int1 instanceof PosInt -> int1) && (int2 instanceof PosInt -> int2)) {
        print("int1: " + int1);
        print("int2: " + int2);
    }


Now, back to the optional type.

You can use conditionals on only booleans, and types that subset boolean values.
If you run a conditional, and the type subsets the boolean values true, false, or just one of them, then
the conditional evaluates the statement as false if it is indeed a false boolean, and true otherwise.
Thus, unless you are explicitly checking instanceof, subsetting 'true' is not necessary.

.. code-block:: Java

    Item.optional getItem(int i){//...code}

    if(getItem(0)) { //This evaluates to false if it is an instance of 'false' and true otherwise.
        print("has an item");
    } else {
        print("doesn't have an item");
    }

As show in the Functions page, you can get a value from this.

.. code-block:: Java

    Item.optional getItem(int i){//...code}

    if(!(getItem(0) : Item.optional myItem)) {
        print("doesn't have item");
    } else if(myItem instanceof Item -> myItem) {
        print("my item is: " + myItem);
    }

This forces you to invert your if statements if you are checking optionality, because getItem returns a Item.optional and not a Item.
And Item is not a strict subset of Item.optional, just a subset.

Taking all of this together, we can rewrite our code from above with more explicit error checking.

.. code-block:: Java

    class Foo {
        typedef PostiveInt : Set.naturalNumbers.greaterThan(-1);
        void main(int myVal) {
            if(myVal subsetof PositiveInt -> myVal) {
                if(!(getItem(myVal): ItemOptional returnItem)) {
                    print("Item out of range");
                } else if(returnItem instanceof Item -> Item returnItem) {
                    print("Item is: " + returnItem.toString());
                }
            } else {
                print("isn't a postive int: " + myVal);
            }
        }
        Item.optional getItem(PositiveInt i) {
            //We know that postive int so no need to check.
            if(i > arrayList.size()) { //This could be some computationally expensive function that can't be properly checked at compile time.
                return false;
            }
            return arrayList.get(i);
        }
    }

However, as all functions are objects and inherit from the function class,
they contain an inherent and overridable validator for their inputs.

.. code-block:: Java

    abstract AbstractFunction {
        ...anything run(anything ...arguments);
        ...anything validate(anything ...arguments);
        void onInvalid();
        void onValid();
    }

    class Function<...ReturnTypes, ...ArgumentTypes> implements AbstractFunction {

        ReturnTypes run(ArgumentTypes ...types);


        //A list of anything can be turned into its optional types.
        //A list of types can also be turned into its optional variants.
        ArgumentTypes.optionals validate(Any ...types[ArgumentTypes.size()-1]) {
            for(int i = 0; i < types.size(); i++) {
                if(types[i] subset ArgumentTypes[i] : subsetType) {
                    onValid();
                    returnChain subsetType; //Return chain allows you to chain return calls if they return multiple things.
                } else {
                    onInvalid();
                }
            }
            returnChainComplete false; //If you use return chain you must call returnChainComplete with whatever default values you wish.
            //In our scenario this would never be called, but this is needed for compiler checks.
        }

    }

With these functions and types, you can actually rewrite the previous above code to be more succinct.

.. code-block:: Java

    class Foo {
        typedef PostiveInt : Set.naturalNumbers.greaterThan(-1);
        void main(int myVal) {
            if(getItem.validate(myVal) -> myVal) {
                if(!(getItem(myVal): ItemOptional returnItem)) {
                    print("Item out of range");
                } else if(returnItem instanceof Item -> Item returnItem) {
                    print("Item is: " + returnItem.toString());
                }
            }
        }
        //You can override function objects functions in the class where they are declared, or anywhere where they are used.
        getItem.onInvalid() {
            print("Error, Isn't a postive int!");
        }
        Item.optional getItem(PositiveInt i) {
            //We know that postive int so no need to check.
            if(i > arrayList.size()) { //This could be some computationally expensive function that can't be properly checked at compile time.
                return false;
            }
            return arrayList.get(i);
        }
    }