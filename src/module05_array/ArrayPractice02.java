package module05_array;

public class ArrayPractice02 {
    static void main(String[] args) {
        // linear search in array ok
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = -1; // शुरुआत में मान लिया कि नहीं मिला

        for(int i = 0 ; i < arr.length; i++) {
            if (arr[i] == 7) {
                res = i; // बस यही बदलाव है! arr[i] (यानी 7) की जगह डिब्बे का नंबर (i) रख लिया।
            }
        }
        System.out.println("found with this index : " + res); // यह प्रिंट करेगा: 6


        }
    }

