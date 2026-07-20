package module05_array;

public class Array18 {
    static void main(String[] args) {
        // for each loop ok
        // 1) print using fo each
        int [] arr = {5, 10, 15, 20, 25};
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();

        // 2) sum of array using for each
        int [] arr2 = {2, 4, 6, 8, 10};
        int sum = 0;
        for(int num : arr2){
            sum += num;
        }
        System.out.println(sum);


        // 3) count element inside array ok
        int[] arr3 = {11, 22, 33, 44, 55, 66};

        int count = 0;
        for (int num : arr3) {
            count++;
        }
        System.out.println(count);


    }
}
