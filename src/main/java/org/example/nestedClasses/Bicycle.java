package org.example.nestedClasses;

public class Bicycle {
    private int maxSpeed = 25;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public class Wheel {
        public void damage() {
            maxSpeed *= 2;
        }
    }
}
