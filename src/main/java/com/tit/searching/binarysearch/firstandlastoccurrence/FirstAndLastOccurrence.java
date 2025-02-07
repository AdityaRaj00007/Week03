package com.tit.searching.binarysearch.firstandlastoccurrence;
public class FirstAndLastOccurrence {
    // Function to find the first occurrence of the target
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                // Continue searching to the left lower indices)
                right = mid - 1;
            } else if (arr[mid] < target) {
                // Target is in the right half
                left = mid + 1;
            } else {
                // Target is in the left half
                right = mid - 1;
            }
        }
        return first;
    }

    // Function to find the last occurrence of the target
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                // Continue searching to the right for higher indices
                left = mid + 1;
            } else if (arr[mid] < target) {
                // Target to find left half
                left = mid + 1;
            } else {
                // Target to find right half
                right = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5, 5, 5, 6};
        int target = 5;

        int firstIndex = findFirstOccurrence(sortedArray, target);
        int lastIndex = findLastOccurrence(sortedArray, target);

        if (firstIndex != -1 && lastIndex != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
            System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
