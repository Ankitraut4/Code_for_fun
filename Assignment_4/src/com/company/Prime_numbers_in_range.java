package com.company;

import java.util.Scanner;

public class Prime_numbers_in_range {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter start number :- ");
        int first=s.nextInt();
        System.out.print("Enter last number :- ");
        int last=s.nextInt();
        countPrimeNumbersInRange(first,last);
    }
    public static void countPrimeNumbersInRange(int first,int last){
        for (int i=first;i<=last;i++){
            if (isPrime(i)){
                System.out.print(i+",");
            }
        }
    }
    private static boolean isPrime(int num){
        if (num<=1){
            return false;
        }else if (num==2){
            return true;
        }else {
            if (num%2==0){
                return false;
            }else {
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
