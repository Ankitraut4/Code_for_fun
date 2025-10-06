package com.company;

import java.util.Arrays;

public class transpose_matrix {
    public static void main(String[] args) {
      //867. Transpose Matrix
        //Given a 2D integer array matrix, return the transpose of matrix.
        //The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
        //Example 1:
        //
        //Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        //Output: [[1,4,7],[2,5,8],[3,6,9]]

        int[][] matrix={{1,2,3},{4,5,6}};
        int[][] newMa=transpose(matrix);
        for (int[] ma : newMa){
            System.out.print(Arrays.toString(ma)+" ");
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int m=matrix[0].length;//when we reverse matrix from row.length=2 to row.length=3 so we take col length here
      //  System.out.println(m);
        int n=matrix.length;//we reverse col.length=3 to col.length=2 so we take row length
      //  System.out.println(n);
        int[][] newma=new int[m][n];
        for (int row=0;row<matrix.length;row++){
            for (int col=0;col<matrix[row].length;col++){
                newma[col][row]=matrix[row][col];
            }
        }

        return newma;
    }
}
