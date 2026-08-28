package module04_loops;

import java.util.Scanner;

public class Loops23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            int result = num * i;

            if (result % 2 == 0) {
                System.out.println(num + " x " + i + " = " + result + " (Even)");
            } else {
                System.out.println(num + " x " + i + " = " + result + " (Odd)");
            }
        }


        sc.close();

    }
}
