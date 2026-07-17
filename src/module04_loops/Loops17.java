package module04_loops;

import java.util.Scanner;
public class Loops17 {
    static void main(String[] args) {
        // printing table using scanner

        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter A Number For Printing A Table : ");
        num = sc.nextInt();

        int i = 1;
        while(i <= 10){
            System.out.println(num+" X "+i+" = "+( i * num));
            i++;
        }

        sc.close();


    }
}
