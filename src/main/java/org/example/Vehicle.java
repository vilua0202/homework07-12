package org.example;

public abstract class Vehicle {
    private int speed;
    private int capacity;
    public Vehicle(int speed,int capacity){
        this.capacity=capacity;
        this.speed=speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    void start() {
        System.out.println("Vehicle starting...");
    }

    // Abstract method for unique features
    abstract void displayUniqueFeatures();
}
