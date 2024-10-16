package org.example.abstraction.interfaces;

public interface Contract {
    // proprietati (sunt prin definitie public static final)
    String FURNIZOR = "Telefonie";

    // metoda abstracta
    void showDetails();

    // metoda default
    default void showName() {
        System.out.println("Contact Name");
    }

    // metoda statica
    static void showAddress() {
        System.out.println("Strada Lalelelor nr 5");
    }
}
