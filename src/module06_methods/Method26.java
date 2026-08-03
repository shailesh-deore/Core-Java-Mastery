package module06_methods;

public class Method26 {

    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            // If current element is greater than the next element,
            // array is not sorted in ascending order.
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // All elements are in ascending order.
        return true;
    }

    public static void main(String[] args) {

        int[] a1 = {10, 20, 30, 40, 50};      // Sorted
        int[] a2 = {10, 24, 20, 43, 50};      // Not Sorted

        System.out.println(isSorted(a1));
        System.out.println(isSorted(a2));
    }
}
