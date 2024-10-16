package org.example.abstraction.interfaces.exempluMedic;

public class MedicGeneralist extends Medic implements SpecializareOrtopedie, SpecializareCardiologie, SpecializarePediatrie, SpecializareNeurologie {
    public MedicGeneralist(String name) {
        super(name);
    }

    @Override
    public void consultCardiologic() {
        System.out.println("Sunt medic generalist " + super.getName());

    }

    @Override
    public double getPuls() {
        return 0;
    }

    public void showDiplomaMedicGeneralist() {

    }

    @Override
    public void consultNeurologic() {

    }

    @Override
    public void radiografieNeuro() {

    }

    @Override
    public void consultOrtopedic() {

    }

    @Override
    public void verificareArticulatii() {

    }

    @Override
    public void consultPediatru() {

    }

    @Override
    public void vaccinare() {

    }
}
