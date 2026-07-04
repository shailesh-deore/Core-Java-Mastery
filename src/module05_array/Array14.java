package module05_array;

public class Array14 {
    static void main(String[] args) {

        /*

         2D ARRAY (CHAR TYPE)


         Definition:
         2D Array = Array of arrays.
         It stores data in rows and columns.

         Syntax:
         datatype[][] arrayName = new datatype[rows][columns];

         Here:
         char[][] arr = new char[3][2];

         rows = 3
         columns = 2

         Means:
         3 rows and each row has 2 columns
        */


                // Step 1: Create 2D array
                char[][] arr = new char[3][2];

        /*
              Column Index
                0   1
        Row 0   A   B
        Row 1   C   D
        Row 2   E   F
        */

                // Step 2: Insert values
                arr[0][0] = 'A';
                arr[0][1] = 'B';

                arr[1][0] = 'C';
                arr[1][1] = 'D';

                arr[2][0] = 'E';
                arr[2][1] = 'F';

        /*
         Array now looks like:

         A B
         C D
         E F
        */


                // Step 3: Print using nested loops
                for (int i = 0; i < arr.length; i++) {

            /*
             Outer loop = Rows

             arr.length = 3
             So i runs:
             0 -> Row 0
             1 -> Row 1
             2 -> Row 2
            */

                    for (int j = 0; j < arr[i].length; j++) {

                /*
                 Inner loop = Columns

                 arr[i].length = columns in current row
                 Here every row has 2 columns

                 So j runs:
                 0
                 1
                */

                        System.out.print(arr[i][j] + " ");
                    }

                    // Move to next line after one row is printed
                    System.out.println();
                }

        /*
         Output:

         A B
         C D
         E F
        */


        /*
         Important Error You Mentioned:

         Index 2 out of bounds for length 2

         Why?

         Because column size = 2
         Valid indexes are only:
         0 and 1

         Wrong:
         j <= arr[i].length

         If length = 2,
         j becomes:
         0,1,2  (2 is invalid)

         Correct:
         j < arr[i].length

         Then j becomes:
         0,1 only
        */
            }
        }
        

