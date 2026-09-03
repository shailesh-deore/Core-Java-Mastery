package module03_conditional;

public class Conditional19 {
    public static void main(String[] args) {
        int number = 15;

        // If-Else Ladder Example
        if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else if (number > 0 && number <= 10) {
            System.out.println("Number is between 1 and 10");
        } else if (number > 10 && number <= 20) {
            System.out.println("Number is between 11 and 20");
        } else {
            System.out.println("Number is greater than 20");
        }

        // Switch-Case Example
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}

