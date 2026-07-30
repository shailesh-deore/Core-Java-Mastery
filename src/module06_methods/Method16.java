package module06_methods;

public class Method16 {
    public static int sumArray(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;

        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int res =  sumArray(a);
        System.out.println(res);
    }
}
