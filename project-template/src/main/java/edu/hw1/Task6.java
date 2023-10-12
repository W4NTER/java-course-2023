package edu.hw1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int counter = 0;
        int[] values = new int[] {3524, 2321, 2221, 2000};
        for (int value : values) {
            System.out.println(countK(value, counter));
        }
    }

    public static int countK(int num, int counter) {
        StringBuilder value =  new StringBuilder(String.valueOf(num));
        int[] arrayNums = new int[] {0, 0, 0, 0};

        for (int i = 0; i < value.length(); i++){
             arrayNums[i] = Integer.parseInt(value.substring(i, i + 1));
        }
        Arrays.sort(arrayNums);
        StringBuilder strValue = new StringBuilder();

        for (int arrayNum : arrayNums) {
            strValue.append(arrayNum);
        }

        int number1 = Integer.parseInt(strValue.toString());

        strValue.reverse();

        int number2 = Integer.parseInt(strValue.toString());

        if (num == 6174) {
            return counter;
        } else {
            num = Math.max(number1, number2) - Math.min(number1, number2);
            counter++;
            return countK(num, counter);
        }
    }
}
