package module02_string;

public class StringBuilderBuffer {
   public static void main(String[] args) {

/*
===============================================================================
              JAVA STRINGBUILDER & STRINGBUFFER COMPLETE REVISION
===============================================================================

Author  : Shailesh Patil
Purpose : Personal Revision + GitHub Notes

===============================================================================
                     WHY STRINGBUILDER CAME?
===============================================================================

Problem with String
-------------------

String is IMMUTABLE.

Example:

    String s = "Java";

    s = s + " Programming";

What happens internally?

Old Object

    "Java"

↓

New Object

    "Java Programming"

The old object is not modified.

A NEW String object is created.

If we modify String many times,

many new objects are created.

Problems

✔ More Memory Usage
✔ More Object Creation
✔ Less Performance

Solution

Java introduced

StringBuilder

because it modifies the SAME object.

No unnecessary object creation.

Hence,

✔ Faster
✔ Better Performance
✔ Memory Efficient

===============================================================================
                     WHAT IS STRINGBUILDER?
===============================================================================

Definition

- StringBuilder is a class in Java.
- It is Mutable.
- Mutable means its object CAN be modified.
- It modifies the SAME object.
- It is NOT Thread Safe.
- It is Faster than String.

Example

    StringBuilder sb = new StringBuilder("Java");

Memory

            Stack

      sb
       |
       |
       V

     +------------------+
     | Java             |
     +------------------+

append()

Same Object

     +------------------+
     | Java Programming |
     +------------------+

No new object is created.

===============================================================================
                 STRING vs STRINGBUILDER
===============================================================================

String

✔ Immutable
✔ New Object Created
✔ Slow for frequent modification

--------------------------------------------

StringBuilder

✔ Mutable
✔ Same Object Modified
✔ Faster

===============================================================================
                 METHOD 1 : append()
===============================================================================

Purpose

Adds text at the END.

Syntax

    sb.append(data);

Return Type

    StringBuilder

Method Chaining

YES

Example

    StringBuilder sb = new StringBuilder("Java");

    sb.append(" Programming");

    System.out.println(sb);

Output

    Java Programming

Important

✔ Same object modified.

✔ Returns StringBuilder.

✔ Supports Method Chaining.

Example

    sb.append(" Programming")
      .append(" Developer")
      .append(" Course");

Output

    Java Programming Developer Course

===============================================================================
                 METHOD 2 : insert()
===============================================================================

Purpose

Inserts text before a given index.

Syntax

    sb.insert(index,data);

Return Type

    StringBuilder

Method Chaining

YES

Example

    StringBuilder sb = new StringBuilder("Java");

    sb.insert(4," Programming");

    System.out.println(sb);

Output

    Java Programming

Important

Index 4 means

Insert BEFORE index 4.

===============================================================================
                 METHOD 3 : delete()
===============================================================================

Purpose

Deletes characters.

Syntax

    sb.delete(start,end);

Return Type

    StringBuilder

Method Chaining

YES

Rule

Start Index

Included

End Index

Excluded

Example

    StringBuilder sb =
            new StringBuilder("Java Programming");

    sb.delete(4,sb.length());

    System.out.println(sb);

Output

    Java

Important

delete(4,8)

Deletes

4
5
6
7

NOT 8

===============================================================================
                 METHOD 4 : deleteCharAt()
===============================================================================

Purpose

Deletes ONE character.

Syntax

    sb.deleteCharAt(index);

Return Type

    StringBuilder

Method Chaining

YES

Example

    StringBuilder sb = new StringBuilder("Java");

    sb.deleteCharAt(0);

    System.out.println(sb);

Output

    ava

Important

Only ONE character is deleted.

===============================================================================
                 CONTINUED IN PART 2
===============================================================================
```

    }
}


 */
/*
        ===============================================================================
               METHOD 5 : replace()
        ===============================================================================

               Purpose

       Replaces old text with new text.

               Syntax

       sb.replace(start, end, "newText");

       Return Type

       StringBuilder

       Method Chaining

       YES

               Rule

       Start Index

       Included

       End Index

       Excluded

               Example

       StringBuilder sb = new StringBuilder("Java Programming");

       sb.replace(4, sb.length(), " Developer");

       System.out.println(sb);

       Output

       Java Developer

       Important

✔ Replaces only the specified range.
✔ Same object is modified.
✔ No new object is created.

       ===============================================================================
       METHOD 6 : reverse()
       ===============================================================================

               Purpose

       Reverses the complete StringBuilder.

       Syntax

       sb.reverse();

       Return Type

       StringBuilder

       Method Chaining

       YES

               Example

       StringBuilder sb = new StringBuilder("Java");

       sb.reverse();

       System.out.println(sb);

       Output

               avaJ

       Important

               Before

       Java

       After reverse()

       avaJ

       Same object is modified.

       -------------------------------------------------------------------------------

               Example

       StringBuilder sb = new StringBuilder("Java");

       StringBuilder result = sb.reverse();

       System.out.println(sb);

       System.out.println(result);

       Output

               avaJ
       avaJ

               Reason

       Both variables point to the SAME object.

               ===============================================================================
               METHOD 7 : setCharAt()
               ===============================================================================

               Purpose

       Changes (Replaces) ONE character.

       Syntax

       sb.setCharAt(index,'A');

       Return Type

       void

       Method Chaining

       NO

               Reason

       Return type is void.

               Example

       StringBuilder sb = new StringBuilder("Jxva");

       sb.setCharAt(1,'a');

       System.out.println(sb);

       Output

               Java

       -------------------------------------------------------------------------------

               Last Character

               Example

       sb.setCharAt(sb.length()-1,'X');

       Output

               JavX

       Important

       Valid Index

       0

       to

       length()-1

       Otherwise

               StringIndexOutOfBoundsException

    ===============================================================================
       METHOD 8 : length()
    ===============================================================================

               Purpose

       Returns total number of characters.

               Syntax

       sb.length();

       Return Type

       int

               Example

       StringBuilder sb = new StringBuilder("Programming");

       System.out.println(sb.length());

       Output

       11

       Important

       Same as String.

               Used in loops.

       Example

       for(int i = 0; i < sb.length(); i++){

       }

===============================================================================
       METHOD 9 : charAt()
 ===============================================================================

               Purpose

       Returns character at a particular index.

       Syntax

       sb.charAt(index);

       Return Type

       char

               Example

       StringBuilder sb = new StringBuilder("Java");

       System.out.println(sb.charAt(2));

       Output

               v

       Important

       Same as String.

               Commonly used with loops.

               Forward Loop

       for(int i = 0; i < sb.length(); i++){

           char ch = sb.charAt(i);

       }

       Reverse Loop

       for(int i = sb.length()-1; i >= 0; i--){

           char ch = sb.charAt(i);

       }

===============================================================================
       METHOD 10 : capacity()
 ===============================================================================

               Purpose

       Returns total CHARACTER SLOTS.

       Syntax

       sb.capacity();

       Return Type

       int

       Default Capacity

       16

       Example

       StringBuilder sb = new StringBuilder();

       System.out.println(sb.capacity());

       Output

       16

               -------------------------------------------------------------------------------

               Example

       StringBuilder sb = new StringBuilder("Java");

       Length

       4

       Capacity

       16 + 4

               =

               20

       Output

       20

       Important

       capacity()

       means

       Character Slots

       NOT

               Bytes

       NOT

               Bits

       Difference

       length()

↓

       Characters Present

       capacity()

↓

       Characters that can be stored before expansion.

               ===============================================================================
               METHOD 11 : toString()
               ===============================================================================

               Purpose

       Converts StringBuilder into String.

       Syntax

       sb.toString();

       Return Type

       String

               Example

       StringBuilder sb = new StringBuilder("Java");

       String str = sb.toString();

       System.out.println(str);

       Output

               Java

       Real Use

       Suppose

       static void greet(String name){

           System.out.println(name);

       }

       This is WRONG

       greet(sb);

       Compile Error

       Correct

       greet(sb.toString());

       Reason

       Method accepts String,

               not StringBuilder.

               ===============================================================================
               METHOD CHAINING
               ===============================================================================

               Definition

       Calling multiple methods together.

       Possible because

       append()

       insert()

       delete()

       replace()

       reverse()

       return

               StringBuilder

       Example

       StringBuilder sb = new StringBuilder("Java");

       sb.append(" Programming")
               .replace(4,17," Developer")
               .reverse();

       Methods NOT Supporting Chaining

       setCharAt()

       Reason

       Return Type

       void

*/



   }
}