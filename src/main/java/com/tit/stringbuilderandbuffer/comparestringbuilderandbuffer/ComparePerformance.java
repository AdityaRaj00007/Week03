package com.tit.stringbuilderandbuffer.comparestringbuilderandbuffer;

public class ComparePerformance {

    static public void compare() {
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

    static public long builderPerformance() {
        StringBuilder stringBuilder = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("hello");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static public long bufferPerformance() {
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append("hello");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        compare();
    }
}