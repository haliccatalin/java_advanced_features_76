package org.example.polymorphism.exercises.ex1;

public class Main {
    /**
     * Write a Java program to create a class called Animal
     * with a method called makeSound(). Create a subclass
     * called Cat that overrides the makeSound() method to
     * bark.
     *
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
