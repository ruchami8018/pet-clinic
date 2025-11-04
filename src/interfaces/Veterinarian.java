package interfaces;
import models.Pet;

public interface Veterinarian {
    String getName();
    String examinePet(Pet pet);
}
