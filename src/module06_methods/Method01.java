 package module06_methods;

/*
============================================================
                JAVA METHODS - BASIC CONCEPTS
============================================================

What is a Method?
-----------------
A method is a block of reusable code with a specific name
that performs a particular task. We can call it whenever
required instead of writing the same code repeatedly.

Why do we use Methods?
----------------------
1. Avoid repetitive code.
2. Improve code reusability.
3. Make code modular and easy to understand.
4. Improve readability and maintenance.

Code Reusability
----------------
Write once, use many times.

Example:
Instead of writing the same logic 10 times,
create one method and call it 10 times.

------------------------------------------------------------
Method Syntax
------------------------------------------------------------

static returnType methodName(parameter){
    // Method Body
}

Example:

static void greet(){
    System.out.println("Hello");
}

------------------------------------------------------------
Meaning of each keyword
------------------------------------------------------------

static
------
Method belongs to the class.
It can be called directly from main()
without creating an object.

void
----
Method performs a task but does not return
any value to the caller.

return
------
Returns a value back to the caller.

Example:

return 100;

This sends the value 100 to the method caller.

------------------------------------------------------------
Main Method
------------------------------------------------------------

public static void main(String[] args)

main() is also a method.

Execution of every Java program starts from main().

------------------------------------------------------------
Method Calling
------------------------------------------------------------

greet();

Method call transfers control to the method.

After execution,
control comes back to main().

------------------------------------------------------------
Parameter & Argument
------------------------------------------------------------

Golden Rule

Argument  ---> sends value

Parameter ---> receives value

Example

greet("Shailesh");

Argument = "Shailesh"

Method

static void greet(String name)

Parameter = name

------------------------------------------------------------
Execution Flow
------------------------------------------------------------

main()

↓

Method Call

↓

Argument

↓

Parameter

↓

Method Executes

↓

return (if any)

↓

Back to Caller

↓

Store (optional)

↓

Print (optional)

============================================================
*/

public class Method01 {

    static void greet(String name){
        System.out.println("Hello " + name);
    }

    static int square(int n){
        return n * n;
    }

    public static void main(String[] args) {

        greet("Shailesh");

        int result = square(5);

        System.out.println(result);



    }
}

