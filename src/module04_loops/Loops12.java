package module04_loops;

public class Loops12 {
    static void main(String[] args) {
        // for loop example: reverse counting

        for(int i = 10 ; i >= 1 ; i--){
            System.out.print(i+" ");
        }


        System.out.println();
        // print a line * pattern
        // *****

        for(int i = 1 ; i <= 6 ; i++){
            System.out.print("*");
        }

        // factorial of 4

        int fact = 1 ;
        for(int i = 1 ; i <=4 ; i++){
            fact = fact * i;
        }
        System.out.print("factorial of 4 is : "+fact);


        System.out.println();

        // half pyramid logics

        for(int i = 10 ; i >= 1; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
