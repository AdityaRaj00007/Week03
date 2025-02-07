package com.tit.challengeproblems.stringandfilereader;

import java.io.*;
import java.util.StringTokenizer;

public class Compare {

    public static void compare() {
        long builderTime = builderPerformance();
        long bufferTime = bufferPerformance();

        System.out.println("StringBuilder Performance: " + builderTime + " ns");
        System.out.println("StringBuffer Performance: " + bufferTime + " ns");

        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster");
        } else {
            System.out.println("StringBuffer is faster");
        }
    }

    public static long builderPerformance() {
        StringBuilder stringBuilder = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            stringBuilder.append("hello");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long bufferPerformance() {
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            stringBuffer.append("hello");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long readFileWithReader(Reader reader) throws IOException {
        long wordCount = 0;
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            wordCount += tokenizer.countTokens();
        }
        return wordCount;
    }

    public static void compareFileReaders(String filePath) {
        try {
            long fileReaderStart = System.nanoTime();
            long fileReaderWordCount = readFileWithReader(new FileReader(filePath));
            long fileReaderEnd = System.nanoTime();
            System.out.println("FileReader Word Count: " + fileReaderWordCount);
            System.out.println("FileReader Time: " + (fileReaderEnd - fileReaderStart) + " ns");

            long inputStreamReaderStart = System.nanoTime();
            long inputStreamReaderWordCount = readFileWithReader(new InputStreamReader(new FileInputStream(filePath)));
            long inputStreamReaderEnd = System.nanoTime();
            System.out.println("InputStreamReader Word Count: " + inputStreamReaderWordCount);
            System.out.println("InputStreamReader Time: " + (inputStreamReaderEnd - inputStreamReaderStart) + " ns");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        compare();
        String filePath = "C:\\Users\\rajgu\\OneDrive\\Desktop\\sample.txt.txt";
        compareFileReaders(filePath);
    }
}
