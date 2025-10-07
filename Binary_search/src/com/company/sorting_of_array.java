package com.company;

import java.util.Arrays;

public class sorting_of_array {
    public static void main(String[] args) {
        int[] arr={23,67,1,9,32,56};
        sort(arr);
       System.out.println(Arrays.toString(arr));

//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
    private  static int[] sort(int[] array){
        int temp=0;
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
