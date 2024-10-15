package com.L07_binary_search;

public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,4, 6, 9, 14, 16, 18, 22};
        int target = 10;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
