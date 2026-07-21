package module05_array;

public class Array21 {
    static void main(String[] args) {

        // String type array store languages

        String[][] arr = new String [2][2];

        arr[0][0]="Java";
        arr[0][1]="Python";
        arr[1][0]="C++";
        arr[1][1]="JavaScript";

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        /*
        Notice how only the data type changed.

        int[][] marks = new int[3][3];
        char[][] grades = new char[3][2];
        String[][] languages = new String[2][2];
        double[][] prices = new double[4][5];
        boolean[][] seats = new boolean[10][6];

        The syntax of a 2D array is always the same. Only the data type changes.
         */


    }
}
