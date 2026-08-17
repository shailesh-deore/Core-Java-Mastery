package module10_collection.ArrayList;
import java.util.ArrayList;

/*
==========================================================
                ArrayList - size() Method
==========================================================

Definition:
-----------
size() is used to find the number of elements currently
present in an ArrayList.

----------------------------------------------------------
Syntax
----------------------------------------------------------

list.size();

Example:
    marks.size();

----------------------------------------------------------
Return Type
----------------------------------------------------------

Returns:
    int

Example:
    int total = list.size();

----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ size() returns the current number of elements.
✔ Empty ArrayList size is 0.
✔ add() increases the size.
✔ remove() decreases the size.
✔ set() does not change the size.
✔ size() is different from array length.

----------------------------------------------------------
Quick Revision
----------------------------------------------------------

size()
→ Returns total number of elements in ArrayList.

==========================================================
*/

public class ArrayList06 {

    public static void main(String[] args) {


        // Example 1 : Finding ArrayList size

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(10);
        marks.add(20);
        marks.add(30);

        System.out.println(marks);

        System.out.println("Size : " + marks.size());



        // Example 2 : Size changes after add() and remove()

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Empty List : " + numbers);
        System.out.println("Size : " + numbers.size());


        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers);
        System.out.println("Size after add : " + numbers.size());


        numbers.remove(0);

        System.out.println(numbers);
        System.out.println("Size after remove : " + numbers.size());



        // Example 3 : remove() decreases size

        ArrayList<String> names = new ArrayList<>();

        names.add("A");
        names.add("B");
        names.add("C");

        System.out.println("Before remove size : " + names.size());

        names.remove(1);

        System.out.println("After remove size : " + names.size());
    }
}
