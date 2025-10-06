package com.company;

public class Check_if_two_numbers_are_co_prime {
    public static void main(String[] args) {

        int a=2,b=4;
        System.out.println(isCoprime(a,b) ? "is co-prime" : "not co-prime");
    }
    //the number is said to be co-prime if the gcd of two number is 1.
    private static int gcd(int a,int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (a == b) {
            return a;

        }
        while (a != b) {

            if (a > b) {

                a=a-b;
            }
            b=b-a;
        }
        return a;
    }
    private static boolean isCoprime(int a,int b){
        if (gcd(a,b)==1){
            return true;
        }
        return false;
    }
}
