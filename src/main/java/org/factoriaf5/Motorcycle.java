package org.factoriaf5;

public class Motorcycle extends Vehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public int calculateToll() {
        return 50;
    }
}