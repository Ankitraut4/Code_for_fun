package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Xor_on_subArray {
    //   Problem Statement :
    //   Khaled has an array A of N elements. It is guaranteed that N is even. He wants to choose at most N/2 elements from array A. It is not necessary to choose             consecutive elements.  Khaled is interested in XOR of all the elements he chooses. Here, XOR denotes the bitwise XOR operation.
    //
    //   For example:
    //If A=[2,4,6,8], then khaled can choose the subset [2,4,8] to achieve XOR=(2 XOR 4 XOR 8)=14.
    //   Khaled wants to maximize the XOR of all the elements he chooses. Your task is to help khaled to find the max XOR of a subset that he can achieve by choosing     at most N/2 elements?
    //
    //   Input format:
    //The first line contains an integer, N, denoting the number of elements in A.
    //Each line i of the N subsequent lines(where 0<=i<=N) contains an integer describing Ai.
    //   Constraints
    //1<=N<=120
    //1<=A[i]<=10^6
    //   Sample Input 1
    //   2
    //   1
    //   2
    //   Sample Output 1
    //   2
    //   Explanation:
    //   N=2,  A=[1,2] khaled can choose the subset[2]. The xor of the elements in the subset is 2. And the number of elements in the subset is 1 which is less than N/2.
    //
    //   Sample Input 2
    //   4
    //   1
    //   2
    //   4
    //   7
    //
    //   Sample Output 2
    //   7
    //   Explanation:
    //N=4,  A=[1,2,4,7] Khaled can choose the subset [7]. The xor of the elements in the subset is 7, and the number of elements in the subset is 1 which is less than       N/2.
    public static void main(String[] args) {
         int[] arr={1,2,4,7,8,3};
         bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(xOR(arr));
    }
    private static int xOR(int[] arr){
        int[] newAr=new int[arr.length/2];


        for (int i=0;i< arr.length/2;i++){
           newAr[i]=arr[i];
        }
        int max=newAr[0];
        for (int i=0;i< newAr.length;i++){
            if(newAr.length==1){
                return newAr[0];
            }

            for (int j=0;j< newAr.length;j++){
                if((newAr[i]^newAr[j])>max){
                    max=newAr[i]^newAr[j];
                }
            }

        }

        return max;
    }
    private static void bubbleSort(int arr[])
    {
        int n= arr.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] < arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

}
