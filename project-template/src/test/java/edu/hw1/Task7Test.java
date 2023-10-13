package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7Test {

    @Test
    @DisplayName("проверка rotateLeft")
    void rotateLeftCheck() {
        int[] n = {16, 17};
        int[] shifts = {1, 2};

        int[] results = {1, 6};

        for (int i = 0; i < n.length; i++) {
            assertEquals(results[i], Task7.rotateLeft(n[i], shifts[i]));
        }
    }

    @Test
    @DisplayName("проверка rotateRight")
    void rotateRightCheck() {
        int n = 8;
        int shift = 1;

        int result = 4;

        assertEquals(result, Task7.rotateRight(n, shift));
    }
}
