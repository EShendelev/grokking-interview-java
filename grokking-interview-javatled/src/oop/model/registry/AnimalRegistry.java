package oop.model.registry;

import oop.interfaces.Animals;
import oop.interfaces.registry.Registry;


import java.util.ArrayList;
import java.util.List;

public class AnimalRegistry implements Registry<Animals> {
    List<Animals> animalRegistry = new ArrayList<>();


    @Override
    public List<Animals> getAll() {
        return animalRegistry;
    }

    @Override
    public void add(Animals animal) {
        animalRegistry.add(animal);
    }

    @Override
    public void delete(Animals animals) {
        animalRegistry.remove(animals);
    }
}
