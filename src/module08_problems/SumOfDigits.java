package module08_problems;

public class SumOfDigits {
    static void main(String[] args) {

        int digit = 12345;
        int sum = 0;
        while (digit > 0) {
            int LastDigit = digit % 10;
            sum = sum + LastDigit;

        }
        System.out.println(sum);



    }

}
