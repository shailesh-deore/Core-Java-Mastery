package module03_conditional;

import java.util.Scanner;

public class Conditional12 {
    static void main(String[] args) {

        // console base small num check app .
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter a number 2 : ");
        int n2 = sc.nextInt();

        if (n1 == n2){
            System.out.println("Sorry ! number should be different . Try again !");
        } else if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);

        }else {
            System.out.println(n2 + " is greater than " + n1);
        }

    }
}
