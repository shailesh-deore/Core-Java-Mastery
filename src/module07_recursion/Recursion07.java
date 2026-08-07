package module07_recursion;

public class Recursion07 {

    // print num 1 to 10 using recursion ok
    public static void printNumbers(int n) {
        if (n > 10) {
            return;
        }
        System.out.println(n);
        printNumbers(n + 1);
    }

    public static void main(String[] args) {
        printNumbers(1);

         //Number badh raha hai (n + 1) ➜ Base case: n > limit
        //Number ghat raha hai (n - 1) ➜ Base case: n == 0 ya n == 1 (problem ke hisab se)
    }
}
