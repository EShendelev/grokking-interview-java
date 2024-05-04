package oop.service;

import oop.interfaces.VocalAnimal;
import oop.model.animals.Animal;
import oop.model.animals.Duck;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class AnimalChorus{

    public void animalSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.go();
        }
    }
}
