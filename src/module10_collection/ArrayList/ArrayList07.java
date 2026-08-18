package module10_collection.ArrayList;

import java.util.ArrayList;

/*
==========================================================
              ArrayList - contains() Method
==========================================================

Definition:
-----------
contains() is used to check whether a specific element
is present in an ArrayList or not.

----------------------------------------------------------
Syntax
----------------------------------------------------------

list.contains(element);

Example:
    list.contains(20);

----------------------------------------------------------
Return Type
----------------------------------------------------------

Returns:
    boolean

true  -> Element is present
false -> Element is not present

----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ contains() only checks presence of an element.
✔ It does not add, remove, or modify the ArrayList.
✔ It searches using value, not index.
✔ Comparison is done using equals() method.
✔ String comparison is case-sensitive.

Example:

"Java" != "java"

----------------------------------------------------------
Quick Revision
----------------------------------------------------------

contains(value)
→ Checks whether value exists in ArrayList.

Return:
true / false

==========================================================
*/

public class ArrayList07 {

    public static void main(String[] args) {


        // ======================================================
        // Example 1 : contains() with Integer
        // ======================================================

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

        System.out.println(numbers.contains(20)); // true
        System.out.println(numbers.contains(50)); // false



        // ======================================================
        // Example 2 : contains() with String
        // ======================================================

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println(languages);

        System.out.println(languages.contains("Java")); // true
        System.out.println(languages.contains("HTML")); // false



        // ======================================================
        // Example 3 : Case Sensitive
        // ======================================================

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println(fruits.contains("Apple")); // true
        System.out.println(fruits.contains("apple")); // false
    }
}
