package module03_conditional;

import java.util.Scanner;

public class Conditional15 {
    static void main(String[] args) {

        //Bank Loan Eligibility System
        // build by me

        final int age;
        final int monthlySalary;
        final int creditScore;
        final int targetSalary = 25000;
        final int targetCredit = 700;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Enter a your monthly salary carefully : ");
        monthlySalary = sc.nextInt();
        System.out.println("Enter your valid credit score : ");
        creditScore = sc.nextInt();

        if(age < 21){
            System.out.println("Status : Loan rejected !");
            System.out.println("Reason : Age should be at least 21.");

        } else if (monthlySalary < targetSalary) {
            System.out.println("Status : Loan rejected !");
            System.out.println("Reason : salary should be at least " +targetSalary);

        } else if (creditScore < targetCredit) {
            System.out.println("Status : Loan rejected !");
            System.out.println("Reason : Credit score should be at least " +targetCredit);

        }else {
            System.out.println("Congratulations ! Loan Approved.");
        }

        sc.close();
    }
}
