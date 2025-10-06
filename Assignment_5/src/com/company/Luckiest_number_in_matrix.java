package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Luckiest_number_in_matrix {
    //1380. Lucky Numbers in a Matrix

    //Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
    //A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
    //Example 1:
    //Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
    //Output: [15]
    //Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
    private static List<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
List<Integer> lt=new ArrayList<>();
        lt=luckyNumbers(matrix);
for (int i=0;i<1;i++){
    System.out.println(lt.get(i));
}

    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int min=Integer.MAX_VALUE;
        int temp=0;
        for (int row=0;row<matrix.length;row++){
            for (int col=0;col<matrix[row].length;col++){
                if (matrix[row][col]<min){
                    min=matrix[row][col];
                    if (min>matrix[col][row]){
                        temp=matrix[col][row];
                        list.add(temp);
                    }
                }
            }
            System.out.println(min);
        }
        return list;
    }
}
