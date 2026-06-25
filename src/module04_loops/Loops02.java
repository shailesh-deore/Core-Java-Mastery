package module04_loops;

public class Loops02 {
    static void main(String[] args) {

        // DO-WHILE LOOP (Exit-Controlled Loop)

        // Rule 1: Iska kaam hai bina kuch soche pehle 1 baar code chalana, condition baad mein dekhna.
        // Rule 2: End mein while ke bracket ke baad semicolon ';' lagana compulsory hai.

        int i = 1; // 1. Shuruat

        do {
            System.out.println(i); // Current number ko print karega (1 se 50).

            i++; // 2. Step: i ki value ko +1 badhayega.
        } while (i <= 50); // 3. Checkpoint (Yahan semicolon pakka lagao!)


        //  THE RISK FACTOR: Yeh industry mein bohot kam kyun use hota hai?

        // Problem: Maan lo user ka account balance 0 hai, fir bhi yeh loop 1 baar paise deduct kar dega!
        // Proof: Agar aap int x = 100; rakhoge aur condition check karoge while(x <= 5);
        //        Toh bhi yeh loop bina checking ke pehle 1 baar 100 print kar hi dega.




    }

}
