package org.example.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Selection sort : " + Arrays.toString(selectionSort(arr)));

    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

        }
        return arr;
    }
}
