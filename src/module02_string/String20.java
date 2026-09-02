package module02_string;

public class String20 {
    public static void main(String[] args) {
        String word = "radar";

        // Reverse the word using StringBuilder
        String reversedWord = new StringBuilder(word).reverse().toString();

        // Simple if-else check
        if (word.equals(reversedWord)) {
            System.out.println("Unique! This word is a palindrome.");
        } else {
            System.out.println("Regular word. It is not a palindrome.");
        }

    }
}
