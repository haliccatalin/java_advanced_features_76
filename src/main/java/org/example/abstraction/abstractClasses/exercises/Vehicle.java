package org.example.abstraction.abstractClasses.exercises;

public abstract class Vehicle {

    //Write a Java program to create an abstract class Vehicle
    // with abstract methods startEngine() and stopEngine().
    // Create subclasses Car and Motorcycle that extend the Vehicle class
    // and implement the respective methods to start and stop the engines for each vehicle type.

    private String engine;

    public Vehicle(String engine){
        setEngine(engine);
    }

    public String getEngine(){
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public abstract void startEngine();

    public abstract void stopEngine();
}
