package org.example.abstraction.abstractClasses;

public class Developer extends Angajat {
    private String programmingLanguage;
    private int yeasOfExperience;

    public Developer(String name, int varsta, double salariu, String programmingLanguage, int yeasOfExperience){
        super(name, varsta, salariu); // merg in clasa parinte

        this.programmingLanguage = programmingLanguage;
        this.yeasOfExperience = yeasOfExperience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getYeasOfExperience() {
        return yeasOfExperience;
    }

    public void setYeasOfExperience(int yeasOfExperience) {
        this.yeasOfExperience = yeasOfExperience;
    }


    //


    @Override
    void calculareBonusuri() {
        // in clasa Developer stiu exact cum sa calculez bonusurile pentru aceasta pozitie
    }
}
