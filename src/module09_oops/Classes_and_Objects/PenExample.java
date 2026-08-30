package module09_oops.classes_and_objects;

class Pen {
    // 1. Attributes (What the pen HAS)
    String color;
    String brand;

    // 2. Actions (What the pen DOES)
    public void write() {
        System.out.println("The " + color + " " + brand + " pen is writing!");
    }
}

public class PenExample {
    public static void main(String [] args){

        // Creating the first object (Pen 1)
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.brand = "Reynolds";

        // Creating the second object (Pen 2)
        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.brand = "Cello";

        // Using the objects to do actions
        pen1.write(); // Output: The Blue Reynolds pen is writing!
        pen2.write(); // Output: The Red Cello pen is writing!
    }
}


