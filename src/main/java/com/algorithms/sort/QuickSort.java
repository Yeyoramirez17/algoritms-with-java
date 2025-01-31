package com.algorithms.sort;

public class QuickSort {
    
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
