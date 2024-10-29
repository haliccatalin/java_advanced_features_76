package org.example.exercises.ex1;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, false);

        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("ham ham");
    }

    @Override
    public void adoptAnimal() {
        super.setAdopted();
    }

    @Override
    public String getAnimalInfo() {
        return super.toString() + ", breed: " + this.breed;
    }
}
