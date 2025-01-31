package com.tit.week03.day02.stackandqueue.circulartourproblem;
public class CircularTour {

    public int tour(int[] petrol, int[] distance) {
        int totalPetrol = 0;
        int totalDistance = 0;
        int surplus = 0;
        int startIndex = 0;

        for (int i = 0; i < petrol.length; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];
            surplus += petrol[i] - distance[i];

            // If surplus becomes negative, reset the start index
            if (surplus < 0) {
                startIndex = i + 1;
                surplus = 0;
            }
        }

        // If total petrol is less than total distance, tour is not possible
        return (totalPetrol < totalDistance) ? -1 : startIndex;
    }
}
