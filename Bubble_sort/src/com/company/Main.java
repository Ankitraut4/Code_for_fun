package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       int[] arr={3,4,2,5,1};
       bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void bubbleSort(int[] arr){
        boolean swap;
        for (int i=0;i< arr.length;i++){//here i is counter for loop to n times and n-1 index
            swap=false;
        for (int j=1;j<arr.length-i;j++){//here we do arr.length-i because after one loop of i=0 last index is highest and for i=1 second last elemnt is at second last index so on...
            if (arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                swap=true;//if we enter in this loop swap will happen
            }
        }
        if (swap!=true){
            break;//if the array is already sorted and the arrray is not swap for any value of j so doed not required check for every
            //loop condition of j so we break the loop
        }
        }

    }
}
