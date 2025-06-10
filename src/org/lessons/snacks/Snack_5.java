package org.lessons.snacks;

import java.util.Arrays;

//Scrivi un programma che generi 30 numeri randomici diversi tra 0 e 55 e li inserisca in un array, stampali, ordinali e poi stampa l'array ordinato, senza usare il metodo Sort
public class Snack_5 {
    static int[] array = new int[30];

    static public void generateArrayValues() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 56);
        }
    }

    static public int[] arraySort(int[] array) {

        int index = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            for (int y = 0; y < index - 1; y++) {
                if (array[y] > array[y + 1]) {
                    int tempValue = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = tempValue;
                }
            }
            index--;
        }

        return array;
    }

    public static void main(String[] args) {
        generateArrayValues();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arraySort(array)));
    }

}
