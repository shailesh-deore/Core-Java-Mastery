package module08_problems;
import javax.swing.text.EditorKit;
import java.util.Scanner;
public class CountDigits {
    static void main(String[] args) {

        // count digits
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Input for count a Digits : ");
        long Input = sc.nextLong();
        int count = 0;
        while (Input > 0) {
            Input = Input / 10;
            count++;
        }
        System.out.println(count);

        sc.close();

        System.out.println();





        //same using for loop

        int digit = 1233456;
        int count1;
        for (count1 = 0; digit > 0; digit /= 10) {
            count1++;
        }
        System.out.println(count1);




    }
}
