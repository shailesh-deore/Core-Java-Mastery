package module06_methods;

/*
=========================================================
            JAVA METHOD OVERLOADING - NOTES
=========================================================

Definition:
Method Overloading means having multiple methods with the
same name but different parameters in the same class.

Simple Definition:
Ek hi method ka naam same hota hai, lekin uske parameters
alag hote hain.

---------------------------------------------------------
Why do we use Method Overloading?
---------------------------------------------------------

1. Code readability improves.
2. Same work ke liye same method name use kar sakte hain.
3. Java automatically correct method call kar leta hai.
4. Code clean aur easy to maintain hota hai.

Example:

sum(10,20);
sum(10,20,30);

Method name same hai (sum)
Lekin parameters different hain.

=========================================================
RULES OF METHOD OVERLOADING
=========================================================

Rule 1:
Same Method Name
----------------

sum()
sum()

Method ka naam same hona chahiye.

---------------------------------------------------------

Rule 2:
Different Number of Parameters
------------------------------

sum(int a, int b)

sum(int a, int b, int c)

✔ Valid Overloading

---------------------------------------------------------

Rule 3:
Different Data Types
--------------------

multiply(int a, int b)

multiply(double a, double b)

✔ Valid Overloading

---------------------------------------------------------

Rule 4:
Different Order of Parameters
-----------------------------

display(String name, int age)

display(int age, String name)

✔ Valid Overloading

---------------------------------------------------------

NOT VALID
---------

Changing only return type is NOT overloading.
 Wrong

int sum(int a, int b)

double sum(int a, int b)

Reason:
Java identifies methods using
Method Name + Parameter List

Return type is NOT considered.

=========================================================
METHOD SIGNATURE
=========================================================

Method Signature =
Method Name + Parameter List

Examples:

sum(int,int)

sum(int,int,int)

multiply(double,double)

Return type is NOT part of Method Signature.

=========================================================
EXAMPLE 1
Different Number of Parameters
=========================================================
*/
public class MethodOverloading {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(sum(10, 20));

        System.out.println(sum(10, 20, 30));

    }
}

/*
Output
30
60


=========================================================
EXAMPLE 2
Different Data Types
=========================================================
*/
class MultiplyExample {

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println(multiply(10, 20));

        System.out.println(multiply(1.5, 2.5));

    }
}

/*
Output

200

3.75

=========================================================
EXAMPLE 3
Different Order of Parameters
=========================================================
*/

class DisplayExample {

    static void display(String name, int age) {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    static void display(int age, String name) {
        System.out.println("Age  : " + age);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {

        display("Shailesh", 22);

        System.out.println();

        display(22, "Shailesh");

    }
}

/*
=========================================================
How Java Decides Which Method to Call?
=========================================================

Call

sum(10,20);

↓

Java checks

Method Name = sum

Arguments = 2

↓

Calls

sum(int,int)

---------------------------------------------------------

Call

sum(10,20,30);

↓

Java checks

Method Name = sum

Arguments = 3

↓

Calls

sum(int,int,int)

---------------------------------------------------------

Call

multiply(10,20);

↓

Arguments = int,int

↓

Calls

multiply(int,int)

---------------------------------------------------------

Call

multiply(2.5,4.5);

↓

Arguments = double,double

↓

Calls

multiply(double,double)

=========================================================
INTERVIEW POINTS
=========================================================

✔ Same method name

✔ Different parameters

✔ Return type alone cannot overload a method.

✔ Java selects the method at Compile Time.

✔ Method Signature =
   Method Name + Parameter List

=========================================================
END OF METHOD OVERLOADING
=========================================================

 */
