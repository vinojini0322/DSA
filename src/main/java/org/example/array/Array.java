package org.example.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("Reversed array : " + Arrays.toString(reverseArray(new int[]{3, 43, 21, 53, 65, 32, 87, 3})));
        System.out.println("Max number : " + maxNum(new int[]{3, 43, 21, 53, 65, 32, 87, 300}));
        System.out.println("Min number : " + minNum(new int[]{31, 43, 21, 53, 65, 32, 87, -3}));
    }

    private static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    private static int maxNum(int[] arr) {
        int max = arr[0];
        for (int a : arr) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }

    private static int minNum(int[] arr) {
        int min = arr[0];
        for (int a : arr) {
            if (min > a) {
                min = a;
            }
        }
        return min;
    }
}
