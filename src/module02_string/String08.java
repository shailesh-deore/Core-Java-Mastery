package module02_string;

public class String08 {
    static void main(String[] args) {

        // STRING METHOD 5: substring()

        // Rule 1: It cuts and extracts a smaller part of a larger string.
        // Rule 2: Variant A takes 1 argument -> Cuts from 'beginIndex' to the absolute end.
        // Rule 3: Variant B takes 2 arguments -> Cuts from 'beginIndex' up to 'endIndex' (EXCLUDED).

        String name = "Amar panchal";

        // Example 1: Single Argument (Cuts from index 5 to the end)
        // Indices: 0:A, 1:m, 2:a, 3:r, 4:' ', 5:p
        String subString = name.substring(5);
        System.out.println(subString); // Output: panchal

        // Example 2: Two Arguments (Cuts from index 5 up to 8, index 8 is EXCLUDED)
        // Pulls letters at index 5, 6, and 7 only.
        String subString1 = name.substring(5, 8);
        System.out.println(subString1); // Output: pan

    }
}
