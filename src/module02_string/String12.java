package module02_string;

public class String12 {
    static void main(String[] args) {

        // STRING METHOD 9: contains()

        // Rule 1: It checks if a specific sequence of characters exists inside the string.
        // Rule 2: It is strictly case-sensitive.
        // Rule 3: It returns a boolean value (true or false).

        // Example 1: Checking for a single character
        String name = "Sunny";
        boolean u = name.contains("u");
        System.out.println(u); // Output: true

        // Example 2: Checking for a full matching word
        String name1 = "raj patil";
        String name2 = "raj";
        System.out.println(name1.contains(name2)); // Output: true

        // Example 3: Checking for a character inside a sentence
        String name3 = "raj patil";
        String name4 = "p";
        System.out.println(name3.contains(name4)); // Output: true


    }
}
