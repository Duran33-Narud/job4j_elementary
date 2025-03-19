package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int arr = array.length;
        for (int i = 0; i < arr / 2; i++) {
            int temp = array[i];
            array[i] = array[arr - 1 - i];
            array[arr - 1 - i] = temp;
        }
        return array;
    }
}
