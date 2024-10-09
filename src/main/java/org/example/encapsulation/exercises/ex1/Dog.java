package org.example.encapsulation.exercises.ex1;

/**
 * Create class Dog.
 * a) Add private fields to the class, like name, age, gender, race, weigth.
 * b) Create constructor that accepts all  the class fields.
 * c) Create additional constructor, that will accept only gender and race. It should call main
 * constructor with default values.
 * d) Create getters and setters for age and weigth.
 * e) Create object of class Dog. Verify if everything works as expected.
 * f) Add verification for all arguments passed to the setters. E.g. setWeigth method should
 * not accept values below or equal to 0.
 */

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String gender, String race) {
        // this -> ne ajuta sa apelam constructorul din clasa curenta
        this("dog", 1, gender, race, 5.5);

    }

    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }

    }
}
