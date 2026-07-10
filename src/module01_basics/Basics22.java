package module01_basics;

public class Basics22 {
    static void main(String[] args) {
        // 1. Arithmetic Operators
        int total = 15 + 5;      // Addition (20)
        int remainder = 17 % 5;  // Modulo/Remainder (2)

        System.out.println("Arithmetic Total: " + total);
        System.out.println("Arithmetic Remainder: " + remainder);

        // 2. Compound Assignment Operators
        int wallet = 50;
        wallet += 20;            // Same as: wallet = wallet + 20 (70)
        wallet *= 2;             // Same as: wallet = wallet * 2 (140)

        System.out.println("Wallet Balance: " + wallet);

        // 3. Unary Operators (Prefix vs Postfix)
        int lives = 3;
        int currentLives = lives--; // Uses 3, then lives becomes 2

        System.out.println("Current Lives (Postfix): " + currentLives);
        System.out.println("Actual Lives Left: " + lives);

        int bonusLives = ++lives;  // Lives becomes 3, then uses 3
        System.out.println("Bonus Lives (Prefix): " + bonusLives);
    }
}

