package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] ch=str.toCharArray();
        System.out.println((reverse1(ch)));
        System.out.println(reverse2(str));
        System.out.println(reverse3(str));
    }
    private static char[] reverse1(char[] ch){
        char[] reverse=new char[ch.length];
        int pos=0;
        for (int i=ch.length-1;i>=0;i--){
            reverse[pos]=ch[i];
            pos++;
        }
        return reverse;
    }
    private static char[] reverse2(String str){
        char[] ch=str.toCharArray();

        for (int i=0;i<ch.length/2;i++){
            swap(ch,i,ch.length-1-i);
        }
        return ch;
    }
    private static char[] reverse3(String str){
        char[] ch=str.toCharArray();
        int start=0;
        int end= ch.length-1;
        while (start< ch.length/2){
            swap(ch,start,end);
            start++;
            end--;
        }
        return ch;
    }
    private static void swap(char[] ch,int first,int second){
        char temp=ch[first];
        ch[first]=ch[second];
        ch[second]=temp;
    }
}
