package com.petclinic.model;

public class Dog extends Pet{
private String breed;

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    public Dog() {}

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String makeSound(){
        return "Bark";
    }
    @Override
    public String eat(){
        return "Dog eats dog food";
    }
    @Override
    public String toString() {
        return "Dog[name=" + getName() + ", age=" + getAge() + ", species=" + getSpecies() + ", breed=" + breed + "]";
    }
}
