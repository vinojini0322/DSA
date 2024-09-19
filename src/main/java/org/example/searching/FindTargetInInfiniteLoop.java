package org.example.searching;

public class FindTargetInInfiniteLoop {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 9, 12, 14, 16, 18, 19, 21, 34, 54, 56, 65, 67, 78, 99};
        System.out.println("Find target in the infinite loop " + findTargetInInfiniteLoop(arr, 78));
    }

    //    Find target in the infinite loop
    private static int findTargetInInfiniteLoop(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (end < arr.length && arr[end] < target) {
            start = end;
            end = end * 2;
        }
        if (end >= arr.length) {
            end = arr.length - 1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
