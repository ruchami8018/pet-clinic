package vets;
import com.petclinic.interfaces.Veterinarian;
import com.petclinic.model.Pet;

public class GeneralVeterinarian implements Veterinarian{
    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    public GeneralVeterinarian() {}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "General check-up for " + pet.getName() + " the " + pet.getSpecies();
    }

    @Override
    public String toString() {
        return "GeneralVeterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
