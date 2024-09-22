package org.example.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntermediate {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 43, 21, 53, 65, 32, 87, 300};
        System.out.println("Find two numbers in an array that add up to a specific target " + Arrays.toString(twoSum(arr, 53)));
        int[] nums = {2, 2, 1, 1, 1, 2, 2, 1, 1, 1};
        System.out.println("Majority element: " + majorityOfElement(nums));
    }

    //    Find two numbers in an array that add up to a specific target
    private static int[] twoSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int remain = sum - arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == remain) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //    Find the majority of elements
    private static int majorityOfElement(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int a : arr) {
            if (count.containsKey(a)) {
                count.replace(a, count.get(a) + 1);
            } else {
                count.put(a, 1);
            }
        }
        for (Integer occurrence : count.values()) {
            if (occurrence > arr.length / 2) {
                return count.entrySet()
                        .stream()
                        .filter(entry -> occurrence.equals(entry.getValue()))
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);
            }
        }
        return -1;
    }

    //      Best Time to Buy and Sell Stock
//    private static int maxProfitForStock(int[] arr) {
//
//    }
}
