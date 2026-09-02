package module06_methods;

public class Method17 {

    static int sumOfArray(int[] arr){
        int res = 0 ;
        for(int x : arr){
            res += x;
        }
        return res;
    }
    private static String ToUpper(String str){
        return str.trim().toUpperCase();
    }
    public static void main(String[] args) {

        int[] a = {10,20,30};
        int [] b = {10,20,30,40,50};


        int res = sumOfArray(a);
        int res1 = sumOfArray(b);

        System.out.println(res);
        System.out.println(res1);

        System.out.println(ToUpper("  vipul   "));

    }
}
