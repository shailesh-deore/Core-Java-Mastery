package module05_array;

public class Array10 {
    static void main(String[] args) {

        // sum of array
        int[] arr = {12,34,45,56,67,78,-1,-14,-18};
        // int sum = arr[0] + arr[1] + arr[2] + arr[3].... so on this is unusual ... very poor bad .
        // loops very important for skip repetition.
        int sum = 0;
        for (int i = 0 ; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);


        // using for-each loop

        int[] array = {10,20,30,30,50};
        int sumOfArray = 0;
        for(int i: array){
            sumOfArray += i;
        }
        System.out.println(sumOfArray);


    }
}
