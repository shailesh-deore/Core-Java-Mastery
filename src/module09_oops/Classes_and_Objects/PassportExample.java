package module09_oops.classes_and_objects;

// 1. THE CLASS (The blank blueprint)
class Passport {
    // Attributes (data fields)
    String name;
    String country;

    // Constructor (Initializes the blank form with data)
    public Passport(String ownerName, String homeCountry) {
        this.name = ownerName;
        this.country = homeCountry;
    }

    // Method (The action the object can perform)
    public void printDetails() {
        System.out.println("Passport Holder: " + this.name + " | Country: " + this.country);
    }
}

// 2. THE RUNNABLE PROGRAM (Where objects are made)
public class PassportExample {
    public static void main(String[] args) {
        // Creating the unique objects using the 'new' keyword
        Passport passportOne = new Passport("Alex", "India");
        Passport passportTwo = new Passport("Emma", "Canada");

        // Executing actions on the objects
        passportOne.printDetails(); // Output: Passport Holder: Alex | Country: India
        passportTwo.printDetails(); // Output: Passport Holder: Emma | Country: Canada
    }
}
