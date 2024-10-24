package org.example.nestedClasses;

public class Teorie {
    /*
       Nested Classes

       - atunci cand avem o clasa in interiorul altei clase, iar aceasta nu este statica
       trebuie sa implementam clasa parinte, iar pe baza obiectului obtinut
       vrom creea un obiect de tipul clasei din interior

       ex:  Bicycle bicycle = new Bicycle();
            Bicycle.Wheel wheel = bicycle.new Wheel();

       - atunci cand avem o clasa statica in interiorul unei clase,
       clasa statica functioneaza independent de clasa principala.

       ex: Car car = new Car();
           Car.Mechanic mechanic = new Car.Mechanic(); (nu are legatura cu instanta clasei Car)

     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.getMaxSpeed());

        // tipul de data      // avem nevoie de instanta lui Bicycle
        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.damage();

        System.out.println(bicycle.getMaxSpeed());

        System.out.println("Nested static class");
        System.out.println();

        Car car = new Car();
        System.out.println(car.getMaxSpeed());

        Car.Mechanic mechanic = new Car.Mechanic();
        mechanic.repair(car);

        System.out.println(car.getMaxSpeed());
    }
}
