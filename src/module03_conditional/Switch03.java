package module03_conditional;
import java.util.Scanner;
public class Switch03 {
    static void main(String[] args) {

        // Restaurant Menu selection mechanism

        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("=========== RESTAURANT MENU ===========");
        System.out.println("1. Pizza      - ₹250");
        System.out.println("2. Burger     - ₹150");
        System.out.println("3. Sandwich   - ₹120");
        System.out.println("4. Coffee     - ₹80");
        System.out.println("5. Tea        - ₹30");
        System.out.println("=======================================");

        System.out.println("Enter A Choice Among 1 to 5: ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Item Selected : Pizza");
                System.out.println("Price         : ₹250");
                System.out.println("Thank You! Visit Again.");
                break;
            case 2:
                System.out.println("Item Selected : Burger");
                System.out.println("Price         : ₹150");
                System.out.println("Thank You! Visit Again.");
                break;
            case 3:
                System.out.println("Item Selected : Sandwich");
                System.out.println("Price         : ₹120");
                System.out.println("Thank You! Visit Again.");
                break;
            case 4:
                System.out.println("Item Selected : Coffee");
                System.out.println("Price         : ₹80");
                System.out.println("Thank You! Visit Again.");
                break;
            case 5:
                System.out.println("Item Selected : Tea");
                System.out.println("Price         : ₹30");
                System.out.println("Thank You! Visit Again.");
                break;
            default:
                System.out.println("Invalid choice");
                System.out.println("Try Again !");
        }

        sc.close();

    }
}
