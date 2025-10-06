package com.company;

import java.util.Arrays;

public class nintyDegree_degree_rotation_of_matrix {
    //1886. Determine Whether Matrix Can Be Obtained By Rotation

    //Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

    //Example 1:

    //Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
    //Output: true
    //Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
    public static void main(String[] args) {

        int[][] mat={{0,1},{1,0}};
        int[][] target={{1,0},{0,1}};
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
int count=0;
        for (int i=0;i<4;i++){
           if (Arrays.deepEquals(mat,target)){
               System.out.println(count);
                if (count==1){
                   return true;
               }
           }else {

 count++;
 mat= rotation(mat);
           }
        }
        return false;
    }
    public static int[][] rotation(int[][] mat){
        int n=mat.length;
        int[][] newMat=new int[n][n];
        for (int row=0;row<n;row++){
            for (int col=0;col<n;col++){
               newMat[col][n-1-row]=mat[row][col];
            }
        }
        return newMat;
}
}
