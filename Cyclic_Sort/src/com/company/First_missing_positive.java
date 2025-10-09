package com.company;

import java.util.Arrays;

public class First_missing_positive {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
firstMissingPositiveNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(firstMissingPositiveNumber(arr));

    }
    private static int firstMissingPositiveNumber(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;
            if ( arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correctIndex]){//we are ignoring number <=0 and >n i.e we can take arr[i]<=arr.length
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }

        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;//if our sorted arr=1,2,3,4 the missing will be n+1=5
    }
    private static void swap(int[] a,int f,int s){
        int temp=a[f];
        a[f]=a[s];
        a[s]=temp;
    }
}
