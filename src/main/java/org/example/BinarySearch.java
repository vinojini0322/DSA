package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {21, 34, 54, 56, 65, 67, 78, 99};
        int[] arrDesc = {99, 78, 67, 65, 56, 54, 34, 21};
        int[] peakArr = {0, 8, 9, 10, 9};
        System.out.println("Ordinary binary search " + binarySearch(arr, 54));
        System.out.println("Order agnostic binary search " + orderAgnosticBinarySearch(arr, 54));
        System.out.println("Order agnostic binary search " + orderAgnosticBinarySearch(arrDesc, 54));
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

    //    Peak element in an array
    //    LeetCode question 162
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int n = start + (end - start) / 2;
            if (nums[n] > nums[n + 1]) {
                end = n;

            } else {
                start = n + 1;
            }
        }
        return start;

    }

    //    Find the target in mountain array
//    LeetCode question 1095
        private static int findInMountainArray(int target, int[] mountainArr) {
            int start = 0;
            int end = mountainArr.length - 1;
            int peak = findPeakElement(mountainArr);
            int ans = binarySearch(mountainArr, target, start, peak, true);
            if (ans != -1) {
                return ans;
            }
            return binarySearch(mountainArr, target, peak + 1, end, false);
        }

        private static int binarySearch(int[] mountainArr, int target, int start, int end, boolean isAscending) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                int midVal = mountainArr[mid];

                if (midVal == target) {
                    return mid;
                }

                if (isAscending) {
                    if (midVal < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                } else {
                    if (midVal > target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return -1;
        }
}
