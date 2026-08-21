package module10_collection.ArrayList;

/*
==========================================================
            ARRAYLIST - BASIC REVISION NOTES
==========================================================

1. ArrayList is a class.
2. Package : java.util
3. Used to store multiple objects dynamically.
4. Dynamic means size grows automatically when needed.
5. Internally, ArrayList uses an array.
6. ArrayList stores objects (Wrapper Classes), not primitive data types.
7. To use ArrayList, import:
       import java.util.ArrayList;

==========================================================
                SYNTAX
==========================================================

ArrayList<Integer> list = new ArrayList<>();

Breakdown:

ArrayList
-> Class name.

<Integer>
-> Generic.
-> Tells Java this ArrayList will store Integer objects only.

list
-> Reference variable.

=
-> Assignment operator.

new
-> Creates a new object.

ArrayList<>()
-> Constructor.
-> Creates an ArrayList object in heap memory.

==========================================================
        WHY Integer AND NOT int ?
==========================================================

Primitive Types
--------------
int
double
char
float
boolean
long
short
byte

Wrapper Classes
---------------
Integer
Double
Character
Float
Boolean
Long
Short
Byte

✔ ArrayList stores Objects.
✔ Wrapper classes are objects.
✘ Primitive data types are not objects.

Wrong:
ArrayList<int> list = new ArrayList<>();

Correct:
ArrayList<Integer> list = new ArrayList<>();

==========================================================
                EXAMPLE
==========================================================
*/

import java.util.ArrayList;

public class ArrayListBasicNotes {

    public static void main(String[] args) {

        // Integer ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // String ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Double ArrayList
        ArrayList<Double> marks = new ArrayList<>();

        // Character ArrayList
        ArrayList<Character> grades = new ArrayList<>();

        // Boolean ArrayList
        ArrayList<Boolean> status = new ArrayList<>();

        System.out.println("ArrayList Objects Created Successfully.");
    }
}

/*
==========================================================
            IMPORTANT POINTS TO REMEMBER
==========================================================

✔ ArrayList is a Class.
✔ It belongs to java.util package.
✔ It stores multiple objects.
✔ Size is dynamic.
✔ Internally uses an array.
✔ Uses Generics (< >) for type safety.
✔ Stores Wrapper Classes instead of primitive types.
✔ Object is created using the 'new' keyword.
*/