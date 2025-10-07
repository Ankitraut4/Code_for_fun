package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class peakElement_in_mountain {
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


        System.out.println("peak element = " +peakElement(arr) );
    }
    private static int peakElement(int[] arr){

        int start=0;
        int end=1;
        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }

        }
        return arr[start];
    }
}

