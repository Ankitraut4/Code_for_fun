package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class p4 {

        // Problem Statement :
        //You have been given a string S of length N. The given string is a binary string which consists of only 0â€™s and â€˜1â€™s. Ugliness of a string is defined as the decimal   number that this binary string represents.
        //Example:
        //101 represents 5.
//            0000 represents 0.
//            01010 represents 10.
//    There are two types of operations that can be performed on the given string.
//Swap any two characters by paying a cost of A coins.
//    Flip any character by paying a cost of B coins
//    flipping a character means converting a 1 to a 0 or converting a 0 to a 1.
//    Initially, you have been given coins equal to the value defined in CASH. Your task is to minimize the ugliness of the string by performing the above mentioned          operations on it. Since the answer can be very large, return the answer modulo 10^9+7.
//Note:
//    You can perform an operation only if you have enough number of coins to perform it.
//    After every operation the number of coins get deducted by the cost for that operation.
//    Input Format
//    The first line contains an integer, N, denoting the number of character in the string
//    The next line contains a string, S, denoting the the binary string
//    The next line contains an integer, CASH, denoting the total number of coins present initially
//    Next will contains an integer, A, denoting the cost to swap two characters.
//    Then the next line contains an integer, B, denoting the cost to flip a character.
//            Constraints
//
//1 <= N <= 10^5
//            1< len(S)<= 10^5
//            1<=CASH <=10^5
//            1<=A<=10^5
//            1<=B<=10^5
//    Sample Input 1 :
//
//            4
//     1111
//     7
//      1
//     2
//
//    Sample Output 1 :
//     1
//Explanation:
//3 flips can be used to create 0001 which represents 1.
//    Sample Input 2:
//     6
//     111011
//     7
//     1
//     3
//Sample Output 2:
//    7
//Explanation:
//First swap 0 with the most significant 1, then use flip twice first on index one and then on index two 111011=>0111111=>001111=>000111 the value represented is 7.
        static int n,cash,a,b;
        static String str;
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter the number of integers in string");
            n=s.nextInt();
            System.out.println("enter the String of binary digit of length "+n);
            str=s.next();

            System.out.println("enter the cash ");
            cash=s.nextInt();
            System.out.println("enter the amount required to swap two characters");
            a=s.nextInt();
            System.out.println("enter the amount required to flip a single characters");
            b=s.nextInt();

            if(a<b){
                swap();
                flip();
            }else {
                flip();
                swap();
            }
            System.out.println(Integer.parseInt(str,2));

        }
        public static void swap(){
            char[] ch=str.toCharArray();

            int i=0;
            for (int j=0;j<ch.length;i++){
                if (ch[j]=='1'){
                    i=j;
                    break;
                }
            }
            int k= ch.length-1;
            while (k>i){

                if (cash<a){
                    break;
                }


                if (ch[k]=='0'){
                    if(ch[i]=='0'){
                        i++;
                    }else {
                        char temp=ch[i];
                        ch[i]=ch[k];
                        ch[k]=temp;
                        cash-=a;
                        k--;
                    }
                }else {
                    k--;
                }
            }
            str=new String(ch);
        }
        public static void flip(){
            char[] ch=str.toCharArray();

            int i=0;
            for (int j=0;j<ch.length;j++){
                if (ch[j]=='1'){
                    i=j;
                    break;
                }
            }
            while (cash>=b){
                if (i== ch.length){
                    break;
                }
                if(ch[i]=='1'){
                    ch[i]='0';
                    cash-=b;
                    i++;
                }
            }
            str=new String(ch);

        }



    }


