package module02_string;

public class String05 {
    static void main(String[] args) {

        // STRING METHOD 2: charAt(int index)

        // Definition: Returns a single character present at a specific index position.
        // Rule 1: The counting index always starts from 0.
        // Rule 2: It automatically returns a primitive 'char' type container.

        String name = "Shailesh deore";
        char c = name.charAt(3);    // Index layout: S=0, h=1, a=2, i=3
        System.out.println(c);      // Output: i

        char crash = name.charAt(50); // Throws: StringIndexOutOfBoundsException
        System.out.println(crash);   // Output: String index out of range: 50

        // The total length of "Shailesh deore" is 14, so the valid indices are 0 to 13.
        // If you request a position that does not exist, Java will crash!


    }
}
