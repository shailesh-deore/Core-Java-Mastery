package module06_methods;

/*
=========================================================
                JAVA CALL BY VALUE
=========================================================

Definition:

Call by Value means Java passes a copy of the variable's
value to the method, not the original variable.

Simple Definition:

Method ko original variable nahi milta.
Uski sirf ek copy milti hai.

If we change the parameter inside the method,
the original variable remains unchanged.

=========================================================
GOLDEN RULE
=========================================================

Original Variable

        ↓

Copy Passed to Method

        ↓

Method Works on Copy

        ↓

Original Variable Never Changes

=========================================================
EXAMPLE 1
Change Parameter Value
=========================================================
*/
public class CallByValue {
    static void change(int x) {

        // Change the copied value
        x = 100;

        System.out.println("Inside Method : " + x);
    }

    public static void main(String[] args) {

        int a = 10;

        change(a);

        // Original variable remains unchanged
        System.out.println("Outside Method : " + a);
    }
}


/*
Output

Inside Method : 100
Outside Method : 10

Reason:

a = 10

↓

Java passes copy

↓

x = 10

↓

x becomes 100

↓

a is still 10

=========================================================
EXAMPLE 2
Increment Value
=========================================================
*/

class Example2 {

    static void increment(int num) {

        num++;

        System.out.println("Inside Method : " + num);
    }

    public static void main(String[] args) {

        int number = 20;

        increment(number);

        System.out.println("Outside Method : " + number);
    }
}

/*
Output

Inside Method : 21
Outside Method : 20

Reason:

Only copied value changed.

=========================================================
EXAMPLE 3
Multiply Value
=========================================================
*/

class Example3 {

    static void multiply(int value) {

        value = value * 5;

        System.out.println("Inside Method : " + value);
    }

    public static void main(String[] args) {

        int n = 8;

        multiply(n);

        System.out.println("Outside Method : " + n);
    }
}

/*
Output

Inside Method : 40
Outside Method : 8

Reason:

Original variable never changes.

=========================================================
EXAMPLE 4
Swap Values
=========================================================
*/

class Example4 {

    static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside Method : " + a + " " + b);
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        swap(x, y);

        System.out.println("Outside Method : " + x + " " + y);
    }
}

/*
Output

Inside Method : 20 10
Outside Method : 10 20

Reason:

Only copies of x and y are swapped.

Original variables remain unchanged.

=========================================================
INTERVIEW POINTS
=========================================================

✔ Java always uses Call by Value.

✔ Method receives a copy of the value.

✔ Original variable is never modified.

✔ Changes inside the method affect only the parameter.

=========================================================
MEMORY FLOW
=========================================================

int a = 10;

change(a);

↓

Java creates

int x = 10;

↓

x = 100;

↓

Method Ends

↓

x Destroyed

↓

a = 10

=========================================================
SUMMARY
=========================================================

Call by Value

↓

Copy of Value Passed

↓

Method Works on Copy

↓

Original Variable Unchanged

=========================================================
END OF CALL BY VALUE
=========================================================

 */
