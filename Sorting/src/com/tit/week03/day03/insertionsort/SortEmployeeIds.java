package com.tit.week03.day03.insertionsort;
import java.util.Arrays;
public class SortEmployeeIds {

    // Method to perform insertion sort on an array
    public void insertionSort(int arr[]) {
        int n = arr.length;

        // Traverse the array starting from the second element
        for (int i = 1; i < n; i++) {
            int j = i; // Pointer to compare elements with sorted part
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap using a temporary variable for better readability
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--; // Decrease j if swap happens
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        SortEmployeeIds sort = new SortEmployeeIds();
        // Array containing Employee IDs
        int arr[] = new int[]{18, 1, 7, 34, 88};
        System.out.println("Before Swapping: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Swappig: ");
        sort.insertionSort(arr);
    }
}
