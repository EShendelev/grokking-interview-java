package oop.model.animals;

import oop.interfaces.Animals;

public abstract class Animal implements Animals {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
