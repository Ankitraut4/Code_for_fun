package com.company;

import java.util.Arrays;

public class Product_0f_except_self {
    //238. Product of Array Except Self

    //Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    //The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    //You must write an algorithm that runs in O(n) time and without using the division operation.
    //Input: nums = [1,2,3,4]
    //Output: [24,12,8,6]
    public static void main(String[] args) {

        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    //it wiil give O(n) time complexity
    public static int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        output[0]=1;
        for (int i=1;i<nums.length;i++){
            output[i]=output[i-1]*nums[i-1];
        }
        int product=1;
        for (int i=nums.length-1;i>=0;i--){
            output[i]=output[i]*product;
            product=product*nums[i];
        }
        return output;
    }

    //this will take o(n*n) time complexity so it is not efficient
//    public static int[] productExceptSelf(int[] nums) {
//
//        int[] newArr=new int[nums.length];
//
//        for (int i=0;i< nums.length;i++){
//            int mul=1;
//            for (int j=0;j<nums.length;j++){
//                if (i!=j){
//                    mul*=nums[j];
//                }
//            }
//            newArr[i]=mul;
//        }
//        return newArr;
//    }
}
