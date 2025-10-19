package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={10,2,33,4,77,90,22};

        int e1=s.nextInt();
        int e2=s.nextInt();
        swap(arr,e1,e2);
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr,int e1,int e2){
        int temp=0;
      if (e1>=0 && e2<6){

              temp=arr[e1];
              arr[e1]=arr[e2];
              arr[e2]=temp;

      }else {
          return;
      }

    }
}
