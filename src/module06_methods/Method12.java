package module06_methods;

public class Method12 {
    // Reverse Number using Method

    static long reverseNum(long n) {

        // Store the reversed number
        long reverse = 0;

        // Repeat until all digits are processed
        while (n > 0) {

            // Extract the last digit
            long digit = n % 10;

            // Shift reverse one place left and add current digit
            reverse = reverse * 10 + digit;

            // Remove the last digit from original number
            n = n / 10;
        }

        // Return the reversed number to the caller
        return reverse;
    }

    static void main(String[] args) {

        // Call the method and store the returned value
        long res = reverseNum(124434L);

        // Print the reversed number
        System.out.println(res);
    }
}
