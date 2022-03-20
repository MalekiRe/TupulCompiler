===========
Constructor
===========

Constructors behave differently in Tupul then how they do in most languages.

This is because **Constructors don't actually exist**

Well, not really, let me explain.

The usecase of constructors, is to force some kind of setup to take place before an object can be used, or uses certain kinds of functions.
This is also a usecase that Tags can cover perfectly, and can even expound upon.

So, any function can acts as a constructor, and all other functions can simply require certain tags be placed on the objects before they can be used.

This means that SOME functions that would actually have to do extra checks, such as a "print" function, which when printing a null object, must check if an object is null before calling the .toString() function on it.
Can instead just have the "initialized" tag for example not as a requirement, and the check done in its own .toString function.

.. code-block::

    type SpecialBoi {
        #tagdef : {initialized}
        private double x = 0;
        private double y = 0;

        double calculateDifference(this, double z)<this == SpecialBoi#initialized;> {
            return x*y+z;
        }

        void initialize(this<append:SpecialBoi#intialized>, int x, int y)<this += SpecialBoi#intialized;> {
            this.x = x;
            this.y = y;
        }

        string toString() { //has implicit this.
            if(this == File#initialized) {
                return "x: " + x + ", y: "+ y;
            } else {
                return "uninitialized"
            }
        }
    }

    void main() {
        SpecialBoi myBoi;
        print(myBoi); //prints "uninitialized"
        myBoi.calculateDifference(1); //Won't compile
        myBoi.initialize(1, 1); //Custom init function
        myBoi.calculateDifference(1); //will compile!
        print(myBoi); //prints "x: 1, y: 1"
    }



An example of some of the extra guard checks necessary

.. code-block::

    Array<Object> myObjects = new Array;

    myObjects.add(new File);

    if( (myObjects.get(0) instanceof File -> File file) && file == File#closed ) { //If we do the check, then our scope considers anything below scope to have it be t rue.
        file.open();
        //read the file whatever
        file.close(); //don't forget to close the file
    }