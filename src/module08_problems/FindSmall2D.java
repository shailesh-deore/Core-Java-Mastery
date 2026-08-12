package module08_problems;

public class FindSmall2D {
    static void main(String[] args) {
        // Search an smallest  element in a 2D array

        int[][] arr = {
                {10, 20, 30},
                {40, -50, 60},
                {70, 80, 90}
        };
        int min = Integer.MAX_VALUE;

        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);


    }
}
