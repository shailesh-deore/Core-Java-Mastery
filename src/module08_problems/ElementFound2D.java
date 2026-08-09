package module08_problems;

public class ElementFound2D {
    static void main(String[] args) {
        // Search an element in a 2D array

        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int target = 50;
        boolean found = false;

        for (int i = 0; i < arr.length && !found; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {
                    found = true;
                    System.out.println("Element Found!");
                    // Print the row and column where the element is found.
                    System.out.println("Element Found at Row = " + i + ", Column = " + j);
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Element Not Found!");
        }
    }
}
