package module10_collection.ArrayList;
import java.util.ArrayList;

/*
==========================================================
              ArrayList - isEmpty() Method
==========================================================

Definition:
-----------
isEmpty() is used to check whether an ArrayList contains
any element or not.


----------------------------------------------------------
Syntax
----------------------------------------------------------

list.isEmpty();


Example:

numbers.isEmpty();


----------------------------------------------------------
Return Type
----------------------------------------------------------

Returns:
    boolean


true  -> ArrayList is empty (size = 0)

false -> ArrayList contains elements


----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ isEmpty() only checks whether the list is empty.
✔ It does not add, remove, or modify elements.
✔ Internally checks:

   size == 0  → true

   size > 0   → false


----------------------------------------------------------
Difference Between size() and isEmpty()
----------------------------------------------------------

size()
→ Returns number of elements.

Example:
[10,20,30]

size() = 3


isEmpty()
→ Checks whether elements exist or not.

Example:
[]

isEmpty() = true


==========================================================
*/


public class ArrayList09 {

    public static void main(String[] args) {


        // ======================================================
        // Example 1 : Empty ArrayList
        // ======================================================

        ArrayList<Integer> numbers = new ArrayList<>();

        boolean result = numbers.isEmpty();

        System.out.println(result);



        // ======================================================
        // Example 2 : After Adding Elements
        // ======================================================

        ArrayList<Integer> numbers1 = new ArrayList<>();

        System.out.println(numbers1.isEmpty());


        numbers1.add(10);
        numbers1.add(20);


        System.out.println(numbers1);

        System.out.println(numbers1.isEmpty());



        // ======================================================
        // Example 3 : isEmpty() after remove()
        // ======================================================

        ArrayList<String> names = new ArrayList<>();


        System.out.println(names.isEmpty());


        names.add("Java");
        names.add("Python");


        System.out.println(names);

        System.out.println(names.isEmpty());


        names.remove(0);

        System.out.println(names);

        System.out.println(names.isEmpty());


        names.remove(0);

        System.out.println(names);

        System.out.println(names.isEmpty());


    }
}
