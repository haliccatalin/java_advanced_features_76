package org.example.optionals;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;
import java.util.function.Consumer;

public class Teorie {
    /*
    Optionals

    - nu este bine / recomandat sa returnam valoarea NULL

    Optional.empty() => returneaza un optional gol

    Optional.of(value) => returneaza un optinal cu valoarea transmisa ca
    parametru, ATENTIE!!! aceasta nu poate sa fie NULL.

    Optional.ofNullable(value) => returneaza un optional cu valoarea trasmisa ca
    parametru, dar aceasta poate sa fie si NULL

     */
    public static void main(String[] args) {
        System.out.println("Varianta fara Optionals");
        String result = create(-10);

        if (result == null) {
            System.out.println("Rezultatul este null");
        } else {
            System.out.println(result.toUpperCase());
        }
        System.out.println();

        System.out.println("Varianta cu Optional");

        Optional<String> optionalString = Optional.ofNullable(create(-100));

        // verifica daca Optionalul are sau nu o valoare diferita de null
        if (optionalString.isPresent()) {

            // optionalString.get() => citeste valoarea din optional
            System.out.println("Value: " + optionalString.get());
        } else {
            System.out.println("Valoarea din Optional este null");
        }

        System.out.println();
        System.out.println("Varianta Optional cu Lambda");

        // Lambda expression
        optionalString.ifPresentOrElse(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Value Lambda: " + s);
            }
        }, new Runnable() {
            @Override
            public void run() {
                System.out.println("Valoarea Lambda din Optional este null");
            }
        });

        System.out.println();
        System.out.println("Varianta Shortcut");

        optionalString.ifPresentOrElse((s) -> {
            System.out.println("Valoarea este: " + s);
        }, () -> {
            System.out.println("Valoarea este null");
        });

    }

    public static String create(int number) {
        if (number > 0) {
            return String.valueOf(number);
        } else {
            return null;
//            return "";
        }
    }

    public static Optional<String> create(double number) {
        if(number > 0) {
            return Optional.of(String.valueOf(number));
        } else {
            return Optional.empty();
        }
    }
}
