package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers_disappering_in_arrays {
    private static List<Integer> ans=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans.toString());
    }
    public static List<Integer> cyclicSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){
                ans.add(index+1);

            }
        }
       return ans;
    }
    private static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
