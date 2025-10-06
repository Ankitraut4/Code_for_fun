import java.util.Arrays;

public class Multiplication_matrix {
    public static void main(String[] args) {

        int matA[][] = { { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } };

        int matB[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 } };
        mul(matA,matB);

    }
    public static void mul(int[][] matA,int[][] matB){
        int row1=matA.length,col1=matA[0].length,row2=matB.length,col2=matB[0].length;
        int[][] resMat=new int[row1][col2];
        if(row1!=col2){
            System.out.println("multiplication is not possible");
            return;
        }
        for (int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<row2;k++){
                    resMat[i][j]+=matA[i][k]*matB[k][j];
                }
            }
        }
        for (int[] m: resMat){
            System.out.println(Arrays.toString(m));
        }

    }
}
