package module03_conditional;

public class Conditional06 {
    static void main(String[] args) {
        //Problem Statement:
        // Write a program that checks the weather temperature and tells you if it is freezing or not.

        int temperature = 28;

        if(temperature < 32){
            System.out.println("It is freezing cold!");
        }else{
            System.out.println("The weather is fine.");
        }


        // check num is even or odd ok

        int num = 20;

        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }


    }
}
