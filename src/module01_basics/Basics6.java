package module01_basics;

 public class Basics6 {
    public static void main(String[] args) {

        // narrowing (explicit - type casting ) conversion
        // cause some loss
        // are you ok with loss then you can use narrowing conversion explicit-type casting

        double doubleValue = 1221.4434556567476;
        float floatValue = (float)doubleValue; // narrowing conversion from double to float
        long longValue = (long)floatValue; // narrowing conversion from float to long // float is 4 bytes & double 8 but float can hold big value
        int intValue = (int)longValue;    // narrowing conversion from long to int

        System.out.println("double :" +doubleValue);
        System.out.println("float :" +floatValue);
        System.out.println("long :" +longValue);
        System.out.println("int :" +intValue);

        //example

        long a = Long.MAX_VALUE;
        System.out.println("max range of long is :" +a);
        int b = (int)a;
        System.out.println(b);

        //example

        int IntValue = 10084;
        char charValue = (char)IntValue;
        System.out.println("char : " +charValue);

    }
}
