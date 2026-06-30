package module04_loops;

public class Loops14 {
    static void main(String[] args) {
        // Hollow Square Pattern

        int n = 10;

        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n ; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
