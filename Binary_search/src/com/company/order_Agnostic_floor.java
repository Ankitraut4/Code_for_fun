package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class order_Agnostic_floor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the no of elements = ");
        int element=s.nextInt();

        int[] arr=new int[element];

        System.out.println("enter the elemnts in ascending order or decending order = ");
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("enter the element whose floor to find = ");
        int target=s.nextInt();

        if (arr[0]<arr[arr.length-1]){
            System.out.println(floorAsc(arr,target));
        }else {
            System.out.println(floorDsc(arr,target));

        }

    }

    private static int floorAsc(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[0]){
                return -1;
            }
            if (target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=end-1;
            }else {
                return arr[mid];
            }
        }
        return arr[end];

    }
    private  static int floorDsc(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[arr.length-1]){
                return -1;
            }
            if (target<arr[mid]){
                start=mid+1;
            }else if (target>arr[mid]){
                end=end-1;
            }else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
