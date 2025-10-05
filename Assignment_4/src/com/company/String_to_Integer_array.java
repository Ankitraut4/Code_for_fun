package com.company;

import java.util.Arrays;

public class String_to_Integer_array {
    public static void main(String[] args) {
        String str="[1,2,3,4,5,60]";
        int [] arr=stringTO_Integer_Array(str);
        System.out.println(Arrays.toString(arr));



    }
    private static int[] stringTO_Integer_Array(String str){
        String[] strings=str.replaceAll("\\[","").replaceAll("]","")
                .split(",");

        int[] arr=new int[strings.length];

        for (int i=0;i<strings.length;i++){
            arr[i]=Integer.valueOf(strings[i]);
        }
        return arr;
    }
}
