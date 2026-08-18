package module10_collection.ArrayList;
import java.util.ArrayList;

/*
==========================================================
          ArrayList - indexOf() & lastIndexOf()
==========================================================


==========================================================
                    indexOf() Method
==========================================================

Definition:
-----------
indexOf() is used to find the index position of the
first occurrence of a specific element in an ArrayList.


Syntax:
-------

list.indexOf(element);


Return Type:
------------

Returns:
    int

If element is found:
    returns index number

If element is not found:
    returns -1


Example:

list = [10, 20, 30]

list.indexOf(20);

Output:
1


----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ Searches from the beginning of ArrayList.
✔ Returns the first matching index.
✔ If element is not present, returns -1.
✔ It does not modify the ArrayList.



==========================================================
                  lastIndexOf() Method
==========================================================

Definition:
-----------
lastIndexOf() is used to find the index position of the
last occurrence of a specific element in an ArrayList.


Syntax:
-------

list.lastIndexOf(element);


Return Type:
------------

Returns:
    int

If element is found:
    returns last index number

If element is not found:
    returns -1


----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ Searches from the end of ArrayList.
✔ Returns the last matching index.
✔ Useful when duplicate elements are present.
✔ It does not modify the ArrayList.



==========================================================
             indexOf() vs lastIndexOf()
==========================================================


indexOf()
---------
Finds first occurrence.

Example:

[10,20,10,30]

indexOf(10)

Output:
0


lastIndexOf()
-------------
Finds last occurrence.

Example:

[10,20,10,30]

lastIndexOf(10)

Output:
2


==========================================================
*/


public class ArrayList08 {

    public static void main(String[] args) {


        // ======================================================
        // Example 1 : indexOf()
        // ======================================================


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Kiwi");


        System.out.println(fruits);


        System.out.println("Index of Apple : " + fruits.indexOf("Apple"));


        System.out.println("Index of Orange : " + fruits.indexOf("Orange"));



        // ======================================================
        // Example 2 : Duplicate Elements
        // indexOf() and lastIndexOf()
        // ======================================================


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);


        System.out.println("\nNumbers : " + numbers);


        System.out.println("First index of 10 : " + numbers.indexOf(10));


        System.out.println("Last index of 10 : " + numbers.lastIndexOf(10));



        // ======================================================
        // Example 3 : Searching String
        // ======================================================


        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");


        System.out.println("\nLanguages : " + languages);


        System.out.println("First Java index : " + languages.indexOf("Java"));


        System.out.println("Last Java index : " + languages.lastIndexOf("Java"));


        // ======================================================
       // Special Example : lastIndexOf() with Duplicate Elements
      // ======================================================

        ArrayList<String> names = new ArrayList<>();

        names.add("Shailesh");
        names.add("Rahul");
        names.add("Amit");
        names.add("Rahul");
        names.add("Vijay");
        names.add("Rahul");


        System.out.println("Names : " + names);


        // Index :  0          1       2       3       4       5
       // Value : Shailesh  Rahul   Amit    Rahul   Vijay   Rahul


        System.out.println("First Rahul index : " + names.indexOf("Rahul"));

        System.out.println("Last Rahul index : " + names.lastIndexOf("Rahul"));


    }
}