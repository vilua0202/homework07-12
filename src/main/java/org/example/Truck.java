package org.example;

class Truck extends Vehicle implements FuelConsumable {
    private int cargoCapacity;
    private int numberOfAxles;
    public Truck(int speed, int capacity, int cargoCapacity, int numberOfAxles ){
        super(speed,capacity);
        this.cargoCapacity=cargoCapacity;
        this.numberOfAxles=numberOfAxles;
    }
    void displayUniqueFeatures() {
        System.out.println("Cargo capacity: " + cargoCapacity);
        System.out.println("Number of axles: " + numberOfAxles);
    }
    public void refuel() {
        System.out.println("Refueling truck...");
    }
}
