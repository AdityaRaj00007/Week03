package com.tit.week03.day03.selectionsort;

import java.util.Arrays;

public class SortExamScores {
    public void selectionSort(int arr []){
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            int minIndex = i;
           for(int j = i+1; j<n ; j++){
               if(arr[j]<arr[minIndex]){
                   minIndex = j;
               }
           }
           // swap current and minimum element
           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        SortExamScores sort = new SortExamScores();
        int arr[] = new int[]{78,65,25,76,91,100};
        System.out.println("Original Scores: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Scores: ");
        sort.selectionSort(arr);
    }
}
