package org.factoriaf5;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private int totalCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        int toll = vehicle.calculateToll();
        totalCollected += toll;
        System.out.println("Vehicle added: " + vehicle.getClass().getSimpleName() + " (License: " + vehicle.getLicensePlate() + ") - Toll: $" + toll);
    }

    public void printSummary() {
        System.out.println("\nToll Station: " + name + " in " + city);
        System.out.println("Vehicles Processed:");
        for (Vehicle vehicle : vehicles) {
            String vehicleType = vehicle.getClass().getSimpleName();
            System.out.println("- " + vehicleType + " (License: " + vehicle.getLicensePlate() + ")");
        }
        System.out.println("Total Toll Collected: $" + totalCollected);
    }

    // Getter for totalCollected
    public int getTotalCollected() {
        return totalCollected;
    }
}

