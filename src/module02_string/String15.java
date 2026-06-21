package module02_string;

public class String15 {
    static void main(String[] args) {

        // Rule: String.format() works exactly like printf(), but instead of printing
        // to the console, it saves the formatted text into a new String variable.
        String formatedString = String.format("my name is %s & age is %d", "rajpatil", 25);
        System.out.println(formatedString);
        // Output: my name is rajpatil & age is 25

    }
}
