package org.example;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4, 7, 9, 6, 8};
        System.out.println("Cyclic sort : " + Arrays.toString(cyclicSort(arr)));
    }

    private static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            i++;
        }
        return arr;
    }
}
