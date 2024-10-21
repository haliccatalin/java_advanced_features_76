package org.example.genericTypes.exercises;

public class Main {
    public static void main(String[] args) {
        Generic<String> stringGeneric = new Generic<>("Test");
        Generic<Integer> integerGeneric = new Generic<>(10);
        Generic<Double> doubleGeneric = new Generic<>(24.5);

        Generic<?>[] data = new Generic[3];
        data[0] = stringGeneric;
        data[1] = integerGeneric;
        data[2] = doubleGeneric;

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getItem());
        }
    }
}
