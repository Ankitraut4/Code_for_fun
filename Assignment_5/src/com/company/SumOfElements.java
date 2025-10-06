package com.company;

public class SumOfElements {
    public static void main(String[] args) {

        int[] arr=new int[15];
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(20+(Math.random()*((100-20)+1)));
           // System.out.println(arr[i]);
        }
        sum(arr);
    }
    public static void sum(int[] arr){
        int sumOf=0;
        for(int i=0;i< arr.length;i++){
            sumOf+=arr[i];
        }
        System.out.println("Sum of elements of array = "+sumOf);
    }

}
