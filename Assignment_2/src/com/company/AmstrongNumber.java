package com.company;

import java.util.Scanner;

public class AmstrongNumber {
    //amstrong number is a number like 153=(1^3)+(5^3)+(3^3)=1+125+27
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers ");
        int n1= s.nextInt();
        int n2= s.nextInt();
        if (isAmstrong(n1) && isAmstrong(n2)) {
            System.out.println(n1 + " and " + n2 + " is amstrong number");
        }else if (isAmstrong(n1)){
            System.out.println(n1+" is amstrong number");
        }
        else  if (isAmstrong(n2)){
            System.out.println(n2+" is amstrong number ");

        }else {
            System.out.println("neither of them is amstrong number");
        }
    }
    private static boolean isAmstrong(int number){
        int temp=number;
        int digit,sum=0;
        while (number!=0){
            digit=number%10;
            number=number/10;
            sum+=digit*digit*digit;
        }
        if (sum==temp){
            return true;
        }
        return false;
    }
}

