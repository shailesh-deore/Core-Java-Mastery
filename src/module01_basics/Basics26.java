package module01_basics;

public class Basics26 {
    static void main(String[] args) {
        //revision
        // Left shift bitwise opr <<

        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        int result = a << 1;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));

        //Right shift bitwise opr <<
        int b = 5;
        System.out.println(Integer.toBinaryString(b));
        int result1 = b >> 1;
        System.out.println(result1);
        System.out.println(Integer.toBinaryString(result1));

        System.out.println();



        int bits = 5 & 3;
        System.out.println(bits);
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(3));





    }
}
