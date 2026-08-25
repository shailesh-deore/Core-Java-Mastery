package module02_string;
public class String18{

    public static void main(String[] args) {

        // 1. STACK references pointing to the STRING POOL
        String s1 = "Java";
        String s2 = "Java";

        // 2. STACK reference pointing to an object on the HEAP
        String s3 = new String("Java");

        // 3. STACK reference manually moved to the STRING POOL
        String s4 = s3.intern();

        // --- THE MEMORY TESTS ---

        // True: s1 and s2 share the exact same spot in the Pool
        System.out.println("Pool matching (s1 == s2): " + (s1 == s2));

        // False: s3 is a brand new object sitting on the Heap
        System.out.println("Pool vs Heap  (s1 == s3): " + (s1 == s3));

        // True: intern() forced s4 to point back to the Pool
        System.out.println("Pool vs Intern(s1 == s4): " + (s1 == s4));
    }
}
