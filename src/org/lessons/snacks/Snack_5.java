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
        int counter = 0;
        do {
            counter = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    counter++;
                    int tempValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempValue;
                }
            }
        } while (counter != 0);

        return array;
    }

    public static void main(String[] args) {
        generateArrayValues();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arraySort(array)));
    }

}
