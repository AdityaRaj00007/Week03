package com.tit.searching.binarysearch.findpeakelement;
public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // cases for the first and last elements
            boolean isLeftSmaller = (mid == 0) || (arr[mid] >= arr[mid - 1]);
            boolean isRightSmaller = (mid == n - 1) || (arr[mid] >= arr[mid + 1]);

            if (isLeftSmaller && isRightSmaller) {
                // Found a peak element
                return mid;
            } else if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                // Peak is in the right half
                left = mid + 1;
            } else {
                // Peak is in the left half
                right = mid - 1;
            }
        }

        // If the array has only one element
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex + ", value: " + arr[peakIndex]);
    }
}
