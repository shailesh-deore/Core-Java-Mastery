package module05_array;

public class Array08 {
    static void main(String[] args) {

        // FIND MAXIMUM ELEMENT IN ARRAY

        int[] arr = new int[5];
        arr[0] = -12;
        arr[1] = 120;
        arr[2] = 1233;
        arr[3] = -1277;
        arr[4] = 344;

        //  CRITICAL RULE: Integer.MIN_VALUE kyun use kiya?
        // - Iska matlab hota hai Java ka sabse chota negative number (-2147483648).
        // - Agar aap 'res = 0' lete, aur array mein saare numbers NEGATIVE hote (jaise -5, -12, -20),
        //   toh aapka loop 0 ko hi maximum bol deta, jo ki galat hota kyunki 0 array mein hai hi nahi!
        // - Isliye hum sabse choti negative infinity se shuru karte hain taaki array ka pehla hi
        //   element isse bada ho jaye aur 'res' mein safely save ho sake.


        int res = Integer.MIN_VALUE;  // using negative infinity instead of 0 why explain !

        // LOOP LOGIC: Linear Comparison
        for (int i = 0; i < arr.length; i++) {

            // Agar array ka current dabba hamare 'res' se bada hai, toh 'res' ko update kar do.
            if (arr[i] > res) {
                res = arr[i]; // Naya sabse bada number 'res' ke andar store ho gaya
            }
        }

        System.out.println(res); // Output: 1233 (Sabse bada element)


    }
}
