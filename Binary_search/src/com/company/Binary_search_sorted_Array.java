package com.company;

public class Binary_search_sorted_Array {

    public static void main(String[] args) {

        //Ascending Order

        int[] arr={-98,1,2,3,4,5,6,7,8,22,54,65,76,99,101};
        int target=99;
        int ans=search(arr,target);
        System.out.println("index of element = "+ans);

     }

     //returning index of target element
     private static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;


        while (start<=end){

            int mid=start+(end-start)/2;

            if (target>arr[mid]){
                start=mid+1;

            }else if (target<arr[mid]){
                end=mid-1;
            }else {
                return mid; //if (mid==target)
            }
        }
        return -1;
     }
}
