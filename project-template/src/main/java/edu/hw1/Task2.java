package edu.hw1;

public class Task2 {
    public static void main(String[] args) {
        int[] input = new int[]{4666, 544, 0, 1212121};
        for (int value : input) {
            System.out.println(countDigits(value));
        }
    }

    public static int countDigits(int value) {
        int delimiter = 10;
        int digit = 0, divisionResult = 1;
        while (divisionResult > 0){
            divisionResult = value / delimiter;
            digit++;
            delimiter *= 10;
        }
        return digit;
    }
}
