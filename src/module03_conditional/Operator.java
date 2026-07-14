package module03_conditional;
import java.util.Scanner;
public class Operator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Are you an Indian citizen? (true/false): ");
        boolean citizen = sc.nextBoolean();

        System.out.println("\n------ RESULT ------");

        // Relational Operators
        System.out.println("Age is 18 or above: " + (age >= 18));
        System.out.println("Marks are 60 or above: " + (marks >= 60));
        System.out.println("Marks are exactly 100: " + (marks == 100));
        System.out.println("Age is not 18: " + (age != 18));

        // Logical AND (&&)
        System.out.println("Eligible (Age >= 18 AND Marks >= 60): "
                + (age >= 18 && marks >= 60));

        // Logical OR (||)
        System.out.println("Can apply (Age >= 18 OR Citizen): "
                + (age >= 18 || citizen));

        // Logical NOT (!)
        System.out.println("Citizen is false: " + (!citizen));

        // Mixed Example
        System.out.println("Eligible (Age >= 18 AND Marks >= 60 AND Citizen): "
                + (age >= 18 && marks >= 60 && citizen));

        // Another Mixed Example
        System.out.println("Needs improvement: " + !(marks >= 60));

        sc.close();
    }
}
