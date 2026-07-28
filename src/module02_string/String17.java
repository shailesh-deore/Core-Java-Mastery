package module02_string;

public class String17 {
   public static void main(String[] args) {

       String fullName = "Shailesh Deore";
       int myAge = 22;
       String city = "Jalgaon";
       String course = "MCA";
       String dreamJob = "TCS Digital";

       System.out.println("Name      : "+ fullName);
       System.out.println("Age       : "+ myAge);
       System.out.println("City      : "+ city);
       System.out.println("Course    : "+ course);
       System.out.println("Dream Job : "+ dreamJob);

       System.out.println(10 + 20); // 30  both are integer
       System.out.println("10" + "20"); // concat both 1020
       System.out.println("Age = " + 22);//Age = 22
       System.out.println(10 + 20 +"java"); // left to right evaluate ok so 30java
       System.out.println("jav"+10+20); // same left to right evaluates ok java1020
       System.out.println("Java" + 10 * 2); // precedence always ok

   }
}
