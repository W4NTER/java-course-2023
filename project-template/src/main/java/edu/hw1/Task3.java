package edu.hw1;

public class Task3 {
    public static void main(String[] args) {
        int[][] arrays1 = new int[][]{{1, 2, 3, 4}, {3, 1}, {9, 9, 8}, {1, 2, 3, 4}};
        int[][] arrays2 = new int[][]{{0, 6}, {4, 0}, {8, 9}, {2, 3}};

        for (int i = 0; i < arrays1.length; i++) {
            System.out.println(isNestable(arrays1[i], arrays2[i]));
        }
    }

    public static boolean isNestable(int[] arr1, int[] arr2){
        return getMin(arr1) > getMin(arr2) && getMax(arr1) < getMax(arr2);

    }

    public static int getMin(int[] array){
        int min = array[0];
        for (int value : array){
            if (min > value){
                min = value;
            }
        }
        return min;
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int value : array){
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
