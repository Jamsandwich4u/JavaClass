package com.Earrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays
        // A collection of values of the same type.
        // Stored in contiguous memory. (touching)

        /*
        int[] arrayInt;
        int arrayInt2[];  // both valid syntax.
        */

        // characteristics of arrays:
            // fixed length.
            // zero-based indexing.
            // no inbuilts (methods).
            // same type.

        // if initialised without data, defaults are used:
            // booleans: false
            // float: 0.0
            // int: 0
            // obj: null
            // char u/0000

        // memory
        // primitives - stored in the array in heap.
        // ref - the array stores the reference, not the object.

        // fast and predictable performance.
        // memory efficient.
        /*
        int[] numbers = {10, 20, 30};
        System.out.println(numbers[0]);

        numbers[0] = 100;

        // length
        System.out.println(numbers.length);  // outputs 3.

        String[] words = {"hello", "world"};

        // multidimensional arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matrix[1][1]);

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.println(matrix[i][j]);
            }
        }
        */

        // Copy
        int[] source = {1, 2, 3};
        /*
        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        System.out.println(destination[2]);
        */

        int[] copy = Arrays.copyOf(source, source.length);
        System.out.println(copy[2]);

        
    }
}
