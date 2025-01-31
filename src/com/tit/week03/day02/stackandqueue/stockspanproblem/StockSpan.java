package com.tit.week03.day02.stackandqueue.stockspanproblem;
import java.util.Stack;

public class StockSpan {

    // Method to calculate stock span
    public int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements from the stackandqueue while they are less than or equal to current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push the current index onto the stackandqueue
            stack.push(i);
        }
        return span;
    }

    // Display method to print stock prices and spans
    public void displaySpan(int[] prices, int[] span) {
        System.out.println("Day  Price  Span");
        for (int i = 0; i < prices.length; i++) {
            System.out.println((i + 1) + "    " + prices[i] + "     " + span[i]);
        }
    }
}
