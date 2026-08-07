package module07_recursion;

public class Recursion06 {

    // Method to reverse a string using recursion
    public static String reverse(String str) {

        // Base Case:
        // If the string is empty, return it.
        if (str.isEmpty()) {
            return "";
        }
        // Recursive Case:
        // Reverse the remaining string
        // then add the first character at the end.
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String text = "HELLO";

        System.out.println(reverse(text));
    }
}
