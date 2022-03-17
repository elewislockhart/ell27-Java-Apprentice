package org.javapet;

public class Pet {
    private String name;
    private double happiness;
    private double energy;
    private String mood;
    private double health;
    private String status;

    public Pet(String _name, double _happiness, double _energy, String _mood, double _health, String _status) {
        this.name = _name;
        this.happiness = _happiness;
        this.energy = _energy;
        this.mood = _mood;
        this.health = _health;
        this.status = _status;
    }

    public void petDetails() {
        System.out.println("--- Pet Details ---");
        System.out.println("Name: " + this.name);
        System.out.println("Happiness: " + this.happiness);
        System.out.println("Energy: " + this.energy);
        System.out.println("Mood: " + this.mood);
        System.out.println("health: " + this.health);
        System.out.println("Status: " + this.status);
        System.out.println("-------------------");
    }

    // Status
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String _aliveStatus) {
        this.status = _aliveStatus;
    }

    // Health
    public double getHealth() {
        return this.health;
    }

    public void setHealth(double _health) {
        this.health = _health;
    }

    // Energy
    public double getEnergy() {
        return this.energy;
    }

    public void setEnergy(double _energy) {
        this.energy = _energy;
    }

    // Mood
    public String getMood() {
        return mood;
    }

    public void setMood(String _mood) {
        this.mood = _mood;
    }

    // Happiness
    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(int _happiness) {
        this.happiness = _happiness;
    }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }
}
