package com.company;

public class diagonal_sum {
    public static void main(String[] args) {
    int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

            //j         //0  1  2

       //i  //0         //1  2  3
            //1         //4  5  6
            //2         //7  8  9

        System.out.println(SumDi(matrix));
    }
    private static int SumDi(int[][] mat){
        int i=0 ,j=0,sum=0;
//sum of left diagonal
        while (i<mat.length){
            sum+=mat[i][j];
            i++;
            j++;
        }

        //sum of right diagonal - similar element when i==j
        i=0;
        j=mat.length-1;

        while (i<mat.length){
            if (i!=j){
                sum+=mat[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }
}
