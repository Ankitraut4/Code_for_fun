package com.company;

import java.util.Arrays;
import java.util.List;

public class Add_to_Array_Form_Of_integer {
    public static void main(String[] args) {
        //989. Add to Array-Form of Integer

        //The array-form of an integer num is an array representing its digits in left to right order.
        //For example, for num = 1321, the array form is [1,3,2,1].
        //Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
        //Example 1:
        //Input: num = [1,2,0,0], k = 34
        //Output: [1,2,3,4]
        //Explanation: 1200 + 34 = 1234

        int[] num={1,2,0,0};
        int k=1134;
        System.out.println(Arrays.toString(add(num,k)));
    }


    public static int[] add(int[] arr,int k) {
        int n = 0;
        for (int i = arr.length-1;i>=0; i--) {
            n = k % 10;
                    arr[i] += n;
                    k=k/10;

            }
           return arr;
    }
}

//
