package module10_collection.ArrayList;

import java.util.ArrayList;

/*
==========================================================
              ArrayList - clear() Method
==========================================================

Definition:
-----------
clear() method is used to remove all elements from an
ArrayList.

Simple:
clear() -> Makes the ArrayList empty.


----------------------------------------------------------
Syntax
----------------------------------------------------------

list.clear();


Example:

numbers.clear();


----------------------------------------------------------
Return Type
----------------------------------------------------------

Returns:

void


Reason:
-------
clear() performs an operation but does not return any value.


----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ clear() removes all elements from ArrayList.

✔ After clear(), size becomes 0.

✔ ArrayList object still exists and can be reused.

Example:

list.clear();

list.add(100);   // Valid


✔ clear() does not delete the ArrayList object.


----------------------------------------------------------
clear() vs remove()
----------------------------------------------------------

remove()
--------

Removes a single element.

Example:

list.remove(1);


Before:
[10,20,30]

After:
[10,30]


----------------------------------------------------------

clear()
-------

Removes all elements.

Example:

list.clear();


Before:
[10,20,30]

After:
[]


==========================================================
*/


public class ArrayList10 {

    public static void main(String[] args) {


        // ======================================================
        // Example 1 : clear() removes all elements
        // ======================================================


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        System.out.println("Before clear : " + numbers);


        numbers.clear();


        System.out.println("After clear  : " + numbers);



        // ======================================================
        // Example 2 : Size becomes 0 after clear()
        // ======================================================


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");


        System.out.println("\nBefore clear : " + fruits);

        System.out.println("Size before clear : " + fruits.size());


        fruits.clear();


        System.out.println("After clear : " + fruits);

        System.out.println("Size after clear : " + fruits.size());



        // ======================================================
        // Example 3 : ArrayList can be reused after clear()
        // ======================================================


        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");


        System.out.println("\nBefore clear : " + languages);


        languages.clear();


        System.out.println("After clear : " + languages);


        languages.add("C++");


        System.out.println("After adding again : " + languages);

    }
}
