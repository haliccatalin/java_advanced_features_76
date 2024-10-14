package org.example.polymorphism.override;

public class Parent {
    private String name;

    public Parent(String name) {
        System.out.println("Constructor clasa Parent");

        this.name = name;
    }

    public void showName() {
        System.out.println("Clasa Parent: " + this.name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "metoda toString() din clasa Parent";
    }
}
