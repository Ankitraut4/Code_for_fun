package com.company;

import java.util.Arrays;

public class row_coloum_sorted_2D_array {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},
                {15,25,35,45},
                {18,27,39,48},
                {19,28,42,50}};

        System.out.println(Arrays.toString(sortedArray(arr,19)));
    }
    private static int[] sortedArray(int[][] arr,int target){
        int r=0;
        int c= arr.length-1;
        while (r<arr.length && c>=0){
            if (arr[r][c]==target){
                return new int[]{r,c};
            }else if (arr[r][c]<target){
                r++;
            }else {
                c--;
            }
        }
        return  new int[]{-1,-1};
    }
}
