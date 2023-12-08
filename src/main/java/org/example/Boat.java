package org.example;

class Boat extends Vehicle implements FuelConsumable {
    private String propulsionType;
    private double draft;
    public Boat(int speed, int capacity, String propulsionType, double draft){
        super(speed,capacity);
        this.propulsionType=propulsionType;
        this.draft=draft;
    }
    void displayUniqueFeatures() {
        System.out.println("Propulsion type: " + propulsionType);
        System.out.println("Draft: " + draft);
    }
    public void refuel() {
        System.out.println("Refueling boat...");
    }
}
