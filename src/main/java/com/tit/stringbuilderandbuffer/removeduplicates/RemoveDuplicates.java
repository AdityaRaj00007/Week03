package com.tit.stringbuilderandbuffer.removeduplicates;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
   static public String removeDuplicates(String str){
       StringBuilder sb = new StringBuilder();
       HashSet<Character> set = new HashSet<>();
       for(var ch : str.toCharArray()){
           if(!set.contains(ch)){
               set.add(ch);
               sb.append(ch);
           }
       }

       return sb.toString();
   }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = input.nextLine();
        System.out.println("After Removing Duplicates ");
        System.out.println(removeDuplicates(str));
    }
}
