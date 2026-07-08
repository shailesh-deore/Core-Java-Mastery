package module03_conditional;

public class Conditional09 {
    static void main(String[] args) {
        //Narrowing conversion automatic explicit conversion ok revision
        int specialNum = 129;
        byte smallNum = (byte) specialNum; // Watch the overflow here!

        if (smallNum < 0) {
            System.out.println("Negative Option");
        } else if (smallNum == 129) {
            System.out.println("Positive Option");
        } else {
            System.out.println("Zero Option");
        }


    }

}
