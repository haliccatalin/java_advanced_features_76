package org.example.abstraction.interfaces.exempluMedic;

public class MedicSpecialistCardiolog extends Medic implements SpecializareCardiologie {

    public MedicSpecialistCardiolog(String name) {
        super(name);
    }

    @Override
    public void consultCardiologic() {
        System.out.println("Sunt Specilist in cardiologie " + super.getName());
    }

    @Override
    public double getPuls() {
        return 0;
    }

    @Override
    public void consult() {
        System.out.println("Clasa MedicSpecilist Cardiolog");
    }
}
