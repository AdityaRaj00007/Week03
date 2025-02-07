package com.tit.stringbuilderandbuffer.reversestring;

import java.util.Scanner;

public class ReverseString {
   public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = input.nextLine();
        System.out.println("Reverse String is");
        System.out.println(reverse(str));


    }
}
