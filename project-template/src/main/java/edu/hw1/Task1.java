package edu.hw1;

public class Task1 {
    public static void main(String[] args) {
        String[] videoLength = {"01:00", "13:56", "10:60"};
        for (String input : videoLength) {
            System.out.println(minutesToSeconds(input));
        }
    }

    public static int minutesToSeconds(String videoLength) {
        String[] strSplit = videoLength.split(":");
        int minutes = Integer.parseInt(strSplit[0]);
        int seconds = Integer.parseInt(strSplit[1]);
        if (seconds >= 60) {
            return -1;
        } else {
            seconds = minutes * 60 + seconds;
            return seconds;
        }

    }

}
