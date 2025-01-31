package com.tit.week03.day02.hashmap.longestconsecutivesequence;
import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Use a HashMap to store the numbers and mark if they've been visited
        HashMap<Integer, Boolean> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, false); // Mark all numbers as unvisited
        }

        int maxLength = 0;

        for (int num : nums) {
            // If the number has already been visited, skip it
            if (numMap.get(num)) {
                continue;
            }

            int currentLength = 1;
            int currentNum = num;

            // Check for the next numbers in the sequence
            while (numMap.containsKey(currentNum + 1)) {
                currentNum++;
                currentLength++;
                numMap.put(currentNum, true); // Mark as visited
            }

            // Check for the previous numbers in the sequence
            currentNum = num;
            while (numMap.containsKey(currentNum - 1)) {
                currentNum--;
                currentLength++;
                numMap.put(currentNum, true); // Mark as visited
            }


            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}