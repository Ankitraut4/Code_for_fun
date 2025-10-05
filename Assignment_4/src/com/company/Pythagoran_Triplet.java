package com.company;

import java.util.Arrays;

public class Pythagoran_Triplet {
    public static void main(String[] args) {
int[] arr={3,1,4,6,5};
        System.out.println(Arrays.toString(triplet(arr)));
    }
    private static int[] triplet(int[] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=1+i;j< arr.length;j++){
                for (int k=1+j;k< arr.length;k++){
                    int x=arr[i]*arr[i],y=arr[j]*arr[j],z=arr[k]*arr[k];
                    if (x==y+z || y==x+z || z==x+y){
                        return new int[]{(int)Math.sqrt(x),(int)Math.sqrt(y),(int)Math.sqrt(z)};
                    }
                }
            }
        }
        return new int[]{-1,-1,-1};
    }
}
