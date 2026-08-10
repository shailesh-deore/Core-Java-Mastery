package module08_problems;
import java.util.Scanner;
public class FactorialFor {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num for calculating factorial : ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = 1; i <= n ; i++){
            fact = fact * i ;
        }
        System.out.println(fact);


    }

}
