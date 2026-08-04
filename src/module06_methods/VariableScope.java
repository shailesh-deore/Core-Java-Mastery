package module06_methods;

/*
=========================================================
                JAVA VARIABLE SCOPE
=========================================================

Definition:
Variable Scope defines where a variable can be accessed
(used) in a program.

Simple Definition:
Variable Scope batata hai ki koi variable program ke
kis area ya block ke andar use ho sakta hai.

---------------------------------------------------------
Local Variable
---------------------------------------------------------

A variable declared inside a method, loop, or block
is called a Local Variable.

A Local Variable can only be accessed inside the block
where it is declared.

Examples:
- Inside a method
- Inside an if block
- Inside a for loop

=========================================================
GOLDEN RULE
=========================================================

A variable can only be accessed inside the block { }
where it is declared.

If the block ends,
the variable's life also ends.

=========================================================
EXAMPLE 1
Variable Inside a Method
=========================================================
*/

public class VariableScope {
    public static void main(String[] args) {

        // Local Variable
        int age = 22;

        // Accessible because we are inside the same method
        System.out.println(age);
    }
}
/*
Output

22

Explanation:
'age' is declared inside main().
So it can be used anywhere inside main().

=========================================================
EXAMPLE 2
Variable in Another Method
=========================================================
*/

class ScopeMethod {

    static void display() {

        // Local Variable
        int marks = 90;

        System.out.println(marks);
    }

    public static void main(String[] args) {

        display();

        // System.out.println(marks);

        // ❌ Compile Time Error
        // 'marks' belongs only to display().
    }
}

/*
=========================================================
EXAMPLE 3
Variable Inside if Block
=========================================================
*/

class ScopeIf {

    public static void main(String[] args) {

        if (true) {

            // Local Variable
            String result = "Pass";

            System.out.println(result);

        }

        // System.out.println(result);

        // ❌ Compile Time Error
        // result exists only inside the if block.
    }
}

/*
=========================================================
EXAMPLE 4
Variable Inside for Loop
=========================================================
*/

class ScopeFor {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

        }

        // System.out.println(i);

        // ❌ Compile Time Error
        // i exists only inside the for loop.
    }
}

/*
=========================================================
VISUAL UNDERSTANDING
=========================================================

main()
{

    int a = 10;

    if(true)
    {

        int b = 20;

        ✔ Can use a
        ✔ Can use b

    }

    ✔ Can use a

    ❌ Cannot use b

}

Reason:
'b' belongs only to the if block.

=========================================================
INTERVIEW POINTS
=========================================================

✔ Local Variable is declared inside a method or block.

✔ Local Variable is accessible only inside that block.

✔ A variable declared in one method cannot be used
   in another method.

✔ A variable declared inside an if block cannot be
   accessed outside the if block.

✔ A variable declared inside a for loop cannot be
   accessed outside the loop.

=========================================================
SUMMARY
=========================================================

Variable Scope

↓

Where can we use a variable?

↓

Inside the block { } where it is declared.

↓

Outside the block
Not Accessible

=========================================================
END OF VARIABLE SCOPE
=========================================================

 */
