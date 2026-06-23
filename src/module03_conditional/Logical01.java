package module03_conditional;

public class Logical01 {
    static void main(String[] args) {

        // LOGICAL OPERATORS

        // Definition: Used to combine two or more boolean conditions together.

        // && -> Logical AND (Returns true ONLY if both sides are true)
        // || -> Logical OR  (Returns true if at least one side is true)
        // !  -> Logical NOT (Inverts/flips the boolean value completely)


        // 1) Logical AND (&&): Both conditions must match

        int passingMarks = 33;
        int RamMark = 35;
        int RamAge = 18;
        System.out.println(RamMark >= passingMarks && RamAge >= 18);
        // Output: true (Both conditions are true, so final answer is true)


        // 2) Logical OR (||): At least one condition must match

        int passingMarks1 = 33;
        int RamMark1 = 35;
        int RamAge1 = 13;
        System.out.println(RamMark1 >= passingMarks1 || RamAge1 >= 18);
        // Output: true (One condition is true, so it returns true)

        // Real-world Company Requirement Example:
        String name = "ram";
        int exp = 2;
        boolean tier1 = true; // Candidate detail
        boolean cond1 = exp >= 5;

        System.out.println(cond1 || tier1);
        // Output: true (Candidate is from Tier 1, so criteria matches)


        // 3) Logical NOT (!): Flips the absolute value

        boolean isUserLoggedIn = false;
        System.out.println(!isUserLoggedIn);
        // Output: true (It flips false to true. Read as: "User is NOT logged in")

        // Basic Boolean Truth Table Tracing

        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // Output: false (Both are not true)

        boolean a1 = true;
        boolean b2 = false;
        System.out.println(a || b); // Output: true (At least one is true)


        // Example: Combining two evaluated relational comparisons

        boolean a3 = 2 < 1;  // Evaluates to false (2 is not less than 1)
        boolean b3 = 1 <= 3; // Evaluates to true  (1 is less than or equal to 3)
        System.out.println(a3 || b3); // Output: true (Because OR operator needs only one true to pass)


        // Relational Operands: Accept Numbers (int, float) and Characters (char) to compare sizes.
        // Logical Operands: Accept ONLY Boolean values (true, false, or boolean expressions) to combine conditions.



    }

}
