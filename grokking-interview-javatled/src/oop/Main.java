package oop;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka", 1);
        Dog dog = new Dog("Sharik", 2);

        dog.sound();
        dog.walk();
        cat.sound();
        cat.walk();
        cat.purr();
    }
}
