package module10_collection.ArrayList;
import java.util.ArrayList;

/*
==========================================================
              ArrayList - remove() Method
==========================================================

Definition:
-----------
remove() is used to delete an element from an ArrayList.

----------------------------------------------------------
Method Overloading
----------------------------------------------------------

1. remove(int index)
   -> Removes the element at the specified index.

2. remove(Object obj)
   -> Removes the specified object (value).

----------------------------------------------------------
Return Type
----------------------------------------------------------

remove(index)
-> Returns the removed element.

remove(Object)
-> Returns true if the object is removed,
   otherwise returns false.

----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ remove(index) removes using index.
✔ remove(Object) removes using value.
✔ Elements automatically shift to the left.
✔ ArrayList size decreases by 1.
✔ Invalid index throws IndexOutOfBoundsException.
✔ In ArrayList<Integer>, remove(20) means index 20.
✔ To remove value 20, use:
   remove(Integer.valueOf(20));

----------------------------------------------------------
Quick Revision
----------------------------------------------------------

remove(index)
→ Remove by index

remove(Object)
→ Remove by value

==========================================================
*/

public class ArrayList05 {

    public static void main(String[] args) {

        // ======================================================
        // Example 1 : remove(index)
        // ======================================================

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before : " + numbers);

        // Index : 0   1   2   3
        // Value :10  20  30  40

        numbers.remove(1);

        System.out.println("After  : " + numbers);

        // Index : 0   1   2
        // Value :10  30  40



        // ======================================================
        // Example 2 : remove(index) with String
        // ======================================================

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Ahmedabad");
        cities.add("Hyderabad");

        System.out.println("\nBefore : " + cities);

        cities.remove(2);

        System.out.println("After  : " + cities);



        // ======================================================
        // Example 3 : remove(Object)
        // ======================================================

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);

        System.out.println("\nBefore : " + marks);

        // marks.remove(20);   // ❌ Java treats 20 as an index.

        marks.remove(Integer.valueOf(20));

        System.out.println("After  : " + marks);



        // ======================================================
        // Example 4 : remove(Object) with String
        // ======================================================

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println("\nBefore : " + fruits);

        fruits.remove("Banana");

        System.out.println("After  : " + fruits);



        // ======================================================
        // Example 5 : Return value of remove(Object)
        // ======================================================

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        boolean removed = languages.remove("Python");

        System.out.println("\nUpdated List : " + languages);
        System.out.println("Removed ?    : " + removed);
    }
}
