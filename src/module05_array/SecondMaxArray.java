package module05_array;

public class SecondMaxArray {
    static void main(String[] args) {

        // second max of arrays
        int[] arr2 = {12, 45, 2, 78, 34};

        // Shuruat mein hum pehle element ko hi max aur secondMax maan lete hain
        // Ya fir Integer.MIN_VALUE (sabse chota possible number) se initialize karte hain
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr2.length; i++) {
            // Case 1: Agar naya element abhi tak ke sabse bade (max) se bhi bada nikal gaya
            if (arr2[i] > max) {
                secondMax = max;  // Jo purana sabse bada tha, wo ab dusre number par aa gaya
                max = arr2[i];    // Aur naya element ab sabse bada ban gaya
            }
            // Case 2: Agar naya element max se toh chota hai, par secondMax se bada hai
            else if (arr2[i] > secondMax && arr2[i] != max) {
                secondMax = arr2[i]; // Toh sirf secondMax ko update karenge
            }
        }

        System.out.println("Second Largest Element: " + secondMax);
    }
}


