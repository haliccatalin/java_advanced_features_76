package org.example.enums;

public class Teorie {
    /*
       ENUMS

       - sunt tipuri de date ce reprezinta o insiruire de elemente
       ex: Zilele saptamanii, lunile anului etc

       - enumurile pot avea constructori, proprietati, metode
       - enum este la baza un obiect, inseamna ca poate suprascrie metodele din clasa Object
       - daca dorim sa definim constructori, proprietati sau metode, in urma enumerarii trebuie sa punem ";"
       ex: enum WeekDays {
        LUNI,
        MARTI,
        MIERCURI;

        private final String name;

        WeekDays(String name) {
            this.name = name;
        }
        }
        - daca adaugam constructori trebuie sa-i apelam atunci cand definim valorile din enum
        LUNI("Luni"),
        MARTI("Marti"),
        MIERCURI("Miercuri");
     */
    public static void main(String[] args) {
        LengthUnit meterUnit = LengthUnit.FOOT;

        System.out.println(meterUnit);

        System.out.println(meterUnit.convertToMeters());

        switch (meterUnit) {
            case LengthUnit.CENTIMETER:
                System.out.println("Acesta este un centrimetru");
                break;
            case LengthUnit.FOOT:
                System.out.println("Acesta este un picior");
                break;
            case LengthUnit.INCH:
                System.out.println("Acesta este un inch");
                break;
            case LengthUnit.METER:
                System.out.println("Acesta este un metru");
                break;
            default:
                System.out.println("Nu este o unitate de masura");
                break;
        }

        // parcurgea elementelor dintr-un enum
        String[] names = {"Ana", "Maria", "Ion"};

        for(String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------");

        for(WeekDays day : WeekDays.values()) {
            System.out.println(day);
        }
    }
}
