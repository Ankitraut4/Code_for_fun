package com.company;

public class hcf_of_array {
    public static void main(String[] args) {
        int[] arr={10,15,25,45};
        System.out.println(fingHcf(arr));
    }

    private static int hcf(int a,int b){
        if (a==b){
            return a;
        }if (a==0 || b==0){
            return 0;
        }
            while (a!=b){
                if (a>b){
                    a=a-b;
                }else {
                     b=b-a;
                }
            }
            return a;
    }
    private static int fingHcf(int[] arr){
        int res=hcf(arr[0],arr[1]);
        for (int i=2;i<arr.length;i++){
            res=hcf(res,arr[i]);
        }
        return res;
    }
}
