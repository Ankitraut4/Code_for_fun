package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class counting_even_no_OF_DIGITS_from_array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Even no of digits are = "+no_of_even_number(arr));

        System.out.println("no.of digits ="+no_of_digits1(-123567));
    }

    private static int no_of_even_number(int[] arr){
        int count=0;
        for (int a : arr){
            if (even(a)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int n){
        return no_of_digits1(n)%2==0;
    }

    private  static int no_of_digits(int num){
        int count=0;
        if (num<0){
            num=num*-1;
        }
        if (num==0){
            return 1;
        }
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }

    private  static int no_of_digits1(int num){
        if (num<0){
            num=num*-1;
        }
       if (num==0){
            return 1;
        }
       return (int)(Math.log10(num)+1);
    }
}
