package org.example.inheritance.exercises.ex1;

import java.time.LocalDateTime;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;


    public Vehicle() {

    }

    public Vehicle(String make, String model, int year, String fuelType) {
        setMake(make);
        setModel(model);
        setYear(year);
        setFuelType(fuelType);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = LocalDateTime.now().getYear();
        if (year > 1900 && year < currentYear) {
            this.year = year;
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void consumption(int nrKm, int consum, int nrOre) {
        int result = (nrKm * nrOre) / consum;
        System.out.println("Fuel Efficiency result :" + result);

    }
}
