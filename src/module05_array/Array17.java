package module05_array;

public class Array17 {
    static void main(String[] args) {
        // fill data at Array index using  loop
        // avoid manual work
        int [] arr = new int [3];

        int x = 10;
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = x;
            x++;
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }



    }
}
