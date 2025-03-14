package com.algorithms.sort;

public class InsertionSort {

    /*
     * Algorithm Insertion Sort
     */
    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = key;
        }
    }
}
