package module03_conditional;

public class Conditional04 {
    static void  main (String[] args) {
        // switch cse importance

        int day1 = 5;

        if(day1 == 1){
            System.out.println("Monday");

        }else if (day1 == 2){
            System.out.println("Tuesday");

        } else if (day1 == 3) {
            System.out.println("Wednesday");

        } else if (day1 == 4) {
            System.out.println("Thursday");

        }else if(day1 == 5){
            System.out.println("Friday");

        }else if (day1 == 6){
            System.out.println("Saturday");

        }else if(day1 == 7){
            System.out.println("Sunday");

        }else{
            System.out.println("Invalid ! ");

        }



        // WHY SWITCH CASE? (if-else ladder ki gandagi saaf karne ke liye)

        // Problem: Agar 50 conditions check karni hon, toh 50 baar 'else if' likhna padega.
        //          Code bohot heavy, ganda aur slow dikhne lagta hai.
        // Solution: Switch-case use karo! Yeh direct target case par jump karta hai.

        int day = 1;

        switch (day) { // Jo variable check karna hai, use bracket () mein dalo

            case 1: {
                System.out.println("Monday");
                break; // CRITICAL! Agar yeh BREAK nahi lagaya, toh Java case 2 ko bhi chalayega!
            }
            case 2: {
                System.out.println("Tuesday");
                break; // Break ka matlab: "Mera kaam ho gaya, ab switch block se BAHAR niklo!"
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday"); // Fix: Default spelling correct
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: { // default matlab -> 'else' (Agar koi bhi case match nahi hua toh yeh chalega)
                System.out.println("Invalid !");
            }
        }

       // Performance Rule: Switch-case direct target case par jump karta hai.
       // Importance: Yeh if-else ki tarah line-by-line check nahi karta, isiliye code fast chalta hai aur performance improve hoti hai.




       // SWITCH DATA TYPES RULES
       // 1. ALLOWED: byte, short, int, char, String, and enums.
       // 2. NOT ALLOWED: long, float, double, and boolean.


       // SWITCH WITH STRING DATA TYPE

       // Rule: Java 7 ke baad se hum switch ke andar direct String use kar sakte hain.
       // Rule: Strings hamesha case-sensitive hoti hain ("Apple" aur "apple" alag hain).

        String fruit = "Banana";

        switch (fruit) { // String variable ko check karne ke liye dala

            case "Apple": {
                System.out.println("Red color fruit and healthy!");
                break;
            }
            case "Banana": {
                System.out.println("Yellow color fruit, instant energy!");
                break; // Output: Yellow color fruit, instant energy!
            }
            case "Cherry": {
                System.out.println("Small red fruit, perfect for cakes!");
                break;
            }
            default: { // Agar upar ka koi bhi fruit match nahi hua
                System.out.println("Unknown fruit choice!");
            }
        }


        // SWITCH PATTERN: MULTIPLE CASES GROUPING (Fall-Through)

        // Rule 1: Agar kisi case ke andar code aur break NAHI likha hai,
        //         toh Java bina ruke niche wale case par slip (fall) ho jata hai.
        // Rule 2: Jab 2 ya 3 alag-alag inputs par ek hi result chahiye ho,
        //         tab yeh group-style writing coding ka best-practice maani jaati hai.

        int number = 2;

        switch (number) {
            case 1:  // Agar number 1 hai, toh yeh niche slip karega...
            case 2:  // Agar number 2 hai, toh yeh bhi niche slip karega...
            case 3:  // Agar number 3 hai, toh control yahan rukega aur niche ka code chalayega!
                System.out.println("Number is 1 , 2 or 3 "); // Output: Number is 1 , 2 or 3
                break; // Yahan break mila, ab safely switch block se bahar!

            case 4: {
                System.out.println("Number is 4 ");
                break;
            }
            default: {
                System.out.println("Number is not 1 , 2 , 3 or 4");
            }
        }

    }
}
