package module01_basics;

public class Basics14 {
    static void main(String[] args) {

        // COMPOUND ASSIGNMENT OPERATORS (Shorthand Shortcuts)
        // Basic Way: Changing a variable manually
        int a = 10;
        a = a + 1;
        System.out.println(a); // Output: 11

        // Corporate Way: Using shorthand operators instead

        // 1. Plus Assignment (+=)
        int b = 10;
        b += 1;                // Same as: b = b + 1
        System.out.println(b); // Output: 11

        // 2. Minus Assignment (-=)
        int b1 = 10;
        b1 -= 1;               // Same as: b1 = b1 - 1
        System.out.println(b1); // Output: 9

        // 3. Multiply Assignment (*=)
        int b2 = 10;
        b2 *= 2;               // Same as: b2 = b2 * 2
        System.out.println(b2); // Output: 20

        // 4. Divide Assignment (/=)
        int b3 = 10;
        b3 /= 2;               // Same as: b3 = b3 / 2
        System.out.println(b3); // Output: 5

        // 5. Modulus/Remainder Assignment (%=)
        int b4 = 10;
        b4 %= 2;               // Same as: b4 = b4 % 2 (10 divided by 2 leaves 0 remainder)
        System.out.println(b4); // Output: 0



        // HIDDEN INTERVIEW RULE: Compound operators do automatic type casting
        byte smallNum = 10;
        // Fails: smallNum = smallNum + 5; (Error: cannot convert int to byte)

        // Works: Compound operator automatically adds the (byte) cast behind the scenes
        smallNum += 5; // Same as: smallNum = (byte)(smallNum + 5);
        System.out.println(smallNum); // Output: 15





    }
}
