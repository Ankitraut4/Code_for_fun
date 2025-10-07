package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class smallest_letter_greater_than_target {
    //ascending order
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string in small letters ");
        String a=s.next();
        char[] letter=a.toLowerCase().toCharArray();
        System.out.println(Arrays.toString(letter));

        System.out.println("enter the target char  ");
        char target=s.next().toLowerCase(Locale.ROOT).charAt(0);

//        char[] letter={'a','b','d'};
//        char target='c';

        System.out.println(wrap_round(letter,target));

    }
    private static char wrap_round(char[] letter,char target){
        int start=0;
        int end=letter.length-1;

        while (start<=end){

            int mid=start+(end-start)/2;

            if (target>letter[mid]){
                start=mid+1;
            }else {
                end=end-1;
            }
        }
        return letter[start%letter.length];
    }
}
