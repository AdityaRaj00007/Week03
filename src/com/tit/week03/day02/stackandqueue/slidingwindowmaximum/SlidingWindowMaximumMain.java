package com.tit.week03.day02.stackandqueue.slidingwindowmaximum;
public class SlidingWindowMaximumMain {
    public static void main(String[] args) {
        SlidingWindowmaximum slidingWindowMaximum = new SlidingWindowmaximum();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = slidingWindowMaximum.maxSlidingWindow(nums, k);

        // Display the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
