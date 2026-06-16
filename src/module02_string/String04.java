package module02_string;

public class String04 {
    static void main(String[] args) {

        // STRING METHOD 1: length()

        // Rule: By using the dot (.) operator, we can access all String methods.
        // Definition: length() calculates and returns the total number of characters in a string.
        // Important: It counts empty spaces (blank spaces) as full characters too!

        // Example 1: Basic Word Counting
        String name = "raj";
        int length = name.length();
        System.out.println(length); // Output: 3

        // Example 2: Counting Word with Empty Spaces
        String Name = "Akshit sharma";
        int length1 = Name.length();
        System.out.println(length1); // Output: 13 (The space between words is counted)

        //Why we use (length - 1)

        // Rule: Human counting (Length) starts from 1, but Java counting (Index) starts from 0.
        // Problem: If string length is 3, the characters are sits at index 0, 1, and 2.
        //          There is NO index 3! So name.charAt(length) will always CRASH your code.
        // Solution: To get the absolute last character safely, always use: length - 1.

        int lastIndex = length - 1; // For "raj", 3 - 1 = Index 2
        System.out.println(name.charAt(lastIndex)); // Output: j (The last character)

    }
}
