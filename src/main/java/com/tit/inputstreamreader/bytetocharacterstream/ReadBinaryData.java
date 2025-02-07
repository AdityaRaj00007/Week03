package com.tit.inputstreamreader.bytetocharacterstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadBinaryData {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\rajgu\\OneDrive\\Desktop\\Binary.txt";

        // Use try-with-resources to automatically close the streams
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
