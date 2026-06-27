package module04_loops;

import org.w3c.dom.ls.LSOutput;

public class Loops07 {
    static  void main(String[] args){

        // COUNT DIGITS OF A NUMBER (Using while loop)

        // Logic Simple Hai: Kisi bhi number ko 10 se divide (/) karne par
        //  uska aakhiri digit permanent delete ho jaata hai!

        int n = 1234567; // Diya gaya number
        int res = 0;     // Yeh hamara counter hai jo digits ko ginne ka kaam karega

        while (n > 0) {
            n = n / 10;  // 10 se divide karo -> Aakhiri digit ko hamesha ke liye uda do!
            res++;       // Ek digit delete hua, toh counter ko +1 badha do
        }

        // WHY PRINT OUTSIDE THE LOOP?

        // Rule: Agar sout ko loop ke andar likhoge, toh Java har step par bacha hua number
        //       aur adhura count dikhane lagega (jaise 1, 2, 3...).
        // Rule: Hamein digits ka sirf FINAL TOTAL COUNT chahiye, isiliye loop poora khatam
        //       hona ke baad hi hum bahar sirf 1 BAAR counter ko print karte hain.

        System.out.println(res); // Output: 7 (Kyunki number mein total 7 digits hain)


    }
}

