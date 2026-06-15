package module02_string;

public class String02 {
    static void main(String[] args) {

        // TWO WAYS TO CREATE A STRING OBJECT

        // Way 1: Using the 'new' keyword (Standard Object Creation)
        String address = new String("India");

        // Way 2: Using a String Literal (Shortcut Feature)
        String name = "vipul";
        // Meaning: Java provides a special feature to create Strings directly.
        // It lets you declare text values easily, just like a primitive data type.



        // CORE STRING THEORY

        // 1. Definition: A sequence of characters in double quotes ("").
        // 2. Class Nature: It is a Non-Primitive type and a built-in Class.
        // 3. Immutability: Once created, String text CANNOT be changed.
        // 4. Methods Rule: All methods return a BRAND-NEW string object.

        // MEMORY & COMPARISON RULES


       // 1. SCP Pool: Java saves memory by reusing identical text literals.
       // 2. '==' Sign: Only compares memory addresses, not spelling.
       // 3. '.equals()': Compares the actual text spelling and content.



    }
}
