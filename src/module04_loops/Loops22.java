package module04_loops;

import java.util.Scanner;

public class Loops22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);

        int evenCount = 0;
        int oddCount = 0;

        if (num == 0) {
            evenCount = 1;
        }

        while (num > 0) {

            int digit = num % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num = num / 10;
        }

        System.out.println("Even digits = " + evenCount);
        System.out.println("Odd digits = " + oddCount);

        sc.close();
    }
}