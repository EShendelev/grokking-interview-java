package oop;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, "Meow", age);
    }

    @Override
    public void sound() {
        System.out.println("Cat " + name + " say: " + sound);
    }

    public void purr() {
        System.out.println("purrrr");
    }
}
