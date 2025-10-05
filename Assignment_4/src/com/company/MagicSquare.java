package com.company;
public class MagicSquare {
    public static void main(String[] args) {

        int[][] mat={{2,7,6},{9,5,1},{4,3,8}};
        System.out.println(isMagicSquare(mat));
    }
    public static boolean isMagicSquare(int[][] m){
        //that checks if the array is a magic square. This means that
        // it must be square, and that all row sums, all column sums,
        // and the two diagonal-sums must all be equal.
        int i=0;
        int sum=0,sum1=0;
         while (i<m.length){
             sum+=m[i][i];
             sum1+=m[0][m.length-1-i];
             i++;
         }
         if (sum!=sum1){//if sum of digonal are not equal then it is not magic square matrix
             return false;
         }
         for(int j=0;j<m.length;j++){
           int  colSum=0,rowSum=0;
             for(int k=0;k<m[0].length;k++){
                 colSum+=m[j][k];
                 rowSum+=m[j][k];
             }
             if (colSum !=rowSum || colSum!=sum || rowSum!=sum){
                 return false;
             }
         }
return true;
    }
}
