package solid._4_interfaceSegregation;

import solid._4_interfaceSegregation.interfaces.VocalAnimal;

public class Dog implements VocalAnimal {
    @Override
    public void makeSound() {
        System.out.println("Dog make woof");
    }

    @Override
    public void go() {
        System.out.println("Dog go");
    }
}
