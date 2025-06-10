package org.lessons.snacks;

//restituisci il secondo elemento piu' grande in un array 
public class Snack_2 {
    static int[] array = { 1, 2, 10, 3, 4, 5, 12, 7, 8, 9, 10, 11 };

    public static void main(String[] args) {
        int highestValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (highestValue < array[i]) {
                highestValue = array[i];
            }
        }
        int secondHighestValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (secondHighestValue < array[i] && array[i] < highestValue) {
                secondHighestValue = array[i];
            }
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(highestValue);
        System.out.println(secondHighestValue);
    }
}
