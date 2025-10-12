package com.company;

import java.util.Scanner;

public class min_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(min(arr));
     }
     private static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
     }
}
