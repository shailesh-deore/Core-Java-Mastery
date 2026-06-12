package module01_basics;

public class Basics15 {
    static void main(String[] args) {

        // UNARY OPERATORS: POSTFIX INCREMENT & DECREMENT (a++ , a--)
        // Rule: Use the current value first, then change it later.

        // 1. Basic Postfix Increment (a++)
        int a = 1;
        a++;                   // Value becomes 2
        System.out.println(a); // Output: 2

        // 2. Basic Postfix Decrement (b--)
        int b = 2;
        b--;                   // Value becomes 1
        System.out.println(b); // Output: 1

        // 3. Tricky Postfix Assignment (c++)
        int c = 99;
        int d = c++;
        System.out.println(d); // Output: 99 (First, current value of 'c' is assigned to 'd')
        System.out.println(c); // Output: 100 (Then, 'c' is incremented in memory)

        // 4. Tricky Postfix Assignment (t--)
        int t = 99;
        int p = t--;
        System.out.println(p); // Output: 99 (First, current value of 't' is assigned to 'p')
        System.out.println(t); // Output: 98 (Then, 't' is decremented in memory)




        // UNARY OPERATORS: PREFIX INCREMENT & DECREMENT
        // Rule: Change the value first, then use it in the line.

        // 1. Basic Prefix Increment (++s)
        int s = 2;
        ++s;                   // Increments to 3 immediately
        System.out.println(s); // Output: 3

        // 2. Basic Prefix Decrement (--w)
        int w = 2;
        --w;                   // Decrements to 1 immediately
        System.out.println(w); // Output: 1

        // 3. Prefix Assignment with Increment (++num)
        int num = 2;
        int output = ++num;    // First 'num' becomes 3, then 3 is assigned to 'output'
        System.out.println(output); // Output: 3
        System.out.println(num);    // Output: 3

        // 4. Prefix Assignment with Decrement (--num2)
        int num2 = 2;
        int output2 = --num2;  // First 'num2' becomes 1, then 1 is assigned to 'output2'
        System.out.println(output2); // Output: 1
        System.out.println(num2);    // Output: 1





        // mix operation for understanding

        // Example 1: Postfix mix
        int a1 = 1;
        int b1 = a1++ + a1;    // 1 + 2 = 3
        System.out.println(b1); // Output: 3

        // Example 2: Prefix mix
        int t1 = 1;
        int t2 = ++t1 + t1;    // 2 + 2 = 4
        System.out.println(t2); // Output: 4


        // Rule: Java reads variables from left to right, so the first 'g' takes 2 before '(g++)' runs.
        int g = 2;
        int f = g + (g++);     // 2 + 2 = 4
        System.out.println(f); // Output: 4
        System.out.println(g); // 3

        int y = 1;
        System.out.println(y++ + y);
        // 3


        int x = 1;
        System.out.println(x++ + --x);
        // Step 1: x++ returns 1 (x becomes 2 in memory)
        // Step 2: --x decreases 2 back to 1, and returns 1
        // Math: 1 + 1 = 2




    }
}
