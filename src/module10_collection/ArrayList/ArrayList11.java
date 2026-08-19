package module10_collection.ArrayList;
import java.util.ArrayList;
public class ArrayList11 {
    public static void main(String[] args) {

      /*Problem 1
        Create an ArrayList<Integer>.
        Add: 10, 20, 30, 40, 50
        Print the complete list.
        Print the total number of elements.
       */


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("List : " + numbers);
        System.out.println("Size : " + numbers.size());



       /*Problem 2
        Create an ArrayList<String> of fruits.
        Add:

        Mango
        Banana
        Apple
        Orange

        Now:
        Print the first fruit.
        Print the last fruit.

        */
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("First fruit : " + fruits.get(0));
        System.out.println("Last fruit  : " + fruits.get(3));

        // Similar to using length in arrays and length() in String
        System.out.println("Last fruit : " + fruits.get(fruits.size() - 1));

        // problem 3
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        System.out.println("Before replacement : " + list);
        list.set(2,100);
        System.out.println("After replacement  : " + list);



        // problem 4

        ArrayList<String> language = new ArrayList<>();
        language.add("Java");
        language.add("C++");
        language.add("Python");
        language.add("JavaScript");

        System.out.println("List : " + language);
        // 1st method
        language.remove(2);  // by indexing
        System.out.println("List After Removing Element  : " + language);
        // 2nd method
       /*language.remove(String.valueOf("Python")); // direct object removing in list
        System.out.println(language);
        */


        // problem 5
        ArrayList<Integer> numbers1 = new ArrayList<>();

        numbers1.add(11);
        numbers1.add(22);
        numbers1.add(33);
        numbers1.add(44); // index 3 is here ok
        numbers1.add(55);

        System.out.println("Original List : " + numbers1);

        numbers1.remove(3);

        System.out.println("Updated List  : " + numbers1);

        System.out.println("Current Size  : " + numbers1.size());

        // problem 6


        ArrayList<String> city = new ArrayList<>();
        city.add("Pune");
        city.add("Mumbai");
        city.add("Nashik");
        city.add("Delhi");

        System.out.println(city);

        boolean result1 = city.contains("Mumbai");
        boolean result2 = city.contains("Chennai");

        System.out.println(result1);
        System.out.println(result2);


        ArrayList <Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(10);
        integerList.add(40);
        integerList.add(10);

        System.out.println(integerList);

        int firstOccurrence = integerList.indexOf(10);
        int lastOccurrence = integerList.lastIndexOf(10);

        System.out.println("first occurrence of 10 is at index : " + firstOccurrence);
        System.out.println("last occurrence of 10 is at index  : " + lastOccurrence);



        ArrayList<String> list2 = new ArrayList<>();
        boolean res1 =  list2.isEmpty();
        System.out.println("Initially Empty?      : " + res1);

        list2.add("Shailesh");
        list2.add("Rahul");

        System.out.println("After Adding Names    : " + list2);

        boolean res2 = list2.isEmpty();
        System.out.println("Is Empty Now?         : " + res2);

        list2.remove(String.valueOf("Shailesh"));
        list2.remove(String.valueOf("Rahul"));
        System.out.println("After Removing Names  : " + list2);

        boolean res3 = list2.isEmpty();
        System.out.println("Is Empty Finally?     : " + res3);

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.add(400);
        System.out.println("list : " + list3);
        int size = list3.size();
        System.out.println("size of list is : " + size);
        list3.clear();
        System.out.println(list3);
        int currentSize = list3.size();
        System.out.println(currentSize);
        boolean res  = list3.isEmpty();
        System.out.println(res);


        // problem 10

        ArrayList<String> completeList = new ArrayList<>();
        completeList.add("Java");
        completeList.add("Python");
        completeList.add("C++");
        completeList.add("Python");
        completeList.add("SQL");

        System.out.println(completeList);
        System.out.println(completeList.size());
        System.out.println(completeList.contains("SQL"));
        System.out.println(completeList.indexOf("Python"));
        System.out.println(completeList.lastIndexOf("Python"));
        completeList.set(2,"JavaScript");
        completeList.remove("SQL");
        System.out.println(completeList);

        System.out.println(completeList.size());
        

    }
}
