package com.company;

import java.util.Scanner;

public class operator_as_input {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the n1 ");
        int n1=s.nextInt();
        System.out.println("enter the n2 ");
        int n2=s.nextInt();
        System.out.println("enter the operator(+,-,*,/) ");
        char op=s.next().charAt(0);

        if (op=='+'){
            System.out.println(n1+n2);
        }else if (op=='-'){
            System.out.println(n1-n2);
        }else if (op=='*'){
            System.out.println(n1*n2);
        }else if (op=='/'){
            System.out.println(n1/n2);
        }

    }
}
