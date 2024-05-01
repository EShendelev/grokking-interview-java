package oop.model;

import oop.interfaces.Animals;
import oop.interfaces.registry.Registry;
import oop.model.animals.Dog;
import oop.model.animals.Duck;
import oop.model.animals.Frog;
import oop.model.registry.AnimalRegistry;

public class AnimalGod {
    private final Registry<Animals> animalRegistry;

    public AnimalGod() {
        this.animalRegistry = new AnimalRegistry();
    }

    public Registry<Animals> getAnimalRegistry() {
        return animalRegistry;
    }
    //не нравится. Типов животных может быть огромное количество..
    public void createAnimal(String name, int age, AnimalsType animalsType) {
        Animals animal = null;
        switch (animalsType) {
            case DOG:
                animal = new Dog(name, age);
                break;
            case DUCK:
                animal = new Duck(name, age);
                break;
            case FROG:
                animal = new Frog(name, age);
                break;
        }
        animalRegistry.add(animal);
    }
}
