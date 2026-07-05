package module05_array;

public class Array16 {
    static void main(String[] args) {
        // Array practice

        int [] arr = new int [5];
        arr[0]=90;
        arr[1]=91;
        arr[2]=92;
        arr[3]=93;
        arr[4]=94;

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println();

        // array practice

        int[] array = {10,20,30,40,50,60,70,80,90,100};
        for(int i = array.length -1 ; i >= 0 ; i--)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        System.out.println();

        // 2D array : Array of Array
        int [][] arr1 = new int [5][5];

        arr1[0][0]=10;
        arr1[0][1]=20;
        arr1[0][2]=30;
        arr1[0][3]=40;
        arr1[0][4]=50;
        //
        arr1[1][0]=60;
        arr1[1][1]=70;
        arr1[1][2]=80;
        arr1[1][3]=90;
        arr1[1][4]=100;
        //
        arr1[2][0]=150;
        arr1[2][1]=200;
        arr1[2][2]=250;
        arr1[2][3]=300;
        arr1[2][4]=350;
        //
        arr1[3][0]=400;
        arr1[3][1]=450;
        arr1[3][2]=500;
        arr1[3][3]=550;
        arr1[3][4]=600;
        //
        arr1[4][0]=650;
        arr1[4][1]=700;
        arr1[4][2]=750;
        arr1[4][3]=800;
        arr1[4][4]=850;

        for(int i = 0 ; i < arr1.length; i++){
            for(int j = 0 ; j < arr1.length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
