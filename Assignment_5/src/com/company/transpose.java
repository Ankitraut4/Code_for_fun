package com.company;

import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{6,7,8}};
        int[][] newM=transposeMat(arr);
        for(int[] ar: newM){
            System.out.println(Arrays.toString(ar));
        }

    }
    public static int[][] transposeMat(int[][] arr){
        int m=arr[0].length;
        int n=arr.length;
        int[][] newMat=new int[m][n];
        for (int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                newMat[j][i]=arr[i][j];
            }
        }
        return newMat;
    }
}
