package com.tit.challengeproblems.linearandbinarysearch;
public class FindMissingPositiveNumber {
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        // Segregate positive numbers
        int shift = segregate(nums);
        int[] positiveNums = new int[n - shift];
        for (int i = 0; i < positiveNums.length; i++) {
            positiveNums[i] = nums[shift + i];
        }

        // Mark elements present
        for (int i = 0; i < positiveNums.length; i++) {
            int num = Math.abs(positiveNums[i]);
            if (num >= 1 && num <= positiveNums.length) {
                int index = num - 1;
                if (positiveNums[index] > 0) {
                    positiveNums[index] = -positiveNums[index];
                }
            }
        }

        // Identify the missing integer
        for (int i = 0; i < positiveNums.length; i++) {
            if (positiveNums[i] > 0) {
                return i + 1;
            }
        }

        return positiveNums.length + 1;
    }

    // Helper method to segregate positive numbers
    private static int segregate(int[] nums) {
        int j = 0; // Index for non-positive numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return j; // Returns the index where positive numbers start
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int missing = findFirstMissingPositive(nums);
        System.out.println("The first missing positive integer is: " + missing);
    }
}
