package org.example;

class Bicycle extends Vehicle {
    private int numberOfWheels;
    private String pedalType;
    public Bicycle(int numberOfWheels,String pedalType, int speed, int capacity){
        super(speed,capacity);
        this.numberOfWheels=numberOfWheels;
        this.pedalType=pedalType;
    }
    void displayUniqueFeatures() {
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Pedal type: " + pedalType);
    }
}
