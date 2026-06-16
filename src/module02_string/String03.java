package module02_string;

public class String03 {
    static void main(String[] args) {

        // STRING COMPARISON: THE HEAP VS STRING CONSTANT POOL (SCP)


        // Case 1: Using the 'new' keyword (Forces Fresh Memory Allocation)
        String a = new String("ram");
        String b = new String("ram");
        System.out.println(a == b); // Output: false
        // Why false? The 'new' keyword forces Java to create two completely
        // separate object bodies in the normal Heap memory.
        // Because their memory location addresses are different, '==' returns false.



        // Case 2: Using String Literals (Java's Smart Memory Saving)
        String c = "ram";
        String d = "ram";
        System.out.println(c == d); // Output: true
        // Why true? Java maintains a special smart zone inside the Heap called the
        // String Constant Pool (SCP).
        // Step 1: When variable 'c' is created, Java puts "ram" inside the pool.
        // Step 2: When variable 'd' is created with the same text "ram", Java checks the pool first.
        //         Since "ram" is already present, Java does NOT create a new object.
        //         It points variable 'd' to the exact same memory address as variable 'c'.

    }

}
