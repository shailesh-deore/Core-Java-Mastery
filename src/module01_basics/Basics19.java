package module01_basics;

public class Basics19 {
    static void main(String[]args) {

        //System.out.print(value);

        // Rule 1: It prints data but does NOT move the cursor to the next line.
        System.out.print("Hello World");
        System.out.print("Hello World2");

        // Output: Hello WorldHello World2

        // Rule 2: It can print different types of data:
        System.out.print(10);       // int value
        System.out.print(3.14);     // double value
        System.out.print('A');      // char value
        System.out.print("Java");   // String value
        System.out.print(true);     // boolean value

        // Rule 3: Calling print() completely empty is invalid!
        // It always requires a value inside the brackets.
        // System.out.print();   // Compile-Time Error

        // Syntax:
        // System.out.print(value);

    }
}
