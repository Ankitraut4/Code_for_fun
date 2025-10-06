package com.company;

public class Richest_customer_wealth {
    public static void main(String[] args) {
//1672. Richest Customer Wealth
//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

//Example 1:
//        Input: accounts = [[1,5],[7,3],[3,5]]
//        Output: 10
//        Explanation:
//        1st customer has wealth = 6
//        2nd customer has wealth = 10
//        3rd customer has wealth = 8
//        The 2nd customer is the richest with a wealth of 10.

        int[][] arr={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {


        int max=0;
        for (int row=0;row<accounts.length;row++){
            int sum=0;
            for (int col=0;col<accounts[row].length;col++){
                sum+=accounts[row][col];
            }
            if (sum>max){
                max=sum;
            }
        }

        return max;
    }
}
