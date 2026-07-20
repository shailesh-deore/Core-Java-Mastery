package module03_conditional;
import java.util.Scanner;
public class Conditional18 {
    static void main(String[] args) {

        //Console-Based Discount Calculator

        float discount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Amount : ");
        float itemPrice = sc.nextFloat();

        if (itemPrice >= 30000) {
            discount = itemPrice * 0.20f;
        } else if (itemPrice >= 20000) {
            discount = itemPrice * 0.10f;
        } else if (itemPrice >= 10000) {
            discount = itemPrice * 0.05f;
        } else {
            System.out.println("No discount applicable.");
        }

        System.out.println("Item Price = " + itemPrice);
        System.out.println("Discount = " + discount);
        System.out.println("Amount after discount = " + (itemPrice - discount));

        sc.close();

    }
}
