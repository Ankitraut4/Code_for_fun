package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class TwoArraysSum {
    //we are given teo arrays and there lengths are not same and we have to do ith sum of there elements
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of first array ");
        int n1=s.nextInt();
        double[] arr1=new double[n1];
        System.out.println("enter the elements of first array ");
        for (int i=0;i<arr1.length;i++){
            arr1[i]=s.nextDouble();
        }
        System.out.println("enter the size of Second array ");
        int n2=s.nextInt();
        double[] arr2=new double[n2];
        System.out.println("enter the elements of second array ");
        for (int i=0;i<arr2.length;i++){
            arr2[i]=s.nextDouble();
        }
        int[] sum;
        if (arr1.length>arr2.length){
            sum=new int[arr1.length];
            int i=0;
            while (i<arr2.length){
                sum[i]=(int)(arr1[i]+arr2[i]);
                i++;
            }
            while (i< arr1.length){
                sum[i]=(int)arr1[i];
                i++;
            }
        }else {
            sum=new int[arr2.length];
            int i=0;
           while (i<arr1.length){
               sum[i]=(int)(arr1[i]+arr2[i]);
               i++;
           }
           while (i< arr2.length){
               sum[i]=(int)arr2[i];
               i++;
           }

        }
        System.out.println(Arrays.toString(sum));

    }
}
