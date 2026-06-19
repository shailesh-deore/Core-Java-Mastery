package module02_string;

public class String10 {
    static void main(String[] args) {

        // STRING METHOD 7: trim()

        // Rule 1: It removes all blank spaces from the START and END of a string.
        // Rule 2: It does NOT remove or touch the spaces between words.

        String name = "   raj patil    ";
        System.out.println(name.trim()); // Output: "raj patil"

        // ek badi chees dhyan me rakho useme hum change nahi kar rahe hai , ye ek nayi string aati hai
        // string is not changeble imp concept


        // STRING METHOD 7: trim() & IMMUTABILITY CONCEPT

        // Rule 1: It removes all blank spaces from the START and END of a string.
        // Rule 2: It does NOT remove or touch the spaces between words.

        String nameOp = "   raj patil    ";
        System.out.println(nameOp.trim()); // Output: "raj patil"


        // THE BIG INDUSTRY CONCEPT: Strings are Immutable (Unchangeable)

        // Rule: Java strings cannot be changed after they are created.
        // Proof: Even after running name.trim(), the original variable 'name'
        // still holds "   raj patil    " with all its spaces in memory.
        // Fact: Every string method returns a BRAND-NEW string object instead of modifying the old one.

        String text = "JAVA PRO";

        // This rule is identical for ALL methods (toLowerCase, substring, trim, etc.)
        String result = text.toLowerCase();

        // Proof that the original text is completely safe and untouched:
        System.out.println(text);   // Output: "JAVA PRO" (Original never changes!)
        System.out.println(result); // Output: "java pro" (Brand new local variable)


    }
}
