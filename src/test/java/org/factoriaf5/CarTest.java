
package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testCarConstructor() {
        Car car = new Car("ABC123");
        assertEquals(car.getLicensePlate(), "ABC123");
    }

    @Test
    public void testCalculateToll() {
        Car car = new Car("ABC123");
        assertEquals(car.calculateToll(), 100);
    }
}