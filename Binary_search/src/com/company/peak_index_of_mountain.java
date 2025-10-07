package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class peak_index_of_mountain {
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

        System.out.println("peak index = " +binarySearch(arr) );
    }
    private static int binarySearch(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;

            if (arr[mid]>arr[mid+1]){//descending order
                //the mid is greater than next so there is chance that there would we greater elemnet than mid previous
                //or mid can be greater so we consider mid and serach left that why we does not go mid-1; we do only end=mid;
                end=mid;
            }else {//arr[mid]<arr[mid+1] //ascending order
                start=mid+1; //here we know that the array is ascending so the mid is not largest so we go mid+1;
            }
        }
        return start;
    }
}
