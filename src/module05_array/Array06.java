package module05_array;

public class Array06 {
    static void main(String[] args) {
        // instead of for loop we can use for-each loop ok
        // this easy to write ,not complex

        // THE ENHANCED FOR LOOP (for-each)

        // 1. Definition: A cleaner way to read every element of an array from start to finish.
        // 2. Syntax Style: for (dataType variable : arrayName) { ... }

        int[] scores = {10, 20, 30, 40};

        // Example: Reading data without using any index counter 'i'
        for (int x : scores) {
            System.out.println(x); // Output: Prints 10, 20, 30, 40 line by line
        }

        System.out.println();

        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        for(int i : arr){
            System.out.println(i);
        }



    }
}
