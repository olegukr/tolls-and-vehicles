package org.factoriaf5;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMainApp() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        App.main(new String[]{});

        System.setOut(System.out);

        String output = outputStream.toString();
        assertTrue(output.contains("Total Toll Collected:"));
        assertTrue(output.contains("Vehicles Processed:"));
    }
}

