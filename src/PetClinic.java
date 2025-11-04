import models.Cat;
import models.Dog;
import models.Pet;
import vets.SpecialistVeterinarian;
import vets.GeneralVeterinarian;
import java.util.ArrayList;
import java.util.List;

import interfaces.Veterinarian;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PetClinic {
    public static void main(String[] args) {
        //יצירת חיות
        Dog dog1 = new Dog("Rex", 3, "Dog", "Labrador");
        Cat cat1 = new Cat("Mittens", 2, "Cat", "Black");

        //יצירת וטרינרים
        GeneralVeterinarian vet1 = new GeneralVeterinarian("Dr. Smith");
        SpecialistVeterinarian vet2 = new SpecialistVeterinarian("Dr. John", "Surgery");

        //רשימות של חיות ווטרינרים
        List<Pet> pets = new ArrayList<>();
        pets.add(dog1);
        pets.add(cat1);

        List<Veterinarian> vets = new ArrayList<>();
        vets.add(vet1);
        vets.add(vet2);

        //הדגמת Polymorphism
        System.out.println("=== Pets and their sounds ===");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " (" + pet.getSpecies() + ") says: " + pet.makeSound());
        }

        System.out.println("\n=== Pets being examined by veterinarians ===");
        for (Pet pet : pets) {
            for (Veterinarian vet : vets) {
                System.out.println(vet.getName() + " examines " + pet.getName() + ": " + vet.examinePet(pet));
            }
        }
    }
}