package module03_conditional;

public class Switch04 {
    public static void main(String[] args) {
        int signalNumber = 1;

        System.out.println("TRAFFIC SYSTEM START");

        switch (signalNumber) {
            case 1:
            case 2:
                System.out.println("Action: Stop or Prepare to Stop! ");
                break;

            case 3:
                System.out.println("Action: Go ahead safely! ");
                break;

            default:
                System.out.println("Action: Signal broken, proceed with caution! ");
                break;
        }
    }
}
