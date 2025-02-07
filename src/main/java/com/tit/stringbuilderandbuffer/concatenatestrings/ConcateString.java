package com.tit.stringbuilderandbuffer.concatenatestrings;

import java.util.Scanner;

public class ConcateString {
    static public String concateString(String [] arr){
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i< arr.length; i++){
            sb.append(arr[i]);
            sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of String Array ");
        int n = input.nextInt();
        String [] arr  = new String[n];
        System.out.println("Enter Elements of String Array ");
        for(int i = 0;i<n; i++){
            arr[i] = input.next();
        }
        System.out.println("Concatenated String");
        System.out.println(concateString(arr));
    }
}
