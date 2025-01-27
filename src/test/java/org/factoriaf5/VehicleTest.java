package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testCarLicensePlate() {
        Vehicle car = new Car("CAR123");
        assertEquals("CAR123", car.getLicensePlate());
    }

    @Test
    public void testMotorcycleLicensePlate() {
        Vehicle motorcycle = new Motorcycle("MOTO123");
        assertEquals("MOTO123", motorcycle.getLicensePlate());
    }

    @Test
    public void testTruckLicensePlate() {
        Vehicle truck = new Truck("TRUCK123", 4);
        assertEquals("TRUCK123", truck.getLicensePlate());
    }
}
