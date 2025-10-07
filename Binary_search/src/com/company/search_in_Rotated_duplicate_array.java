package com.company;

public class search_in_Rotated_duplicate_array {
    public static void main(String[] args) {

        int[] nums={2,2,9,3,3,1};
        int target=1;

        System.out.println(pivotDuplicateArray(nums));
        System.out.println(searchUsingPivot(nums,target));

    }
    private static int searchUsingPivot(int[] nums,int target){
        int pivot=pivotDuplicateArray(nums);

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

    //work for duplicate array
    private static int pivotDuplicateArray(int[] nums){
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

            //if element at middle , element at start , element at end all are equal then skip the elements
            if (nums[mid]==nums[start] && nums[mid]==nums[end]){
                //before skiping start check whether the given start is pivot
                if (nums[start]>nums[start+1]){
                    return start;
                }else {
                    start++;//as given start is not pivot then skip it
                }
                //checking wheather the given end is pivot
                if (nums[end]<nums[end-1]){
                    return end-1;
                }else {
                    end--;
                }

                //left side is sorted then pivot is at right
                if (nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
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
