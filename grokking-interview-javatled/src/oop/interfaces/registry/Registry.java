package oop.interfaces.registry;

import oop.interfaces.Animals;

import java.util.List;

public interface Registry<T> {

    List<Animals> getAll();

    public void add(T obj);
    public void delete(T obj);
}
