package com.petclinic.interfaces;
import com.petclinic.model.Pet;

public interface Veterinarian {
    String getName();
    String examinePet(Pet pet);
}
