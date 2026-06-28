package module04_loops;

public class Loops10 {
    static void main(String[] args) {

        // THE CONTINUE STATEMENT (Skip and Jump)
        // Rule 1: 'continue' skips the rest of the code inside the loop for the CURRENT cycle only.
        // Rule 2: It instantly jumps back up to the main condition check for the NEXT cycle.
        // Rule 3: Unlike 'break', it does NOT kill the loop; it only skips one specific step.

        int i = 1;
        while (i <= 10) {
            // THE SKIP TRIGGER:
            if (i == 5) {
                i++;      // MANDATORY SAFETY: Increments 'i' to 6 before jumping, so we don't get stuck at 5!
                continue; // Skips the Sout line below and forces Java to jump straight back to the while condition.
            }
            System.out.println(i); // Output: Prints 1, 2, 3, 4, (5 is skipped!), 6, 7, 8, 9, 10
            i++;
        }

    }
}
