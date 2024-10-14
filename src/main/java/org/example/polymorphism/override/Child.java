package org.example.polymorphism.override;

public class Child extends Parent {

    public Child(String name) {
        super(name);

        System.out.println("Constructor clasa Child");
    }

    @Override
    public void showName() {

        // super. => apeleaza metoda din clasa parinte
//        super.showName();
        System.out.println("Clasa Child: showName() " + super.getName());
    }
}
