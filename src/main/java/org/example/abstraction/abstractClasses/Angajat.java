package org.example.abstraction.abstractClasses;

public abstract class Angajat {
    private String name;
    private int varsta;
    private double salariu;

    public Angajat(String name, int varsta, double salariu) {
        this.name = name;
        this.varsta = varsta;
        this.salariu = salariu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }


    // doctor
    // nr ore * tariful orar + spor de noapte

    // developer
    // nr ore * tariful orar * 150%

    // femeie de serviciu
    // nr ore * tarif orar
    abstract void calculareBonusuri();

}
