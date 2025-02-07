package com.tit.searching.binarysearch.rotationpoint;
public class FindRotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // If the array is not rotated
        if (arr[left] < arr[right]) {
            return 0;
        }

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                // The smallest element is in the right half
                left = mid + 1;
            } else {
                // The smallest element is in the left half (including mid)
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int rotationIndex = findRotationPoint(rotatedArray);
        System.out.println("Rotation point is at index: " + rotationIndex);
        System.out.println("Smallest element is: " + rotatedArray[rotationIndex]);
    }
}
