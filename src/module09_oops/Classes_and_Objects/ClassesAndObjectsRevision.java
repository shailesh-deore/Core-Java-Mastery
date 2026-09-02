package module09_oops.classes_and_objects;
/**
 * TOPIC: CLASSES AND OBJECTS (COMPLETE REVISION GUIDE)
 * Purpose: Upload to GitHub for quick future revision.
 *
 * CONCEPT DEFINITIONS:
 * 1. Class: A blank blueprint, template, or prototype. It occupies NO memory.
 * 2. Object: A real-world instance built from the blueprint. It occupies space in Heap memory.
 * 3. Instance Variables: Variables declared inside a class but outside methods. Every object gets its own copy.
 * 4. Methods: Functions defined inside a class that specify the behavior/actions of the object.
 * 5. 'this' Keyword: A reference variable that points to the current object executing the method.
 */

// ==========================================
// 1. THE BLUEPRINT CLASS (Template)
// ==========================================
class Employee {

    // Attributes / Instance Variables (What the object HAS)
    // Every new Employee object created will have its own unique copy of these variables.
    String employeeName;
    int employeeId;
    double monthlySalary;

    // Actions / Methods (What the object DOES)
    public void displayProfile() {
        // 'this' refers directly to whichever object called this method right now
        System.out.println("Employee ID   : " + this.employeeId);
        System.out.println("Employee Name : " + this.employeeName);
        System.out.println("Monthly Salary: $" + this.monthlySalary);
        System.out.println("----------------------------------------");
    }

    public void calculateAnnualSalary() {
        double annualSalary = this.monthlySalary * 12;
        System.out.println(this.employeeName + "'s Yearly Earnings: $" + annualSalary);
        System.out.println("========================================");
    }
}

// ==========================================
// 2. THE MAIN CLASS (Execution & Memory Allocation)
// ==========================================
public class ClassesAndObjectsRevision {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // OBJECT 1: Creation and Data Initialization
        // -------------------------------------------------------------
        // 'emp1' variable is stored in STACK memory.
        // 'new Employee()' allocates actual data blocks inside HEAP memory.
        // 'emp1' acts as a remote control pointing to that block in the HEAP.
        Employee emp1 = new Employee();

        // Storing unique state values inside Object 1
        emp1.employeeName = "Shailesh Deore";
        emp1.employeeId = 101;
        emp1.monthlySalary = 5000.0;

        // -------------------------------------------------------------
        // OBJECT 2: A Completely Independent Instance
        // -------------------------------------------------------------
        // This creates an entirely separate data block inside the HEAP memory.
        Employee emp2 = new Employee();

        // Storing unique state values inside Object 2
        emp2.employeeName = "John Doe";
        emp2.employeeId = 102;
        emp2.monthlySalary = 4200.0;

        // -------------------------------------------------------------
        // EXECUTING METHODS (Behavior Verification)
        // -------------------------------------------------------------

        // Executing Object 1 behaviors
        // Inside these methods, 'this' automatically transforms into 'emp1'
        emp1.displayProfile();
        emp1.calculateAnnualSalary();

        // Executing Object 2 behaviors
        // Inside these methods, 'this' automatically transforms into 'emp2'
        emp2.displayProfile();
        emp2.calculateAnnualSalary();
    }
}
