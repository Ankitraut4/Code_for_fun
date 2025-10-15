package com.company;

public class BinarySearch_recursion {
    public static void main(String[] args) {
        int[] arr={1,3,55,77,78,89,92,97,99};
        int target=77;
        System.out.println(recurionBinarySearch(arr,0,arr.length-1,target));

    }
    private static int recurionBinarySearch(int[] arr,int start,int end,int target){
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (target==arr[mid]){
            return mid;
        }
        if (target>arr[mid]){
            return recurionBinarySearch(arr,mid+1,end,target);
        }
        return recurionBinarySearch(arr,start,mid-1,target);
    }
}
