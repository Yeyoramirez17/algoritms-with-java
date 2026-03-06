package com.algorithms.sort;

import java.util.stream.IntStream;

public class CountingSort {

    public static void sort(int[] arr) {
        int max = IntStream.of(arr).max().getAsInt();
        int size = arr.length;

        int[] count = new int[max + 1];
        int[] output = new int[size + 1];

        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }

        // Contar apariciones
        for(int i = 0; i < size; i++) {
            count[arr[i]]++;
        }

        // Calcular suma acumulativa
        for(int i = 1; i <= max; i++) {
            count[i] += count[i-1];
        }

        // Construir arreglo ordenado
        for(int i = size - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for(int i = 0; i < size; i++) {
            arr[i] = output[i];
        }
    }

}
