package com.company;

public class Fibo_until_n_numbers {
    public static void main(String[] args) {

       fiboSeries(0,1,6);
    }
    private static void fiboSeries(int first,int second,int numbers){
        System.out.print(first+" "+second+" ");
        for (int i=0;i<numbers-2;i++){
            int newNum=first+second;
            first=second;
            second=newNum;

            System.out.print(newNum+" ");
        }
    }
}
