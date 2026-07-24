package module06_methods;

/*
============================================================
Author  : Shailesh Patil
Topic   : Method Internal Working
Language: Java

Purpose:
Understand how a method call works internally in Java.
============================================================
*/

public class MethodInternalWorking {
    /*
     * Method:
     * Takes one number as input.
     * Returns its square.
     */

    static int square(int number) {

        // Calculate square

        int result = number * number;

        // Send result back to the caller

        return result;
}
    public static void main(String[] args) {

        // Calling the method

        int answer = square(5);

        // Printing returned value

        System.out.println("Square = " + answer);

    }

}

/*
============================================================
               INTERNAL WORKING (STEP BY STEP)
============================================================

STEP 1

Program execution starts from

main()

------------------------------------------------------------

STEP 2

main() calls

square(5);

Here,

Argument = 5

------------------------------------------------------------

STEP 3

Control goes to

square(int number)

Parameter receives the argument.

number = 5

------------------------------------------------------------

STEP 4

Method executes.

result = number * number

result = 5 * 5

result = 25

------------------------------------------------------------

STEP 5

return result;

returns

25

back to the caller.

------------------------------------------------------------

STEP 6

Control comes back to main()

Now this line

int answer = square(5);

becomes

int answer = 25;

------------------------------------------------------------

STEP 7

System.out.println(answer);

Output

Square = 25

============================================================


Execution Flow

main()

        |

        V

square(5)

        |

        V

Argument = 5

        |

        V

Parameter receives value

number = 5

        |

        V

Calculation

5 * 5 = 25

        |

        V

return 25

        |

        V

main() receives 25

        |

        V

answer = 25

        |

        V

Print

Square = 25

============================================================


Golden Rule

Method Call

↓

Argument sends value

↓

Parameter receives value

↓

Method executes

↓

return sends value

↓

Caller receives value

↓

Store (optional)

↓

Print (optional)

============================================================

Important Difference

Argument
--------
Value passed while calling the method.

Example

square(5);

Argument = 5

--------------------------------------------

Parameter
---------
Variable that receives the argument.

Example

square(int number)

Parameter = number

--------------------------------------------

return
------
Sends value back to the caller.

It DOES NOT print anything.

Example

return 25;

--------------------------------------------

System.out.println()
--------------------
Prints the value on the console.

============================================================
*/

