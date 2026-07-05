package module05_array;

public class PracticeArray01 {
    static void main(String[] args) {

        // sum of array

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
    }

}