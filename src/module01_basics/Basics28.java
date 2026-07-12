package module01_basics;

public class Basics28 {
    static void main(String[] args) {
        //example
        // boolean data type: true = ON, false = OFF
        boolean lightOn = false;

        // Toggle 1: Turns ON
        lightOn ^= true;
        System.out.println("Light status: " + lightOn); // Prints: true

        // Toggle 2: Turns OFF
        lightOn ^= true;
        System.out.println("Light status: " + lightOn); // Prints: false

    }
}
