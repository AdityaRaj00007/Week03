package com.tit.week03.day03.quicksort;
public class SortProductPrices {

    // Method to sort the array using Quick Sort
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after the partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Method to partition the array and place the pivot in its correct position
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = low - 1; // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        SortProductPrices sorter = new SortProductPrices();

        int[] productPrices = {299, 150, 399, 100, 250, 500, 75};
        System.out.println("Original Product Prices:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
        System.out.println();

        sorter.quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Product Prices:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
