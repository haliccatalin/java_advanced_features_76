package org.example.enums;

public enum LengthUnit {
    METER(1, "Unitate de masura pentru Metru"),
    CENTIMETER(0.01, "Unitate de masura pentru Centimetru"),
    FOOT(0.3, "Unitate de masura pentru Picioare"),
    INCH(0.025, "Unitate de masura pentru Inch");

    private final double value;
    private final String name;

    LengthUnit(double value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    double convertToMeters() {
        return value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
