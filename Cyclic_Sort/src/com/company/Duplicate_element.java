package com.company;

import java.util.Arrays;

public class Duplicate_element {
    public static void main(String[] args){
        int[] arr={1,3,4,3,2};

        System.out.println("duplicate element in array = "+duplicateElement(arr));


    }
    private static int duplicateElement(int[] arr){
        int i=0;
        while (i<arr.length){
            if (arr[i]!=i+1){
                int correctIndex=arr[i]-1;
                if (arr[i]!=arr[correctIndex]){//if at the correct index the element is already present or not
                    swap(arr,i,correctIndex);
                }else {//if element is already present then it is duplicate element
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;//if no duplicate found return -1
    }
    private static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
