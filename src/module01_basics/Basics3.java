package module01_basics;

 public class Basics3 {
    public static void main(String[]args){

        // primitive datatype in java
        // characters
        // char 2 byte

        char myChar = 'A';
        char myChar2 = 'a';
        char num = '2';
        char symbol = '@';
        char check = 'p';
        // we can store num alphabet or symbol in single char
        // Store only Single character , in Single Quotes
        // in char data type each character mapped in numerical value corresponding
        // in memory char store in numerical format

        System.out.println(myChar);
        System.out.println(myChar2);
        System.out.println((int)symbol);
        // type casting char convert into int , we can do it , because char in memory store in number format


        System.out.println((int)check);
        // output is
        //112 << p in memory

        //range
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        // output not clear understable by user

        // for understand we can type caste into integer
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        // in java we can store char from 0 to 65535 til

        System.out.println(10084);
        //type cast in char for check corresponding char
        System.out.println((char)10084);
        // output ❤

        char heartSymbol = (char)10084;
        // no need to type cast
        System.out.println(heartSymbol);

        char symBoll = 1234;
        System.out.println(symBoll);

        // standard method
        // Unicode representation
        char Heart = '\u2764';
        System.out.println(Heart);




    }
}
