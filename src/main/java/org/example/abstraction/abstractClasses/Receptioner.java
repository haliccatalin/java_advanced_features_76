package org.example.abstraction.abstractClasses;

public class Receptioner extends Angajat {

    public Receptioner(String name, int varsta, double salariu) {
        super(name, varsta, salariu);
    }

    @Override
    void calculareBonusuri() {
        // calculare bonusuri pentru un receptioner
    }
}
