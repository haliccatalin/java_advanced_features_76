package org.example.nestedClasses;

public class Car {
    private int maxSpeed = 100;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static class Mechanic {
        public void repair(Car car) {
            car.maxSpeed += 200;
        }
    }
}
