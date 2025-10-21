package com.company;

import java.util.Scanner;

public class Xor_sum {
    // Problem Statement :
    //    Wael is well-known for how much he loves the bitwise XOR operation, while kaito is well known for how much he loves to sum numbers, so their friend Resli          decided to make up a problem that would enjoy both of them. Resil wrote down an array A of length N, an integer K and he defined a new function called  Xor-        sum as follows
    //Xor-sum(x)=(x XOR A[1])+(x XOR A[2])+(x XOR A[3])+…………..+(x XOR A[N])
    //    Can you find the integer x in the range [0,K] with the maximum Xor-sum (x) value?
    //    Print only the value.
    //    Input format
    // The first line contains integer N denoting the number of elements in A.
    //The next line contains an integer, k, denoting the maximum value of x.
    //Each line i of the N subsequent lines(where 0<=i<=N) contains an integer describing Ai.
    //   Constraints
    //1<=N<=10^5
    //0<=K<=10^9
    //0<=A[i]<=10^9
    //   Sample Input 1
    //   1
    //   0
    //   989898
    //   Sample Output 1
    //   989898
    //   Explanation:
    //Xor_sum(0)=(0^989898)=989898
    //
    //   Sample Input 2
    //   3
    //   7
    //   1
    //   6
    //   3
    //   Sample Output 2
    //   14
    //   Explanation
    //Xor_sum(4)=(4^1)+(4^6)+(4^3)=14.

    //////////////////////////////////////////////////////////  or      //////////////////////////

    //Find a value X in range [0, K] which can maximize X XOR sum over given array
    //Difficulty Level : Basic
    //Last Updated : 16 Nov, 2021
    //Given an array a[] of size N and an integer K, the task is to find a value X in the range [0, K] which can maximize the value of the given function
    //
    //Xor-sum(X) = (X XOR A[0]) + (X Xor A[1]) + (X Xor A[2]) + __________+ (X Xor A[N-1]).
    //Examples:
    //
    //Input: a[] = {1, 2, 3, 4, 5, 6}, N=6, K=10
    //Output: 8
    //Explanation: The value of X is 1 for which the required sum becomes maximum.
    //
    //Input: a[] = {1, 6}, N=2, K=7
    //Output: 0

    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int[] arr=new int[n];
//        int k=s.nextInt();
//        for (int i=0;i< n;i++){
//            arr[i]=s.nextInt();
//        }                             //dynamic input


        int[] arr= {1,2,3,4,5,6};
        int k=10;



        System.out.println(xor_Sum(arr,k));

    }
    private static int xor_Sum(int[] arr,int k){
        int max=0,x=0;
        for (int i=0;i<=k;i++){
            int sum=0;
            for (int j=0;j< arr.length;j++){
                sum=sum+(i^arr[j]);

            }
            if (sum>max){
                max=sum;
                x=i;

            }

        }
        System.out.println(x+" is the number which make xor-sum maximum");
        return max;
    }
}
