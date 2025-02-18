package com.algorithms.search;

public class BinarySearch {

    public static int search(int[] array, int toSearch) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            
            if(toSearch == array[middle]) return middle;

            if(toSearch > array[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        
        return -1;
    }

    public static int searchRecursive(int[] array, int low, int high, int toSearch) {
        if(high >= low) {
            int middle = low + (high - low) / 2;

            if (toSearch == array[middle]) return middle;

            if(toSearch > array[middle]) {
                return searchRecursive(array, middle + 1, high, toSearch);
            } else {
                return searchRecursive(array, low, middle - 1, toSearch);
            }
        }

        return -1;
    }
}
