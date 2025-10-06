package com.company;

public class Jump_Game {
    public static void main(String[] args) {
//55. Jump Game
//Medium
//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//Return true if you can reach the last index, or false otherwise.
//Example 1:
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

        int[] arr={2,2,1,1,4};
        System.out.println(canJump(arr));
        System.out.println(canJump1(arr));
    }
    public static boolean canJump(int[] nums) {


        if (nums.length<=1){
    return true;
}
        int max=nums[0];
        for (int i=0;i<nums.length;i++){
            if (max<=i && nums[i]==0){
                return false;
            }else{
                if (i+nums[i]>max){
                    max=i+nums[i];
                }
                if (max>=nums.length-1){
                    return true;
                }
            }
        }

        return false;
    }
    //travesing array backward
    public static boolean canJump1(int[] nums) {
        int goodIndex=nums.length-1;
        for (int i=nums.length-1;i>=0;i--){
            if (i+nums[i]>=goodIndex){
                goodIndex=i;
            }
        }
        return goodIndex==0;
    }
}
