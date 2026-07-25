package module06_methods;

public class Method08 {

    // check even odd with exact boolean expression
    static boolean isEven(int n){
       return n%2==0;
    }
    static void main(String[] args) {

        if(isEven(21)){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }

    }
}
