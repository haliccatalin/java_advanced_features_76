package org.example.abstraction.abstractClasses;

public class Teorie {
    public static void main(String[] args) {
        // O clasa abstracta nu poate avea o instanta!!! pentru ca au metode abstracte

        // O metoda abstracta contine DOAR semnatura metodei
        // - aceasta mai contine keyword-ul "abstract" semnatura

//        Angajat angajat = new Angajat("Catalin", 30, 2000);
//        angajat.calculareBonusuri();

        Angajat developer = new Developer("John", 23, 4000, "Java", 3);
        // de discutat: clase / interfete ANONIME
    }
}
