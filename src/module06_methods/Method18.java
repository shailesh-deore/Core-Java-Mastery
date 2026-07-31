package module06_methods;

public class Method18 {
    public static void printAray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
   public static void main(String[] args) {
        int[] m = {10,20,30,40,50};
        int[] n= {122,222,322,433,523};

        printAray(m);
        printAray(n);

    }
}
