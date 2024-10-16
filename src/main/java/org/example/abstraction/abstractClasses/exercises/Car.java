package org.example.abstraction.abstractClasses.exercises;

public class Car extends Vehicle{

    public Car(String engine){
        super(engine);
    }

    @Override
    public void startEngine() {
        System.out.println("Start car engine: " + getEngine());
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop car engine: " + getEngine());
    }
}

