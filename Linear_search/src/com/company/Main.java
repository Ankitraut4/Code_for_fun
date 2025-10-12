package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();

        }

        System.out.println(linearSearch3(arr,25));


    }
    //return index of element
    private static int linearSearch(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr.length==0){
                return -1;
            }
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //return element
    private static int linearSearch2(int[] arr,int target){
        for (int element : arr){
            if (arr.length==0){
                return Integer.MAX_VALUE;
            }

            if (element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    //return true if present or false
    private static boolean linearSearch3(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr.length==0){
                return false;
            }
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
