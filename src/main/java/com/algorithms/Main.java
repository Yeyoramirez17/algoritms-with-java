package com.algorithms;

import java.util.Arrays;

import com.algorithms.sort.SortAlgorithms;

public class Main {
    public static void main(String[] args) {        
        int[] numbers = { 2, 4, 8, 0, 5, 1, 9, 3, 7, 6, 4, 2 };

        // SortAlgorithms.bubbleSort(numbers);
        // SortAlgorithms.insertionSort(numbers);
        SortAlgorithms.selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}