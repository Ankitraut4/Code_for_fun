package com.company;

public class fibo_recursion {
    public static void main(String[] args) {
        System.out.println(fibo(3));//3 is the position
    }
    public static int fibo(int n){
        if (n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
