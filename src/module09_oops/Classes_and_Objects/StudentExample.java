package module09_oops.classes_and_objects;

// 1. The Blueprint Class (Keep it non-public so it can stay in this file)
class Student {
    // Attributes / Variables (What a student HAS)
    int age;
    String name;
    int rollNo; // Clean Code Tip: Variable names should start with a small letter (camelCase)

    // Action / Method (What a student DOES)
    public void printInfo() {
        System.out.println("Age: " + this.age);
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNo);
    }
}

// 2. The Main Execution Class (Change the name to match the topic)
public class StudentExample {
    public static void main(String[] args) {

        // Step 1: Create a real object (s1) from the Student blueprint
        Student s1 = new Student();

        // Step 2: Store actual values inside the object's variables
        s1.name = "Shailesh Deore";
        s1.age = 22;
        s1.rollNo = 45;

        // Step 3: Call the method to print the details
        s1.printInfo();
    }
}
