package com.tit.week03.day03.mergesort;
public class SortBookPrices {

    // Method to sort the array using Merge Sort
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively divide the array into two halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Method to merge two sorted halves
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // Size of the left half
        int n2 = right - mid;    // Size of the right half

        // Create temporary arrays for left and right halves
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        // Initial indices for merging
        int i = 0, j = 0;
        int k = left;

        // Merge the arrays by comparing elements
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left array
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right array
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        SortBookPrices sorter = new SortBookPrices();

        int[] bookPrices = {450, 120, 800, 300, 700, 100, 600};
        System.out.println("Original Book Prices:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
        System.out.println();

        sorter.mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Book Prices:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
