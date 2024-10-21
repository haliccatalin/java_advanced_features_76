package org.example.genericTypes;

import org.example.genericTypes.pahare.PaharSampanie;

public class Teorie {
    /*
    GENERIC TYPES

    - sunt asemantore cu niste cutii in care putem stoca obiecte
    - nu putem folosi PRIMITE in tipurile generice
    - folosim literele urmatoare intre <?>
    <E> => element
    <T> => type
    <K> => key
    <V> => value
    - NU PUTEM folosi in interiorul clasei metode din clasa T, pentru ca acel T poate fi orice obiect

    ex: class Box<T> {}

    GENERIC TYPES LIMITED

    - sunt asemanatoare cu niste cutii in care putem stoca obiecte DE UN ANUMIT FEL!!!!!
    - obiectele stocate trebuie sa aibe ca parinte clasa aflata in semnatura clasei
    ex: class BoxLimited<T extends Pahar> {}

    - in exemplul de mai sus putem stoca doar obiecte ce fac parte din clasa Pahar
    - in aceste clase generice putem face referire la metodele din clasa Pahar, pentru ca
    suntem 100% siguri ca avem doar acel tip de obiecte in clasa
     */
    public static void main(String[] args) {
//        Box<int> boxInt = new Box<int>();

        Box<String> stringBox = new Box<>("Text");
        System.out.println(stringBox.getItem());
        stringBox.setItem("Este un stringBox");
        System.out.println(stringBox.getItem());

        System.out.println("------");

        Box<Integer> integerBox = new Box<>(10);
        System.out.println(integerBox.getItem());
        integerBox.setItem(99);
        System.out.println(integerBox.getItem());

        System.out.println("------");

        Box<Boolean> booleanBox = new Box<>(true);
        System.out.println(booleanBox.getItem());
        booleanBox.setItem(false);
        System.out.println(booleanBox.getItem());

        System.out.println("------");

        Pahar pahar = new Pahar();
        Box<Pahar> paharBox = new Box<>(pahar);
        System.out.println(paharBox.toString());

        BoxLimited<Pahar> boxLimited = new BoxLimited<Pahar>(pahar);

        PaharSampanie paharSampanie = new PaharSampanie();
        BoxLimited<PaharSampanie> sampanieBoxLimited = new BoxLimited<>(paharSampanie);
        sampanieBoxLimited.getVolume();


    }
}
