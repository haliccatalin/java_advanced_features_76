package org.example.inheritance;

public class Animal extends Creature {
    private String name;
    private String race;
    private double weight;

    public Animal(String name, String race, double weight) {
//        this.name = name;
//        this.race = race;
//        this.weight = weight;
        super(); // se apeleaza pe prima linie atunci cand avem un constructor default

        setName(name);
        setRace(race);
        setWeight(weight);

        System.out.println("Constructor CLASA ANIMAL");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        if(race != null && !race.isEmpty()) {
            this.race = race;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight >= 0) {
            this.weight = weight;
        }
    }
}
