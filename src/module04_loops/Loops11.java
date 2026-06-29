package module04_loops;

public class Loops11 {
    static void main(String[] args) {
        // print all even num among 1 to 10 ok

        for (int i = 1 ; i <= 10; i++ ){
           if(i%2==0){
               System.out.print(i+" ");
           }
        }

        System.out.println();


        //  performance  optimized ok
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.print(i + " ");
        }


        System.out.println();

        // print 5 table ok

        int num = 5;
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(num+ " x " + i + " = "+num*i);

        }

        System.out.println();

        // sum, of digit till 5 ok

        int sum = 0;
        for(int i = 1 ; i <= 5 ; i++){
          sum +=i;
        }
        System.out.println(sum);



    }
}
