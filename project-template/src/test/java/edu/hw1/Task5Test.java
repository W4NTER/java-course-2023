package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {

    @Test
    void isThisPalindrome(){

        int[] numbers = {122, 11211230, 23336014, 12991};
        boolean[] results = {false, true, true, false};

        for (int i = 0; i < numbers.length; i++) {
            assertEquals(results[i], Task5.isPalindromeDescendant(numbers[i]));
        }
    }

    @Test
    @DisplayName("Обрабатывается ли случай с числом длины 1")
    void lengthOne() {
        assertEquals(false, Task5.isPalindromeDescendant(1));
    }
}
