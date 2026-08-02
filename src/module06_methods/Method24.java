package module06_methods;

public class Method24 {
    public static int countOdd(int[] arr){
         int count = 0;
         for(int i : arr){
             if(i % 2 != 0){
                 count++;
             }
         }
         return count;
    }
    static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        int res = countOdd(arr);
        System.out.println(res);
    }
}
