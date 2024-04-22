package solid._4_interfaceSegregation;

import solid._4_interfaceSegregation.interfaces.FlyingAnimal;
import solid._4_interfaceSegregation.interfaces.SwimmingAnimal;
import solid._4_interfaceSegregation.interfaces.VocalAnimal;

public class Duck implements VocalAnimal, SwimmingAnimal, FlyingAnimal {
    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }

    @Override
    public void makeSound() {
        System.out.println("Duck make sound");
    }

    @Override
    public void go() {
        System.out.println("Duck go");
    }
}
