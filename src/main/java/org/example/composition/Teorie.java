package org.example.composition;

public class Teorie {
    /*
    Principiul Compozitiei

    - se refera la posibilitatea obiectelor de a avea
    ca proprietati alte obiecte

    HAS A?
     */
    public static void main(String[] args) {
        Ecran ecran = new Ecran();
        Tastatura tastatura = new Tastatura();
        Baterie baterie = new Baterie();

        Laptop asus = new Laptop(ecran, tastatura, baterie);
    }
}
