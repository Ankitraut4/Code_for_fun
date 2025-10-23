package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Merge sort using recursion
        int[] arr={5,3,2,4,1};
        int[] neA=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(neA));//we are return new array so original arr is not sorted, copy of it is sorted
        //but we can modify/update the origimal array by
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] mergeSort(int[] arr){

        if (arr.length==1){
            return arr;
        }
        int mid= arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){

        int[] newAr=new int[left.length+ right.length];
        int i=0,j=0,k=0;
        while (i< left.length && j<right.length){
            if (left[i]<right[j]){
                newAr[k]=left[i];
                i++;
            }else{//left[i]>right[j]
                newAr[k]=right[j];
                j++;
            }
            k++;
        }
        // if any of the left or right part length get finished then add the remaninng element
        while (i< left.length){
            newAr[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            newAr[k]=right[j];
            j++;
            k++;
        }
        return newAr;
    }
}
