package module06_methods;

public class MethodOverLoadExample {


    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static void student(String name, int age) {
        System.out.println(name + " " + age);
    }

    static void student(int age, String name) {
        System.out.println(age + " " + name);
    }

    public static void main(String[] args) {

        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));

        System.out.println(multiply(10, 20));
        System.out.println(multiply(1.5, 2.5));

        student("Shailesh", 22);
        student(22, "Shailesh");

        // Method Overloading means creating multiple methods with the same name but different parameters in the same class.
    }
}

