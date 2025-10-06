package com.company;

public class Remove_duplicate_elements {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,6,6,6,8,8};
        int n=arr.length;
        n=removeDuplication(arr);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    private static int removeDuplication(int[] arr){
        int x=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                arr[x]=arr[i];
                x++;
            }
        }
        arr[x]=arr[arr.length-1];
        return x;
    }
}
