package module03_conditional;

public class Relational02 {
    static void main(String[] args) {


        int passingMarks = 33; // Minimum marks required to pass
        int ramMarks = 33;     // Marks scored by Ram

        // Check if Ram's marks are greater than or equal to passing marks (33 >= 33)
        System.out.println(ramMarks >= passingMarks ); // true

        int shyamMarks = 31;   // Marks scored by Shyam

        // Check if Shyam's marks are greater than or equal to passing marks (31 >= 33)
        System.out.println(shyamMarks >= passingMarks); // false


    }
}
