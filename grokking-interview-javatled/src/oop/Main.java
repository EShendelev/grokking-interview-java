package oop;

import oop.model.AnimalGod;
import oop.model.AnimalsType;
import oop.model.animals.Dog;
import oop.service.AnimalChorus;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        AnimalGod animalGod = new AnimalGod();
        animalGod.createAnimal("Sharik", 1, AnimalsType.DOG);
        animalGod.createAnimal("Carevna", 17, AnimalsType.FROG);
        animalGod.createAnimal("Shura", 3, AnimalsType.DUCK);

        AnimalChorus animalChorus = new AnimalChorus();
        animalChorus.animalSound(animalGod.getAnimalRegistry().getAll());
        System.out.println("------<>------");

        List<Dog> dogs = new ArrayList<>();
        Dog dog = new Dog("1", 1);
        Dog dog1 = new Dog("2", 1);
        Dog dog2 = new Dog("3", 1);
        Dog dog3 = new Dog("4", 1);
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        animalChorus.animalSound(dogs);


    }
}
