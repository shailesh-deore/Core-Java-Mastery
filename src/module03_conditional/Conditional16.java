package module03_conditional;
import java.util.Scanner;

public class Conditional16 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        double bonus;

        if (salary < 20000) {
            bonus = salary * 0.05;
        } else if (salary <= 50000) {
            bonus = salary * 0.10;
        } else if (salary <= 100000) {
            bonus = salary * 0.15;
        } else {
            bonus = salary * 0.20;
        }

        System.out.println("Bonus = " + bonus);
        System.out.println("Total Salary = " + (salary + bonus));

        sc.close();

    }
}
