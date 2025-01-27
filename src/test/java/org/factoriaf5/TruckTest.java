package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    public void testTruckCreation() {
        Truck truck = new Truck("ABC123", 4);
        assertEquals(truck.getLicensePlate(), "ABC123");
        assertEquals(truck.getAxles(), 4);
    }

    @Test
    public void testCalculateToll() {
        Truck truck = new Truck("XYZ789", 3);
        assertEquals(truck.calculateToll(), 150);
    }
}