package module04_loops;

public class Loops09 {
    static void main(String[] args) {

        // THE BREAK STATEMENT (Force Loop Exit)
        // Rule 1: 'break' instantly stops the current loop completely .
        // Rule 2: It bypasses the main loop condition and jumps straight out of the curly braces {}

        int i = 0;

        while (i <= 100) {
            System.out.println(i); // Prints numbers from 0 to 60

            // THE BREAK TRIGGER:
            if (i == 60) {
                break; // Looks at 'break' -> terminates the loop instantly!
            }

            i++;
        }

        // RUNTIME SHORT TRACE (For Your Mindset)

        //  i = 0 to 59: Condition 'i == 60' is FALSE. Code prints 'i' and increments normally.
        //  i = 60: Condition 'i == 60' becomes TRUE .
        //  Execution: Java runs the 'break' statement inside the 'if' block.
        //  Result: The remaining numbers (61 to 100) are never checked or printed. Loop stops!

    }
}
