package module03_conditional;

import java.util.Scanner;

public class Conditional13 {
    static void main(String[] args) {

        // grade calculator
        // build it by itself from Scratch !

        Scanner sc = new Scanner(System.in);
        System.out.println("Pls Enter A Valid Marks For Checking Your Grade : ");
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100){
            System.out.println("Your Marks " +marks+ " is Invalid ");

        } else if (marks >= 90) {
            System.out.println("Your Marks " +marks+ " Grade : A Excellent ");

        } else if (marks >= 75) {
            System.out.println("Your Marks " +marks+ " Grade : B Good ");

        }else if (marks >= 60) {
            System.out.println("Your Marks " +marks+ " Grade : C  Average ");

        } else if (marks >= 35) {
            System.out.println("Your Marks " +marks+ " Grade : D Need Improvement ok");

        }else {
            System.out.println("You Failed !");
        }

        sc.close();

    }
}
