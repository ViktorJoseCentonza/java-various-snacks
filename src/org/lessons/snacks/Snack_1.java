package org.lessons.snacks;

import java.util.Arrays;

//Scambia il primo elemento con il penultimo e l'ultimo con il secondo di un array
public class Snack_1 {
    static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    public static void main(String[] args) {
        int valueHolder = array[array.length - 2];
        array[array.length - 2] = array[array.length - 1];
        array[array.length - 1] = valueHolder;

        System.out.println(Arrays.toString(array));

    }
}
