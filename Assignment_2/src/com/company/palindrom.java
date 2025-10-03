package com.company;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");
        String str=s.nextLine();
        System.out.println(isPali(str));
    }
    private static boolean isPalindrom(String str){
        char[] ch=str.toCharArray();
        int start=0;
        int end=ch.length-1;
        while (start<= ch.length/2){
            if (ch[start]!=ch[end]){

                return false;

            }
            start++;
            end--;

        }
        return true;
    }
    private static boolean isPali(String str){
        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length/2;i++){
            if (ch[i]!=ch[ch.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
