package module03_conditional;

public class Conditional03 {
    static void main(String[] args) {

        // PRACTICE TASK: ONLINE DELIVERY DISCOUNT SYSTEM
        int billAmount = 620;

        // Tracing: 620 >= 500 ka answer TRUE aayegi.
        // Result: Java sirf 'if' ka block chalayega aur 'else' ko skip kar dega.

        if (billAmount >= 500) {   // AGAR bill 500 ya usse zyada hai
            System.out.println("Get 20% Discount!"); // Output: Get 20% Discount!
        }
        else {                     // NAHI TO (Agar bill 500 se kam hai)
            System.out.println("No Discount. Add more items! ");
        }



    }
}
