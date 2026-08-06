package module07_recursion;
//sum of n natural number Example 01 for better understanding of recursion ok
public class Recursion02 {
    public static  int sumOfNaturalNumbers(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
   public static void main(String[] args) {
       System.out.println(sumOfNaturalNumbers(5));

    }
}


// explanation :
// Sum of N Natural Numbers using Recursion
class RecursionExplanation {

    // Method to calculate the sum of first N natural numbers
    public static int sumOfNaturalNumbers(int n) {

        // Base Case:
        // When n becomes 0, stop the recursion.
        // Sum of first 0 natural numbers is 0.
        if (n == 0) {
            return 0;
        }

        // Recursive Case:
        // Current number (n) +
        // Sum of remaining numbers (n - 1)
        //
        // Example:
        // sum(5)
        // = 5 + sum(4)
        // = 5 + 4 + sum(3)
        // = 5 + 4 + 3 + sum(2)
        // = 5 + 4 + 3 + 2 + sum(1)
        // = 5 + 4 + 3 + 2 + 1 + sum(0)
        // = 5 + 4 + 3 + 2 + 1 + 0
        // = 15
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {

        // Calling the recursive method
        System.out.println(sumOfNaturalNumbers(5));
        // Output:
        // 15
    }
}


