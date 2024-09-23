package org.example.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4, 7, 9, 6, 8};
        int[] nums = {2, 1, 3, 4, 7, 9, 6, 8, 0};
        System.out.println("Cyclic sort : " + Arrays.toString(cyclicSort(arr)));
        System.out.println("Find missing number : " + missingNumber(nums));
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

    //    Find missing number from array
    //    Leetcode 268
    private static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
