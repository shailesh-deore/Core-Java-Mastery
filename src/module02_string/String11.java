package module02_string;

public class String11 {
    static void main(String[]args){

        // STRING METHOD 8: replace() & METHOD CHAINING

        // Rule 1: It searches for a specific target text and replaces it with a new text.
        // Rule 2: It is dynamic! It will automatically replace ALL matching targets it finds.
        // Rule 3: Method Chaining -> You can link multiple string methods together in one single line.

        String name = "Amar panchal";

        // Example 1: Basic Word Replacement
        String replace = name.replace("panchal", "deore");
        System.out.println(replace); // Output: Amar deore

        // Example 2: Single Letter Replacement (Replaces all matching small 'a's)
        String replace1 = name.replace("a", "o");
        System.out.println(replace1); // Output: Amor ponchol

        // Example 3: Global Replacement (Replaces every single occurrence in the line)
        String name2 = "panchal Amar panchal panchal";
        String replace2 = name2.replace("panchal", "deore");
        System.out.println(replace2); // Output: deore Amar deore deore

        // Example 4: Method Chaining Feature (Massive Corporate Use)
        // Rule: Java executes left-to-right. First it replaces the text, then it capitalizes it.
        String replace3 = name.replace("panchal", "deore").toUpperCase();
        System.out.println(replace3); // Output: AMAR DEORE

    }
}
