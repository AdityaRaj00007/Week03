package com.tit.searching.linearsearch.firstnegativenumber;

import java.util.Scanner;

public class LinearSearch {
    public int searchNegativeNumber(int arr []){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of Array ");
        int n = input.nextInt();
        System.out.println("Enter the elements of Array ");
        int arr [] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(ls.searchNegativeNumber(arr));
    }
}
