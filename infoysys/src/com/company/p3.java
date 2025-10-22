package com.company;

import java.util.*;

public class p3 {
    //wrong solution as case 2 would not be satisfied -- correct sloution is resent in exp file

    //Problem Statement:
    //
    //You have an array A of N integers A1 A2 .. An. Find the longest increasing subsequence Ai1 Ai2 .. Ak
    //(1 <= k <= N) that satisfies the following condition:
    //For every adjacent pair of numbers of the chosen subsequence Ai[x] and Ai[x+1] (1 < x < k), the expression( Ai[x] & Ai[x+1] ) * 2 < ( Ai[x] | Ai[x+1] ) is true
    //
    //Note: ‘&’ is the bitwise AND operation, ‘ | ‘ is the bit-wise OR operation
    //
    //Input:
    //
    //The first line contains an integer, N, denoting the number of elements in A.
    //Each line i of the N subsequent lines (where 0 ≤ i < N) contains an integer describing Ai.
    //Sample cases:
    //
    //Input	Output	Output Description
    //5
    //15
    //6
    //5
    //12
    //1
    //
    //2	One possible subsequence is: 5 12
    //6
    //9
    //17
    //2
    //15
    //5
    //2
    //
    //2	One possible subsequence is: 2 15
    //7
    //17
    //16
    //12
    //2
    //8
    //17
    //17

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Set<Integer> set=new LinkedHashSet<>();


        for(int i=0;i< arr.length-1;i++) {
            if (arr[i]<arr[i+1]) {
                if (((arr[i] & arr[i + 1]) * 2) < ((arr[i] | arr[i + 1]))) {
                    set.add(arr[i]);
                    set.add(arr[i + 1]);
                }
            }
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
