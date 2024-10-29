package org.example.exercises.ex1;

public class Cat extends Animal {
    private String furLength;

    public Cat(String name, int age, String furLength) {
        super(name, age, false);

        this.furLength = furLength;
    }

    @Override
    public void makeSound() {
        System.out.println("miau miau");
    }

    @Override
    public void adoptAnimal() {
        super.setAdopted();
    }

    @Override
    public String getAnimalInfo() {
        return super.toString() + ", " + this.furLength;

    }
}
