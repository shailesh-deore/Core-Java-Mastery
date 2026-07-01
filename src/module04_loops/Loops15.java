package module04_loops;

public class Loops15 {
    static void main(String[] args) {

        // number pattern
        int n = 4;
        int num = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i ; j++){
              System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }


    }
}
