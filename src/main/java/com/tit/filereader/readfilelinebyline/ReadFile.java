package com.tit.filereader.readfilelinebyline;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rajgu\\OneDrive\\Desktop\\Week03\\Day04\\src\\main\\java\\com\\tit\\filereader\\readfilelinebyline\\ReadFile.java"; // Ensure the file exists in the project directory

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) { // Read line by line
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
