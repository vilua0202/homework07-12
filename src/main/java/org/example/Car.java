package org.example;

// Subclass for Car
class Car extends Vehicle implements FuelConsumable {
    private int numberOfDoors;
    private String transmissionType;
    public Car(int speed, int capacity, int numberOfDoors, String transmissionType){
        super(speed,capacity);
        this.numberOfDoors=numberOfDoors;
        this.transmissionType=transmissionType;
    }

    void displayUniqueFeatures() {
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Transmission type: " + transmissionType);
    }
    public void refuel() {
        System.out.println("Refueling car...");
    }
}
