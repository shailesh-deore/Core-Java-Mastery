package module08_problems;

public class SumOfElement2D {
    static void main(String[] args) {
        // sum of element 2D array
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
