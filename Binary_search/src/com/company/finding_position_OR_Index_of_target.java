package com.company;

import java.util.Arrays;

public class finding_position_OR_Index_of_target {
    public static void main(String[] args) {


        int[] num={1,3,4,7,7,7,7,8,9};
        int target=2;
        int[] ans=range(num,target);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] range(int[] num,int target){

        int[] ans={-1,-1};
        ans[0]=search(num,target,true);
        if(ans[0]!=0){
            ans[1]=search(num,target ,false);

        }

        return ans;
    }
    private static int search(int num[],int target,boolean fisrtIndex){
        int ans=-1;
        int start=0;
        int end=num.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>num[mid]){
                start=mid+1;
            }else if (target<num[mid]){
                end=mid-1;
            }else {
                ans=mid;
                if (fisrtIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;

    }
}
