package com.tit.week03.day02.hashmap.subarrayswithzerosum;

import java.util.HashMap;

public class SubarraysWithSum {
    public void findSubarrayWithSum(int [] arr , int sum){
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = arr.length;
        boolean isFound = false;
        int cumulativeSum = 0;
        map.put(0 , -1);
        for(int i = 0 ; i<n ; i++){
            cumulativeSum += arr[i];
            if(map.containsKey(cumulativeSum-sum)){
                int start = map.get(cumulativeSum - sum) + 1;
                isFound = true;
                System.out.println("Subarray With " + sum + " Found From index " + start + " to " + i);
            }
            map.put(cumulativeSum , i);
        }
        if(!isFound){
            System.out.println("No Subarray Found");
        }

    }
    public static void main(String[] args) {
        SubarraysWithSum subarray = new SubarraysWithSum();
        int[] arr = {4, 2, -3, 1, 6, -4, 2, -8};
        int sum = 0;
        subarray.findSubarrayWithSum(arr , sum );
    }
}