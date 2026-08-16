package module10_collection.ArrayList;
import java.util.ArrayList;
public class ArrayList03 {
    /*
==========================================================
                ArrayList - get() Method
==========================================================

Definition:
-----------
get() is used to retrieve (read) an element from an
ArrayList using its index.

----------------------------------------------------------
Syntax
----------------------------------------------------------

list.get(index);

Example:
    list.get(0);

----------------------------------------------------------
Return Type
----------------------------------------------------------

Returns the element present at the specified index.

Example:
String fruit = list.get(1);
int num = numbers.get(2);

----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ get() uses index, NOT value.
✔ Index always starts from 0.
✔ Valid index range: 0 to size() - 1.
✔ get() only reads the element.
✔ It does NOT remove or modify the element.
✔ Invalid index throws IndexOutOfBoundsException.

----------------------------------------------------------
Quick Revision
----------------------------------------------------------

get(index)
→ Returns element at the given index.

==========================================================
*/
    public static void main(String[] args) {

        // Example 1 : Retrieving elements using get()

        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Kiwi");
        fruitList.add("Custard Apple");

        System.out.println(fruitList);

        System.out.println(fruitList.get(0)); // Mango
        System.out.println(fruitList.get(1)); // Banana
        System.out.println(fruitList.get(3)); // Kiwi

        // Index :  0        1       2       3       4
        // Value : Mango  Banana   Apple   Kiwi   Custard Apple



        // Example 2 : Another Example

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println(languages.get(2)); // C++

        // Index :  0      1       2
        // Value : Java  Python   C++


    }
}
