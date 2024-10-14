package org.example.polymorphism;

import org.example.polymorphism.overload.Person;
import org.example.polymorphism.override.Child;

public class Teorie {
    /**
     * Polymorphism-ul reprezinta calitatea obiectelor de a lua diferite forme
     * in functie de implementarea metodelor din clasa
     *
     * Se impare in 2 categori
     *
     * 1. Suprascriere (Override)
     * - se refera la schimbarea functionalitatii unei metode
     * din clasa PARINTE in clasa COPIL ex: toString()
     *
     * 2. Supraincarcare (OverLoad)
     * - posibilitatea de a avea intr-o clasa mai multe metode (si constructori)
     * cu acelasi nume DAR cu parametrii diferiti (tipul, ordinea sa fie diferita)
     *
     * ATENTIE!!!!
     *
     * - tipul returnat al unei metode nu conteaza (nu poate sa fie singura diferenta intre metode)
     *
     * ASA NU!!
     * public static void showData() {
     *
     * }
     *
     * public static boolean showData() {
     *    return false;
     * }
     */



    public static void main(String[] args) {
        // overload
        Person person3 = new Person("Catalin", "0752123123", 30);
        Person person1 = new Person("catalin", 30, "342342");
        Person person2 = new Person(30, "catalin", "342342");
        Person person4 = new Person("Catalin", "065534545435");
        Person person5 = new Person("Catalin");
        Person person6 = new Person();

        // override
        Child child = new Child("john");
        child.showName();

        String result = child.toString();
        System.out.println(result);

    }
}
