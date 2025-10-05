package com.company;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(337));
    }
    private static boolean isPrime(int num){
        if (num<=1){
            return false;
        }else if (num==2){
            return true;
        }else {
            if (num%2==0){//if num % 2 give reminder 0 it means it is even
                return false;
            }else {
                //if it is not even then check for all number upto in squareroot of that number
                for (int i=3;i<=Math.sqrt(num);i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }

    }
}
