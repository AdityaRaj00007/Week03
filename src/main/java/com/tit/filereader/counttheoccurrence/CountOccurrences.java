package com.tit.filereader.counttheoccurrence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the words which occurrences you want to check ");
        String targetWord = input.next();

        String filePath = "C:\\Users\\rajgu\\OneDrive\\Desktop\\sample.txt.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();
            int wordCount = 0;
            while(line!=null){
                String [] words = line.split("\\s+");
                line = br.readLine();

            for(String word : words){
                if(word.equalsIgnoreCase(targetWord)){
                    wordCount++;
                }
              }
            }
            System.out.println("The word '" + targetWord + "' appeared " + wordCount + " times in the file.");

        }
        catch (IOException e){
            e.getStackTrace();
        }
    }
}
