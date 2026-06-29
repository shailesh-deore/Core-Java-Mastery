package module05_array;

public class Array02 {
    static void main(String[] args) {
       /*
        int[] arr = new int [10];
        System.out.println(arr); // [I@27716f4
       */

        int[] arr = new int [10];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);
        System.out.println(arr[8]);
        System.out.println(arr[9]);
        // manually traversing array without assigning value this is empty .

        System.out.println();

       int[] arr1 = new int [10];
       arr1[0]=12; // assign value at index of array
       arr1[1]=45;
       arr1[4]=89;
       arr1[7]=87;

       //we can print them
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        System.out.println(arr1[5]);
        System.out.println(arr1[6]);
        System.out.println(arr1[7]);
        System.out.println(arr1[8]);
        System.out.println(arr1[9]);
      // ok clear concept automatically

      // this is boring and repetitive task pls use loop for print arrays values .

        int[] arr3 = new int [10];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for(int  i = 0; i < 10 ; i++){ // but this is hardcode, we can use length of array for printing length

            System.out.println(arr[i]);
        }

        System.out.println();

        int[] arr4 = new int[20]; // this size can be another like 100 , 200, etc
        arr4[0]=10;
        arr4[1]=20;
        arr4[2]=30;
        arr4[3]=40;
        arr4[4]=50;
        arr4[5]=60;
        for(int i = 0 ; i < arr.length; i++){ // one point in mind this is not method ok ( arr.length ) this is an array properties ok
            System.out.println(arr[i]);
        }

    }
}
