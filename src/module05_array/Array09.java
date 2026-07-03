package module05_array;

public class Array09 {
    static void main(String[] args) {
        // reverse array

        int[] arr1 = {10,20,30,40,50,60,70,80,90,100};
        for(int i = arr1.length-1 ; i >= 0; i--){
            System.out.println(arr1[i]);
        }

        System.out.println();
        // REVERSE ARRAY ITERATION (Right-to-Left Loop)

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Total length = 10

        // THE REVERSE LOGIC EXPLANATION:
        // 1. Start Point (i = arr.length - 1) -> Points exactly to the last valid slot (Index 9).
        // 2. Checkpoint (i >= 0) -> Keeps the loop running until it reaches the very first slot (Index 0).
        // 3. Step (i--) -> Forces the counter to step backward from right to left after each print.

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]); // Output: Prints 100, 90, 80... down to 10
        }




    }
}
