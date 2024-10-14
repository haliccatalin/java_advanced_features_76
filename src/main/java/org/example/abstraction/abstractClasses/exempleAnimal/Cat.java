package org.example.abstraction.abstractClasses.exempleAnimal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("miau miau");
    }
}
