package module06_methods;

public class Method22 {
 public static boolean searchElement(int[] arr , int key){
     for(int i : arr){
         if(i == key){
             return true;
         }
     }
     return false;

 }
    public static void main(String[] args) {
        int [] num = {10, 20, 30, 40, 50};
        System.out.println(searchElement(num, 30));
        System.out.println(searchElement(num, 70));

    }
}
