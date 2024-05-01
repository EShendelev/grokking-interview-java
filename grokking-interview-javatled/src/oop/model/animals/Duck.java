package oop.model.animals;

import oop.interfaces.FlyAnimal;
import oop.interfaces.SwimAnimal;
import oop.interfaces.VocalAnimal;


public class Duck extends Animal implements FlyAnimal, VocalAnimal, SwimAnimal {


    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println("Duck " + name + " flays anyway");
    }

    @Override
    public void makeSound() {
        System.out.println("Duck " + name + " says: \"krya krya\"");
    }

    @Override
    public void swim() {
        System.out.println("Duck " + name + " swims anyway");
    }
}
