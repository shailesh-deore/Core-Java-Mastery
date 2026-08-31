package module09_oops.classes_and_objects;

// 1. The Blueprint Class
class Car {
    // Attributes (What the car HAS)
    String brand;
    String model;
    String color;
    int topSpeed; // speed in km/h

    // Action (What the car DOES)
    public void drive() {
        System.out.println("The " + this.color + " " + this.brand + " " + this.model + " is driving fast!");
        System.out.println("Top Speed is: " + this.topSpeed + " km/h");
        System.out.println("----------------------------------------");
    }
}

// 2. The Main Execution Class
public class CarExample {
    public static void main(String[] args) {

        // Creating the first car object
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.model = "Model S";
        car1.color = "Red";
        car1.topSpeed = 250;

        // Creating the second car object
        Car car2 = new Car();
        car2.brand = "Tata";
        car2.model = "Nexon";
        car2.color = "White";
        car2.topSpeed = 180;

        // Using the objects to perform actions
        System.out.println("--- Testing Car 1 ---");
        car1.drive();

        System.out.println("--- Testing Car 2 ---");
        car2.drive();
    }
}
