package oop.model.animals;

import oop.interfaces.VocalAnimal;

public class Dog extends Animal implements VocalAnimal {

    public Dog(String name, int age) {
        super(name, age);

    }

    @Override
    public void go() {
        System.out.println("Dog " + name + " goes anyway");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name + " says: \"Woof Woof\"");
    }
}
