package module03_conditional;
import java.util.Scanner;
public class Switch02 {
    static void main(String[] args) {

        // ATM menu selection mechanism

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("           ATM MENU");
        System.out.println("=================================");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Mini Statement");
        System.out.println("5. Change PIN");
        System.out.println("6. Exit");
        System.out.println("=================================");

        System.out.print("Enter Your Choice (1-6): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Check Balance Selected.");
                System.out.println("Your Current Balance is ₹25,000.");
                break;

            case 2:
                System.out.println("Deposit Money Selected.");
                break;

            case 3:
                System.out.println("Withdraw Money Selected.");
                break;

            case 4:
                System.out.println("Mini Statement Selected.");
                break;

            case 5:
                System.out.println("Change PIN Selected.");
                break;

            case 6:
                System.out.println("Thank You for Using Our ATM.");
                System.out.println("Visit Again!");
                break;

            default:
                System.out.println("Invalid Choice!");
                System.out.println("Please Select Between 1 and 6.");
        }

        sc.close();
    }
}
