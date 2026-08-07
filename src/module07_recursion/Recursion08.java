package module07_recursion;

public class Recursion08 {
    // recursion print reverse number
    public static  void  printNumberReverse(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumberReverse(n - 1);
    }
   public static void main(String[] args) {
        printNumberReverse(10);

      // Number badh raha hai (n + 1) ➜ Base case: n > limit
       //Number ghat raha hai (n - 1) ➜ Base case: n == 0 ya n == 1 (problem ke hisab se)
    }
}
