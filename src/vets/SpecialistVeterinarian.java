package vets;

import interfaces.Veterinarian;
import models.Pet;

public class SpecialistVeterinarian implements Veterinarian {

    private String name;
    private String specialty;

    // Constructor
    public SpecialistVeterinarian(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "Specialist (" + specialty + ") examination for "
                + pet.getName() + " the " + pet.getSpecies();
    }

    @Override
    public String toString() {
        return "SpecialistVeterinarian[name=" + name + ", specialty=" + specialty + "]";
    }

}
