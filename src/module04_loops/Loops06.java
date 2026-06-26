package module04_loops;

public class Loops06 {
    static void main(String[] args) {

        // SUM OF N NATURAL NUMBERS (Using while loop)

        // Logic Simple Hai: Pen-paper par socho -> 1 + 2 + 3 + 4... up to 10

        int sum = 0; // Yeh hamara piggy bank (gullak) hai jisme total save hoga
        int i = 1;   // Shuruat 1 se hogi

        while (i <= 10) {
            sum = sum + i; // Har naye number (i) ko gullaq ke andar jodte jao
            i++;           // Agle number par badho
        }

        //  WHY PRINT OUTSIDE THE LOOP? (sout bahar kyun hai?)
        // Rule: Agar sout ko loop ke ANDAR likhoge, toh Java har cycle ka adhura total
        //       (1, 3, 6, 10...) print karne lagega, jo hamein nahi chahiye.
        // Rule: Hamein sirf AKHIRI aur FINAL net result chahiye, isliye jab loop poora
        //       khatam (exit) ho jata hai, tabhi hum bahar sirf 1 BAAR print karte hain.

        System.out.println(sum); // Output: 55 (Total sum of 1 to 10)




    }
}
