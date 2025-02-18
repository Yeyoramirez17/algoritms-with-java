package com.algorithms;
import java.util.Arrays;

import com.algorithms.search.BinarySearch;
import com.algorithms.search.LinearSearch;
// import com.algorithms.sort.BubbleSort;
// import com.algorithms.sort.InsertionSort;
// import com.algorithms.sort.SelectionSort;
// import com.algorithms.sort.QuickSort;
import com.algorithms.sort.MergeSort;

public class Main {
    public static void main(String[] args) {        
        int[] numbers = { 2, 4, 8, 0, 5, 1, 14, 3, 7, 6 };
        System.out.println(Arrays.toString(numbers));

        // BubbleSort.bubbleSort(numbers);
        // InsertionSort.insertionSort(numbers);
        // SelectionSort.selectionSort(numbers);
        // QuickSort.quickSort(numbers, 0, numbers.length - 1);
        MergeSort.mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));

        /* Search Algorithms */
        int toSearch = 14;
        // int index = LinearSearch.search(numbers, toSearch);
        // int index = BinarySearch.search(numbers, toSearch);
        int index = BinarySearch.searchRecursive(numbers, 0, numbers.length - 1, toSearch);
        System.out.println(String.format("- To Search %s, Result: [%s] = %s", toSearch, index, numbers[index]));
    }
}