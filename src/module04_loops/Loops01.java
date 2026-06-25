package module04_loops;

public class Loops01 {
    static void main(String[] args) {
        // Loops : while , do-while , for
        // Definition: A loop is used to execute the same block of code repeatedly.
        // Why Use: It stops code repetition and completely AUTOMATES the task.


        // THE 3 MANDATORY PILLARS OF ANY LOOP

        // 1. Initialization: The starting point where the loop counter variable is created (e.g., int i = 1).
        // 2. Condition: The boolean checkpoint that determines exactly when the loop must stop (e.g., i <= 10).
        // 3. Upgrade: The step size that forces the counter to move forward or backward (e.g., i++ or i--).



        // WHILE LOOP: RUNTIME EXECUTION TRACKING

        // THE INFINITE LOOP TRAP (Commented out):
        // int i = 0;
        // while(i == 0){
        //     System.out.println("Hello world");
        // }
        // Reason: Kyunki 'i' hamesha 0 rahega, condition hamesha TRUE rahegi aur loop kabhi nahi rukega!

        int i = 1; // 1. Initialization (Shuruat)

        while (i <= 10) { // 2. Condition Check (Checkpoint)
            System.out.println("Hello World !");

            i = i + 1; // 3. Upgradation (Step Size)
        }

        // LINE-BY-LINE JVM EXECUTION TRACE (For Your Revision)

        // Cycle 1:  i=1  ➔  1 <= 10 (TRUE)  ➔ Print #1  ➔ i becomes 2
        // Cycle 2:  i=2  ➔  2 <= 10 (TRUE)  ➔ Print #2  ➔ i becomes 3
        // Cycle 3:  i=3  ➔  3 <= 10 (TRUE)  ➔ Print #3  ➔ i becomes 4
        // Cycle 4:  i=4  ➔  4 <= 10 (TRUE)  ➔ Print #4  ➔ i becomes 5
        // Cycle 5:  i=5  ➔  5 <= 10 (TRUE)  ➔ Print #5  ➔ i becomes 6
        // Cycle 6:  i=6  ➔  6 <= 10 (TRUE)  ➔ Print #6  ➔ i becomes 7
        // Cycle 7:  i=7  ➔  7 <= 10 (TRUE)  ➔ Print #7  ➔ i becomes 8
        // Cycle 8:  i=8  ➔  8 <= 10 (TRUE)  ➔ Print #8  ➔ i becomes 9
        // Cycle 9:  i=9  ➔  9 <= 10 (TRUE)  ➔ Print #9  ➔ i becomes 10
        // Cycle 10: i=10 ➔ 10 <= 10 (TRUE)  ➔ Print #10 ➔ i becomes 11
        // Exit:     i=11 ➔ 11 <= 10 (FALSE) ➔ Loop breaks instantly!



        // WHILE LOOP: SIMPLE COUNTING (1 TO 50)

        int i1 = 1; // 1. Shuruat: Loop 1 se start hoga.

        while (i1 <= 50) { // 2. Checkpoint: Jab tak i1 50 ya usse chota hai, andar jao.
            System.out.println(i1); // Current number ko print karega (1, 2, 3... up to 50).

            i1++; // 3. Step: i1 ki value ko har cycle mein +1 badhayega.
        }

        // RUNTIME SHORT TRACE (Dimaag ke liye)

        // Cycle 1:  i1 = 1  ➔  1 <= 50 (TRUE)  ➔ Print 1  ➔ i1 becomes 2
        // Cycle 2:  i1 = 2  ➔  2 <= 50 (TRUE)  ➔ Print 2  ➔ i1 becomes 3
        // ...
        // Cycle 50: i1 = 50 ➔ 50 <= 50 (TRUE)  ➔ Print 50 ➔ i1 becomes 51
        // Exit:     i1 = 51 ➔ 51 <= 50 (FALSE) ➔ Loop breaks! Final value in memory = 51.




       // WHILE LOOP: EXTRA IMPORTANT DEV NOTES


       // 1. Entry-Controlled Guard: Yeh loop bina condition check kiye
       //    bichare code ko 1 baar bhi chalne nahi deta. Agar pehli baar
       //    mein hi condition false ho gayi, toh output zero (khali) aayega.

       // 2. Upgradation Mandatory Rule: Agar aap block ke andar 'i++' ya
       //    'i--' likhna bhool gaye, toh loop hamesha ke liye trap ho jayega.
       //    Isse system ka CPU use 100% ho jata hai aur system hang ho sakta hai.

       // 3. The Semicolon Trap (DO NOT DO THIS):
       //    while(i <= 10); { ... }
       //    Condition ke baad kabhi bhi semicolon ';' mat lagana. Semicolon
       //    lagate ہی loop wahin khatam ho jata hai aur infinite loop ban jata hai.

       // 4. When to Use: Real-world production mein ise tabhi chalayein jab
       //  ginti fixed na ho (e.g., jab tak database se data aa raha hai, tab tak chalte raho).



      //INTERVIEW GOLDEN RULE: KAUN SA LOOP KAB USE KAREIN?

      // 1. FOR LOOP:      Jab ginti pehle se FIX aur maaloom ho (e.g., 1 se 10 tak ginti chalani ho).
      // 2. WHILE LOOP:    Jab ginti FIX na ho, sirf ek DYNAMIC CONDITION pata ho (e.g., jab tak user sahi PIN na daale).
      // 3. DO-WHILE LOOP: Jab condition chahe galat hi kyun na ho, par code ko KAM SE KAM 1 BAAR pakka chalana ho (e.g., Game Menu dikhana).




    }
}
