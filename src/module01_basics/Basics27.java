package module01_basics;

public class Basics27 {
    static void main(String[] args) {

        // even odd using bitwise opr

        int number = 7;

        if ((number & 1) != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

    }
}
