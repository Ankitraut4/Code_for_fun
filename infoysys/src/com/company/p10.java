package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p10 {
    //Today you decided to go to the gym. You currently have energy equal to E units. There are N exercises in the gym. Each of these exercises drains Ai amount of energy from your body.
    //You feel tired if your energy reaches 0 or below. Calculate the minimum number of exercises you have to perform such that you become tired. Every unique exercise can only be performed at most 2 times as others also have to use the machines.
    //If performing all the exercises does not make you feel tired, return -1.
    //Input Format
    //E :: INTEGER
    //The first line contains an integer, E, denoting the Energy.
    //E :: 1 -> 10^5
    //N :: INTEGER
    //The next line contains an integer, N, denoting the number of exercises. N :: 1 -> 10^5
    //A :: INTEGER ARRAY
    //Each line i of the N subsequent lines (where 0 ≤ i < N) contains an integer describing the amount of energy drained by i-th exercise.
    //A[i] :: 1 -> 10^5
    //Sample Input 1:
    //6
    //2
    //1
    //2
    //Sample Output 1 :
    //4
    //Sample input 2:
    //10
    //2
    //1
    //2
    //Sample Output 2:
    //-1
    //Sample input 3:
    //2
    //3
    //1
    //5
    //2
    //Sample Output 3:
    //1

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the energy");
        int energy=s.nextInt();
        System.out.println("enter the number of exercise");
        int ex=s.nextInt();
        System.out.println("enter the amount of energy consumed by "+ex+" exercise");
        int[] arr=new int[ex];
        for (int i=0;i<ex;i++){
            arr[i]=s.nextInt();
        }

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int k=0,count=0;
        if (energy==0){
            System.out.println(0);
            return;
        }
        while (energy>0 && k<ex){

                for (int i=0;i<2;i++) {
                    if (arr[k]<=energy){
                    energy -= arr[k];
                    count++;
                }
            }
                k++;
        }
        if (energy!=0){
            System.out.println(-1);
            return;
        }
        System.out.println(count);
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


}
