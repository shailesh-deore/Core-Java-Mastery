package module10_collection.ArrayList;
import java.util.ArrayList;
/*
==========================================================
                ArrayList - add() Method
==========================================================

Definition:
-----------
add() is used to insert (add) an element into an ArrayList.

----------------------------------------------------------
1. add(E element)
----------------------------------------------------------

Syntax:
    list.add(element);

Purpose:
✔ Adds the element at the END of the ArrayList.

Return Type:
✔ boolean
✔ Normally returns true.

Example:
    list.add(10);

----------------------------------------------------------
2. add(int index, E element)
----------------------------------------------------------

Syntax:
    list.add(index, element);

Purpose:
✔ Inserts an element at the specified index.
✔ Existing elements automatically shift to the right.

Return Type:
✔ void

Example:
    list.add(2, 30);

----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ ArrayList stores Objects only.
✔ Use Wrapper Classes (Integer, Double, Character, etc.).
✔ add(element) → Adds at the END.
✔ add(index, element) → Inserts at a specific position.
✔ ArrayList automatically shifts elements when inserting.

----------------------------------------------------------
Quick Revision
----------------------------------------------------------

add(E element)
→ End insertion

add(index, element)
→ Insert at specific index

==========================================================
*/
public class ArrayList02 {
    public static void main(String[] args) {


        // ==========================================================
        // Example 1 : add(E element)
        // Adds elements at the END of the ArrayList.
        // ==========================================================

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);

        // Output:
        // [10, 20, 30, 40]



        // ==========================================================
        // Example 2 : Return type of add(E element)
        // ==========================================================

        ArrayList<String> names = new ArrayList<>();

        boolean result = names.add("Shailesh");

        System.out.println(result);

        // Output:
        // true



        // ==========================================================
        // Example 3 : String ArrayList
        // ==========================================================

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Plum");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");

        System.out.println(fruits);



        // ==========================================================
        // Example 4 : Double ArrayList
        // ==========================================================

        ArrayList<Double> prices = new ArrayList<>();

        prices.add(222.45);
        prices.add(223.08);
        prices.add(221.49);

        System.out.println(prices);



        // ==========================================================
        // Example 5 : Character ArrayList
        // ==========================================================

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('Q');
        chars.add('@');
        chars.add('Y');
        chars.add((char) 64);

        System.out.println(chars);



        // ==========================================================
        // Example 6 : Empty ArrayList
        // ==========================================================

        ArrayList<Double> emptyList = new ArrayList<>();

        System.out.println(emptyList);

        // Output:
        // []



        // ==========================================================
        // Example 7 : add(index, element)
        // Insert at a specific position.
        // ==========================================================

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);

        // Before:
        // [10, 20, 40, 50, 60]

        list.add(2, 30);

        System.out.println(list);

        // After:
        // [10, 20, 30, 40, 50, 60]



        // ==========================================================
        // Example 8 : add(index, element) with String
        // ==========================================================

        ArrayList<String> employeeNames = new ArrayList<>();

        employeeNames.add("Shailesh");
        employeeNames.add("Deore");

        System.out.println(employeeNames);

        employeeNames.add(1, "Parmeshwar");

        System.out.println(employeeNames);

        // Output:
        // [Shailesh, Parmeshwar, Deore]



        // ==========================================================
        // Example 9 : Insert at Last Index
        // ==========================================================

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(10);
        marks.add(20);
        marks.add(30);

        marks.add(3, 100);

        System.out.println(marks);

        // Output:
        // [10, 20, 30, 100]

    }
}
