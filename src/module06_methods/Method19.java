package module06_methods;

public class Method19 {
    public static int findMax(int[] arr){
        int res = Integer.MIN_VALUE; // negative infinity ok
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > res){
                res = arr[i];
            }
        } return res;
    }
   public static void main(String[] args) {

        int[] a = {10,20,30,-20,-50,50,-80};
        int m = findMax(a);
        System.out.println(m);
    }
}
