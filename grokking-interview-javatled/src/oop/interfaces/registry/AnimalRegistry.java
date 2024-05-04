package oop.interfaces.registry;


import oop.model.animals.Animal;

import java.util.List;

public interface AnimalRegistry {

    List<Animal> getAll();

    void add(Animal animal);
    void delete(Animal animal);
}
