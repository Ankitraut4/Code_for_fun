package com.company;

import java.util.Arrays;

public class Searching_in_2D_array {
    public static void main(String[] args) {

        int[][] arr={
                {1,2,3},
                {4,5,6,7},
                {88,8,9,10}
        };
        int[] ans=search(arr,88);
        System.out.println(Arrays.toString(ans));//way 1 of printing array

        for (int a  : ans){
             System.out.print(a+" ");//way 2 print array
         }


        System.out.println();
        System.out.println(max(arr));

    }

    //searching element in 2d array
    private static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //max element
    private static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] ar: arr){
            for (int element: ar){
                if (element>max){
                    max=element;
                }
            }
        }
        return max;
    }
}
