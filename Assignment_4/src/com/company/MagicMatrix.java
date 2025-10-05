package com.company;

import java.util.Arrays;

public class MagicMatrix {
    public static void main(String[] args) {
      int[][] matrixA={{1,2,3},{2,0,6}};

        System.out.println(isRowMagic(matrixA));


    }
    public static boolean isRowMagic(int[][] m){
      //checks if the array is row-magic (this means that every row has the same row sum).
        int sum=0;
        for (int k=0;k<m[0].length;k++){
           sum+=m[0][k];

       }
        System.out.println(sum);
        for(int i=0;i<m.length;i++){
            int sumRow=0;
           for (int j=0;j<m[0].length;j++){
               sumRow+=m[i][j];
           }
           if (sum==sumRow){
               return true;
           }
        }
        return false;
    }
}
