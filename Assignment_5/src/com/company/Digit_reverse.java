package com.company;

import java.util.Scanner;

public class Digit_reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a digit = ");
        int digit=s.nextInt();
        System.out.println(reverseDigit(digit));
    }
    public static int reverseDigit(int digit){
        int num=0;
        while (digit!=0){
            num=(10*num)+digit%10;
            digit=digit/10;
        }
        return num;
    }
}
