====
Tags
====

Tags are useful ways to ensure consistency. They are checked at compile time and are a zero cost abstraction.
Tags can be "consumed", "appended" or "checked" with "consume", "append", or "check.
As an example take a slightly modified standard library I/O File implementation.

.. code-block:: Java
    :linenos:

    type File {
        #tagdef : {closed, opened}
        #invalidScopingTags : {opened} //These are tags that your type cannot have when leaving scope.
        init()
        <this += File#closed;>
        {
            //...code
        }
        static File open(string fileName) {
            if(//can't open file) {
                return null;
            }
            File file = new File;
            file -= File#opened;
            file += File;
            return file;
        }
        void close(this)
        <
        this -= File#opened;
        this += File#closed;
        >{
            //do whatever io stuff to close the file.
        }
    }

    type FileReader {
        type Iterator implements Iterator {
            //...keeps track of the position in things like files.
        }
        static boolean hasNext(File file, FileReader.Iterator iterator)
        <
        file == File#opened;
        >
        {
            return //...code
        }
        static String getNextLine(File file, FileReader.Iterator iterator)
        <
        file == File#opened;
        >
        {
            return //...code to get next line.
        }

    }

    type MainClass {
        void main(string[] args) {
            File myFile; //Unlike java constructor, if the constructor takes no arguments it is called implicitly, if constructor requires arguments this syntax is invalid and requires the 'new' keyword
            myFile.init(); //Closed  tag actually isn't really a thing, but is used to show consuming and appending, but so for this example we have 'init' which sets it up with a closed tag.
            if( (File.open("file.txt"): File.optional optionalFile) && optionalFile instanceof File -> myFile) {
                if(myFile == File#opened) {
                    print("hey extra check that file was opened that was COMPLETELY UNNECESSARY")
                }
                FileReader.Iterator fileIterator;
                while(FileReader.hasNext(myFile, fileIterator)) {
                    print(FileReader.getNextLine(myFile, fileIterator));
                }
                myFile.close(); //invalid tag must be removed before object can go out of scope. invalid tags are defined per type.
            }
        }
    }