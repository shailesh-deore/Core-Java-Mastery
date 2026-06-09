package module01_basics;

public class Basics9 {
   static void main(String[] args) {

       //Arithmetic operators (+ - * / % (5))

       //Addition (+)
       int yourSalary = 10000;
       int bonus = 500;
       int totalSalary = yourSalary + bonus;
       System.out.println(totalSalary);

       //Subtraction (-)
       int yourSalary1 = 10000;
       int deduction= 500;
       int totalSalary1 = yourSalary1 - deduction;
       System.out.println(totalSalary1);

       //Multiplication (*)
       int num1 = 20;
       int num2 = 3;
       int output = num1 * num2;
       System.out.println("Multiplication of numbers is : " + output);
       //example 2 (*)
       int yourSalary2 = 10000;
       int deduction1= 500;
       int totalSalary2 = yourSalary2 - deduction1;
       int yearlyTotal = yourSalary2 * 12;
       System.out.println(totalSalary2);
       System.out.println(yearlyTotal);

       //Division (/)
       //per-child income divide example
       int mySalary = 50000;
       int yearlyTotal2 = mySalary * 12;
       int dividePerChild = yearlyTotal2 / 4;
       System.out.println(yearlyTotal2);
       System.out.println(dividePerChild);

       //Modulus (%)
       //to check remainder
       int a = 5;
       int b = 2;
       int c = a % b;
       System.out.println(c);
      //we covered 5 operation in this class
      //In next class we will discuss this operation in detail

    }
}
