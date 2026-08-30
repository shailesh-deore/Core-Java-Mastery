package module09_oops;

class Student {
    int age;
    String name;
    int RollNo;

    public void printInfo(){
       System.out.println(this.age);
       System.out.println(this.name);
       System.out.println(this.RollNo);
    }
}
public class Main {
    public static void main (String[] args){
        // here yu can create object and call method ok

        Student s1 = new Student();

        s1.name="Shailesh Deore";
        s1.age=22;
        s1.RollNo=45;

        s1.printInfo();


    }

}
