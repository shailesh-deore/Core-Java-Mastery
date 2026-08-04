package module07_recursion;

public class Recursion01 {
    public static void main(String[] args) {
/*
==========================================================
                JAVA RECURSION - BASIC NOTES
==========================================================

What is Recursion?

Recursion is a programming technique in which a method
calls itself to solve a smaller version of the same problem.

Simple Definition:
"A method calling itself is called Recursion."

----------------------------------------------------------
Why Do We Use Recursion?
----------------------------------------------------------

We use recursion when a problem can be divided into
smaller similar problems.

Examples:
- Factorial
- Sum of N Natural Numbers
- Fibonacci
- Sum of Digits
- Power Function
- Reverse String
- Tree Traversal (Advanced)
- Backtracking (Advanced)

----------------------------------------------------------
Two Parts of Every Recursive Method
----------------------------------------------------------

1) Base Case

The Base Case is the stopping condition.

It tells the method:
"Stop calling yourself."

Example:

if(n == 0){
    return;
}

Without a Base Case,
the recursion never stops.

Result:
StackOverflowError

----------------------------------------------------------

2) Recursive Call

A recursive call is when a method calls itself.

Example:

method(n - 1);

Every recursive call should make the problem smaller.

----------------------------------------------------------
Golden Formula
----------------------------------------------------------

Every recursive method follows this pattern:

if(baseCase){
    return;
}

return method(smallerProblem);

Remember these three steps:

1. Base Case
2. Smaller Problem
3. Recursive Call

----------------------------------------------------------
How Recursion Works
----------------------------------------------------------

Example:

print(5);

Execution:

print(5)
   ↓
print(4)
   ↓
print(3)
   ↓
print(2)
   ↓
print(1)
   ↓
print(0)
   ↓
Base Case
   ↓
Return
   ↑
Return
   ↑
Return
   ↑
Return
   ↑
Return

----------------------------------------------------------
Call Stack
----------------------------------------------------------

Every method call is stored inside the Call Stack.

Example:

print(3);

Stack:

---------
print(3)
---------

Inside print(3)

print(2);

Stack:

---------
print(2)
---------
print(3)
---------

Inside print(2)

print(1);

Stack:

---------
print(1)
---------
print(2)
---------
print(3)
---------

When the Base Case is reached:

return;

The stack becomes empty one method at a time.

print(1) removed
      ↓
print(2) removed
      ↓
print(3) removed

----------------------------------------------------------
Without Base Case
----------------------------------------------------------

method(5)
   ↓
method(4)
   ↓
method(3)
   ↓
method(2)
   ↓
method(1)
   ↓
method(0)
   ↓
method(-1)
   ↓
method(-2)
   ↓
...

The recursion never stops.

Java throws:

StackOverflowError

----------------------------------------------------------
Important Rule
----------------------------------------------------------

Every recursive call must move toward the Base Case.

Correct:

method(n - 1);

Wrong:

method(n);

The problem never becomes smaller,
so recursion never ends.

----------------------------------------------------------
Recursive Thinking
----------------------------------------------------------

Whenever solving a recursion problem,
always ask these three questions:

1. What is the Base Case?

2. How can I make the problem smaller?

Examples:

n - 1

index + 1

length - 1

3. How will the method call itself?

method(smallerProblem);

----------------------------------------------------------
Problems We Will Solve
----------------------------------------------------------

1. Factorial
2. Sum of N Natural Numbers
3. Fibonacci
4. Sum of Digits
5. Power Function
6. Reverse String

----------------------------------------------------------
Advantages
----------------------------------------------------------

- Less code
- Easy for mathematical problems
- Useful for Trees
- Useful for Graphs
- Useful in Backtracking
- Useful in Divide & Conquer

----------------------------------------------------------
Disadvantages
----------------------------------------------------------

- Uses more memory (Call Stack)
- Can be slower than loops
- Wrong Base Case causes StackOverflowError

----------------------------------------------------------
Quick Revision
----------------------------------------------------------

Base Case
→ Stops recursion.

Recursive Call
→ Method calls itself.

Smaller Problem
→ Every recursive call should reduce the problem.

Call Stack
→ Stores every recursive method call until the
  Base Case is reached.

----------------------------------------------------------
Remember Forever
----------------------------------------------------------

Recursion

= Base Case
+ Smaller Problem
+ Recursive Call

If these three concepts are clear,
most basic recursion problems become easy.

----------------------------------------------------------
Interview Definition
----------------------------------------------------------

"Recursion is a programming technique in which
a method calls itself repeatedly until a Base Case
is reached."

==========================================================
                 END OF RECURSION BASICS
==========================================================
*/


    }
}
