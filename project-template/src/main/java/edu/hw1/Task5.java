package edu.hw1;

public class Task5 {
    public static void main(String[] args) {

        System.out.println(isPalindromeDescendant(12321));

    }

    public static boolean isPalindromeDescendant(int number) {
        StringBuilder variableNumber = new StringBuilder(String.valueOf(number));
        StringBuilder createdNumber = new StringBuilder();
        if (variableNumber.toString().contentEquals(variableNumber.reverse()) && variableNumber.length() > 1) {
            return true;
        } else if (variableNumber.length() > 2){
            for (int i = 0; i < variableNumber.length() - 1; i += 2){
                createdNumber.append(Integer.parseInt(variableNumber.substring(i, i + 1))
                        + Integer.parseInt(variableNumber.substring(i + 1, i + 2)));
            }
            return isPalindromeDescendant(Integer.parseInt(createdNumber.toString()));
        } else return false;

    }
}
