package module10_collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList14  {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. Add elements
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Original List: " + numbers);

        // 3. Sort the list (Smallest to Largest)
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // 4. Search for a number
        if (numbers.contains(30)) {
            System.out.println("Yes, 30 is in the list.");
        }

        // 5. Get list size
        System.out.println("Total numbers: " + numbers.size());
    }
}

