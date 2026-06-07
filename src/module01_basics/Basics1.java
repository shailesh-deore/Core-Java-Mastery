package module01_basics;

 public class Basics1 {
    public static void main(String[]args){
        // primitive Datatypes in java
        // integral numbers
        // byte << // << short // << int // << long

        byte check = 127;
        short check1 = 12213;
        int check2 = 123343245;
        long check3 = 2324241232323232l; // use l for Long ,

       // we can choose data type according to our requirements !
        System.out.println(Byte.MIN_VALUE); // byte range
        System.out.println(Byte.MAX_VALUE);
      // don't need to remember range

        System.out.println(Short.MIN_VALUE); // short range  using wrapper class method
        System.out.println(Short.MAX_VALUE);
      // All data type have a certain range we can use according to requirement

        System.out.println(Integer.MIN_VALUE); // integer range
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE); // long range
        System.out.println(Long.MAX_VALUE);

        // Data Type: A blueprint that defines the size of memory to allocate and the type of values a variable can hold.

    }
}
