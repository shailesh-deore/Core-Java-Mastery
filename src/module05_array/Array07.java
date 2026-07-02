package module05_array;

public class Array07 {
    static void main(String[] args) {

        // search element in array !

        int[] arr = {10, 20,40,55,-3 ,-60, 23 ,60,-18 };
        for(int i : arr){
            if(i == 55){
                System.out.println("found ! ");
            }
        }


        // best implementation

        //LINEAR SEARCH: HANDLING THE "NOT FOUND" LOGIC

        int[] arr1 = {10, 20, 40, 55, -3, -60, 23, 60, -18};

        // Rule 1: Use a boolean flag variable outside the loop.
        // Rule 2: Assume the element is NOT found at the beginning (isFound = false).
        boolean isFound = false;

        for (int i : arr1) {
            if (i == 55) {
                isFound = true; // Flag changes to true because we found it!
                break;          // Stop searching immediately to save CPU cycles.
            }
        }

        // Rule 3: Check the status of the flag AFTER the loop finishes completely.
        if (isFound) {
            System.out.println("found ! ");
        } else {
            System.out.println("not found !");
        }



    }
}
