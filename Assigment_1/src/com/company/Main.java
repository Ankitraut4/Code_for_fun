package com.company;


import java.util.Scanner;

public class Main {

    //leap year must be divisible by 400
    //leap year must be divisible by 4 but not by 100
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enter the year ");
        int n=s.nextInt();
        System.out.println(isLeapYear(n) ? "Leap year ": "Not Leap Year");

    }
    private static boolean isLeapYear(int v){
        if (v%400==0 ){
            return true;
        }else if (v%100!=0 && v%4==0){
            return true;
        }
        return false;
    }

}
