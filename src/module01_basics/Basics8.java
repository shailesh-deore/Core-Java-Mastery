package module01_basics;

public class Basics8 {
    public static void main(String[] args) {

        // Naming convention - variable
        // A variable is like a labeled box. You put data inside it, and you can change that data later

        // Rule 1: Variable names are case-sensitive
        int amount = 1000;
        int Amount = 8000;
        // Both are different variable names

        // Rule 2: We can use letters, numbers, underscores (_), and dollar signs ($) only.
        // Must begin with a letter, dollar sign ($), or underscore (_)
        int salary_Amount = 20000;
        double salary$ = 2332.8858;
        float mySalary12 = 1232.232f;

        System.out.println(salary_Amount);
        System.out.println(salary$);
        System.out.println(mySalary12);

        // Can't use characters like %, &, *, -, etc.
        // Don't start a variable name with digits
        // Like: int 23salary = 66777; // Invalid syntax

        // Rule 3: Can't use Java keywords as a variable name
        // Like: int class = 45; float public = 45.55f; // Invalid, reserved keywords

        // Rule 4: Ideal variable names in Java use (camelCase) format
        String myFullName = "Shailesh Deore";
        System.out.println(myFullName);

        int yourSalary = 45000;
        System.out.println("your salary is : " + yourSalary);

        // Make variable names meaningful
        // Make a sensible name, not random names like XXX
    }
}

