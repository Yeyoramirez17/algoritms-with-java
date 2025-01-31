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

    public static void quickSort(int[] array, int start, int end) {
        if( start < end ) {
            int p = partition(array, start, end);
            quickSort(array, start, p - 1);
            quickSort(array, p + 1, end);
        }     
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[ end ];

        int pointer = start;

        for (int j = start; j < end; j++) {
            if (array[ j ] <= pivot) {
                int temp = array[ j ];
                array[ j ] = array[ pointer ];
                array[ pointer ] = temp;
                pointer++;
            }
        }

        int temp = array[pointer];
        array[ pointer ] = array[ end ];
        array[ end ] = temp;

        return pointer;
    }

}
