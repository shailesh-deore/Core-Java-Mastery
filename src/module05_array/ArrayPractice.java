package module05_array;

public class ArrayPractice {
    static void main(String[] args) {
        // find maximum element in Array
        int[] arr = {-5, -2, -10, -8};
        int max = arr[0]; // Start with the first element

        for (int i = 1; i < arr.length; i++) { // Start loop from index 1
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max); // Correctly prints -2


        // sum of Array

        int[] sumOfArray = {1, 2, 3, 4, 5};
        int res = 0; // 0 से शुरू करें

        for(int i = 0 ; i < sumOfArray.length; i++){
            res += sumOfArray[i];
        }
        System.out.println(res); // अब सही आउटपुट आएगा: 15


        // multiply array with 2

        int[] arr1 = {1, 2, 3, 4, 5};

         // 1. लूप चलाकर सीधे एरे के अंदर ही वैल्यूज को डबल (Double) कर रहे हैं
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] * 2; // arr1[i] की पुरानी वैल्यू को 2 से गुणा करके वहीं स्टोर कर दिया
        }

        // 2. अब बदले हुए एरे को प्रिंट कर रहे हैं
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " "); // अब यह सही से 2 4 6 8 10 प्रिंट करेगा
        }



    }
}



