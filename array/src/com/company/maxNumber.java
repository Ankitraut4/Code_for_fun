package com.company;

import java.util.Arrays;

public class maxNumber {
    public static void main(String[] args) {

        int[] arr={10,2,33,4,77,90,22};


        System.out.println(max(arr, 1 ,4));
    }
    private static int max(int[] arr,int start ,int end){
       int max=0;
       for (int i=start;i<=end;i++){
           if (arr[i]>max){
               max=arr[i];
           }
       }
return max;
    }
}
