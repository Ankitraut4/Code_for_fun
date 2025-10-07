package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Search_in_mountain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no.of element");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element in bitoic or mountain or ascending then decending order ");
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the target element to search it index = ");
        int target=s.nextInt();

        System.out.println("target element index = " +searchTarget(arr,target) );
    }
    private static int searchTarget(int[] arr,int target){
        int peak=peakIndex( arr);
        if (peakIndex(arr)!=-1){
            return order_Agnotic_search(arr,0,peak,target);
        }
        return order_Agnotic_search(arr,peak+1,arr.length-1,target);
    }
    private static int peakIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;

            if (arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }
    private static int order_Agnotic_search(int[] arr,int start,int end,int target){
        boolean isAsc=arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }else {
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

        }
        return -1;
    }
}
