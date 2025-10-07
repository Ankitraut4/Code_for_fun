package com.company;

public class search_in_Rotated_Array {
    public static void main(String[] args) {

        int[] nums={13,14,15,6,7,8,9,10,11};
        int target=10;

        System.out.println(searchUsingPivot(nums,target));

    }
    //work for non-duplicate values
    private static int searchUsingPivot(int[] nums,int target){
        int pivot=pivot(nums);

        //if pivot == -1 means array is not in rotated order
        if (pivot==-1){
            //if pivot==-1 just do normal binary search
            return binarySearch(nums,0,nums.length-1,target);
        }else {
            if (target==nums[pivot]){
                return pivot;
            }
            if (nums[0]>=target){
                return binarySearch(nums,0,pivot-1,target);
            }//target>nums[0]
            return binarySearch(nums,pivot+1,nums.length-1,target);
        }
    }

    private static int pivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;


            if (nums[mid]>nums[mid+1] && end>mid ){
                return mid;

            }
            if (nums[mid]<nums[mid-1] && mid>start){
                return mid-1;
            }
            if ( nums[start]>=nums[mid] ){
                end=mid-1;
            }else{// nums[mid]>nums[start]
                start= mid+1;
            }
        }
        return -1;

    }
    private static int binarySearch(int[] nums,int start,int end,int target){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>nums[mid]){
                start=mid+1;
            }else if (target<nums[mid]){
                end=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}






