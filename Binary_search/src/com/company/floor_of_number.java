package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class floor_of_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the no of elements = ");
        int element=s.nextInt();

        int[] arr=new int[element];

        System.out.println("enter the elemnts in ascending order = ");
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("enter the element whose floor to find = ");
        int target=s.nextInt();

        System.out.println(binarySearch(arr,target));



    }
    //return the index of floor element (bigest element <= target)
    private static int binarySearch(int[] arr ,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[0]){
                System.out.println("there is no element present in array which is smaller than target");
                return -1;
            }
            if (target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=end-1;
            }else {
                return mid;
            }
        }
        return end;//end is returning index of floor ,  for the value of floor we can use arr[end];
    }
}
