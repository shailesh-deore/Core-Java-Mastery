package module05_array;

public class Array15 {
    static void main(String[] args) {

              /*
               JAGGED ARRAY IN JAVA

               Definition:
               Jagged Array = 2D array where each row can have
               different number of columns.

               Normal 2D Array:
               1 2 3
               4 5 6
               7 8 9
              (All rows same size)

              Jagged Array Example:
              A B
              C D D
              E F

              Row 0 -> 2 elements
              Row 1 -> 3 elements
              Row 2 -> 2 elements

              This uneven shape is called Jagged Array.
             */

                // Step 1: Create array with 3 rows
                char[][] arr = new char[3][];

                /*
                Here:
                3 = number of rows
                Column size not fixed yet
                Each row can have different length
               */

                // Step 2: Give each row different size
                arr[0] = new char[2]; // row 0 -> 2 columns
                arr[1] = new char[3]; // row 1 -> 3 columns
                arr[2] = new char[2]; // row 2 -> 2 columns

                // Step 3: Insert values
                arr[0][0] = 'A';
                arr[0][1] = 'B';

                arr[1][0] = 'C';
                arr[1][1] = 'D';
                arr[1][2] = 'D';

                arr[2][0] = 'E';
                arr[2][1] = 'F';

              /*
               Array now looks like:

                 A B
                 C D D
                 E F
              */

                // Step 4: Print jagged array
                for (int i = 0; i < arr.length; i++) {   // loop for rows

               /*
                 arr.length = total rows = 3
                i = 0,1,2
                */

                    for (int j = 0; j < arr[i].length; j++) { // loop for columns

                  /*
                 Important:
                 arr[i].length because every row
                 has different size.

                 arr[0].length = 2
                 arr[1].length = 3
                 arr[2].length = 2
                 */

                        System.out.print(arr[i][j] + " ");
                    }

                    // Move to next line after row complete
                    System.out.println();
                }

               /*
               Output:
               A B
               C D D
               E F
               */
            }
        }



