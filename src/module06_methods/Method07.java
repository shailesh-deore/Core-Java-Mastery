package module06_methods;

public class Method07 {

    // find max in between three

    static int findMax(int a , int b , int c){
        if( a >= b && a >= c){
            return a;
        } else if ( b >= a && b >= c) {
            return b;
        }else{
            return c;
        }
    }
    static void main(String[] args) {
        // find max using scanner ok
        int max = findMax(20,80,10);
        System.out.println(max);
    }
}
