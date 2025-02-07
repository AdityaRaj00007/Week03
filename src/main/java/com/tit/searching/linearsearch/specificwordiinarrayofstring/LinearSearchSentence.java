package com.tit.searching.linearsearch.specificwordiinarrayofstring;

public class LinearSearchSentence {

    public static String findSentenceWithWord(String[] sentences, String targetWord) {
        // Iterate through each sentence in the array
        for (String sentence : sentences) {
            // Check if the sentence contains the target word
            if (sentence.contains(targetWord)) {
                // If found, return the sentence
                return sentence;
            }
        }
        // If no sentence contains the word, return "Not Found"
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Python is a great programming language.",
                "I enjoy solving problems on LeetCode.",
                "Machine learning is fascinating."
        };

        String targetWord = "Python";
        String result = findSentenceWithWord(sentences, targetWord);
        System.out.println(result);

        targetWord = "Java";
        result = findSentenceWithWord(sentences, targetWord);
        System.out.println(result);
    }
}