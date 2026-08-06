package module07_recursion;

public class Recursion04 {
    // Method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base Case:
        // Fibonacci of 0 is 0
        // Fibonacci of 1 is 1
        if (n <= 1) {
            return n;
        }
        // Recursive Case:
        // Current Fibonacci number =
        // Fibonacci(n-1) + Fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {

        int n = 5;
        System.out.println("Fibonacci of " + n + " = " + fibonacci(n));
        // output:
        // Fibonacci of 5 = 5
    }
}
