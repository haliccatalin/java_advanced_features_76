package org.example.exercises.ex1;

public abstract class Animal {
    private String name;
    private int age;
    private boolean isAdopted = false;

    public Animal(String name, int age, boolean isAdopted) {
        this.name = name;
        this.age = age;
        this.isAdopted = isAdopted;
    }

    public void setAdopted() {
        this.isAdopted = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public abstract void makeSound();

    public abstract void adoptAnimal();

    public abstract String getAnimalInfo();

    @Override
    public String toString() {
        return "name: " + getName() + ", age: " + getAge() + ", isAdopted: " + isAdopted();
    }
}
