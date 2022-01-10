package com.company.objects;

public class dog {
    private int animalID;
    private String name;
    private String species;
    private int age;
    private double weight;
    private String food;
    private double height;
    private String lastfed;

    public dog(int animalID, String name, String species, int age, double weight, String food, double height, String lastfed) {
        this.animalID = animalID;
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.food = food;
        this.height = height;
        this.lastfed = lastfed;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getLastfed() {
        return lastfed;
    }

    public void setLastfed(String lastfed) {
        this.lastfed = lastfed;
    }
}
