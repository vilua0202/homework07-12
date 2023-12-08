package org.example;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car(120,5,4,"Automatic");

        Bicycle bicycle = new Bicycle(2,"Manual",20, 1);

        Truck truck = new Truck(80,3,5000,2);

        Boat boat = new Boat(25,10,"Sail",5.0);

        car.start();
        bicycle.start();
        truck.start();
        boat.start();

        car.displayUniqueFeatures();
        car.refuel();

        bicycle.displayUniqueFeatures();

        truck.displayUniqueFeatures();
        truck.refuel();

        boat.displayUniqueFeatures();
        boat.refuel();
    }
}
