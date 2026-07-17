package module04_loops;

public class Loops19 {
    static void main(String[] args) {

        // for loop

        //we can also write like thi sin one for loop ok
       /*10
         100
         1000
         10000
         100000 */

        for(int i = 10,j = 1; j<= 5; i = i * 10, j++){
            System.out.println(i);
        }
        System.out.println();



        // Approach direct

        for(int i = 10; i<= 100000; i = i * 10) {
            System.out.println(i);
        }


    }
}
