package com.company;

public class cout_co_primes_in_array {
    public static void main(String[] args) {
        int[] arr={4,8,3,9};
        System.out.println(coutCoprime(arr));
    }
    private static  int coutCoprime(int[] arr){
        int count=0;
        for (int i=0;i< arr.length;i++){
            for (int j=1+i;j< arr.length;j++){

                    if (gcd(arr[i],arr[j])==1){
                        count++;
                    }

            }
        }
        return count;
    }


    private static int gcd(int a,int b){
        if (a==0 || b==0){
            return 0;
        }
        if (a==b){
            return a;
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }else {
                b = b - a;
            }
        }
        return a;
    }
}
