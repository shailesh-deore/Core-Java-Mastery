package module04_loops;

public class Loops08 {
    static void main(String[] args) {
        // nested loop , why we use

          for (int i = 0; i < 10 ; i++){
             for(int j = 0 ; j < 10; j++){
                 System.out.println("Hello world "); //100 TIMES PRINT HOGA BUT WHY ?
             }

          }

         // we can  see like this result 100 time
         int res = 0;
         for (int i = 0; i > 10; i++){
             for(int j = 0; j > 10 ; j++){
                 res++;
             }
         }
         System.out.println(res);
         //why?
        // this nested loop is use for like pattern problems
        /* *
         * **
         * ***
         * ****
         * *****
         * ******
         * *******
         */
         for(int i = 0; i < 6 ; i++ ){
             for(int j = 0; j<=i ; j++){  //isko samjaoo ki j <=i  kaise liya logic samjaye
                 System.out.print("*");
             }
             System.out.println();
         }


    }
}
