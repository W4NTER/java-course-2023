package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {

    @Test
    @DisplayName("Может ли массив вложиться в другой массив")
    void isThisArrFits() {

        int[][] arrays1 = new int[][]{{1, 2, 3, 4}, {3, 1}, {9, 9, 8}, {1, 2, 3, 4}};
        int[][] arrays2 = new int[][]{{0, 6}, {4, 0}, {8, 9}, {2, 3}};

        boolean[] results = new boolean[] {true, true, false, false};

        for (int i = 0; i < arrays2.length; i++) {
            assertEquals(results[i], Task3.isNestable(arrays1[i], arrays2[i]));
        }
    }
}
