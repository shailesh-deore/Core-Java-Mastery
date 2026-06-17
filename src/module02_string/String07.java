package module02_string;

public class String07 {
    static void main(String[] args) {

        // STRING METHOD 4: compareTo() & compareToIgnoreCase()

        // Rule 1: It compares two strings lexicographically (alphabetical order).
        // Rule 2: It returns an INTEGER value by subtracting ASCII numbers.
        // Rule 3: It reads left-to-right. It skips matching letters and stops at the first mismatch.

        String str1 = "remote"; // ASCII of 'r' = 114
        String str2 = "car";    // ASCII of 'c' = 99

        // Example 1: Subtracts first mismatch ('r' - 'c') -> 114 - 99 = 15
        int i = str1.compareTo(str2);
        System.out.println(i); // Output: 15

        // Example 2: Reverse check ('c' - 'r') -> 99 - 114 = -15
        int i1 = str2.compareTo(str1);
        System.out.println(i1); // Output: -15

        // Example 3: Exact identical check -> 99 - 99 = 0
        int i2 = str2.compareTo(str2);
        System.out.println(i2); // Output: 0

        // Example 4: Skipping matching letters
        String name = "remote"; // index 0: 'r' matches, index 1: 'e' (101)
        String name1 = "ramote"; // index 0: 'r' matches, index 1: 'a' (97)
        int i3 = name.compareTo(name1); // Subtracts ('e' - 'a') -> 101 - 97 = 4
        System.out.println(i3); // Output: 4

        // Example 5: Case-Insensitive Comparison
        // Rule: Ignores capital/small differences before checking ASCII values.
        String name2 = "Amar";
        String name3 = "amar";
        int i4 = name3.compareToIgnoreCase(name2);
        System.out.println(i4); // Output: 0 (Treated as completely identical)

        // ASCII Reference Values (For quick checking)
        System.out.println('r' + 0); // 114
        System.out.println('c' + 0); // 99
        System.out.println('e' + 0); // 101
        System.out.println('a' + 0); // 97




    }
}
