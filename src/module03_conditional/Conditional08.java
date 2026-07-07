package module03_conditional;

public class Conditional08 {
    static void main(String[] args) {
        //Problem Statement:
        // Write a program that simulates a traffic light and tells the driver what to do.

        String lightColor = "yellow";

        if(lightColor.equals("Red")){
            System.out.println("Stop!");

        } else if(lightColor.equals("yellow")) {
            System.out.println("Slow down!");

        } else if(lightColor.equals("Green")) {
            System.out.println("Go!");
        }else{
            System.out.println("Invalid traffic light color.");
        }

        }
    }

