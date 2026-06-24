package module03_conditional;
import java.util.Scanner;
public class Problem01 {
    static void main(String[] args) {
      // conditional practice .


        int marks = 70;

        if(marks < 0 || marks > 100){
            System.out.println("Invalid marks!");
        }else if(marks >= 90){
            System.out.println("A");
        }else if(marks >= 75){
            System.out.println("B");
        }else if(marks >= 50){
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }







    }
}
