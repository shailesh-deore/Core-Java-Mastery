package module02_string;

public class TestStudent {
    static void main(String[] args) {

        // 1. Creating an Object (Blueprint Instance) assigning properties
        Student Shailesh = new Student();
        Shailesh.name = "Shailesh";
        Shailesh.address = "Pune Maharashtra";
        Shailesh.standard = 12;
        Shailesh.roleNumber = 45;

        // Printing values using object reference
        System.out.println(Shailesh.name);
        System.out.println(Shailesh.address);

        // MEMORY DIFFERENCE: STACK VS HEAP

        // Example A: Primitive Variable (Stored in Stack)
        int a = 1;
        // The literal value '1' is stored directly inside variable a's memory box.

        // Example B: Reference Variable (Stored in Heap, linked to Stack)
        Student vipul = new Student();
        // 'new Student()' allocates memory for a brand-new object on the Heap.
        // 'vipul' is a reference variable on the Stack. It does NOT store the object data,
        // it only stores the memory address (pointer) of that Heap object.

    }
}
