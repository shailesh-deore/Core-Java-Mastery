package module07_recursion;

public class Recursion03 {
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}


// Explanation :
// Factorial using Recursion
 class RecursionExplanation01 {
    // Method to calculate factorial of a number
    public static int factorial(int n) {

        // Base Case:
        // When n becomes 1, stop the recursion.
        // Factorial of 1 is always 1.
        if (n == 1) {
            return 1;
        }

        // Recursive Case:
        // Current number (n) *
        // Factorial of the remaining number (n - 1)
        //
        // Example:
        // factorial(5)
        // = 5 * factorial(4)
        // = 5 * 4 * factorial(3)
        // = 5 * 4 * 3 * factorial(2)
        // = 5 * 4 * 3 * 2 * factorial(1)
        // = 5 * 4 * 3 * 2 * 1
        // = 120
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        // Calling the recursive method
        System.out.println(factorial(5));
        // Output:
        // 120
    }
}


