package module08_problems;

public class SearchingElement {
    public static void main(String[] args){
        int target = 700;
        int [] arr = {10,20,30,40,50,60,80,70};
        boolean found = false;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == target) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("found");

        }else {
            System.out.println("not found");
        }
    }
}

