package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Dispaly_Letter_for_corresponding_integer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number 1 ");
        int a=s.nextInt();
        System.out.println("enter the number 2++ ");
        int b=s.nextInt();
        System.out.println("enter the number 3 ");
        int c=s.nextInt();
        System.out.println("enter the number 4 ");
        int d=s.nextInt();
        char [] ar=displayLetters(a,b,c,d);
        System.out.println(Arrays.toString(ar));

    }
    private static char[] displayLetters(int a,int b,int c,int d){

        char q=(char) a;
        char w=(char) b;
        char e=(char) c;
        char r=(char) d;

        return new char[]{q,w,e,r};
    }
}
