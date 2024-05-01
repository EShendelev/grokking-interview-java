package oop.service;

import oop.interfaces.Animals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class AnimalChorus<T>{

    public void animalSound(List<T> animals) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (T animal : animals) {
            Method makeSound = animal.getClass().getMethod("makeSound");
            makeSound.invoke(animal);
        }
    }
}
