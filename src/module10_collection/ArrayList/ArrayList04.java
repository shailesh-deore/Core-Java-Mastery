package module10_collection.ArrayList;
import java.util.*;

/*
==========================================================
                ArrayList - set() Method
==========================================================

Definition:
-----------
set() is used to replace (update) an existing element
at the specified index.

----------------------------------------------------------
Syntax
----------------------------------------------------------

list.set(index, element);

Example:
    list.set(2, 30);

----------------------------------------------------------
Return Type
----------------------------------------------------------

Returns the OLD element that was replaced.

Example:
String oldValue = list.set(1, "Orange");

----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ Replaces an existing element.
✔ No new element is added.
✔ ArrayList size remains the same.
✔ No shifting occurs.
✔ Index must be valid (0 to size() - 1).

----------------------------------------------------------
Quick Revision
----------------------------------------------------------

set(index, element)
→ Replaces the element at the specified index.

==========================================================
*/

public class ArrayList04 {

    public static void main(String[] args) {

        // ======================================================
        // Example 1 : Replacing an Integer element
        // ======================================================

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(10);
        marks.add(20);
        marks.add(40);

        // Index :  0   1   2
        // Value : 10  20  40

        System.out.println("Before Replacement : " + marks);

        marks.set(2, 30);

        // Index :  0   1   2
        // Value : 10  20  30
        // 40 is replaced by 30 at index 2.

        System.out.println("After Replacement  : " + marks);

        System.out.println();



        // ======================================================
        // Example 2 : Replacing a String element
        // ======================================================

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println("Before : " + fruits);

        fruits.set(1, "Orange");

        System.out.println("After  : " + fruits);

        // Before : [Mango, Banana, Apple]
        // After  : [Mango, Orange, Apple]


        // ======================================================
        // Example 3 : set() returns the old element
        // ======================================================

        String oldFruit = fruits.set(2, "Kiwi");

        System.out.println("Updated List : " + fruits);
        System.out.println("Old Value    : " + oldFruit);

        // Updated List : [Mango, Orange, Kiwi]
        // Old Value    : Apple
    }
}
