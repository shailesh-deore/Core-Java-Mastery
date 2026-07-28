package module02_string;

public class StringMemoryNotes {
/*
===============================================================================
                     JAVA STRING MEMORY MANAGEMENT
                         (Quick Revision Notes)
===============================================================================

Author : Shailesh Patil
Purpose: Personal Revision Notes
Topic  : Heap Memory | Stack Memory | String Pool | new String()

===============================================================================
1. What is String?
===============================================================================

- String is NOT a primitive datatype.
- String is a class in Java.
- Since it is a class, String values are Objects.

Example:

    String name = "Shailesh";

Here,
- name -> Reference Variable
- "Shailesh" -> String Object

===============================================================================
2. Where are Strings Stored?
===============================================================================

Memory is divided into different areas.

For Strings, remember only these two:

1) Stack Memory
2) Heap Memory

===============================================================================
3. Stack Memory
===============================================================================

Stack stores:

✔ Reference Variables
✔ Local Variables
✔ Method Calls


Example:

    String name = "Java";

Memory:

    Stack                  Heap

    name  ------------->   "Java"

NOTE:
The variable does NOT store the actual String.
It only stores the reference (address) of the object.

===============================================================================
4. Heap Memory
===============================================================================

Heap Memory stores:

✔ Objects

Example:

    String city = "Jalgaon";

Memory:

    Stack                     Heap

    city  ----------------->  "Jalgaon"

Important:

Objects are always stored in Heap Memory.

===============================================================================
5. String Pool
===============================================================================

String Pool is a SPECIAL AREA inside Heap Memory.

Purpose:

✔ Reuse duplicate String literals.
✔ Save memory.
✔ Improve performance.

Example:

    String s1 = "Java";
    String s2 = "Java";

Memory:

             Stack

    s1 -----------\
                   \
                    -------> "Java"
                   /
    s2 -----------/

            String Pool (Heap)

Only ONE object is created.

Both variables point to the SAME object.

===============================================================================
6. Why String Pool?
===============================================================================

Without String Pool:

"Java"
"Java"
"Java"

Three objects would be created.

With String Pool:

Only ONE object is created.

Memory is saved.

===============================================================================
7. String Literal
===============================================================================

Example:

    String language = "Java";

Process:

Step 1:
Java checks the String Pool.

Step 2:
If the String already exists,
reuse it.

Step 3:
If it does NOT exist,
create it in the String Pool.

Rule:

String literals always use the String Pool.

===============================================================================
8. new String()
===============================================================================

Example:

    String s = new String("Java");

Meaning:

The keyword "new"

FORCES Java

to create a NEW object in Heap Memory.

Rule:

new String()

Always creates a NEW object in Heap Memory.

===============================================================================
9. Difference
===============================================================================

String Literal

    String s = "Java";

✔ Uses String Pool
✔ Reuses duplicate objects
✔ Memory efficient

---------------------------------------------------------

new String()

    String s = new String("Java");

✔ Creates NEW Heap Object
✔ Does not reuse the Heap object
✔ Uses more memory

===============================================================================
10. Important Memory Diagram
===============================================================================

Code:

    String s1 = "Java";
    String s2 = new String("Java");

Memory:

                STACK
        ------------------

        s1 ----------------------+
                                 |
                                 |
                                 V

              STRING POOL (Heap)

                 +---------+
                 | "Java"  |
                 +---------+

        s2 ------------------------------+
                                         |
                                         |
                                         V

                 NORMAL HEAP

                 +---------+
                 | "Java"  |
                 +---------+

Explanation:

s1 points to the String Pool object.

s2 points to the NEW Heap object.

Both contain the same text,

but both are DIFFERENT objects.

===============================================================================
11. Interview Question
===============================================================================

Question:

How many objects are created?

Code:

    String s = new String("Java");

Case 1:

"Java" is NOT present in String Pool.

Objects Created:

1. String Pool Object
2. Heap Object

Total = 2 Objects

---------------------------------------------------------

Case 2:

"Java" already exists in String Pool.

Objects Created:

1. Heap Object

Total = 1 New Object

(String Pool object is reused.)

===============================================================================
12. Golden Rules
===============================================================================

✔ String is a class.

✔ String objects live in Heap Memory.

✔ Reference variables live in Stack Memory.

✔ String Pool is a special area inside Heap Memory.

✔ String literals use the String Pool.

✔ Duplicate String literals are reused.

✔ new String() always creates a NEW Heap object.

✔ String objects are Immutable (cannot be modified after creation).

===============================================================================
END OF STRING MEMORY REVISION
===============================================================================
*/

}
