package module06_methods;

public class Method25 {
    public static  void printReverse(int[] arr){
        for(int i = arr.length-1; i >= 0 ; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] a = {10,30,20,50,6};
        printReverse(a);
    }
}
