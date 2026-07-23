package module06_methods;

/*
============================================================
                FOUR TYPES OF METHODS
============================================================

Methods are classified based on two questions.

1. Does the method take input?
(Parameter)

2. Does the method return a value?
(Return)

According to these two conditions,
there are four types of methods.

============================================================
TYPE 1
No Parameter + No Return
============================================================

Definition

Method does not take any input
and does not return any value.

Used when we simply perform an action.

*/

public class Method02 {
    static void welcome(){
        System.out.println("Welcome to Java");
    }
    public static void main(String[] args) {
        welcome();
    }
}


/*
============================================================
TYPE 2
Parameter + No Return
============================================================

Definition

Method receives input using parameter
but does not return any value.

Used when we only perform an action
using the given input.

*/

class Type2{

    static void showCollege(String collegeName){
        System.out.println("College : " + collegeName);
    }

    public static void main(String[] args){

        showCollege("KCES IMR Jalgaon");
        showCollege("MIT WPU Pune");

    }

}

/*
============================================================
TYPE 3
No Parameter + Return
============================================================

Definition

Method does not take any input
but returns a value to the caller.

Used when a fixed value or internally
calculated value is required.

*/

class Type3{

    static int getLuckyNumber(){
        return 7;
    }

    public static void main(String[] args){

        int number = getLuckyNumber();

        System.out.println(number);

    }

}

/*
============================================================
TYPE 4
Parameter + Return
============================================================

Definition

Method receives input through parameters
and returns the calculated result.

This is one of the most commonly used
method types in real-world Java programs.

*/

class Type4{

    static int cube(int n){
        return n * n * n;
    }

    public static void main(String[] args){

        int answer = cube(5);

        System.out.println(answer);

    }

}

/*
============================================================
Summary
============================================================

Type 1
No Parameter
No Return

Used for:
Printing messages
Displaying menus

--------------------------------------------

Type 2

Parameter
No Return

Used for:
Printing data based on input

--------------------------------------------

Type 3

No Parameter
Return

Used for:
Returning fixed or internally generated values

--------------------------------------------

Type 4

Parameter
Return

Used for:
Calculations
Searching
Checking Prime
Factorial
Square
Cube
Maximum
Minimum

============================================================

Golden Rule

Need Input?

YES -> Parameter

NO -> No Parameter

----------------------------

Need Result?

YES -> Return

NO -> void

============================================================
*/

