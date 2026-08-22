package module08_problems;
import java.util.Scanner;
public class SwapOfTwoNum {
    public static  void main(){
        // swap of two num using third temporary variable

        int a = 10;
        int b = 20;

        System.out.println("Numbers before swap : ");
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Numbers After swapped : ");
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);

        // swap of two num without using third temporary variable pls use operation

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num 1 : ");
        int n1 = sc.nextInt();

        System.out.println("Enter a num 2 : ");
        int n2 = sc.nextInt();

        System.out.println("Original are n1 & n2 : " + n1 + " & " + n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("after swaping n1 & n2 are : " + n1 + " & " + n2);
        

    }
}
