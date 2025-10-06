package com.company;

import java.util.Arrays;

public class move_all_zero_to_end {

    public static void main(String[] args) {
          int[] arr={1, 2, 0, 4, 3, 0, 5, 0};
        //  int[] newA=moveright(arr);
      //  moveright(arr);
        char[] ch=moveRight(arr);
        System.out.println(Arrays.toString(ch));
    }



    private static char[] moveRight(int[] arr){
        int x=0,count=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=0){
                arr[x]=arr[i];
                x++;
                count++;
            }
        }
        while (count< arr.length){
            arr[count]=0;
            count++;
        }
        char[] ch=new char[arr.length];
        for (int j=0;j<arr.length;j++) {
            if (arr[j] > 0) {
                ch[j] = (char) (arr[j] + 'a' - 1);
            }else {
                ch[j]='0';
            }
        }
        return ch;
    }
}
