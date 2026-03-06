# Sort Algorithms

## Bubble Sort
Este algoritmo parte de la analogia, de un vaso con agua, en donde las burbujas salen a la superficie, el   **Bubble Sort** hace que los elementos que mayor tamaño burbujeen, es decir que se coloquen al lado derecho del arreglo, mientras que los elementos de menor valor, queden en lo profundo, que se coloquen en el lado izquierdo del arreglo.

```math
\text{Bubble Sort} = O(n^2)
```
## Insert Sort
El **Insert Sort** es un algoritmo de ordenamiento que se basa en la idea de dividir el arreglo en dos partes: una parte ordenada y otra parte no ordenada. El algoritmo toma cada elemento de la parte no ordenada y lo inserta en la posición correcta dentro de la parte ordenada, desplazando los elementos mayores hacia la derecha para hacer espacio para el nuevo elemento.
```math
\text{Insert Sort} = O(n^2)
```
## Selection Sort
El **Selection Sort** es un algoritmo de ordenamiento que funciona seleccionando el elemento más pequeño (o más grande, dependiendo de la variante) del arreglo no ordenado y colocándolo en la posición correcta del arreglo ordenado. Este proceso se repite hasta que todos los elementos estén ordenados.
```math
\text{Selection Sort} = O(n^2)
```

## Merge Sort
El **Merge Sort** es un algoritmo de ordenamiento que utiliza la técnica de divide y vencerás. El algoritmo divide el arreglo en dos mitades, ordena cada mitad de forma recursiva y luego combina las dos mitades ordenadas para obtener el arreglo final ordenado.
```math
\text{Merge Sort} = O(n \log n)
```

## Quick Sort
El **Quick Sort** es un algoritmo de ordenamiento que también utiliza la técnica de divide y vencerás. El algoritmo selecciona un elemento llamado pivote y particiona el arreglo en dos partes: una parte con elementos menores que el pivote y otra parte con elementos mayores que el pivote. Luego, el algoritmo ordena recursivamente las dos partes y combina los resultados para obtener el arreglo final ordenado.
```math
\text{Quick Sort} = O(n \log n)
```

## Counting Sort
El **Counting Sort** es un algoritmo de ordenamiento que se utiliza para ordenar números enteros. Este algoritmo funciona contando el número de ocurrencias de cada valor en el arreglo de entrada y luego utilizando esa información para construir el arreglo de salida ordenado. El Counting Sort es eficiente cuando el rango de los números a ordenar es pequeño en comparación con la cantidad de elementos a ordenar.
```math
\text{Counting Sort} = O(n + k)
```

