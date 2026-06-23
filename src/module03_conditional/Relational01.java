package module03_conditional;

public class Relational01 {
    static void main(String[] args) {

        // RELATIONAL OPERATORS (COMPARISON)

        // Rule 1: Used to compare two values.
        // Rule 2: They ALWAYS return a boolean result (true or false).
        // Definition: Relational operators compare two values and produce a Boolean Expression (true/false) [INDEX].
        // Purpose: We use them to make decisions in code by checking conditions like size, equality, or range [INDEX].


        int n1 = 7, n2 = 8;
        System.out.println(n1 > n2);  // Output: false (7 is greater than 8)
        System.out.println(n1 < n2);  // Output: true  (7 is less than 8)


        // '==' Operator: Checks if two values are exactly equal

        int a = 1, b = 2;
        System.out.println(a == b);     // Output: false (1 is not equal to 2)
        System.out.println(a == b / 2); // Output: true  (2 / 2 = 1. So, 1 == 1 is true)

        // '!=' Operator: Checks if two values are NOT equal

        int num1 = 5, num2 = 6;
        System.out.println(num1 != num2); // Output: true (5 is indeed not equal to 6)


        // '<=' and '>=' Operators: Less than/Greater than or equal to

        System.out.println(num1 <= num2); // Output: true  (5 is less than or equal to 6)
        System.out.println(num1 >= num2); // Output: false (5 is not greater than or equal to 6)


        // Character Comparison: Uses underlying ASCII values

        char char1 = 'z';
        char char2 = 'a';
        boolean result = 'z' > 'a'; // Evaluates as: 122 > 97
        System.out.println(result); // Output: true

        System.out.println('z' + 0); // Output: 122 (For checking ASCII)
        System.out.println('a' + 0); // Output: 97  (For checking ASCII)


        // String Memory Comparison Trap using '=='

        String str1 = "pool";
        String str2 = "pool";
        String str3 = new String("pool");

        // Rule: Reuses the same memory address inside the String Constant Pool (SCP).
        System.out.println(str1 == str2); // Output: true

        // Rule: 'new' keyword forces a brand-new object creation outside the pool in the Heap area.
        System.out.println(str1 == str3); // Output: false


    }
}
