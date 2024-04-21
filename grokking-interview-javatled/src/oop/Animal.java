package oop;

public class Animal {
    /*
    1. private - class
    2. default - class, package
    3. protected - class, package, child
    4. public - all
     */

    protected String name;
    protected int age;
    protected final String sound;

    public Animal(String name, String sound, int age) {
        this.name = name;
        this.sound = sound;
        this.age = age;
    }

    public void sound() {

    }

    public void walk() {
        System.out.println("go to walk");
    }


}
