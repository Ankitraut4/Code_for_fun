package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Order_Agnostic_binary_search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the no.of elements in array = ");
        int num=s.nextInt();

        int[] arr=new int[num];

        System.out.println("enter the element in ascending or desecding order ");

        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("enter the element whose index to find = ");
        int target=s.nextInt();

        System.out.println("The Element is present at  index = "+orderAgnosicBs(arr,target));
    }

    private static int orderAgnosicBs(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target>arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else {
                if (target<arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
