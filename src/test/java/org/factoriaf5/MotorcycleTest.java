
package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MotorcycleTest {

    @Test
    public void testMotorcycleCreation() {
        Motorcycle motorcycle = new Motorcycle("ABC123");
        assertEquals(motorcycle.getLicensePlate(), "ABC123");
    }

    @Test
    public void testCalculateToll() {
        Motorcycle motorcycle = new Motorcycle("ABC123");
        assertEquals(motorcycle.calculateToll(), 50);
    }
}