package com.company;

import java.util.Scanner;

public class HCF_and_LCM {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n1 ");
        int n1=s.nextInt();
        System.out.println("enter n2 ");
        int n2=s.nextInt();
        System.out.println("HCF of numbers "+n1+" and "+n2+" = "+find(n1,n2));
        System.out.println("LCM of numbers "+n1+" and "+n2+" = "+(n1*n2)/find(n1,n2));
    }
    private static int find(int n1,int n2) {
        while(n1!=n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n1;
    }

}
