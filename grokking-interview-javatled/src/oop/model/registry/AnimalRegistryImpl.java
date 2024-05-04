package oop.model.registry;

import oop.model.animals.Animal;


import java.util.ArrayList;
import java.util.List;

public class AnimalRegistryImpl implements oop.interfaces.registry.AnimalRegistry {
    private final List<Animal> animalRegistry = new ArrayList<>();


    @Override
    public List<Animal> getAll() {
        return new ArrayList<>(animalRegistry);
    }

    @Override
    public void add(Animal animal) {
        animalRegistry.add(animal);
    }

    @Override
    public void delete(Animal animals) {
        animalRegistry.remove(animals);
    }
}
