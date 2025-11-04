package models;
public class Cat extends Pet {

    private String color;

    // Constructor
    public Cat(String name, int age, String species, String color) {
        super(name, age, species); // קורא לבנאי של Pet
        this.color = color;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Override abstract method makeSound
    @Override
    public String makeSound() {
        return "Meow"; // החתול מיילל
    }

    // Override abstract method eat
    @Override
    public String eat() {
        return "Cat eats cat food"; // מה החתול אוכל
    }


    @Override
    public String toString() {
        return "Cat[name=" + getName() + ", age=" + getAge() + ", species=" + getSpecies() + ", color=" + color + "]";
    }
}
