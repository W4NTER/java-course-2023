package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {

    @Test
    @DisplayName("Количество чисел в числе")
    void countOfValues() {
        int[] input = new int[] {4666, 544, 0, 1212121};
        int[] results = new int[] {4, 3, 1, 7};

        for (int i = 0; i < input.length; i++) {
            assertEquals(results[i], Task2.countDigits(input[i]));
        }
    }
}
