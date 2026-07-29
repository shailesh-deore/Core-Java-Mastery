package module02_string;

public class StringImmutability {

/*
===============================================================================
                     JAVA STRING IMMUTABILITY
                        (Quick Revision Notes)
===============================================================================

Author  : Shailesh Patil
Purpose : Personal Revision Notes
Topic   : String Immutability

===============================================================================
1. What is Immutability?
===============================================================================

Immutable means:

    "Cannot be Changed"

Definition:

Once a String object is created,
its value CANNOT be modified.

===============================================================================
2. Example
===============================================================================

String s = "Java";

Memory:

        Stack                     String Pool

        s ---------------------> "Java"

Now,

s = "Python";

Question:

Did "Java" become "Python" ?

Answer:

NO.

===============================================================================
3. What Actually Happens?
===============================================================================

Java NEVER modifies the existing String object.

Instead,

1. A NEW String object is created.
2. The reference variable points to the NEW object.
3. The old object remains unchanged.

Memory:

Before

        s ---------------------> "Java"

After

        s ---------------------> "Python"

Old Object:

        "Java"

New Object:

        "Python"

The object changes?

NO.

The reference changes?

YES.

===============================================================================
4. Golden Rule
===============================================================================

A String object is NEVER modified.

Whenever it appears to change,

Java creates a NEW String object,

and the reference variable points to the new object.

===============================================================================
5. Why are Strings Immutable?
===============================================================================

1. String Pool

Duplicate String literals can be safely reused.

Example:

String s1 = "Java";
String s2 = "Java";

Both variables point to the SAME object.

---------------------------------------------------------

2. Security

Passwords
Database URLs
API Keys

cannot be accidentally modified.

---------------------------------------------------------

3. Thread Safety

Multiple threads can safely use
the same String object.

---------------------------------------------------------

4. Performance

String Pool saves memory
by reusing String literals.

===============================================================================
6. Garbage Collector (Basic Idea)
===============================================================================

If no variable points to an old String object,

Java's Garbage Collector (GC)

can remove it from memory later.

Example:

String s = "Java";

s = "Python";

Now,

"Java"

has no reference.

It becomes eligible for Garbage Collection.

===============================================================================
7. Important Example
===============================================================================

String language = "Java";

language = "Python";

Memory:

Step 1

language ------------------> "Java"

Step 2

language ------------------> "Python"

Old Object:

"Java"

New Object:

"Python"

===============================================================================
8. Interview Definition
===============================================================================

Q. Why are Strings Immutable?

Answer:

Strings are immutable because Java never modifies an existing
String object. Whenever a String appears to change, Java creates
a new String object and updates the reference variable.
This helps provide better memory optimization (String Pool),
security, thread safety, and performance.

===============================================================================
9. Revision in 5 Lines
===============================================================================

✔ Immutable means cannot be changed.

✔ String objects are immutable.

✔ Changing a String creates a NEW object.

✔ The reference variable points to the NEW object.

✔ The old object remains unchanged.

===============================================================================
END OF STRING IMMUTABILITY REVISION
===============================================================================
*/
/*




===============================================================================
⭐ Golden Definition of String Immutability
===============================================================================

A String object is NEVER modified.

Whenever it appears to change,

Java creates a NEW String object,

and the reference variable points to the NEW object.

Simple Meaning:

✔ Old String Object  -> Remains Unchanged
✔ New String Object  -> Gets Created
✔ Reference Variable -> Points to the New Object

Example:

String s = "Java";

Memory:

s ------------------> "Java"

Now,

s = "Python";

Java DOES NOT modify "Java".

Instead,

Step 1: Create a NEW object -> "Python"

Step 2: Change the reference variable

Memory:

Before

s ------------------> "Java"

After

s ------------------> "Python"

Old Object:

"Java"   (Unchanged)

New Object:

"Python"

Remember Forever:

Object Never Changes ❌

Reference Changes ✅

===============================================================================


 */




}
