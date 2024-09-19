package org.example.searching;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {225, 23, 23, 43, 21, 45, 221, 58, 32, 75, -7, 890};
        int ans = linearSearch(arr, 32);
        System.out.println("Linear search " + ans);
        System.out.println("Search in string " + searchInString("Vinojini", 'v'));
        System.out.println("Search in string for loop " + searchInStringFor("Vinojini", 'n'));
        System.out.println("Search in range " + searchInRange(arr, 21, 2, 8));
        System.out.println("Min number " + minNumber(arr));
        System.out.println("Max number " + maxNumber(arr));
        int[][] twoDArr = {
                {10, 23, 43, 21},
                {3, 21, 567, 43, 22, 13},
                {67, 43, 1}
        };
        System.out.println("Search in 2D array " + Arrays.deepToString(searchIn2DArray(twoDArr, 56743)));
        System.out.println("Max value in 2D array " + maxIn2DArray(twoDArr));
        System.out.println("Min value in 2D array " + minIn2DArray(twoDArr));
    }

    //    Linear search
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //    Search in string
    private static boolean searchInString(String word, char target) {
        for (char a : word.toLowerCase().toCharArray()) {
            if (a == target) {
                return true;
            }
        }
        return false;
    }

    //    Search in word for loop
    private static int searchInStringFor(String word, char target) {
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    //    Search in range
    private static int searchInRange(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //    Find minimum number
    private static int minNumber(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    //    Find maximum number
    private static int maxNumber(int[] arr) {
        int max = arr[0];
        for (int a : arr) {
            if (max < a) {
                max = a;
            }
        }
        return max;
    }

    //    Search in 2D array
    private static int[][] searchIn2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[][]{{i}, {j}};
                }
            }
        }
        return new int[][]{{-1}, {-1}};
    }

    //    Max in 2D array
    private static int maxIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] num : arr) {
            for (int anInt : num) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    //    Min in 2D array
    private static int minIn2DArray(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] a : arr) {
            for (int b : a) {
                if (b < min) {
                    min = b;
                }
            }
        }
        return min;
    }
}
