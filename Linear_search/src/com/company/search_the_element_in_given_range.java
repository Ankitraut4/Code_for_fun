package com.company;

import java.util.Scanner;

public class search_the_element_in_given_range {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();

        }

        System.out.println(linearSearch(arr,3));


    }
    //return index of element
    private static boolean linearSearch(int[] arr,int target){
        for (int i=1;i<=4;i++){
            if (arr.length==0){
                return false;
            }
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }

}
