package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList2D {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();

        //initilisation
        for (int i=0;i<3;i++){
            lists.add(new ArrayList<>());
        }

        //add element
        for (int i=0;i<lists.size();i++){
            for (int j=0;j<4;j++){
                lists.get(i).add(scanner.nextInt());
            }
            System.out.println();
        }


        System.out.println(lists);
    }
}
