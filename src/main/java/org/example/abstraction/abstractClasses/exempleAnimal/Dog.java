package org.example.abstraction.abstractClasses.exempleAnimal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("ham ham");
    }
}
