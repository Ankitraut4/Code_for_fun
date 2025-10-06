package com.company;

import java.util.Arrays;

public class Maximum_Subarray {
    public static void main(String[] args) {
        //53. Maximum Subarray

        //Given an integer array nums, find the contiguous subarray (containing at least one number)
        // which has the largest sum and return its sum.
        //A subarray is a contiguous part of an array.
        //Example 1:
        //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        //Output: 6
        //Explanation: [4,-1,2,1] has the largest sum = 6.

        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));


    }
    public static int maxSubArray(int[] nums) {



        for (int i=1;i<nums.length;i++){

            if (nums.length==0 ){
                return 0;
            }else if (nums.length==1){
                return nums[0];
            }else if (nums[i-1]>0){

                nums[i]+=nums[i-1];
            }

        }
        System.out.println(Arrays.toString(nums));//just for debugging purpose
        int max=Integer.MIN_VALUE;
        for (int i=0;i< nums.length;i++){
//            if (nums[i]>max){
//                max=nums[i];
//            }
            max=Math.max(max,nums[i]);
        }
        return max;
    }
public static int maxSubArraySum(int[] arr) {

    int size = arr.length;
    int start = 0;
    int end = 0;

    int maxSoFar = arr[0], maxEndingHere = arr[0];

    for (int i = 0; i < size; i++) {
        if (arr[i] > maxEndingHere + arr[i]) {
            start = i;
            maxEndingHere = arr[i];
        } else
            maxEndingHere = maxEndingHere + arr[i];

        if (maxSoFar < maxEndingHere) {
            maxSoFar = maxEndingHere;
            end = i;
        }
    }
    System.out.printf("Found Maximum Subarray between {} and {}", Math.min(start, end), end);

    return maxSoFar;
}
}
