package org.factoriaf5;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ789");
        Vehicle truck = new Truck("TRK456", 4);

        System.out.println("Car Toll: $" + car.calculateToll());
        System.out.println("Motorcycle Toll: $" + motorcycle.calculateToll());
        System.out.println("Truck Toll: $" + truck.calculateToll());
    
    }
}
