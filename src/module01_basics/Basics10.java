package module01_basics;

public class Basics10 {
    public static void main(String[] args) {
      //Addition in Deep Dive
      //java suggest local variable > double for this operation
      //no loss
       int a = 10 ;
       double b = 10.1;
       double v = a + b;
       System.out.println(v);
      // we can write this with (literal) direct number value fix
       int x = 10;
       double y = x + 10.1; // literal
       System.out.println(y);

        // consider float
        // java suggest local variable > float for this operation
        // long big datatype in bytes but float can hold value with scientific notation
        // float can hold bigger value
        // no loss
        // float can hold larger value
      float num = 12.2f;
      long num2 = 23723;
      float v1 = num + num2;
      System.out.println(v1);
      // here if you get big value in long then could be precision loss
      // ye same kahani hogi baki ki operators ke sath bhi -* etc


     // check
     int n = 438347634;
     int m = n * 24223;
     System.out.println(m);
    // 935582670 output but Actual output is not
    // multiplication result out of the range of integer

        // we can write
        int f = 438347634;
        long t = f * 24223;
        System.out.println(t);
        //935582670 same output why
        // this both f * 24223 are int then final java put final output in integer ,java read every number as integer


        // final we can write code like this avoid loss of output
        // keep both dataType long
        long f1 = 438347634;
        long t1 = f1 * 24223; // literal
        System.out.println(t1);
        // this is complete final Answer without loss : 10618094738382
        // sabhi datatype ki case me yesa hota hai








    }
}
