package module10_collection.ArrayList;

import java.util.ArrayList;

public class ArrayList15{
    public static void main(String[] args) {
        // 1. Create an ArrayList of Names
        ArrayList<String> names = new ArrayList<>();

        // 2. Add names to the list
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        System.out.println("Original names: " + names);

        // 3. Change a name (Update)
        names.set(1, "Alex"); // Changes "Alice" to "Alex"
        System.out.println("After update: " + names);

        // 4. Check if the list is empty
        System.out.println("Is list empty? " + names.isEmpty());

        // 5. Print names one by one using a loop
        System.out.println("\nPrinting names one by one:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
