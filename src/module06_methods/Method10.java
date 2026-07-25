package module06_methods;
// Percentage = (obtainedMarks × 100) / totalMarks
public class Method10 {

    // calculate student percentage with using standard percentage formula

    static  float calculatePercentage(int obtMarks, int totalMarks ){

        return  ((float)obtMarks *100)/totalMarks;
    }
    static void main(String[] args) {

        float res = calculatePercentage(405,500);
        System.out.println(res);
    }
}
