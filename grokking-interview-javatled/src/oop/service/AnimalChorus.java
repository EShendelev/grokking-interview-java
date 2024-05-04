package oop.service;

import oop.model.animals.Animal;

import java.util.List;

public class AnimalChorus{

    public void animalSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.go();
        }
    }
}
