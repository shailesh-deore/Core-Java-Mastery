package module05_array;

public class Array13 {
    static void main(String[] args) {
        // traversing array 2D

        int[][] arr = {  // matrix
                //0 1 2 index
                {1, 2, 3}, // 0  row
                {4, 5, 6}, // 1  row
                {7, 8, 9}  // 2  row
        }; // array of array
        // use loop ok

        for (int i = 0 ; i < arr.length; i++){ // row
           // System.out.println(arr[i]); // no this is  not a traverse array for 2D ok
           for(int j = 0 ; j < arr.length; j++){ // column
               System.out.print(arr[i][j] +" ");
           }
            System.out.println();
        }
        // this is perfect traversing ok

        System.out.println();


        //we can create 2D array by indexing ok like 1D array

        int[][] arr1 = new int [3][3];
        arr1[0][0]=123;
        arr1[0][1]=122;
        arr1[0][2]=134;
        arr1[1][0]=190;
        arr1[1][1]=134;
        arr1[1][2]=126;
        arr1[2][0]=127;
        arr1[2][1]= 233;
        arr1[2][2]=187;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0 ; j < arr1.length; j++){
                System.out.print(arr1[i][j] +" ");
            }
            System.out.println();
        }
      // perfect we can create array through index ok


    }
}
