package org.factoriaf5;

public class Truck extends Vehicle {
    private int axles;

    // Constructor
    public Truck(String licensePlate, int axles) {
        super(licensePlate);
        this.axles = axles;
    }

    // Getter
    public int getAxles() {
        return axles;
    }

    @Override
    public int calculateToll() {
        return axles * 50;
    }
}
