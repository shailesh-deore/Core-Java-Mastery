package module03_conditional;

import java.util.Scanner;

public class Conditional14 {
    static void main(String[] args) {

        // ATM withdrawal system ok 
        // build by me

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter Withdrawal Amount: ");
        int withdrawalAmount = sc.nextInt();

        if (balance <= 0) {
            System.out.println("Invalid Account Balance.");

        } else if (withdrawalAmount <= 0) {
            System.out.println("Invalid Withdrawal Amount.");

        } else if (withdrawalAmount % 100 != 0) {
            System.out.println("Withdrawal Amount must be a multiple of 100.");

        } else if (withdrawalAmount > balance) {
            System.out.println("Insufficient Balance.");

        } else {
            System.out.println("Withdrawal Successful.");
            System.out.println("Amount Withdrawn : " + withdrawalAmount);
            System.out.println("Remaining Balance: " + (balance - withdrawalAmount));
        }

        sc.close();


    }
}
