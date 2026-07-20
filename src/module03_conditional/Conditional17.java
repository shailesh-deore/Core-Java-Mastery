package module03_conditional;
import java.util.Scanner;
public class Conditional17 {
    static void main(String[] args) {
        // Console based Recharge Offer System

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a recharge : ");
        int recharge= sc.nextInt();

        if(recharge < 100){
            System.out.println("No Offer");
        }else if(recharge < 200){
            System.out.println("1 GB Extra Data");
        }else if(recharge < 500){
            System.out.println("3 GB Extra Data");
       }else if(recharge < 1000){
            System.out.println("5 GB Extra Data");
        }else{
            System.out.println("Unlimited Data + OTT Subscription");
        }

        sc.close();
    }
}
