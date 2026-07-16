package module03_conditional;

public class Switch01 {
    static void main(String[] args) {
        // calculator

        int num1 = 10;
        int num2 = 5;
        int choice = 4;

        switch (choice) {
            case 1:
                System.out.println("Addition : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Division : " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
