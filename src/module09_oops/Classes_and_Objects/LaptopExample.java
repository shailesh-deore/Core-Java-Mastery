package module09_oops.classes_and_objects;

// 1. The Blueprint Class
class Laptop {
    // Attributes (What the laptop HAS)
    String brand;
    String processor;
    int ramSize; // in GB
    double price; // in INR or USD

    // Action (What the laptop DOES)
    public void displaySpecifications() {
        System.out.println("Brand Name : " + this.brand);
        System.out.println("Processor  : " + this.processor);
        System.out.println("RAM Size   : " + this.ramSize + " GB");
        System.out.println("Price Tag  : $" + this.price);
        System.out.println("-------------------------------------");
    }
}

// 2. The Main Execution Class
public class LaptopExample {
    public static void main(String[] args) {

        // Creating the first laptop object
        Laptop laptop1 = new Laptop();
        laptop1.brand = "Apple";
        laptop1.processor = "M3 Chip";
        laptop1.ramSize = 16;
        laptop1.price = 1299.99;

        // Creating the second laptop object
        Laptop laptop2 = new Laptop();
        laptop2.brand = "HP";
        laptop2.processor = "Intel i7";
        laptop2.ramSize = 8;
        laptop2.price = 799.50;

        // Printing details using our reusable class action
        System.out.println("--- Laptop 1 Profile ---");
        laptop1.displaySpecifications();

        System.out.println("--- Laptop 2 Profile ---");
        laptop2.displaySpecifications();


    }
}
