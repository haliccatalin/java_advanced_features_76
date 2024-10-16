package org.example.abstraction.interfaces.exempluMedic;

public interface SpecializareCardiologie {
    void consultCardiologic();

    double getPuls();

    default void consult() {
        System.out.println("Este o consultatie");
    }
}
