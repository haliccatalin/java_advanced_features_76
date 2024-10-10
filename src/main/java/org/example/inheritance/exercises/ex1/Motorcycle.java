package org.example.inheritance.exercises.ex1;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make,String model,int year,String fuelType){
        super();

        super.setMake(make);
        super.setModel(model);
        super.setYear(year);
        super.setFuelType(fuelType);
    }
}
