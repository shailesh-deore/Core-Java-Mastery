package module03_conditional;
public class Switch05 {
    public static void main(String[] args) {
        int dayNumber = 3;

        switch (dayNumber) {
            case 1:
                System.out.println("It is Monday ");
                break;
            case 2:
                System.out.println("It is Tuesday ");
                break;
            case 3:
                System.out.println("It is Wednesday ");
                break;
            case 4:
                System.out.println("It is Thursday ");
                break;
            case 5:
                System.out.println("It is Friday ");
                break;
            default:
                System.out.println("It is the Weekend! ");
                break;
        }
    }
}
