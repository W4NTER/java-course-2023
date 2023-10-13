package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

    @Test
    @DisplayName("Изменение порядка символов")
    void fixedString() {
        String[] arrStr = {"123456", "hTsii  s aimex dpus rtni.g", "badce", "оПомигети псаривьтс ртко!и"};

        String[] result = {"214365", "This is a mixed up string.", "abcde", "Помогите исправить строки!"};

        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], Task4.fixString(arrStr[i]));
        }
    }
}
