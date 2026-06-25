package module04_loops;

public class Loops03 {
    static void main(String[] args) {

        // THE FOR LOOP (Counter-Controlled Engine)

        // Rule 1: Used in 99% of real-world production cases when iteration limits are fixed.
        // Rule 2: All 3 mandatory pillars (Start, Checkpoint, Step) live inside a single line.
        // Rule 3: Scope Control -> Variables created inside the loop line die when the loop ends.

        // Standard Structure Template:
        // for (initialization ; condition ; upgradation) {
        //     // Reusable code execution block
        // }


        //  THE COMFORT COMPARISON: while vs for

        // Approach A: The while layout (Scattered all over the file)
        int i1 = 1;
        while (i1 <= 10) {
            System.out.println(i1);
            i1++;
        }

        // Approach B: The for layout (Clean, single-line, and self-contained)
        // Note: 'i' is locked inside this loop block scope only.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // Output: Prints 1 to 10 cleanly



        }
    }
}