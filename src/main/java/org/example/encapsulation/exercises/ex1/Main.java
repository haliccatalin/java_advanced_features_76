package org.example.encapsulation.exercises.ex1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 2, "m","labrador", 10.5);

        System.out.println("Age dog1: " + dog1.getAge());
        System.out.println("Weight dog1: " + dog1.getWeight());

        Dog dog2 = new Dog("f", "Bichon");

        System.out.println("Age dog2: " + dog2.getAge());
        System.out.println("Weight dog2: " + dog2.getWeight());

        dog1.setAge(-10);
        System.out.println("Age dog1: " + dog1.getAge());

        dog1.setWeight(0);
        System.out.println("Weight dog1: " + dog1.getWeight());
    }
}
