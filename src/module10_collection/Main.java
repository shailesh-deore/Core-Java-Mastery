package module10_collection;

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

    }
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Barking...");
    }
}

interface Animal {

    void sound();
}