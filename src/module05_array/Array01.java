package module05_array;

public class Array01 {
    static void main(String[] args) {

        // INTRODUCTION TO ARRAYS (Linear Data Collections)

        // Rule 1: An Array is a collection of elements of the EXACT same data type.
        // Rule 2: It is a Non-Primitive data type because it handles data as an object in memory.
        // Rule 3: Whenever you need to store bulk similar items, use an array!

        // THE BAD MANUAL APPROACH (Wastes time and variable names):
        int x = 10;
        int y = 20;
        int z = 30;

        // THE SMART ARRAY APPROACH (Stores everything in one single variable):
        int[] array = {1, 2, 3}; // Integer type array containing 3 items

        // syntax / declaration of arrays
        // we can declare like : first declare and then initialize

        // type[] variableName ; // int[] integerArray; [] means we need array for same datatype .
        // we can declare and initialize array in one line or alag alg line me bhi kar sakte hai ;

        // Rule 1: The square brackets '[]' inform Java that this variable holds a sequence, not a single value.
        // Rule 2: You can split declaration and initialization, or combine them into a single line.
        // Rule 3: Fixed Size -> Once you define the size (e.g., [10]), it cannot be expanded or shrunk later.

        // Split Layout:
        int[] intArray;        // 1. Declaration (Only creates a name variable)
        intArray = new int[5]; // 2. Initialization (Allocates 5 empty slots in memory)

        // Combined Layout:
        int[] arr = new int[10]; // Creates a reference variable pointing to 10 integer slots.
       // arr : is  a reference variable hai, jo new int [10]; ko refer kar rah hai
       // new int [10]; store in heap memory :
       // Line 1: 'new int[5]' likhte hi Heap memory mein 5 dabbon ka ek physical continuous block banta hai.
       // Line 2: Is block ke saare dabbon mein default value '0' hoti hai, aur iska data dynamic aur permanent hota hai.


        // VISUAL MEMORY LAYOUT (Stack vs Heap Architecture)


        // Heap Memory:
        //      +---+---+---+---+---+
        //      | 0 | 0 | 0 | 0 | 0 |  <- Array object (of 5 integers) in heap memory
        //      +---+---+---+---+---+
        //        ^
        //        |  (Pointer/Reference link)
        //        |
        // Stack Memory:
        //  [ arr ]  <- Reference variable containing heap address (starting address of heap ok )



    }
}
