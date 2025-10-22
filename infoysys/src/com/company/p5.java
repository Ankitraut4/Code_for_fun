package com.company;

import java.util.Scanner;

public class p5 {
    //Khaled has an array A of N elements. It is guaranteed that N is even. He wants to choose at most N/2 elements from array A. It is not necessary to choose consecutive elements.  Khaled is interested in XOR of all the elements he chooses. Here, XOR denotes the bitwise XOR operation.
    //   For example:
    //If A=[2,4,6,8], then khaled can choose the subset [2,4,8] to achieve XOR=(2 XOR 4 XOR 8)=14.
    //Khaled wants to maximize the XOR of all the elements he chooses. Your task is to help khaled to find the max XOR of a subset that he can achieve by choosing at most N/2 elements?
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
    //Explanation:
    //N=2,  A=[1,2] khaled can choose the subset[2]. The xor of the elements in the subset is 2. And the number of elements in the subset is 1 which is less than N/2.
    //Sample Input 2
    //4
    //1
    //2
    //4
    //7
    //Sample Output 2
    //7
    //Explanation:
    //N=4,  A=[1,2,4,7] Khaled can choose the subset [7]. The xor of the elements in the subset is 7, and the number of elements in the subset is 1 which is less than N/2.
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of element in an array");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the "+n+" element");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        bubbleSort(arr);
        System.out.println(xor(arr));
    }
    public static void bubbleSort(int[] arr){
        boolean swap;

        for (int i=0;i< arr.length-1;i++){
            swap=false;
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false) {
                break;
            }
        }
    }
    public static int xor(int[] arr){
        int[] newAr=new int[arr.length/2];
        for (int i=0;i< newAr.length;i++){
            newAr[i]=arr[i];
        }

        int max=newAr[0];
        for (int i=0;i< newAr.length;i++){
            if(newAr.length==1){
                return newAr[0];
            }
            for (int j=0;j< newAr.length;j++){
                if((arr[i]^arr[j])>max){
                    max=(arr[i]^arr[j]);
                }
            }
        }
        return max;
    }
}
