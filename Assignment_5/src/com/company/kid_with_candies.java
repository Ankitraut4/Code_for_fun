package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kid_with_candies {
    private static List<Boolean> list=new ArrayList<>();
    public static void main(String[] args) {
        //1431. Kids With the Greatest Number of Candies

        //There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number
        // of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
        //Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
        // they will have the greatest number of candies among all the kids, or false otherwise.
        //
        //Note that multiple kids can have the greatest number of candies.
int[] arr={4,2,0,1,4};
        System.out.println(kidsWithCandies(arr,3));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        for(int i=0;i<candies.length;i++){
            list.add(candies[i]+extraCandies>=max(candies));
        }
        return list;
    }
    public static int max(int[] candies){
        int max=0;
        for (int i=0;i<candies.length;i++){
            if (candies[i]>max){
                max=candies[i];
            }
        }
        return max;
    }
}
