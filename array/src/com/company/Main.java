package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //2d array

        int[][] arr=new int[3][3];

        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=s.nextInt();
            }

        }

        //output
//        for (int row=0;row<arr.length;row++){
//            for (int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        //output by enhance for loop
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
