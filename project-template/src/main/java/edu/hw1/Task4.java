package edu.hw1;

public class Task4 {
    public static void main(String[] args) {
        String[] arrStr = new String[]{"123456", "hTsii  s aimex dpus rtni.g", "badce", "оПомигети псаривьтс ртко!и"};
        for (String str : arrStr) {
            System.out.println(fixString(str));
        }
    }

    public static String fixString(String input) {
        StringBuilder fixedString = new StringBuilder();
        for (int i = 1; i < input.length(); i += 2) {
            fixedString.append(input.charAt(i));
            fixedString.append(input.charAt(i - 1));
        }
        return new String(fixedString);
    }
}
