package module06_methods;

public class Method21 {
    public static  int countEven(int [] arr){
        int count = 0;
        for(int i : arr){
            if(i%2 == 0){
               count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a=  {10, 15, 20, 25, 30};
        int res = countEven(a);
        System.out.println(res);
    }
}
