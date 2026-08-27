package module04_loops;

import java.util.Scanner;

public class Loops21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        System.out.print("Enter number 1: ");
        int greatest = sc.nextInt();

        for (int i = 2; i <= n; i++) {

            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num > greatest) {
                greatest = num;
            }
        }

        System.out.println("Greatest number = " + greatest);

        sc.close();
    }
}
