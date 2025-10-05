package com.company;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(-99));
    }
    private static int factorial(int n) {
        int sum=1 ;
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            return sum;
        }
    }
}
