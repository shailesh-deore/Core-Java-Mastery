package module07_recursion;

public class Recursion05 {

    // Method to calculate x^n using recursion
    public static int power(int x, int n) {

        // Base Case:
        // Any number raised to the power 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive Case:
        // x^n = x × x^(n-1)
        return x * power(x, n - 1);
    }
    public static void main(String[] args) {

        System.out.println(power(2, 5)); // 32
        System.out.println(power(3, 4)); // 81
        System.out.println(power(5, 3)); // 125
    }
}
