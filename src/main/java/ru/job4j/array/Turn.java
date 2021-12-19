package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {

        for (int startIndex = 0, endIndex = array.length - 1; startIndex < endIndex; startIndex++, endIndex--) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
        return array;
    }
}
