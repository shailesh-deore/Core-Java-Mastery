package module08_problems;

public class FindLarge2D {
    static void main(String[] args) {

        // find Large element using 2D array
        int[][] arr = {
                {10, 20, 30},
                {40, 100, 60},
                {70, 80, 90}
        };

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j< arr[i].length;j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
