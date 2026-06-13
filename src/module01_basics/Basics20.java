package module01_basics;

public class Basics20 {
    static void main(String[] args) {

        // CLEAN PRINTING USING FORMAT SPECIFIERS (System.out.printf)

        int a = 1;
        int b = 2;
        String c = "Sum";

        // PROBLEM: String concatenation looks very messy and hard to read
        System.out.println(c + " of " + a + " & " + b + " is " + (a + b));
        System.out.print(c + " of " + a + " & " + b + " is " + (a + b) + "\n");
        System.out.printf(c + " of " + a + " & " + b + " is " + (a + b) + "\n");

        // SOLUTION: Use printf() with Placeholders (Format Specifiers)
        // %s -> String        |  %d -> Integer/Byte/Short
        // %f -> Float/Double  |  %c -> Character
        // %b -> Boolean       |  %n or \n -> New Line (Line Break)
        System.out.printf("%s of %d & %d is : %d\n", c, a, b, a + b);

        // Practice with other Data Types
        char d = 'A';
        float e = 12.2f;
        System.out.printf("%c & %f\n", d, e);

        // 1. Double Example (%f)
        double price = 99.99;
        System.out.printf("Price is: %f\n", price);

        // 2. Boolean Example (%b)
        boolean status = true;
        System.out.printf("Status is: %b\n", status);



    }
}
