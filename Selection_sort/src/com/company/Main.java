package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] arr={4,5,1,2,3};
	selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr){
   int start=0;
        for (int i=0;i<arr.length-1;i++){
            int end=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,start,end);

            //swaping the max with last element
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[end];
            arr[end]=temp;
        }

    }
    private static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for (int i=start;i<=end;i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
