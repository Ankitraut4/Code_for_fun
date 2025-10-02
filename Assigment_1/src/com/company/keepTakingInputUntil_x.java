package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class keepTakingInputUntil_x {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
       while (s.hasNextInt()){
           int n= s.nextInt();
           if (n=='x'){
               break;
           }
           list.add(n);
       }
       for (int i=0;i<list.size();i++){
           System.out.println(list.get(i));
       }
        System.out.println();
        System.out.println("max element is "+max(list));
    }

    private static int max(ArrayList<Integer> list){
        int max=0;
        for (int i=0;i<list.size();i++){
            if (list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }


}
