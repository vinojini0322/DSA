package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {21, 34, 54, 56, 65, 67, 78, 99};
        int[] arrDesc = {99, 78, 67, 65, 56, 54, 34, 21};
        int[] peakArr = {0, 8, 9, 10, 9};
        System.out.println("Ordinary binary search " + binarySearch(arr, 54));
        System.out.println("Order agnostic binary search " + orderAgnosticBinarySearch(arr, 54));
        System.out.println("Peak element in mountain array " + peakIndexInMountainArray(peakArr));
    }

    //    Ordinary binary search
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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

    //    Order agnostic binary search
    private static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean asc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (asc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    //    Find peek element in mountain array
    //    LeetCode question 852
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }
}
