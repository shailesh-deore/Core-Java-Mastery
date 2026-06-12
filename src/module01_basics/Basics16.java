package module01_basics;

public class Basics16 {
    static void main(String[] args) {

        // Example 6: Complex Float Calculation
        // Rule: Solve brackets first, then go Left-to-Right for (*) and (/)
        float x = 1.5f, y = 2.5f, z = 3.5f;
        float complexCalculation = (x + y) * (x - y) / (x + z);

        // Step 1 (Solve all brackets):
        // (1.5 + 2.5) = 4.0
        // (1.5 - 2.5) = -1.0
        // (1.5 + 3.5) = 5.0
        // Equation becomes: 4.0 * -1.0 / 5.0

        // Step 2 (Multiply - Leftmost first): 4.0 * -1.0 = -4.0
        // Step 3 (Divide - Final step): -4.0 / 5.0 = -0.8

        System.out.println(complexCalculation); // Output: -0.8




    }
}