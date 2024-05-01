package oop.model.animals;

import oop.interfaces.SwimAnimal;
import oop.interfaces.VocalAnimal;

public class Frog extends Animal implements VocalAnimal, SwimAnimal {

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Frog " + name + " swims anyway");
    }

    @Override
    public void makeSound() {
        System.out.println("Frog " + name + " says: \"ribbit\"");
    }
}
