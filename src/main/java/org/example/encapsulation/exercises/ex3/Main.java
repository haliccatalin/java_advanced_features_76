package org.example.encapsulation.exercises.ex3;

public class Main {
    // Write a Java program to create a class called Product
    // with private instance variables productName, productCode,
    // and price. Provide public getter and setter methods to
    // access and modify these variables. Add a method called
    // applyDiscount() that takes a percentage and reduces the
    // price by that percentage.

    public static void main(String[] args) {
        Product product = new Product("Telefon", "16", 1000);
        product.discount(20);
        System.out.println(product.getPrice());

    }
}
