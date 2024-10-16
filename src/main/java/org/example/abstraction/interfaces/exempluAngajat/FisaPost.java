package org.example.abstraction.interfaces.exempluAngajat;

public interface FisaPost {
    void checkIn();

    void checkOut();

    default void showZileDeConcediu() {
        System.out.println("21 de zile de concediu");
    }
}
