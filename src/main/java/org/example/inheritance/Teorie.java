package org.example.inheritance;

public class Teorie {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", "Labrador", 10.8, 2);
        System.out.println("Name: " + rex.getName());
        System.out.println("Race: " + rex.getRace());
        System.out.println("Weight: " + rex.getWeight());
        System.out.println("Aggressiveness: " + rex.getAggressiveness());

        rex.setAge(4);
        System.out.println("Age: " + rex.getAge());
        System.out.println(rex.toString());

        rex.showAge();

        System.out.println("------------------");

        Cat mia = new Cat("Mia", "British", 3.2, "Gri");
        System.out.println("Name: " + mia.getName());
        System.out.println("Race: " + mia.getRace());
        System.out.println("Weight: " + mia.getWeight());
        System.out.println("Color: " + mia.getColor());

        System.out.println("------------------");

        Animal animal = new Animal("Animal", "Oarecare", 100);
        System.out.println(animal.getName());
        System.out.println(animal.getRace());
        System.out.println(animal.getWeight());
        System.out.println(animal.getAge());

        System.out.println("-----------");

        Creature creature = new Creature();
        System.out.println(creature.getAge());

    }
}
