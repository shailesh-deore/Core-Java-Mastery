package module06_methods;

public class Method15 {

    // Method Overloading - Practice
    // same method name and diff parameter ok
    // this i iw write ok
    // signature  same method name + diff parameter
    // Different Number of Parameters
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // No Parameter and With Parameter
    static void print() {
        System.out.println("Shailesh Deore");
    }

    static void print(String name) {
        System.out.println(name);
    }

    // Different Data Types
    static int calculateSquare(int n) {
        return n * n;
    }

    static double calculateSquare(double n) {
        return n * n;
    }

    public static void main(String[] args) {

        // Sum
        System.out.println(sum(10, 40));
        System.out.println(sum(10, 20, 30, 40));

        // Print
        print();
        print("Welcome Shailesh");

        // Square
        System.out.println(calculateSquare(12));
        System.out.println(calculateSquare(25.5));
    }
}
