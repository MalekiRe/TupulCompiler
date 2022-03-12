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
        constructor(this<append:File#closed>) {
            //...code
        }
        static File open(string fileName) {
            if(//can't open file) {
                return null;
            }
            File file = Tag.consume(Tag.append(new File(), File#opened), File#closed);
            return file;
        }
        void close(this<consume:File#opened, append:File#closed>) {
            //do whatever io stuff to close the file.
        }
    }

    type FileReader {
        type Iterator implements Iterator {
            //...keeps track of the position in things like files.
        }
        static boolean hasNext(File file<check:File#opened>, FileReader.Iterator iterator) {
            return //...code
        }
        static String getNextLine(File file<check:File#opened>, FileReader.Iterator iterator) {
            return //...code to get next line.
        }

    }

    type MainClass {
        void main(string[] args) {
            File myFile; //Unlike java constructor, if the constructor takes no arguments it is called implicitly, if constructor requires arguments this syntax is invalid and requires the 'new' keyword
            if( (File.open("file.txt"): File.optional optionalFile) && optionalFile instanceof File -> myFile) {
                if(Tag.check(myFile, File#opened)) {
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