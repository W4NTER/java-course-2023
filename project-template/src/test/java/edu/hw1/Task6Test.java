package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {

    @Test
    void countKTest() {
        int[] values = new int[] {6621, 6554, 1234};

        int[] results = {5, 4, 3};

        for (int i = 0; i < values.length; i++) {
            assertEquals(results[i], Task6.countK(values[i]));
        }
    }
}
