package module03_conditional;

import java.sql.SQLOutput;

public class Conditional02 {
    static void main(String[] args){

        // IF-ELSE LADDER (Multi-Condition Checking)

        int marks = 99;

        // Rule 1: Jab hamare paas bohot saari conditions hoti hain, tab hum 'else if' ka use karte hain.
        // Rule 2: CRITICAL RULE: Java upar se niche check karta hai. Jaise hi KOI BHI EK block chal gaya,
        //         uske baad aage ka koi bhi block check ya execute nahi hoga! Poora ladder skip ho jayega.

        if (marks >= 90) {          // AGAR marks 90 ya usse zyada hain
            System.out.println("Grade : A"); // Output: Grade : A (Yahan true hua, ab niche ka sab band!)
        }
        else if (marks >= 75) {     // NAHI TO AGAR marks 75 ya usse zyada hain
            System.out.println("Grade : B");
        }
        else if (marks >= 60) {     // NAHI TO AGAR marks 60 ya usse zyada hain
            System.out.println("Grade : C");
        }
        else {                      // NAHI TO (Agar upar ki saari conditions fail ho jayein)
            System.out.println("Grade : D");
        }




    }
}
