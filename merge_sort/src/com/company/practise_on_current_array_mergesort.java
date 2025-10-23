package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class practise_on_current_array_mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array in continous order with ',' seperate numbers ");
        String str=sc.nextLine();

        String[] stt=str.split(",");

        int[] arr=new int[stt.length];
        for (int i=0;i<stt.length;i++){
            arr[i]=Integer.valueOf(stt[i]);
        }

        System.out.println(Arrays.toString(arr));

        mergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void mergeSort(int[] arr,int start,int end){
        if (end-start==1){
            return;
        }
        int mid=start+(end-start)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid,arr.length);

        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr,int start,int mid,int end){

        int i=start;
        int j=mid;
        int k=0;
        int[] newAr=new int[end-start];
        while (i<mid && j<end){
            if (arr[i]<arr[j]){
                newAr[k]=arr[i];
                i++;
            }else {
                newAr[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            newAr[k]=arr[i];
            i++;
            k++;
        }
        while (j<end){
            newAr[k]=arr[j];
            j++;
            k++;
        }

        for (int l=0;l<newAr.length;l++){
            arr[start+l]=newAr[l];
        }
    }

}
