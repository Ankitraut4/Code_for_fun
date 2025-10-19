package com.company;

import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        double value=n;
        int num=0,sum=0;
        while (n!=0){
            num=n%10;
            sum+=num;
            n= n / 10;
        }
        System.out.println(value/sum);
    }
}
