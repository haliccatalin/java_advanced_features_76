package org.example.inheritance.exercises.ex1;

// Write a Java program to create a vehicle class hierarchy.
// The base class should be Vehicle, with subclasses Truck,
// Car and Motorcycle. Each subclass should have properties
// such as make, model, year, and fuel type. Implement methods
// for calculating fuel efficiency, distance traveled, and
// maximum speed.

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Focus", 2010, "Diesel");
        car1.consumption(100, 6, 1);

        //Nu putem initializa clasa copil cu clasa parinte
        //Car car2=new Vehicle();

        Vehicle car3 = new Car("Ford", "Focus", 2010, "Diesel");
//          car3.showCarDetails();

        Motorcycle motorcycle1 = new Motorcycle("Suzuki", "1234", 2020, "Benzina");
        motorcycle1.consumption(100, 4, 2);

        Truck truck1 = new Truck("Volvo", "VH16", 2018, "Diesel");
        truck1.consumption(500, 30, 8);


    }
}
