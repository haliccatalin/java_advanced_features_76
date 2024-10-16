package org.example.abstraction.interfaces;

import org.example.abstraction.interfaces.exempluAngajat.Angajat;
import org.example.abstraction.interfaces.exempluAngajat.FisaPostProgramatorJava;
import org.example.abstraction.interfaces.exempluAngajat.FisaPostProgramatorPython;
import org.example.abstraction.interfaces.exempluAngajat.ProgramatorJava;
import org.example.abstraction.interfaces.exempluMedic.MedicGeneralist;
import org.example.abstraction.interfaces.exempluMedic.MedicSpecialistCardiolog;
import org.example.abstraction.interfaces.exempluMedic.SpecializareCardiologie;

public class Teorie {
    /*
    Interface

    - reprezinta o colectie de metode publice si abstracte
    - nu poate avea proprietati, cu exceptia celor care sunt statice si final (constante)
    - nu poate avea constructori
    - nu poate fi instantiata cu keyword-ul "new"
    - ATENTIE!!!
        - in interfete putem avea metode cu implementare
        doar daca acestea sunt STATICE sau DEFAULT (a nu se confunda cu modificatorul de acces)
        - pentru a avea metode cu implementare trebuie sa punem in semnatura
        metodei keywordul "default"

        default void showName() {
            System.out.println("Contact Name");
        }
     - o clasa poate implementa o infinitate de interfete
     - keywordul "implements" ajuta la implementarea interfetelor
     -

     */

    public static void main(String[] args) {
        SpecializareCardiologie cardiologGeneralist = new MedicGeneralist("Ion");
        cardiologGeneralist.consultCardiologic();
        cardiologGeneralist.consult();

        System.out.println("---------");

        SpecializareCardiologie cardiologSpecialist = new MedicSpecialistCardiolog("Dan");
        cardiologSpecialist.consultCardiologic();
        cardiologSpecialist.consult();

        FisaPostProgramatorJava fisaPostProgramatorJava = new ProgramatorJava("Raul");
        FisaPostProgramatorPython fisaPostProgramatorPython = new ProgramatorJava("Catalin");
    }
}
