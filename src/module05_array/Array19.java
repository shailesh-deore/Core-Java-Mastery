package module05_array;

import java.util.Scanner;

public class Array19 {
    static void main(String[] args) {

        // found element using= user input ok
        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Target element ok : ");
        int userInput = sc.nextInt();

        boolean found = false;

        for (int num : arr) {
            if (num == userInput) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
