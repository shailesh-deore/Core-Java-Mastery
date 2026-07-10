package module01_basics;

public class Basics24 {
    static void main(String[] args) {
        int level = 1;
        int xp = 100;

        // Step 1: Unary & Arithmetic Mix
        int currentXp = xp++ + 10;

        // Step 2: Compound Assignment with Prefix
        level += 2;
        int nextLevel = ++level;

        // Step 3: The Ultimate Test
        int combo = 4;
        int finalResult = --combo * combo--;

        // What prints here?
        System.out.println("xp: " + xp);
        System.out.println("currentXp: " + currentXp);
        System.out.println("level: " + level);
        System.out.println("nextLevel: " + nextLevel);
        System.out.println("finalResult: " + finalResult);
    }
}
