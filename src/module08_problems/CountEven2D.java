package module08_problems;

public class CountEven2D {
    static void main(String[] args) {

        // count even number using 2D array
        int[][] arr = {
                {10, 21, 30},
                {41, 50, 61},
                {72, 83, 94}
        };
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length;j++){
                if(arr[i][j]%2==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
