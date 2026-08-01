package module06_methods;

public class Method20 {
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int x : arr) {
            if(x < min){
              min = x;
            }
        } return min ;
    }
    public static void main(String[] args) {
        int[] num = {10,20,40,-70,700,-8};
        int min = findMin(num);
        System.out.println(min);

    }
}
