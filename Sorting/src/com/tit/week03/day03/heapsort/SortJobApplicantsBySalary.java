package com.tit.week03.day03.heapsort;
public class SortJobApplicantsBySalary {

    public void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (largest) element with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }

        // Display the sorted array
        System.out.println("Sorted Salaries:");
        for (int salary : arr) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }

    // Helper method to maintain the max heap property
    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Assume the current node is the largest
        int left = 2 * i + 1; // Left child index
        int right = 2 * i + 2; // Right child index

        // Check if left child is larger than the current largest
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child is larger than the current largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Swap and continue heapifying if the root is not the largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        SortJobApplicantsBySalary sorter = new SortJobApplicantsBySalary();

        int[] salaries = {50000, 70000, 60000, 80000, 55000, 65000, 75000};
        System.out.println("Original Salaries:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();

        sorter.heapSort(salaries);
    }
}
