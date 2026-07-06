package module05_array;

public class PracticeArray {
    static void main(String[] args) {
        // find Largest element in give list ok

        int[] arr = {12, 45, 2, 67, 8};
        int  res = Integer.MIN_VALUE ; // agar -1 -134  yesa ho to 0 se kam wala isiliye ye liya ok nahi 0 bhi chalega
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] > res){
                 res = arr[i];
            }
        }
        System.out.println(res);


         // equality check ?
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        if (array1 == array2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        //  why not equal ?
        //The == operator compares memory locations, not the values inside.
        // Since array1 and array2 are created as two separate objects,
        // they live at different addresses in memory.



        int arr2[] = {2, 4, 6, 8};

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 6) {
                System.out.println("Found at index: " + i);
            }
        }


    }

}
