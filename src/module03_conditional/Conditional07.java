package module03_conditional;

public class Conditional07 {
    static void main(String[] args) {
        //Problem Statement:
        // A movie Theatre gives discounts based on a person's age.
        // Write a program to determine the ticket price message.

        int age = 18;
        if(age <= 13){
            System.out.println("Child Ticket: 50% discount!");
        } else if (age >= 65) {
            System.out.println("Senior Ticket: 30% discount!");
        }else{
            System.out.println("Regular Ticket: Full price.");
        }

    }
}
