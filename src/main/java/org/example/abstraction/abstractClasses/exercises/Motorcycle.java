package org.example.abstraction.abstractClasses.exercises;

public class Motorcycle extends Vehicle{

    public Motorcycle(String engine){
        super(engine);
    }

    @Override
    public void startEngine() {
        System.out.println("I am starting motocycle engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("I am stopping motocycle engine");
    }
}