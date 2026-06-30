package module04_loops;

public class Loops13 {
    static void main(String[] args) {
        // pyramid pattern

        /*

           *
          ***
         *****
        *******
       *********

       */
                int n = 5; // Number of rows

                // Outer loop for rows
                for (int i = 1; i <= n; i++) {

                    // Inner loop 1: Print spaces
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }

                    // Inner loop 2: Print stars
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }

                    // Move to the next line
                    System.out.println();
                }
                    System.out.println();



            int n1 = 5;

             // Outer loop for rows
            for (int i = 1; i <= n1; i++) {

            // Inner loop 1: Print increasing spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Inner loop 2: Print decreasing stars
             for (int k = 1; k <= (2 * (n1 - i) + 1); k++) {
                System.out.print("*");
            }

             // Move to the next line
              System.out.println();
        }

           }
        }

