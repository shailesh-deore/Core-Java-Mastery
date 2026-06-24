package module03_conditional;

public class Conditional01 {
    static void main(String[] args) {

        // CONDITIONAL STATEMENTS (if-else)

        int age = 10;

        // Rule 1: if ke bracket () ke andar hamesha ek boolean expression hota hai jo true ya false deta hai.
        // Rule 2: {} ko block bolte hain. Agar condition true hogi, toh sirf if ka block chalega.
        // Rule 3: Agar condition false hogi, toh if ka block skip ho jayega aur else ka block chalega.

        if (age >= 18) {  // if matlab -> AGAR (Age 18 ya 18 se badi hai)
            System.out.println("you are an adult !");
        }
        else {           // else matlab -> NAHI TO (Agar upar wali condition galat ho jaye)
            System.out.println("sorry your a child ! "); // Output: sorry your a child !
        }

        // IF-ELSE WITH LOGICAL AND (&&)

        int Age = 50;
        int Marks = 35;

        // Rule 1: && operator ka matlab hai ki DONO conditions ka sahi (true) hona zaroori hai.
        // Rule 2: Yahan Pehli Condition (50 <= 20) -> FALSE hai.
        // Rule 3: Doosri Condition (35 >= 33) -> TRUE hai.
        // Result: FALSE && TRUE ka final answer FALSE aata hai, isiliye 'else' block chalega.

        if (Age <= 20 && Marks >= 33) { // AGAR Age 20 ya choti ho AUR Marks 33 ya bade hon
            System.out.println("congrates");
        }
        else {                           // NAHI TO (Agar ek bhi condition galat hui)
            System.out.println("sorry !"); // Output: sorry !
        }


        // THE ALWAYS-TRUE PATH (Hamesha Chalne Wali Condition)

        // Rule: Agar if() ke andar direct boolean value 'true' pass kar dein,
        //       toh Java bina kisi comparison ke is block ko HAMESHA chalayega.

        if (true) { // AGAR hamesha sach hai (No calculation needed!)
            System.out.println("hello world"); // Output: hello world (Hamesha print hoga!)
        }



    }
}
