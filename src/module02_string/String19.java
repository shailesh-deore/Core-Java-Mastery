package module02_string;

public class String19 {

    public static void main(String[] args) {

        String text = "  Java Programming  ";

        // 1. Length - Counts characters
        System.out.println("Length: " + text.length()); // 20

        // 2. Trim - Removes blank spaces from start and end
        String cleanText = text.trim();
        System.out.println("Cleaned: '" + cleanText + "'"); // "Java Programming"

        // 3. Substring - Cuts a piece out of the string (from index 0 to 4)
        String word = cleanText.substring(0, 4);
        System.out.println("Piece: " + word); // "Java"

        // 4. Contains - Checks if a word is inside the text
        System.out.println("Has 'Pro'? " + cleanText.contains("Pro")); // true

        // 5. Replace - Swaps characters
        String newText = cleanText.replace("Java", "Python");
        System.out.println("Replaced: " + newText); // "Python Programming"

        // 6. Equals - Correct way to compare two strings
        System.out.println("Matches 'java'? " + word.equalsIgnoreCase("java")); // true
    }
}

