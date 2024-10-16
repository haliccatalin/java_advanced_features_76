package org.example.abstraction.interfaces.exempluAngajat;

public class ProgramatorJava extends Angajat implements FisaPostProgramatorJava, FisaPostProgramatorPython {

    public ProgramatorJava(String name) {
        super(name);
    }


    // clasa Angajat care implementeaza fisa postului
    @Override
    public void checkIn() {

    }

    @Override
    public void checkOut() {

    }

    @Override
    public void createApps() {

    }

    // Fisa postului pentru programtorul de java
    @Override
    public void learnJava() {

    }

    @Override
    public void teachJava() {

    }

    @Override
    public void showSlides() {

    }

    // Fisa postului pentru programtorul de python
    @Override
    public void learnPython() {

    }

    @Override
    public void teachPython() {

    }
}
