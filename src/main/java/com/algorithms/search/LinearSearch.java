package com.algorithms.search;

public class LinearSearch {

    public static int search( int[] array, int toSearch ) {
        for(int i = 0; i < array.length; i++ ) {
            if(array[i] == toSearch) return i;
        }
        return -1;
    }

}
