package module01_basics;

public class StudentDemo {
    // class Student: A blueprint for creating objects.
    // It defines the properties (data) and behavior of a Student.
    // In Java, every single program must live inside a class.

    public static void main(String[] args) {

     // public static void main(String[] args) {}
     // This is the main method with a specific signature. It is the entry point of every Java program.

     // 1. public: It is an access modifier. It allows the JVM to access and call the main method from anywhere outside the package.
     // 2. static: Means the JVM can run the main method directly without creating an object of the Student class.
     // 3. void: It is the return type. It means this method does not return any value after execution.
     // 4. main: This is the name of the core method that the JVM looks for to start the program.
     // 5. String[] args: It is an array of Strings used for command-line arguments, allowing us to pass parameters to the program during startup.

        System.out.println("Hello world ");
     // System.out.println("Hello world ");
     // This is the line used to print data to the computer console.

     // 1. System: A built-in final class present inside the 'java.lang' package.
     // 2. out: A public static reference variable (object) of the PrintStream class, residing inside the System class.
     // 3. println: A public method of the PrintStream class used to print text and move the cursor to the next line.



     // Curly Brackets {}: Defines a block of code. It marks where a class, method, or loop starts and ends.
     // Semicolon ;: A statement terminator. It acts like a full stop, telling Java that a line of instruction is finished.


    }
}
