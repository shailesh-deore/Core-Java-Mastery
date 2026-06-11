package module01_basics;

public class Basics12 {
    static void main(String[] args) {

       // we cannot divide by Zero  (/)
        //ArithmeticException
        int a = 2;
        int b = a - 2; // zero
        int c = a/b;
        System.out.println(c);
        // divisor is zero then show error

        //similarly with  modulus(%)
        int a1 = 2 ;
        int b2 = a1 - 2;
        int c3 = a1%b2;
        System.out.println(c3);
        // remainder lene ke liye bhi divide ho rah hi hai internally
        //ArithmeticException



    }
}
