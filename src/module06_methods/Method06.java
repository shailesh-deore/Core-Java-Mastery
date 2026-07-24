package module06_methods;

public class Method06 {

    static void greet(){
        System.out.println("Welcome to Java");
    }
    static void greetMessage(String name ){
        System.out.println("Hello"+" "+name);
    }
    static float calculateArea(float length , float width){

        return  length * width;
    }
     static int findMax (int n1, int n2){
        if(n1 > n2){
            return n1;
        }else{
            return n2;
        }
    }
    static void main(String[] args) {
        greet();
        greetMessage("shailesh");
        greetMessage("hitesh");
        greetMessage("ganesh");

        float res = calculateArea(12.0f,10.5f);
        System.out.println(res);

        int max = findMax(10,5);
        System.out.println(max);


    }
}
