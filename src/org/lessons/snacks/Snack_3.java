package org.lessons.snacks;

import java.util.Arrays;

//rimuovi l'elemento centrale di un array se e' dispari, i due elementi centrali se e' pari
public class Snack_3 {
    static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        if (array.length % 2 == 0) {
            int[] newArray = new int[array.length - 2];
            int y = 0;
            for (int i = 0; i < array.length; i++) {
                if (i != array.length / 2 - 1 && i != array.length / 2) {
                    newArray[y] = array[i];
                    y++;
                }
            }

            System.out.println(Arrays.toString(newArray));
        } else {
            int[] newArray = new int[array.length - 1];
            int y = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.println("this is loop n: " + i + " for y index: " + y);
                if (i != array.length / 2) {
                    newArray[y] = array[i];
                    y++;
                }
            }

            System.out.println(Arrays.toString(newArray));
        }

    }
}
