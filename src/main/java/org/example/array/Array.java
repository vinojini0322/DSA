package org.example.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("Reversed array : " + Arrays.toString(reverseArray(new int[]{3, 43, 21, 53, 65, 32, 87, 3})));
        System.out.println("Max number : " + maxNum(new int[]{3, 43, 21, 53, 65, 32, 87, 300}));
        System.out.println("Min number : " + minNum(new int[]{31, 43, 21, 53, 65, 32, 87, -3}));
        int[] arr = {3, 0, 1, 2, 5};
        System.out.println("Missing number : " + missingNum(arr));
        System.out.println("Remove duplicates : " + Arrays.toString(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 4, 5, 6, 6, 23, 44, 54, 55, 55, 66, 66, 66})));
    }

    //    Reverse array
    private static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    // Find max num in array
    private static int maxNum(int[] arr) {
        int max = arr[0];
        for (int a : arr) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }

    // Find min num in array
    private static int minNum(int[] arr) {
        int min = arr[0];
        for (int a : arr) {
            if (min > a) {
                min = a;
            }
        }
        return min;
    }

    //    Find the missing number from array
    private static int missingNum(int[] arr) {
        int expSum = (arr.length * (arr.length + 1)) / 2;
        int actualSum = 0;
        for (int a : arr) {
            actualSum += a;
        }
        return expSum - actualSum;
    }

    //   Remove duplicates in an array
    private static int[] removeDuplicates(int[] arr) {
        int[] updatedArr = new int[arr.length];
//        updatedArr[0] = arr[0];
        int b = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                updatedArr[b++] = arr[i];
            }
        }
        updatedArr[b] = arr[arr.length - 1];
        return updatedArr;
    }
}
