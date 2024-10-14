package org.example.polymorphism.exercises.ex2;

// Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
// Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        double result = circle.getPerimeter();
        double result2 = circle.getArea();
        System.out.println(result);
        System.out.println(result2);

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}
