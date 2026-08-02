package module06_methods;

public class Method23 {
    public static double calculateAverage(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i ;
        }
        return (double)sum / arr.length;
}
    public static void main(String[] args) {
    int []a = {20,20,30,50,60};
     double res = calculateAverage(a);
        System.out.println(res);
    }
}
