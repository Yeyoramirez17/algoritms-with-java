package com.algorithms.sort;

public class MergeSort {

    public static void mergeSort(int[] array, int left, int right) {

        if(left < right) {
            int middle = left + (right - left) / 2;
            
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
    
            merge(array, left, middle, right);
        }

    }

    private static void merge(int[] array, int left, int middle, int right) {
        // Tamaño de las dos mitades
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Creación de los dos arreglos temporales, en bases al tamaño de las dos mitades.
        int[] arrLeft = new int[n1];
        int[] arrRight = new int[n2];

        // Copiar los datos del array a ordenar a los array temporales (arrLeft, arrRight).
        for(int i = 0; i < n1; i++) {
            arrLeft[i] = array[left + i];
        }
        for(int j = 0; j < n2; j++) {
            arrRight[j] = array[middle + 1 + j];
        }

        // Índices para recorrer los subarrays y el array original
        int i = 0, j = 0, k = left; 

        while (i < n1 && j < n2) {
            if(arrLeft[i] <= arrRight[j]) {
                array[k] = arrLeft[i];
                i++;
            } else {
                array[k] = arrRight[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes del array arrLeft, si hay.
        while (i < n1) {
            array[k] = arrLeft[i];
            i++;
            k++;
        }
        // Copiar los elementos restantes del array arrRight, si hay,
        while (j < n2) {
            array[k] = arrRight[j];
            j++;
            k++;
        }
    }
}
