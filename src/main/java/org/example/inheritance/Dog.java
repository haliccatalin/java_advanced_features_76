package org.example.inheritance;

public class Dog extends Animal {


    private int aggressiveness;

    public Dog(String name, String race, double weight, int aggressiveness) {
        // super -> este un keyword care face legatura cu
        //          clasa parinte.
        //       -> este echivalentul lui "this", doar ca
        //       acesta este folosit in relatia de mostenire

        // apelam constructorul din clasa parinte

        // ATENTIE!!!!!!!!
        // atunci cand avem o relatie de mostenire, pe prima linie in
        // constructor TREBUIE SA SCRIEM SUPER()
        super(name, race, weight);

        this.aggressiveness = aggressiveness;

        System.out.println("Constructor CLASA DOG");
    }

    public int getAggressiveness() {
        return aggressiveness;
    }

    public void setAggressiveness(int aggressiveness) {
        if(aggressiveness >= 1 && aggressiveness <= 10) {
            this.aggressiveness = aggressiveness;
        }
    }

    public void showAge() {
        int age = super.getAge();

        System.out.println(age);
    }


}
