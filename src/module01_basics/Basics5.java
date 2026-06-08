package module01_basics;

 public class Basics5 {
     public static void main(String[] args) {

         // widening(implicit) & narrowing(explicit) conversion in java

         int a = 10; // 4 bytes
         long b = a; // 8 bytes
         float c = b; //4 bytes
         double d = c; // 8 bytes
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         // automatic conversion by java
         // bigger datatype can hold smaller datatype easily
         // should be compatible

         float f = 1.7f;
         int g = (int)f;
         //int g = f; //error
         // but here no automatic because here a decimal part
         // need to type cast
         System.out.println(g);
         // are you ok with loss then you can type cast



         // widening (implicit) conversion in java
         // widening means implicit automatic conversion in java
         // no need to type cast
         // one datatype convert into another datatype is known as implicit automatic conversion in java

         byte byteValue = 10; // 1 byte  = 8 bits
         short shortValue = byteValue; // 2 bytes
         int intValue = shortValue; // 4 bytes
         long longValue =intValue; // 8 bytes
         float floatValue = longValue; // 4 bytes  // can hold long also ,because float can hold big scientific notation value
         double doubleValue = floatValue; // 8 bytes

         System.out.println("short :" +shortValue);
         System.out.println("int :" +intValue);
         System.out.println("float :" +floatValue);
         System.out.println("long :" +longValue);
         System.out.println("double:" +doubleValue);


         // Obviously
         //we can Widening conversion char to int
         char charValue = 'A';
         int intValue2 = charValue;
         System.out.println("char" +charValue);
         System.out.println("int" +intValue2);


         // widening conversion char to float
         char charValue3 = 'A';
         float floatValue3 = charValue;
         System.out.println("char" +charValue3);
         System.out.println("float" +floatValue3);






     }
}
