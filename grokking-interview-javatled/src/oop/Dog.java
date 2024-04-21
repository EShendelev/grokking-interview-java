package oop;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name,"Gow", age);
    }


    @Override
    public void sound() {
        System.out.println("Dog " + name + " say: " + sound);
    }
}
