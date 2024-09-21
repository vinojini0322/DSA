package org.example.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23, 12, 32, 4, 30, 54, 3, 17, 87, 67, 4};
        System.out.println("Insertion sort : " + Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
