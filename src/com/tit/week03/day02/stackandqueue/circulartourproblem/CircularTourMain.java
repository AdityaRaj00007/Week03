package com.tit.week03.day02.stackandqueue.circulartourproblem;
public class CircularTourMain {
    public static void main(String[] args) {
        CircularTour circularTour = new CircularTour();

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startPump = circularTour.tour(petrol, distance);

        if (startPump == -1) {
            System.out.println("No solution. The tour cannot be completed.");
        } else {
            System.out.println("The tour can be completed starting from pump " + (startPump + 1));
        }
    }
}
