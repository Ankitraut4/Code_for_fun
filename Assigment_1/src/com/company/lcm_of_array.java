package com.company;

public class lcm_of_array {
    public static void main(String[] args) {
        int[] arr={2,7,3,9,4};
        System.out.println(lcm(arr));
    }
    public static int gcd(int a,int b){
        while (a!=b){
            if (a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        return a;
    }

    public static int lcm(int[] arr){
        int result=(arr[0]*arr[1])/gcd(arr[0],arr[1]);
        for (int i=2;i< arr.length;i++){
            result=(result*arr[i])/gcd(result,arr[i]);
        }
        return result;


    }
}
