package org.example.exercises.ex1;

/*
Exercise 1: OOP Basics - Animal Shelter System
Objective: Practice creating classes, inheritance, and encapsulation.
Create an abstract class Animal with the following properties:
- name (String)
- age (int)
- isAdopted (boolean, defaults to false)
Abstract methods: makeSound(), adoptAnimal(), and getAnimalInfo()
Create two subclasses:
- Dog with an additional property breed (String).
- Cat with an additional property furLength (String, e.g., "short", "long").
Implement the methods:
- In makeSound(), print an appropriate sound for each animal type (e.g., “Woof” for dogs and “Meow” for cats).
- In adoptAnimal(), mark the animal as adopted.
- In getAnimalInfo(), return a summary of the animal’s details, including if they have been adopted.
 */
public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 2, "Golden Retriver");
        rex.adoptAnimal();
        rex.makeSound();
        String infoDog = rex.getAnimalInfo();
        System.out.println(infoDog);

        Cat tom = new Cat("Tom", 1, "short");
        tom.adoptAnimal();
        tom.makeSound();
        String infoCat = tom.getAnimalInfo();
        System.out.println(infoCat);
    }
}
