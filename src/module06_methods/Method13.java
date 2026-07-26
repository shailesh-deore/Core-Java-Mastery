package module06_methods;

public class Method13 {
    static int revNum(int n){
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        return  rev;
    }
    static void main(String[] args) {
        int res = revNum(10021);
        System.out.println(res);
    }
}
