package module02_string;

public class String16 {
    static void main(String[] args) {

        // substring() vs subSequence()

        String name = "Amar panchal";

        // 1. .substring() -> Returns a real String object type
        String substring = name.substring(5, 8);
        System.out.println(substring); // Output: pan

        // 2. .subSequence() -> Returns a CharSequence interface type
        System.out.println(name.subSequence(2, 8)); // Output: ar pan


    }
}
