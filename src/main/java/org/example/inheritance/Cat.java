package org.example.inheritance;

public class Cat extends Animal {
    private String color;

    public Cat(String name, String race, double weight, String color) {
//        this.name = name;
//        this.race = race;
//        this.weight = weight;

        super(name, race, weight);

        this.color = color;

        System.out.println("Constructor CLASA CAT");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
