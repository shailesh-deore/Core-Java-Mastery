package module05_array;

public class Array04 {
    static void main(String[] args) {

        //  ARRAY CREATION STYLES & LOOP ITERATION

        // Approach 1: Empty Allocation (Creates 5 empty slots initialized to default 0)
        int[] arr = new int[5];

        // Approach 2: Direct Inline Literal Assignment
        int[] arr1 = {12, 23, 34, 34, 34};

        // Reading Array Elements Dynamically Using a Counter Loop

        int lengthOfArray = arr1.length; // Holds total size = 5 (Valid indices: 0, 1, 2, 3, 4)
        System.out.println(lengthOfArray); // Output: 5

        // Rule: Loop starts at 0 and must stay strictly LESS than length (i < 5)
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]); // Output: Prints 12, 23, 34, 34, 34 line by line
        }


    }
}
