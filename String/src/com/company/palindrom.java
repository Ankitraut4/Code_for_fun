package com.company;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string");
        String s=scanner.nextLine();
        System.out.println("it is palindron = "+isPalindron(s));
    }
    private static boolean isPalindron(String str){

        char[] arr=str.toCharArray();
        if (arr==null || arr.length==0){
            return true;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
