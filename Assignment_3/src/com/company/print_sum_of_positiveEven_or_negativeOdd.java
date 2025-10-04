package com.company;

import java.util.Scanner;

public class print_sum_of_positiveEven_or_negativeOdd {
    //Write a program to print the sum of negative numbers,
    // sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
    // The list terminates when the user enters a zero.
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter total number of numbers = ");
        int n=s.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the elements = ");
        for (int i=0;i<arr.length;i++){

            arr[i]=s.nextInt();
            if (arr[i]==0){
                break;
            }
        }
        sum(arr);
    }
    private  static void sum(int[] arr){
        int sum=0;
        int sum1=0;
        int sum2=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]<0){
                sum+=arr[i];
            }else if (arr[i]%2==0){
                sum1+=arr[i];
            }else {
                sum2+=arr[i];
            }
        }
        System.out.println("negitve sum = "+sum+" positive even = "+sum1+" positive odd = "+sum2);
        System.out.println("difference between sum of positive even - sum of postive odd = "+(sum1-sum2));
    }
}
