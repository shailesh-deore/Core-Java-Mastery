package module06_methods;
import java.util.Scanner;

public class Method14 {

    // Check whether a number is Prime or Not
    static boolean isPrime(int n) {
        // Prime numbers are always greater than 1
        if (n <= 1) {
            return false;
        }
        // Check every possible divisor from 2 to n-1
        for (int i = 2; i < n; i++) {

            // If number is completely divisible,
            // an extra factor is found, so it is NOT prime
            if (n % i == 0) {
                return false;
            }
        }

        // No extra factor found,
        // so the number is Prime
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter a number to check Prime or Not : ");
        int n = in.nextInt();

        // Call method and print result
        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
