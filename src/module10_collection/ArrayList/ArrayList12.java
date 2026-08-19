package module10_collection.ArrayList;
import java.util.*;
public class ArrayList12 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers  = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        for (int i = 0 ; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }


        ArrayList<String> fruits  = new ArrayList<>();
       fruits.add("Mango");
       fruits.add("Apple");
       fruits.add("Plum");
       for(int i = 0 ; i < fruits.size();i++){
           System.out.println(fruits.get(i));

       }

        ArrayList<String> fruitsRev  = new ArrayList<>();
        fruitsRev.add("Mango");
        fruitsRev.add("Apple");
        fruitsRev.add("Plum");
        for(int i = fruitsRev.size() - 1 ; i >= 0 ;i--){
            System.out.println(fruitsRev.get(i));

        }

        ArrayList<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(15);
        num.add(18);
        num.add(40);
        num.add(7);

        for (int i = 0 ; i < num.size(); i++){
            System.out.println("Index : " + i + " Value : " + num.get(i));
        }


        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        num1.add(50);

        int sum = 0;
        for (int i = 0 ; i < num1.size(); i++){
            sum += num1.get(i);
        }
        System.out.println(sum);


        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(25);
        num2.add(10);
        num2.add(80);
        num2.add(45);
        num2.add(60);
        num2.add(5);

        int max = Integer.MIN_VALUE; // for negatives

        for (int i =0 ; i < num2.size(); i++){
            if(num2.get(i)>max){
                max = num2.get(i);
            }
        }
        System.out.println(max);


        ArrayList<Integer> num3 = new ArrayList<>();
        num3.add(25);
        num3.add(10);
        num3.add(80);
        num3.add(45);
        num3.add(60);
        num3.add(5);

        int min = Integer.MAX_VALUE; // for negatives

        for (int i =0 ; i < num3.size(); i++){
            if(num3.get(i)<min){
                min = num3.get(i);
            }
        }
        System.out.println(min);





    }
}
