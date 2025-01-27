package org.factoriaf5;


public final class App {
    private App() {
    }

    public static void main(String[] args) {

        TollStation tollStation = new TollStation("Central Toll", "New York");

        tollStation.addVehicle(new Car("ABC123"));
        tollStation.addVehicle(new Motorcycle("XYZ789"));
        tollStation.addVehicle(new Truck("TRK456", 4));

        tollStation.printSummary();
    }
    
}
