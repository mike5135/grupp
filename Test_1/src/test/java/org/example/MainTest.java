package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testArrayContents() {
        // Hämtar arrayen från Main klassen
        int[] actualArray = Main.getArray();

        // Förväntad array
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Testar om den actualArray arrayen är lika med den expectedArray arrayen
        assertArrayEquals(expectedArray, actualArray, "Arrayen är inte som förväntat!");
    }
}
