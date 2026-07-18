package module04_loops;

public class Loops20 {
    static void main(String[] args) {

        // continue statement ok for while and for
        //1) while loop
        int i1 = 1;
        while(i1 <= 10){

            if(i1 == 5){
                i1++;
                continue;
            }
            System.out.println(i1);
            i1++;

        }

        System.out.println();

        //2) for loop
        for(int i = 0 ; i <=10 ; i++) {
            if (i == 5)
                continue;
            System.out.println(i);

        }
    }
}
