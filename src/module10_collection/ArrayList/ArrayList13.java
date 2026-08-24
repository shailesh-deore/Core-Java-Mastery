package module10_collection.ArrayList;

import java.util.ArrayList;

public class ArrayList13 {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements (Create)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // 3. Access an element (Read) - index starts at 0
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // 4. Update an element (Update)
        fruits.set(1, "Blueberry"); // Changes "Banana" to "Blueberry"

        // 5. Remove an element (Delete)
        fruits.remove(2); // Removes "Mango"

        // 6. Iterate / Loop through the ArrayList
        System.out.println("\nRemaining fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
    }
}

