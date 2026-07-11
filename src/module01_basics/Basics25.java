package module01_basics;

public class Basics25 {
    static void main(String[] args) {
        // Bitwise opr (binary opr) revision ok

        /*
        int a = 5;
        String checkBinary = Integer.toBinaryString(a);
        System.out.println(checkBinary);
        */


        // and Bitwise opr &
        int operation = 5 & 4 ;
        // check binaries of both num ok
        String binaryString1 =Integer.toBinaryString(5);
        String binaryString2 = Integer.toBinaryString(4);
        System.out.println("binary of 5 :" + binaryString1);
        System.out.println("binary of 4 :" + binaryString2);

        System.out.println(operation);
        // both bits should be 1 then Answer 1 other-wise 0


        // or bitwise opr |
        int oprOr = 5 | 7 ;
        // check binaries of both num ok
        String binaryString3 =Integer.toBinaryString(5);
        String binaryString4 = Integer.toBinaryString(7);
        System.out.println("binary of 5 :" + binaryString3);
        System.out.println("binary of 7 :" + binaryString4);

        System.out.println(oprOr);
        // at least one bit should be 1 ok then return 1


        // xor bitwise opr ^
        int oprXor = 5 ^ 7 ;
        // check binaries of both num ok
        String binaryString5 =Integer.toBinaryString(5);
        String binaryString6 = Integer.toBinaryString(7);
        System.out.println("binary of 5 :" + binaryString5);
        System.out.println("binary of 7 :" + binaryString6);

        System.out.println(oprXor);
        // both bits should be different then return 1 ok


        // not bitwise opr ~
        // it used to split binary value ok
        // 0 to 1 , 1 to 0 lik this

        int oprNot = 5 ;
        System.out.println(Integer.toBinaryString(5));
        int result = ~5;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
        // check binaries
        System.out.println(Integer.toBinaryString(-6));




    }

}
    
