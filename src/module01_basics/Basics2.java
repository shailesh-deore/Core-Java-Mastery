package module01_basics;

 public class Basics2 {
    static void main(String[] args) {
        // primitive Data type in java
        // Decimal numbers
        // float << double

        float num = 12.342432f; // f is mandatory java read double by default // use for min precision after decimal
        double num2 = 12.342432456778; // use for more precision after decimal


        float mySalary = 1229.223442f;
        double yourSalary = 1229.22342232432;
        System.out.println(mySalary);
        System.out.println(yourSalary);

        // datatype store value by according to its range

        // reassign

        mySalary = 100112312331133313131231321313243.23223322354353666664564565343546546443565756f;
        yourSalary = 10012321342442343534554667577757577.68678678686896787867435436437367833583582351454543653653342554543534;
        System.out.println(mySalary);
        System.out.println(yourSalary);

        // output shows in Scientific notation  ,there are limits

        /*1.0011231E32
        1.0012321342442344E34*/

        // range of float
        // lets check

        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println("minimum range of float is : " + floatMin);
        System.out.println("maximum range of float is : " + floatMax);

        // range of double

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("minimum range of double is : " + doubleMin);
        System.out.println("maximum range of doubke is : " + doubleMax);



    }
}
