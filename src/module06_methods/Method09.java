package module06_methods;

public class Method09 {

    // calculate simple interest with exact formula
    static float calculateSimpleInterest(float principle , float rate , float time){
        return (principle * rate * time)/100;
    }
    static void main(String[] args) {
        float res = calculateSimpleInterest(1000,2,24);
        System.out.println(res);

    }
}
