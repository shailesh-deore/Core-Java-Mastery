package module06_methods;

public class Method11 {
    // factorial using method ok
    static int calculateFactorial(int n){
        int fact = 1;
        for(int i = 1; i <= n ; i++){
            fact *= i;
        }
        return fact;
    }
    static void main(String[] args) {
        int res = calculateFactorial(6);
        System.out.println(res);
    }

}
