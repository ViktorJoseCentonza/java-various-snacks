package org.lessons.snacks;

import java.util.Arrays;

//metodo che ritorni true se l'array contiene un duplicato, array di duplicati, quadruplicati
public class Snack_4 {
    static int[] array = new int[50];

    static public void generateArrayValues() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
    }

    // ----------------------------------------------------------
    // returns only if something is duplicate

    static public boolean containsDuplicates() {
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array.length; y++) {
                if (array[i] == array[y] && i != y) {
                    return true;
                }
            }
        }

        return false;
    }

    // ----------------------------------------------------------
    // returns only once, what numbers are duplicated

    static public boolean isNotAlreadyFound(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return false;
            }
        }
        return true;
    }

    static public int[] containsDuplicatesWithArrayOfDuplicates() {
        int[] duplicatesArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            for (int y = i + 1; y < array.length; y++) {
                // System.out.println("this is cycle n: " + i + " for y: " + y + " j is
                // currently: " + j);
                if (array[i] == array[y] && isNotAlreadyFound(duplicatesArray, array[y])) {

                    // System.out.println("duplicate found and added to array!");
                    duplicatesArray[j] = array[i];
                    j++;
                }
            }
        }

        return duplicatesArray;
    }

    // ----------------------------------------------------------
    //

    static public int[] containsDuplicatesWithDetailedArrayOfDuplicates() {
        int[] detailedDuplicatesArray = new int[array.length];
        int j = 0;
        boolean justFound = false;
        for (int i = 0; i < array.length; i++) {
            justFound = false;
            if (isNotAlreadyFound(detailedDuplicatesArray, array[i])) {
                for (int y = i + 1; y < array.length; y++) {
                    // System.out.println("this is cycle n: " + i + " for y: " + y + " j is
                    // currently: " + j);

                    if (array[i] == array[y]) {
                        // System.out.println("duplicate found and added to array!");
                        detailedDuplicatesArray[j] = array[i];
                        if (!justFound) {
                            j++;
                            detailedDuplicatesArray[j] = array[i];
                            justFound = true;
                        }
                        j++;
                    }

                }
            }
        }

        return detailedDuplicatesArray;
    }

    static public int[] getDuplicatesFromArray(int[] array) {
        int[] duplicatesArray = new int[array.length / 2];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int y = i + 1; y < array.length; y++) {
                if (array[i] == array[y]) {
                    counter++;
                }
            }
            if (counter == 2) {
                duplicatesArray[j] = array[i];
                j++;
            }
        }
        return duplicatesArray;
    }

    static public int[] getTriplicatesFromArray(int[] array) {
        int[] triplicatesArray = new int[array.length / 3];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int y = i + 1; y < array.length; y++) {
                if (array[i] == array[y]) {
                    counter++;
                }
            }
            if (counter == 3) {
                triplicatesArray[j] = array[i];
                j++;
            }
        }
        return triplicatesArray;
    }

    static public int[] getQuadruplicatesFromArray(int[] array) {
        int[] quadruplicatesArray = new int[array.length / 4];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int y = i + 1; y < array.length; y++) {
                if (array[i] == array[y]) {
                    counter++;
                }
            }
            if (counter == 4) {
                quadruplicatesArray[j] = array[i];
                j++;
            }
        }
        return quadruplicatesArray;
    }

    static public int[] updatedContainsDuplicatesWithDynamicArraySize() {
        int[] detailedDuplicatesArray = new int[0];
        int j = 0;
        boolean justFound = false;
        for (int i = 0; i < array.length; i++) {
            justFound = false;
            if (isNotAlreadyFound(detailedDuplicatesArray, array[i])) {
                for (int y = i + 1; y < array.length; y++) {
                    // System.out.println("this is cycle n: " + i + " for y: " + y + " j is
                    // currently: " + j);

                    if (array[i] == array[y]) {
                        // System.out.println("duplicate found and added to array!");

                        if (!justFound) {
                            int[] tempArray = new int[detailedDuplicatesArray.length + 2];
                            for (int z = 0; z < detailedDuplicatesArray.length; z++) {
                                tempArray[z] = detailedDuplicatesArray[z];
                            }
                            tempArray[j] = array[i];
                            j++;
                            tempArray[j] = array[i];
                            justFound = true;

                            detailedDuplicatesArray = tempArray;

                        } else {

                            int[] tempArray = new int[detailedDuplicatesArray.length + 1];
                            for (int z = 0; z < detailedDuplicatesArray.length; z++) {
                                tempArray[z] = detailedDuplicatesArray[z];
                            }
                            tempArray[j] = array[i];

                            detailedDuplicatesArray = tempArray;
                        }
                        j++;
                    }

                }
            }
        }

        return detailedDuplicatesArray;
    }

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        generateArrayValues();

        // ----------------------------------------------------------------------------------------------------
        // with simple true/false
        // if (containsDuplicates()) {
        // System.out.println("There's a duplicate somewhere!");
        // } else {
        // System.out.println("There are no duplicates");
        // }

        // -----------------------------------------------------------------------------------------------------
        // with array containing only once, what numbers are duplicates (or more than
        // duplicates)
        // if (containsDuplicatesWithArrayOfDuplicates().length != 0) {

        // System.out.println("duplicates found, here's the full list below");
        // System.out.println(Arrays.toString(containsDuplicatesWithArrayOfDuplicates()));

        // System.out.println("and here's the original array");

        // System.out.println(Arrays.toString(array));

        // } else {
        // System.out.println("there were no duplicates found!");
        // }

        // -----------------------------------------------------------------------------------------------------------

        // if (containsDuplicatesWithDetailedArrayOfDuplicates().length != 0) {

        // System.out.println("duplicates found, here's the full list below");
        // System.out.println(Arrays.toString(containsDuplicatesWithDetailedArrayOfDuplicates()));

        // System.out.println("and here's the original array");

        // System.out.println(Arrays.toString(array));

        // System.out.println("here is the duplicates list");

        // System.out.println(Arrays.toString(getDuplicatesFromArray(
        // containsDuplicatesWithDetailedArrayOfDuplicates())));

        // System.out.println("here is the triplicates list");

        // System.out.println(Arrays.toString(getTriplicatesFromArray(
        // containsDuplicatesWithDetailedArrayOfDuplicates())));

        // System.out.println("here is the quadruplicates list");

        // System.out.println(Arrays.toString(getQuadruplicatesFromArray(
        // containsDuplicatesWithDetailedArrayOfDuplicates())));

        // } else {
        // System.out.println("there were no duplicates found!");
        // }

        // --------------------------------------------------------------------------

        if (updatedContainsDuplicatesWithDynamicArraySize().length != 0) {

            System.out.println("duplicates found, here's the full list below");
            System.out.println(Arrays.toString(updatedContainsDuplicatesWithDynamicArraySize()));

            System.out.println("and here's the original array");

            System.out.println(Arrays.toString(array));

            System.out.println("here is the duplicates list");

            System.out.println(Arrays.toString(getDuplicatesFromArray(
                    updatedContainsDuplicatesWithDynamicArraySize())));

            System.out.println("here is the triplicates list");

            System.out.println(Arrays.toString(getTriplicatesFromArray(
                    updatedContainsDuplicatesWithDynamicArraySize())));

            System.out.println("here is the quadruplicates list");

            System.out.println(Arrays.toString(getQuadruplicatesFromArray(
                    updatedContainsDuplicatesWithDynamicArraySize())));

        } else {
            System.out.println("there were no duplicates found!");
        }
    }
}
