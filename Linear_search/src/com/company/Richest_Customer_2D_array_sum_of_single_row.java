package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Richest_Customer_2D_array_sum_of_single_row {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int[][] arr=new int[3][3];
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=s.nextInt();
            }
        }
        for (int[] row : arr){
            System.out.println(Arrays.toString(row));
        }


        System.out.println(maximumWealth(arr));

    }
    private static int maximumWealth(int[][] arr){
        int max=0;
        for (int[] a : arr){
            int sum=0;
            for (int element : a){
                sum+=element;
            }
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
