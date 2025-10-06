package com.company;

import java.util.Scanner;

public class HailstoneSequence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Positive Number = ");
        int n=scan.nextInt();
        int count=0;
      while (n!=1){
          if(n%2==0){
              System.out.println(n+" is even so i take half : "+n/2);
              n=n/2;
          }else{
              int a=(3*n)+1;
              System.out.println(n+" is odd so i make 3n+1 : "+a);
              n=a;
          }
          count++;

      }
        System.out.println("There are total "+count+" steps to reach 1");
    }
}
