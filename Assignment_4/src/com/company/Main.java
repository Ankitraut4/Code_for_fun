package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Problem: Write a Program to find the Maximum and Minimum of the Given Three Numbers.
        Scanner s=new Scanner(System.in);
        int[] arr=new int[3];
        for (int i=0;i<3;i++){
            arr[i]=s.nextInt();
        }
        max_and_min(arr);

    }
    private static void max_and_min(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max value = "+max+" Min value "+min);
    }
}
