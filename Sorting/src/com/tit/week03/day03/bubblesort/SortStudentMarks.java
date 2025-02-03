package com.tit.week03.day03.bubblesort;

import java.util.Arrays;

public class SortStudentMarks {
    // Method to sort elements in ascending order
    public static void bubbleSort(int arr []){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // Swap using XOR operation
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                    flag = true;
                }
            }
            if(!flag){ // To optimize algorithm for nearly or sorted array
              break;
            }
        }
        // print sorted array
        System.out.println(Arrays.toString(arr));


    }
    public static void main(String[] args) {
        SortStudentMarks sort = new SortStudentMarks();
        // Array containing Student Marks
        int arr [] = new int[] {70,50,40,80,72,54,62};
        System.out.println("Before Swapping: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Swappig: ");
        sort.bubbleSort(arr);
    }
}
