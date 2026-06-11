package module01_basics;

public class Basics13 {
    static void main(String[] args) {
        //operator precedence

        // Example 1: Multiply (*) always happens before Plus (+)
        int a = 10;
        int b = a + 3 * 2;     // Step 1: 3 * 2 = 6  |  Step 2: 10 + 6 = 16
        System.out.println(b); // Output: 16

        // Example 2: Brackets () have the highest priority
        // If you want to add first, put it inside brackets
        int a1 = 10;
        int b1 = (a1 + 3) * 2; // Step 1: Solve bracket (10 + 3) = 13  |  Step 2: 13 * 2 = 26
        System.out.println(b1); // Output: 26

        // Example 3: Division (/) has higher priority than Plus (+)
        int n = 10, m = 5;
        int o = n / m + 3;     // Step 1: 10 / 5 = 2  |  Step 2: 2 + 3 = 5
        System.out.println(o); // Output: 5

        // Example 4: Division (/) and Multiply (*) have EQUAL priority.
        // Rule: When priority is equal, Java calculates from Left to Right.
        int x = 10, y = 5;
        int z = x / y * 3;     // Step 1: 10 / 5 = 2 (Leftmost first) | Step 2: 2 * 3 = 6
        System.out.println(o); // Output: 6

        // Example 5: High mix of operators (/, *, +, -)
        // Order: High priority (/, *) first from Left to Right, then (+, -) from Left to Right.
        int e = 10, f = 5;
        int g = e / f + 2 * 3 - 1;
        // Step 1 (Divide): 10 / 5 = 2   -> Equation becomes: 2 + 2 * 3 - 1
        // Step 2 (Multiply): 2 * 3 = 6  -> Equation becomes: 2 + 6 - 1
        // Step 3 (Plus): 2 + 6 = 8      -> Equation becomes: 8 - 1
        // Step 4 (Minus): 8 - 1 = 7     -> Final Result
        System.out.println(g); // Output: 7



    }
}
