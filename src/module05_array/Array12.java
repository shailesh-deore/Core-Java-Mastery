package module05_array;

public class Array12 {
    static void main(String[] args) {
        // 2d array is : Array of Arrays ok remember  !
        // let's see

        int[][] numbers = {  // matrix
                //0 1 2 index
                {1, 2, 3}, // 0  row
                {4, 5, 6}, // 1  row
                {7, 8, 9}  // 2  row
        }; // array of array
        //numbers[0]se ye rows print ho jayegi ok {1 ,2,3}
        //numbers[1]se {4,5,6}
        //numbers[2]se ye {7,8,9}
        // if I want to print (6) then first select row by index then column ;
        System.out.println(numbers[1][2]); // print 6
        System.out.println(numbers[1][1]); // print 5

        //ok concept done
    }
}