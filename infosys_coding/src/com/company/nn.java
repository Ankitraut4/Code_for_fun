package com.company;

public class nn {
    public static void main(String[] args) {
        double[] arr={1.01,1.32,1.991,1.41};
        System.out.println(fin(arr));
    }
    private static double fin(double[] arr){
        double sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        return Math.round(sum/3);
    }
}
