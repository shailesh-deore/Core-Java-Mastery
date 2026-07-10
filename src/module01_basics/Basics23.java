package module01_basics;

public class Basics23 {
    static void main(String[] args) {
        int score = 10;
        int multiplier = 3;

        // Step 1: Compound Assignment
        score *= multiplier;

        // Step 2: Arithmetic with Unary Postfix
        int finalScore = score + 5;
        score++;

        // Step 3: Complex Unary Mix
        int energy = 5;
        int totalEnergy = ++energy + energy++;

        // What prints here?
        System.out.println("Score: " + score);
        System.out.println("Final Score: " + finalScore);
        System.out.println("Total Energy: " + totalEnergy);
    }
}
