package module04_loops;
public class Loops18 {
    static void main(String[] args) {

        // digit count
        int count = 0;
        int num =987657;
        while(num != 0){

            num = num / 10;
            count++;

        }
        System.out.println(count);

    }
}
