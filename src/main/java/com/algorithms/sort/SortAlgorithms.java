package com.algorithms.sort;


public class SortAlgorithms {

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                
                if ( array[i] > array[j] ) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
    }

    /*
     * Algorithm Insertion Sort
     */
    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j > 0 && array[j] > key) {
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = key;
        }
    }

    /*
     * Algorithm Select Sort | O(n^2)
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }

            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        
    }

}
