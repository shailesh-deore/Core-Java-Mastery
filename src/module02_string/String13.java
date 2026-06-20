package module02_string;

public class String13 {
    static void main(String[]args) {

        // STRING METHODS 10 & 11: prefix, suffix, and empty checks

        // Rule 1: .startsWith() checks if text begins with the target prefix.
        // Rule 2: .endsWith() checks if text finishes with the target suffix.
        // Rule 3: .isEmpty() returns true only if the string length is strictly 0.
        // Rule 4: All of these methods return a boolean value (true or false).

        String name = "Aman deora";

        // Example 1: Case-Sensitive prefix check
        // ('Am' is true, but 'am' with small 'a' returns false)
        System.out.println(name.startsWith("am")); // Output: false
        System.out.println(name.endsWith("re"));   // Output: true


        // Example 2: The Empty String Reality Checks

        String name1 = "";
        System.out.println(name1.isEmpty()); // Output: true (Length is exactly 0)

        String name2 = " ";
        System.out.println(name2.isEmpty()); // Output: false (Space counts as a character!)

        // .isBlank(): Returns true if the string is empty OR contains only spaces.
        boolean blank = name2.isBlank();
        System.out.println(blank); // Output: true

        // .indexOf(): Finds the FIRST occurrence of a character from the left side.
        int i = name.indexOf("a");
        System.out.println(i); // Output: 2

        // .lastIndexOf(): Finds the LAST occurrence of a character from the right side.
        int i1 = name.lastIndexOf("a");
        System.out.println(i1); // Output: 9

    }
}
