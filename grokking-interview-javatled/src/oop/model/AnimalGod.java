package oop.model;

import oop.interfaces.registry.AnimalRegistry;
import oop.model.animals.Animal;
import oop.model.animals.Dog;
import oop.model.animals.Duck;
import oop.model.animals.Frog;
import oop.model.registry.AnimalRegistryImpl;

public class AnimalGod {
    private final AnimalRegistry animalRegistry;

    public AnimalGod() {
        this.animalRegistry = new AnimalRegistryImpl();
    }

    public AnimalRegistry getAnimalRegistry() {
        return animalRegistry;
    }
    //не нравится. Типов животных может быть огромное количество..
    public void createAnimal(String name, int age, AnimalsType animalsType) {
        Animal animal = null;
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
            default:
                throw new IllegalArgumentException("Неверный тип");
        }
        animalRegistry.add(animal);
    }
}
