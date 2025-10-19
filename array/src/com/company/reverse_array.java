package com.company;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {

        int[] arr={10,2,33,4,77,90,22};

        reverse(arr,0,6);
        System.out.println(Arrays.toString(arr));
        
    }
    private static void reverse(int[] arr,int start,int end){

       while (start<=(arr.length/2)){
           swap(arr,start,end);
           start++;
           end--;
       }
    }
    private static void swap(int[] arr,int e1,int e2){
        int temp=0;
        if (e1>=0 && e2< arr.length){

                temp=arr[e1];
                arr[e1]=arr[e2];
                arr[e2]=temp;

        }else {
            return;
        }

    }
}
