package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;




class Task1Test {

    @Test
    @DisplayName("Время видео в секундах")
    void videoLengthInSeconds(){
        //given
        String[] videoLength = {"01:00", "13:56", "10:60"};
        int[] results = {60, 836, -1};

        //when
//        int lengthInSeconds = Task1.minutesToSeconds(videoLength);

        //then
        for (int i = 0; i < videoLength.length; i++) {
            assertEquals(results[i], Task1.minutesToSeconds(videoLength[i]));
        }


    }

}
