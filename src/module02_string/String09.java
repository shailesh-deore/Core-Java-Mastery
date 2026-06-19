package module02_string;

public class String09 {
    static void main(String[] args) {

        // STRING METHOD 6: toLowerCase() & toUpperCase()

        // Rule 1: toLowerCase() converts all capital letters into small letters.
        // Rule 2: toUpperCase() converts all small letters into capital letters.
        // Rule 3: Non-alphabet characters like numbers, symbols, and spaces remain unchanged.

        // Example 1: Converting to Small Letters
        String name = "SHAILESH";
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase); // Output: shailesh

        // Example 2: Converting to Capital Letters
        String name1 = "shailesh";
        String upperCase = name1.toUpperCase();
        System.out.println(upperCase); // Output: SHAILESH

    }
}
