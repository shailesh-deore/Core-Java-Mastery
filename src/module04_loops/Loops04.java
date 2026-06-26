package module04_loops;

public class Loops04 {
    static void main(String[] args) {
        // for loop

        for(int j = 1; j <= 10 ; j++ ){
            System.out.println(j);

         // how it's going on :  first initialization  then check condition , then upgradation !
         // repeat cycle till condition is true , when condition is false then exit loop
        }

        // example
        /*1
          10
          100
          1000
          10000
        */
        // Golden Rule: Always understand your step logic on pen & paper first before typing code!

        // Example 1: Basic Exponential Jump Logic
        // Rule: Instead of i++, we can use multiplication to scale values dynamically.
        for (int i = 1; i <= 10000; i = i * 10) {
            System.out.println(i); // Output: 1, 10, 100, 1000, 10000
        }

        // Example 2: Simultaneous Multi-Variable Initialization & Upgradation !
        // Rule 1: We can declare multiple variables of the SAME type separated by commas.
        // Rule 2: We can update multiple variables separated by commas in the same line.
        for (int i = 1, j = 1; j <= 5; i = i * 10, j++) {
            System.out.println(i); // Output: 1, 10, 100, 1000, 10000 (Controlled cleanly by 'j' loop counter)
        }



    }
}
