package com.company;

import java.util.Arrays;

public class Missing_Number_in_array {
    public static void main(String[] args) {

        int[] arr={0,5,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(cyclicSort(arr));


    }
    private  static int cyclicSort(int[] arr){
        int i=0;

        while (i<arr.length){
            int correctIndex=arr[i];
            if (arr[i]<arr.length  && arr[i]!=arr[correctIndex]){
                swap(arr,correctIndex,i);
            }
            i++;
        }
        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index){
                return index;
            }
        }
        return arr.length;

    }

    private static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
