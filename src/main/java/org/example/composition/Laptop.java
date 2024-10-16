package org.example.composition;

public class Laptop {
    private Ecran ecran;
    private Tastatura tastatura;
    private Baterie baterie;

    public Laptop(Ecran ecran, Tastatura tastatura, Baterie baterie) {
        this.ecran = ecran;
        this.tastatura= tastatura;
        this.baterie = baterie;
    }
}
