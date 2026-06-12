package module01_basics;

public class Basics17 {
     static void main(String[]args){

         // BITWISE OPERATORS (Playing with Raw Bits)

         // Rule 1: Computers store all data in raw binary format (0 and 1)
         int a = 5;

         // Rule 2: Use wrapper class method to check binary values automatically
         System.out.println(Integer.toBinaryString(a)); // Output: 101

         // What Is Bitwise Operators
         // Rule 3: Bitwise operators let you change and manipulate individual bits (0 and 1)
         // Rule 4: Performance - Bitwise operations are directly processed by CPU, making them faster than regular arithmetic
         // Rule 5: Data Constraints - Only works on Integer types (byte, short, int, long). NOT allowed on decimals (float/double)


         // THE 7 TYPES OF BITWISE OPERATORS

         int x = 5; // Binary: 0101
         int y = 4; // Binary: 0100

         // 1. Bitwise AND (&) -> Both bits must be 1 to get 1
         System.out.println(x & y);   // 0101 & 0100 = 0100 -> Output: 4

         // 2. Bitwise OR (|) -> At least one bit must be 1 to get 1
         System.out.println(x | y);   // 0101 | 0100 = 0101 -> Output: 5

         // 3. Bitwise XOR (^) -> Bits must be different to get 1
         System.out.println(x ^ y);   // 0101 ^ 0100 = 0001 -> Output: 1

         // 4. Bitwise NOT (~) -> Flips 0 to 1, and 1 to 0
         // QUICK FORMULA: ~N = -(N + 1)
         System.out.println(~x);      // Formula: -(5 + 1) -> Output: -6

         // 5. Left Shift (<<) -> Moves bits left (Adds 0 at the end)
         // QUICK FORMULA: Multiply the number by 2 for every 1 shift
         System.out.println(x << 1);  // 5 * 2 -> Output: 10
         System.out.println(x << 2);  // 5 * 2 * 2 -> Output: 20

         // 6. Right Shift (>>) -> Moves bits right
         // QUICK FORMULA: Divide the number by 2 (Ignore the decimal)
         System.out.println(x >> 1);  // 5 / 2 -> Output: 2

         // 7. Unsigned Right Shift (>>>) -> Moves bits right and always fills empty spaces on the left with 0
         System.out.println(x >>> 1); // Works like normal right shift for positive numbers -> Output: 2



          //practicals
          // and
          int c =  x & y;
         System.out.println(Integer.toBinaryString(x));
         System.out.println(Integer.toBinaryString(y));
         System.out.println(c); // expected Answer : y = 4

         // or
         int v =  5 | 7 ;
         System.out.println(Integer.toBinaryString(5));
         System.out.println(Integer.toBinaryString(7));
         System.out.println(v); // expected Answer : 7

         // xor
         int f = 5 ^ 7;
         System.out.println(f); // expected Answer : 2 (010)
         int  check = 2 ;
         System.out.println(Integer.toBinaryString(2));

         // not ~  no need to two operand only one
          int b = 5 ; //formula -(5+1) = -6 // Split the bits 101 >> 010
          int o = ~b;
         System.out.println(o);
         System.out.println(Integer.toBinaryString(o));


         // left shift <<

         int t = 5 ;
         System.out.println(Integer.toBinaryString(5));
         int o1 = t << 1; // 5*2 = 10
         int o2 = t << 2;  // 5*2*2 = 20
         System.out.println(o1);
         System.out.println(o2);

         // right shift >>
         int u = 5;
         int p = u >> 1;
         System.out.println(p); // 2
         System.out.println(Integer.toBinaryString(p));

         

     }
}
