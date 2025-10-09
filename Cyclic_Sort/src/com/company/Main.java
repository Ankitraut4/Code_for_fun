package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int[] arr={3,4,2,5,1};
       cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //in cyclic sort the array should contain element from 1 to n(1,2,3.......n) (in any order for sorting)
    private static void cyclicSort(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int correctIndex=arr[start]-1;
            if (arr[start]!=(arr[correctIndex])){
//                int temp=arr[start];
//                arr[start]=arr[correctIndex];
//                arr[correctIndex]=temp;
                swap(arr,correctIndex,start);
            }else {
              start++;
            }
        }
    }
    private static void swap(int[] arr,int first , int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
