package module02_string;

public class String06 {
    static void main(String[]args){

        // STRING METHOD 3: equals() & equalsIgnoreCase()

        // Rule 1: Never use '==' to compare text inside Strings.
        // '==' only checks if they point to the same memory location.
        // Rule 2: Always use '.equals()' to check if the actual spelling/content matches.
        // Rule 3: These methods return a boolean value (true or false).

        // Example 1: Comparing Different Spellings
        String name = "shailesh";
        String nameAnother = "shailendra";
        boolean equals = name.equals(nameAnother);
        System.out.println(equals); // Output: false

        // Example 2: The Space Trap (Spaces are characters too!)
        String name2 = "tarun";
        String name3 = "tarun "; // Notice the blank space at the end
        System.out.println(name2.equals(name3)); // Output: false

        // Example 3: Case-Insensitive Comparison (Massive Industry Use)
        // Rule: .equalsIgnoreCase() ignores Capital vs Small letter differences.
        String name4 = "Tarun";
        String name5 = "tarun";
        System.out.println(name4.equalsIgnoreCase(name5)); // Output: true


        // THE NULL TRAP: Safe Equality Rule

        String userWord = null;
        // Fails: userWord.equals("admin"); (Crashes with NullPointerException)
        // Works: Always put the fixed text FIRST to prevent crashes
        System.out.println("admin".equals(userWord)); // Output: false

        // example for empty String
        String userWord2 = null;
        String name6 = "admin";
        System.out.println("Admin".equalsIgnoreCase(name6));


    }
}
