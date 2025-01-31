package com.tit.week03.day02.stackandqueue.stockspanproblem;
public class StockSpanMain {
    public static void main(String[] args) {
        StockSpan stockSpan = new StockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = stockSpan.calculateSpan(prices);
        stockSpan.displaySpan(prices, span);
    }
}
