package com.algorithms;

import java.util.Arrays;

import com.algorithms.sort.SortAlgorithms;

public class Main {
    public static void main(String[] args) {        
        int[] numbers = { 2, 4, 8, 0, 5, 1, 9, 3, 7, 6, 4, 2 };
        //    numbers = { 0, 1, 2, 2, 5, 4, 9, 3, 7, 6, 4, 8 };

        // SortAlgorithms.bubbleSort(numbers);
        // SortAlgorithms.insertionSort(numbers);
        // SortAlgorithms.selectionSort(numbers);
        SortAlgorithms.quickSort(numbers, 0, numbers.length - 1);

        System.out.println(Arrays.toString(numbers));
    }
}