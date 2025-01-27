package org.factoriaf5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TollStationTest {

    private TollStation tollStation;
    private Vehicle mockVehicle;

    @BeforeEach
    public void setUp() {
        tollStation = new TollStation("Main Street", "Springfield");
        mockVehicle = new Vehicle("ABC123") {
            @Override
            public int calculateToll() {
                return 5;
            }
        };
    }

    @Test
    public void testAddVehicle() {
        tollStation.addVehicle(mockVehicle);
        assertEquals(5, tollStation.getTotalCollected());
    }

    @Test
    public void testAddMultipleVehicles() {
        Vehicle anotherMockVehicle = new Vehicle("XYZ789") {
            @Override
            public int calculateToll() {
                return 10;
            }
        };

        tollStation.addVehicle(mockVehicle);
        tollStation.addVehicle(anotherMockVehicle);

        assertEquals(15, tollStation.getTotalCollected());
    }

    @Test
    public void testPrintSummary() {
        tollStation.addVehicle(mockVehicle);
        tollStation.addVehicle(mockVehicle);

        tollStation.printSummary();
        // Test passes if no exceptions are thrown.
    }
}
