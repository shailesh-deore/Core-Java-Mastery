package module01_basics;
import java.util.*;
import java.math.BigInteger;
import java.util.Scanner;
public class Basics21 {
    static void main(String[] args) {

                // SCANNER SETUP

                // new Scanner(System.in) creates the input stream in Heap memory.
                // System.in tells Java to listen to your physical keyboard inputs.
                Scanner input = new Scanner(System.in);


                // 1. PRIMITIVE WHOLE NUMBERS

                System.out.print("Enter an Integer: ");
                int intVar = input.nextInt();

                System.out.print("Enter a Small Byte: ");
                byte byteVar = input.nextByte();

                System.out.print("Enter a Short Number: ");
                short shortVar = input.nextShort();

                System.out.print("Enter a Huge Long Number: ");
                long longVar = input.nextLong();


                // 2. DECIMAL NUMBERS

                System.out.print("Enter a Float Decimal: ");
                float floatVar = input.nextFloat();

                System.out.print("Enter a Double Decimal: ");
                double doubleVar = input.nextDouble();


                // 3. CONDITIONALS & LOGIC

                System.out.print("Are you a Java Developer? (true/false): ");
                boolean boolVar = input.nextBoolean();


                // 4. STRINGS & SINGLE CHARACTERS

                System.out.print("Enter your First Name: ");
                String singleWord = input.next();

                // Newline Trap Fix: Clears the hidden '\n' space left by numbers in memory.
                input.nextLine();

                System.out.print("Enter your Full Name: ");
                String fullSentence = input.nextLine();

                System.out.print("Enter any single Character: ");
                // .next() gets the word, .charAt(0) clips the character at index 0.
                char charVar = input.next().charAt(0);


                // 5. INFINITE NUMBERS (BigInteger)

                System.out.print("Enter an Infinite Size BigInteger: ");
                String bigInput = input.next();
                BigInteger hugeNumber = new BigInteger(bigInput);

                // Math operations on BigInteger require explicit method calls.
                BigInteger addedResult = hugeNumber.add(new BigInteger("100"));
                System.out.println("Result after adding 100: " + addedResult);


                // CLOSURE

                // input.close() terminates the stream to avoid system memory leaks.
                input.close();


               //java mein import java.util.*; line ka ekdum simple aur direct matlab hota hai:
               // "Utility folder (package) ke andar jitni bhi classes hain, un sabhi ko ek sath mere code mein use karne ke liye permission de do
               // * wildcard


            }
        }



