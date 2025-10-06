package com.company;

import java.util.Arrays;

public class Cells_with_odd_matrix {
    //1252. Cells with Odd Values in a Matrix
    //There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci]
    // represents a 0-indexed location to perform some increment operations on the matrix.
    //For each location indices[i], do both of the following:
    //Increment all the cells on row ri.
    //Increment all the cells on column ci.
    //Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

    //Example 1:
    //Input: m = 2, n = 3, indices = [[0,1],[1,1]]
    //Output: 6
    //Explanation: Initial matrix = [[0,0,0],[0,0,0]].
    //After applying first increment it becomes [[1,2,1],[0,1,0]].
    //The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
    public static void main(String[] args) {

        int m=2;
        int n=3;
        int[][] indices={{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));

    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        for (int row=0;row< indices.length;row++){
            for (int col=0;col<indices[row].length;col++) {
                int value = indices[row][col];
                if (col < 1) {
                    for (int i = 0; i < n; i++) {
                        matrix[value][i]++;
                    }
                } else {
                    for (int j = 0; j < m; j++) {
                        matrix[j][value]++;
                    }
                }
            }
        }
        int count=0;
        for (int row=0;row<matrix.length;row++){
            for (int col=0;col<matrix[row].length;col++){
                if (matrix[row][col]%2!=0){
                    count++;
                }
            }
        }
        for (int[] j: matrix){
            System.out.println(Arrays.toString(j));
        }
        return count;

    }
}
