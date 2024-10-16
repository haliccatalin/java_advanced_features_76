package org.example.abstraction.abstractClasses.exercises;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("turbo");
        car.startEngine();
        car.stopEngine();

        Motorcycle motorcycle = new Motorcycle("yahama");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
