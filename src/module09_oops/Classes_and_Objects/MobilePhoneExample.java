package module09_oops.classes_and_objects;

// 1. The Blueprint Class
class MobilePhone {
    // Attributes (What the phone HAS)
    String brand;
    String model;
    String color;
    int battery;

    // Action (What the phone DOES)
    public void printDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Battery: " + this.battery + "%");
        System.out.println("-----------------------------");
    }
}

// 2. The Main Execution Class
public class MobilePhoneExample {
    public static void main(String[] args) {

        // Creating the first phone object
        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy S26 Ultra";
        phone1.color = "Gray";
        phone1.battery = 100;

        // Creating the second phone object
        MobilePhone phone2 = new MobilePhone();
        phone2.brand = "Apple";
        phone2.model = "iPhone 17 Pro";
        phone2.color = "Gold";
        phone2.battery = 90;

        // Printing info of both phones
        System.out.println("--- Phone 1 Details ---");
        phone1.printDetails();

        System.out.println("--- Phone 2 Details ---");
        phone2.printDetails();
    }
}
