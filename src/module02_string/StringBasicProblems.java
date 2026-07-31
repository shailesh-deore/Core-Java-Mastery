package module02_string;

/*
===============================================================================
                    JAVA STRING BASIC LOGIC PROBLEMS
===============================================================================

Author  : Shailesh Patil
Purpose : Personal Revision + GitHub Notes

Topics Covered

1. Print Every Character
2. Reverse String
3. Count Vowels
4. Count Uppercase, Lowercase & Digits
5. Count Words
6. Palindrome
7. Single Character Frequency

===============================================================================
*/
    public class StringBasicProblems {
        public static void main(String[] args) {


        /*
        ===============================================================================
        PROBLEM 1 : PRINT EVERY CHARACTER
        ===============================================================================
        Logic

        ✔ Traverse String
        ✔ charAt()
        ✔ Print every character
        */

            String str1 = "Java";

            System.out.println("========== Problem 1 ==========");

            for (int i = 0; i < str1.length(); i++) {

                char ch = str1.charAt(i);

                System.out.println(ch);

            }

        /*
        Output

        J
        a
        v
        a
        */



        /*
        ===============================================================================
        PROBLEM 2 : REVERSE STRING
        ===============================================================================
        Logic

        ✔ Start from last index
        ✔ Go till index 0
        ✔ Build reverse String
        */

            String str2 = "Java";

            String reverse = "";

            System.out.println("\n========== Problem 2 ==========");

            for (int i = str2.length() - 1; i >= 0; i--) {

                char ch = str2.charAt(i);

                reverse += ch;

            }

            System.out.println("Original : " + str2);
            System.out.println("Reverse  : " + reverse);



        /*
        ===============================================================================
        PROBLEM 3 : COUNT TOTAL VOWELS
        ===============================================================================
        Logic

        ✔ Convert into lowercase
        ✔ Traverse String
        ✔ Check vowels
        ✔ Increase counter
        */

            String str3 = "Programming";

            str3 = str3.toLowerCase();

            int vowelCount = 0;

            System.out.println("\n========== Problem 3 ==========");

            for (int i = 0; i < str3.length(); i++) {

                char ch = str3.charAt(i);

                if (ch == 'a' ||
                        ch == 'e' ||
                        ch == 'i' ||
                        ch == 'o' ||
                        ch == 'u') {

                    vowelCount++;

                }

            }

            System.out.println("Total Vowels : " + vowelCount);



        /*
        ===============================================================================
        PROBLEM 4 : COUNT UPPERCASE, LOWERCASE & DIGITS
        ===============================================================================
        Logic

        ✔ Traverse String
        ✔ Character.isUpperCase()
        ✔ Character.isLowerCase()
        ✔ Character.isDigit()
        */

            String str4 = "Java2027";

            int upper = 0;
            int lower = 0;
            int digit = 0;

            System.out.println("\n========== Problem 4 ==========");

            for (int i = 0; i < str4.length(); i++) {

                char ch = str4.charAt(i);

                if (Character.isUpperCase(ch)) {

                    upper++;

                }
                else if (Character.isLowerCase(ch)) {

                    lower++;

                }
                else if (Character.isDigit(ch)) {

                    digit++;

                }

            }

            System.out.println("Uppercase : " + upper);
            System.out.println("Lowercase : " + lower);
            System.out.println("Digits    : " + digit);



        /*
        ===============================================================================
        PROBLEM 5 : COUNT TOTAL WORDS
        ===============================================================================
        Logic

        ✔ split(" ")
        ✔ Returns String[]
        ✔ array.length gives total words
        */

            String sentence = "I Love Java Programming";

            String[] words = sentence.split(" ");

            System.out.println("\n========== Problem 5 ==========");

            System.out.println("Total Words : " + words.length);



        /*
        ===============================================================================
        PROBLEM 6 : PALINDROME
        ===============================================================================
        Logic

        ✔ Reverse String
        ✔ Compare using equals()
        */

            String original = "madam";

            String reversed = "";

            System.out.println("\n========== Problem 6 ==========");

            for (int i = original.length() - 1; i >= 0; i--) {

                reversed += original.charAt(i);

            }

            if (original.equals(reversed)) {

                System.out.println("Palindrome");

            } else {

                System.out.println("Not Palindrome");

            }



        /*
        ===============================================================================
        PROBLEM 7 : SINGLE CHARACTER FREQUENCY
        ===============================================================================
        Logic

        ✔ Traverse String
        ✔ Compare current character with target
        ✔ Increase counter
        */

            String str7 = "ganeshay";

            char target = 'a';

            int count = 0;

            System.out.println("\n========== Problem 7 ==========");

            for (int i = 0; i < str7.length(); i++) {

                char ch = str7.charAt(i);

                if (ch == target) {

                    count++;

                }

            }

            System.out.println("Character : " + target);
            System.out.println("Frequency : " + count);



        /*
        ===============================================================================
                              GOLDEN REVISION POINTS
        ===============================================================================

        ✔ String index starts from 0.

        ✔ Last index = length() - 1.

        ✔ length() -> returns int.

        ✔ charAt() -> returns char.

        ✔ substring() -> returns String.

        ✔ equals() compares content.

        ✔ String is Immutable.

        ✔ split() returns String[].

        ✔ trim() removes only leading and trailing spaces.

        ✔ replace() returns a NEW String.

        ✔ Character.isUpperCase()

        ✔ Character.isLowerCase()

        ✔ Character.isDigit()

        ===============================================================================
                                END OF REVISION
        ===============================================================================
        */

        }

    }


