package com.tit.week03.day02.hashmap.pairsum;
import java.util.HashMap;
public class PairSum {
    public void findPairSum(int [] arr , int targetSum){
        int n = arr.length;
        boolean isFound = false;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i =0 ; i<n ; i++){
           int partner = targetSum - arr[i];
           if(map.containsKey(partner)){
               isFound =true;
               int start = map.get(partner);
               int ans [] = {start , i};
               System.out.println("Target Sum Found [" + ans[0] + "," + ans[1] + "]");
           }
           map.put(arr[i] , i);
        }
        if(!isFound){
            System.out.println("Target Sum Not Found ");
        }

    }
    public static void main(String[] args) {
        PairSum pairsum = new PairSum();
        int arr [] = new int[]{1 ,2 , 3 , 4 ,5};
        int targetSum = 6;
        pairsum.findPairSum(arr , targetSum);

    }
}
