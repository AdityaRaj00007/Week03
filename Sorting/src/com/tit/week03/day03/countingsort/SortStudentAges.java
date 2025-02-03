package com.tit.week03.day03.countingsort;
public class SortStudentAges {
    public void countSort(int arr[]) {
        int n = arr.length;

        // Find the maximum value in the array
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create and populate the frequency array
        int frequencyArray[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            frequencyArray[arr[i]]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (frequencyArray[i] > 0) {
                arr[index] = i;
                index++;
                frequencyArray[i]--;
            }
        }

        // Display the sorted array
        System.out.println("Sorted Student Ages:");
        for (int age : arr) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortStudentAges sort = new SortStudentAges();

        int[] studentAges = {18, 20, 17, 19, 21, 18, 20, 17};
        System.out.println("Original Student Ages:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
        System.out.println();

        sort.countSort(studentAges);
    }
}
