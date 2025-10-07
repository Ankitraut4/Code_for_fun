package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class position_in_infinite_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of elements in array");
        int n=s.nextInt();


        int[] arr=new int[n];
        System.out.println("enter the elements in array = ");
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("enter the element to search ");
        int target=s.nextInt();
        System.out.println("index of target element = "+ans(arr,target));

    }
    private static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int temp=end+1;
            //update the end by *2 to the size of previous arrry
            end=(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    private static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
